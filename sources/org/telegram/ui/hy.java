package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class hy implements org.telegram.ui.Components.am0 {
    public final Rect f37819a = new Rect();
    public final ly f37820b;

    public hy(ly lyVar) {
        this.f37820b = lyVar;
    }

    @Override
    public final boolean mo17d(float f7, float f10, int i10, View view) {
        ly lyVar = this.f37820b;
        if (lyVar.getParentActivity() != null && (view instanceof org.telegram.ui.Cells.f4)) {
            Rect rect = this.f37819a;
            ((ImageView) view.getTag(R.id.object_tag)).getHitRect(rect);
            if (!rect.contains((int) f7, (int) f10)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lyVar.getParentActivity());
                alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.Delete)}, new gy(this, i10, 0));
                lyVar.showDialog(alertDialog$Builder.f20608a);
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
