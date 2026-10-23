package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class jy implements org.telegram.ui.Components.dm0 {
    public final Rect f38723a = new Rect();
    public final ny f38724b;

    public jy(ny nyVar) {
        this.f38724b = nyVar;
    }

    @Override
    public final boolean mo17c(float f7, float f10, int i10, View view) {
        ny nyVar = this.f38724b;
        if (nyVar.getParentActivity() != null && (view instanceof org.telegram.ui.Cells.f4)) {
            Rect rect = this.f38723a;
            ((ImageView) view.getTag(R.id.object_tag)).getHitRect(rect);
            if (!rect.contains((int) f7, (int) f10)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(nyVar.getParentActivity());
                alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.Delete)}, new iy(this, i10, 0));
                nyVar.showDialog(alertDialog$Builder.f20678a);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void h() {
    }

    @Override
    public final void o(float f7) {
    }
}
