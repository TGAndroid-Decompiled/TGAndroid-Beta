package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class i80 implements TextWatcher {
    public final j80 f34526a;

    public i80(j80 j80Var) {
        this.f34526a = j80Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        l80 l80Var = this.f34526a.f34833f;
        if (l80Var.d.d.length() != 0) {
            l80Var.E = true;
            l80Var.f35375y = true;
            h80 h80Var = l80Var.f35372s;
            if (!h80Var.h) {
                h80Var.h = true;
                h80Var.l();
            }
            l80Var.f35372s.E(l80Var.d.d.toString());
            l80Var.h.setFastScrollVisible(false);
            l80Var.h.setVerticalScrollBarEnabled(true);
            l80Var.f35371r.e(true, true);
            l80Var.f35371r.setStickerType(1);
            l80Var.f35371r.d.setText(LocaleController.getString(R.string.NoResult));
            l80Var.f35371r.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            return;
        }
        l80Var.E = false;
        l80Var.f35375y = false;
        h80 h80Var2 = l80Var.f35372s;
        if (h80Var2.h) {
            h80Var2.h = false;
            h80Var2.l();
        }
        l80Var.f35372s.E(null);
        l80Var.h.setFastScrollVisible(true);
        l80Var.h.setVerticalScrollBarEnabled(false);
        l80Var.f35371r.e(false, true);
        l80Var.f35371r.setStickerType(0);
        l80Var.f35371r.d.setText(LocaleController.getString(R.string.NoContacts));
        l80Var.f35371r.e.setText("");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
