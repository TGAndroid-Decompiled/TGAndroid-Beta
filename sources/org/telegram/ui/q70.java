package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class q70 implements TextWatcher {
    public final r70 f40327a;

    public q70(r70 r70Var) {
        this.f40327a = r70Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        t70 t70Var = this.f40327a.f40595f;
        if (t70Var.d.d.length() != 0) {
            t70Var.E = true;
            t70Var.f41611y = true;
            p70 p70Var = t70Var.f41608s;
            if (!p70Var.h) {
                p70Var.h = true;
                p70Var.l();
            }
            t70Var.f41608s.E(t70Var.d.d.toString());
            t70Var.h.setFastScrollVisible(false);
            t70Var.h.setVerticalScrollBarEnabled(true);
            t70Var.f41607r.e(true, true);
            t70Var.f41607r.setStickerType(1);
            t70Var.f41607r.d.setText(LocaleController.getString(R.string.NoResult));
            t70Var.f41607r.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            return;
        }
        t70Var.E = false;
        t70Var.f41611y = false;
        p70 p70Var2 = t70Var.f41608s;
        if (p70Var2.h) {
            p70Var2.h = false;
            p70Var2.l();
        }
        t70Var.f41608s.E(null);
        t70Var.h.setFastScrollVisible(true);
        t70Var.h.setVerticalScrollBarEnabled(false);
        t70Var.f41607r.e(false, true);
        t70Var.f41607r.setStickerType(0);
        t70Var.f41607r.d.setText(LocaleController.getString(R.string.NoContacts));
        t70Var.f41607r.e.setText("");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
