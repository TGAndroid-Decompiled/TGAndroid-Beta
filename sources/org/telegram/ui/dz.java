package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class dz implements org.telegram.ui.Components.dm0 {
    public final Rect f35405a = new Rect();
    public final hz f35406b;

    public dz(hz hzVar) {
        this.f35406b = hzVar;
    }

    @Override
    public final boolean mo17d(float f7, float f10, int i10, View view) {
        hz hzVar = this.f35406b;
        if (hzVar.getParentActivity() != null && (view instanceof org.telegram.ui.Cells.g4)) {
            Rect rect = this.f35405a;
            ((ImageView) view.getTag(R.id.object_tag)).getHitRect(rect);
            if (!rect.contains((int) f7, (int) f10)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hzVar.getParentActivity());
                alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.Delete)}, new cz(this, i10, 0));
                hzVar.showDialog(alertDialog$Builder.f19548a);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void h() {
    }

    @Override
    public final void q(float f7) {
    }
}
