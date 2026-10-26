package org.telegram.ui;

import android.widget.EditText;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class q70 extends org.telegram.ui.ActionBar.s0 {
    public final w70 f42756a;

    public q70(w70 w70Var) {
        this.f42756a = w70Var;
    }

    @Override
    public final void h() {
        w70.Z(this.f42756a);
    }

    @Override
    public final void l(EditText editText) {
        int length = editText.length();
        w70 w70Var = this.f42756a;
        if (length != 0) {
            w70Var.f45001x = true;
            t70 t70Var = w70Var.f44999s;
            if (!t70Var.h) {
                t70Var.h = true;
                t70Var.l();
            }
            w70Var.f44999s.E(editText.getText().toString());
            w70Var.h.setFastScrollVisible(false);
            w70Var.h.setVerticalScrollBarEnabled(true);
            w70Var.f44998r.e(true, true);
            w70Var.f44998r.setStickerType(1);
            w70Var.f44998r.d.setText(LocaleController.getString(R.string.NoResult));
            w70Var.f44998r.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            return;
        }
        w70.Z(w70Var);
    }
}
