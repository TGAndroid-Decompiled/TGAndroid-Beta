package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class jy implements org.telegram.ui.Components.dm0 {
    public final Rect f40625a = new Rect();
    public final ny f40626b;

    public jy(ny nyVar) {
        this.f40626b = nyVar;
    }

    @Override
    public final boolean mo17e(float f7, float f10, int i10, View view) {
        ny nyVar = this.f40626b;
        if (nyVar.getParentActivity() != null && (view instanceof org.telegram.ui.Cells.k4)) {
            Rect rect = this.f40625a;
            ((ImageView) view.getTag(R.id.object_tag)).getHitRect(rect);
            if (!rect.contains((int) f7, (int) f10)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(nyVar.getParentActivity());
                alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.Delete)}, new iy(this, i10, 0));
                nyVar.showDialog(alertDialog$Builder.f22369a);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void g() {
    }

    @Override
    public final void o(float f7) {
    }
}
