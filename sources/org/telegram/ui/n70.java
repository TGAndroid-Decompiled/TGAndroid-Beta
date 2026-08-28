package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class n70 implements TextWatcher {
    public final o70 f40608a;

    public n70(o70 o70Var) {
        this.f40608a = o70Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        q70 q70Var = this.f40608a.f40999f;
        if (q70Var.d.d.length() != 0) {
            q70Var.A = true;
            q70Var.f41710y = true;
            m70 m70Var = q70Var.f41707s;
            if (!m70Var.h) {
                m70Var.h = true;
                m70Var.l();
            }
            q70Var.f41707s.E(q70Var.d.d.toString());
            q70Var.h.setFastScrollVisible(false);
            q70Var.h.setVerticalScrollBarEnabled(true);
            q70Var.f41706r.e(true, true);
            q70Var.f41706r.setStickerType(1);
            q70Var.f41706r.d.setText(LocaleController.getString(R.string.NoResult));
            q70Var.f41706r.f28885e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            return;
        }
        q70Var.A = false;
        q70Var.f41710y = false;
        m70 m70Var2 = q70Var.f41707s;
        if (m70Var2.h) {
            m70Var2.h = false;
            m70Var2.l();
        }
        q70Var.f41707s.E(null);
        q70Var.h.setFastScrollVisible(true);
        q70Var.h.setVerticalScrollBarEnabled(false);
        q70Var.f41706r.e(false, true);
        q70Var.f41706r.setStickerType(0);
        q70Var.f41706r.d.setText(LocaleController.getString(R.string.NoContacts));
        q70Var.f41706r.f28885e.setText("");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
