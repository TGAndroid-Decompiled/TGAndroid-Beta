package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class iy implements org.telegram.ui.Components.pk0 {
    public final Rect f39317a = new Rect();
    public final my f39318b;

    public iy(my myVar) {
        this.f39318b = myVar;
    }

    @Override
    public final boolean mo5c(float f10, float f11, int i9, View view) {
        my myVar = this.f39318b;
        if (myVar.getParentActivity() != null && (view instanceof org.telegram.ui.Cells.g4)) {
            Rect rect = this.f39317a;
            ((ImageView) view.getTag(R.id.object_tag)).getHitRect(rect);
            if (!rect.contains((int) f10, (int) f11)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(myVar.getParentActivity());
                alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.Delete)}, new hy(this, i9, 0));
                myVar.showDialog(alertDialog$Builder.f22702a);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void j() {
    }

    @Override
    public final void u(float f10) {
    }
}
