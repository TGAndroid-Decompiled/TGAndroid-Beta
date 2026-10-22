package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class o70 implements TextWatcher {
    public final p70 f39793a;

    public o70(p70 p70Var) {
        this.f39793a = p70Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        r70 r70Var = this.f39793a.f40089f;
        if (r70Var.d.d.length() != 0) {
            r70Var.E = true;
            r70Var.f41086y = true;
            n70 n70Var = r70Var.f41083s;
            if (!n70Var.h) {
                n70Var.h = true;
                n70Var.l();
            }
            r70Var.f41083s.E(r70Var.d.d.toString());
            r70Var.h.setFastScrollVisible(false);
            r70Var.h.setVerticalScrollBarEnabled(true);
            r70Var.f41082r.e(true, true);
            r70Var.f41082r.setStickerType(1);
            r70Var.f41082r.d.setText(LocaleController.getString(R.string.NoResult));
            r70Var.f41082r.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            return;
        }
        r70Var.E = false;
        r70Var.f41086y = false;
        n70 n70Var2 = r70Var.f41083s;
        if (n70Var2.h) {
            n70Var2.h = false;
            n70Var2.l();
        }
        r70Var.f41083s.E(null);
        r70Var.h.setFastScrollVisible(true);
        r70Var.h.setVerticalScrollBarEnabled(false);
        r70Var.f41082r.e(false, true);
        r70Var.f41082r.setStickerType(0);
        r70Var.f41082r.d.setText(LocaleController.getString(R.string.NoContacts));
        r70Var.f41082r.e.setText("");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
