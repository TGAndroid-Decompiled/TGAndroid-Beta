package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class d80 implements TextWatcher {
    public final e80 f33055a;

    public d80(e80 e80Var) {
        this.f33055a = e80Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        g80 g80Var = this.f33055a.f33298f;
        if (g80Var.d.d.length() != 0) {
            g80Var.E = true;
            g80Var.f33857y = true;
            c80 c80Var = g80Var.f33854s;
            if (!c80Var.h) {
                c80Var.h = true;
                c80Var.l();
            }
            g80Var.f33854s.E(g80Var.d.d.toString());
            g80Var.h.setFastScrollVisible(false);
            g80Var.h.setVerticalScrollBarEnabled(true);
            g80Var.f33853r.e(true, true);
            g80Var.f33853r.setStickerType(1);
            g80Var.f33853r.d.setText(LocaleController.getString(R.string.NoResult));
            g80Var.f33853r.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            return;
        }
        g80Var.E = false;
        g80Var.f33857y = false;
        c80 c80Var2 = g80Var.f33854s;
        if (c80Var2.h) {
            c80Var2.h = false;
            c80Var2.l();
        }
        g80Var.f33854s.E(null);
        g80Var.h.setFastScrollVisible(true);
        g80Var.h.setVerticalScrollBarEnabled(false);
        g80Var.f33853r.e(false, true);
        g80Var.f33853r.setStickerType(0);
        g80Var.f33853r.d.setText(LocaleController.getString(R.string.NoContacts));
        g80Var.f33853r.e.setText("");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
