package org.telegram.ui;

import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

public final class ly implements org.telegram.ui.Components.sk0 {

    public final Rect f40264a = new Rect();

    public final py f40265b;

    public ly(py pyVar) {
        this.f40265b = pyVar;
    }

    @Override
    public final boolean mo5c(float f10, float f11, int i10, View view) {
        py pyVar = this.f40265b;
        if (pyVar.getParentActivity() != null && (view instanceof org.telegram.ui.Cells.d4)) {
            ImageView imageView = (ImageView) view.getTag(R.id.object_tag);
            Rect rect = this.f40264a;
            imageView.getHitRect(rect);
            if (!rect.contains((int) f10, (int) f11)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pyVar.getParentActivity());
                alertDialog$Builder.f(new CharSequence[]{LocaleController.getString(R.string.Delete)}, new ky(this, i10, 0));
                pyVar.showDialog(alertDialog$Builder.f22702a);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void i() {
    }

    @Override
    public final void s(float f10) {
    }
}
