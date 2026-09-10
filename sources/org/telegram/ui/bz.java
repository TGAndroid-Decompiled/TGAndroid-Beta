package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class bz implements org.telegram.ui.Components.ml0 {
    public final Rect f31469a = new Rect();
    public final fz f31470b;

    public bz(fz fzVar) {
        this.f31470b = fzVar;
    }

    @Override
    public final boolean mo18c(float f7, float f10, int i10, View view) {
        fz fzVar = this.f31470b;
        if (fzVar.getParentActivity() != null && (view instanceof org.telegram.ui.Cells.g4)) {
            Rect rect = this.f31469a;
            ((ImageView) view.getTag(R.id.object_tag)).getHitRect(rect);
            if (!rect.contains((int) f7, (int) f10)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fzVar.getParentActivity());
                alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.Delete)}, new az(this, i10, 0));
                fzVar.showDialog(alertDialog$Builder.f17528a);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void h() {
    }

    @Override
    public final void p(float f7) {
    }
}
