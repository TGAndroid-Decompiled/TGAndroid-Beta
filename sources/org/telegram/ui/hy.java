package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class hy implements org.telegram.ui.Components.cm0 {
    public final Rect f40099a = new Rect();
    public final ly f40100b;

    public hy(ly lyVar) {
        this.f40100b = lyVar;
    }

    @Override
    public final boolean mo17e(float f7, float f10, int i10, View view) {
        ly lyVar = this.f40100b;
        if (lyVar.getParentActivity() != null && (view instanceof org.telegram.ui.Cells.k4)) {
            Rect rect = this.f40099a;
            ((ImageView) view.getTag(R.id.object_tag)).getHitRect(rect);
            if (!rect.contains((int) f7, (int) f10)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lyVar.getParentActivity());
                alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.Delete)}, new gy(this, i10, 0));
                lyVar.showDialog(alertDialog$Builder.f22366a);
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
