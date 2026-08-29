package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class ky implements org.telegram.ui.Components.cl0 {
    public final Rect f40038a = new Rect();
    public final oy f40039b;

    public ky(oy oyVar) {
        this.f40039b = oyVar;
    }

    @Override
    public final boolean mo17b(float f9, float f10, int i10, View view) {
        oy oyVar = this.f40039b;
        if (oyVar.getParentActivity() != null && (view instanceof org.telegram.ui.Cells.e4)) {
            Rect rect = this.f40038a;
            ((ImageView) view.getTag(R.id.object_tag)).getHitRect(rect);
            if (!rect.contains((int) f9, (int) f10)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(oyVar.getParentActivity());
                alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.Delete)}, new jy(this, i10, 0));
                oyVar.showDialog(alertDialog$Builder.f22714a);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void h() {
    }

    @Override
    public final void r(float f9) {
    }
}
