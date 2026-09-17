package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class k80 implements TextWatcher {
    public final l80 f35128a;

    public k80(l80 l80Var) {
        this.f35128a = l80Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        n80 n80Var = this.f35128a.f35478f;
        if (n80Var.d.d.length() != 0) {
            n80Var.E = true;
            n80Var.f35976y = true;
            j80 j80Var = n80Var.f35973s;
            if (!j80Var.h) {
                j80Var.h = true;
                j80Var.l();
            }
            n80Var.f35973s.E(n80Var.d.d.toString());
            n80Var.h.setFastScrollVisible(false);
            n80Var.h.setVerticalScrollBarEnabled(true);
            n80Var.f35972r.e(true, true);
            n80Var.f35972r.setStickerType(1);
            n80Var.f35972r.d.setText(LocaleController.getString(R.string.NoResult));
            n80Var.f35972r.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            return;
        }
        n80Var.E = false;
        n80Var.f35976y = false;
        j80 j80Var2 = n80Var.f35973s;
        if (j80Var2.h) {
            j80Var2.h = false;
            j80Var2.l();
        }
        n80Var.f35973s.E(null);
        n80Var.h.setFastScrollVisible(true);
        n80Var.h.setVerticalScrollBarEnabled(false);
        n80Var.f35972r.e(false, true);
        n80Var.f35972r.setStickerType(0);
        n80Var.f35972r.d.setText(LocaleController.getString(R.string.NoContacts));
        n80Var.f35972r.e.setText("");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
