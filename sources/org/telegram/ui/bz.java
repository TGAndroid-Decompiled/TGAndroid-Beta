package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class bz implements org.telegram.ui.Components.dl0 {
    public final Rect f32602a = new Rect();
    public final fz f32603b;

    public bz(fz fzVar) {
        this.f32603b = fzVar;
    }

    @Override
    public final boolean mo18c(float f7, float f10, int i10, View view) {
        fz fzVar = this.f32603b;
        if (fzVar.getParentActivity() != null && (view instanceof org.telegram.ui.Cells.f4)) {
            Rect rect = this.f32602a;
            ((ImageView) view.getTag(R.id.object_tag)).getHitRect(rect);
            if (!rect.contains((int) f7, (int) f10)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fzVar.getParentActivity());
                alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.Delete)}, new az(this, i10, 0));
                fzVar.showDialog(alertDialog$Builder.f18446a);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void g() {
    }

    @Override
    public final void q(float f7) {
    }
}
