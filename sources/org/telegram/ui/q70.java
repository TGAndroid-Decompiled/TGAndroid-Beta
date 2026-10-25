package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class q70 extends org.telegram.ui.ActionBar.s0 {
    public final w70 f42753a;

    public q70(w70 w70Var) {
        this.f42753a = w70Var;
    }

    @Override
    public final void h() {
        w70.Z(this.f42753a);
    }

    @Override
    public final void l(EditText editText) {
        int length = editText.length();
        w70 w70Var = this.f42753a;
        if (length != 0) {
            w70Var.f44998x = true;
            t70 t70Var = w70Var.f44996s;
            if (!t70Var.h) {
                t70Var.h = true;
                t70Var.l();
            }
            w70Var.f44996s.E(editText.getText().toString());
            w70Var.h.setFastScrollVisible(false);
            w70Var.h.setVerticalScrollBarEnabled(true);
            w70Var.f44995r.e(true, true);
            w70Var.f44995r.setStickerType(1);
            w70Var.f44995r.d.setText(LocaleController.getString(R.string.NoResult));
            w70Var.f44995r.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            return;
        }
        w70.Z(w70Var);
    }
}
