package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class h80 implements TextWatcher {
    public final i80 f33322a;

    public h80(i80 i80Var) {
        this.f33322a = i80Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        k80 k80Var = this.f33322a.f33558f;
        if (k80Var.d.d.length() != 0) {
            k80Var.E = true;
            k80Var.f34267y = true;
            g80 g80Var = k80Var.f34264s;
            if (!g80Var.h) {
                g80Var.h = true;
                g80Var.l();
            }
            k80Var.f34264s.E(k80Var.d.d.toString());
            k80Var.h.setFastScrollVisible(false);
            k80Var.h.setVerticalScrollBarEnabled(true);
            k80Var.f34263r.e(true, true);
            k80Var.f34263r.setStickerType(1);
            k80Var.f34263r.d.setText(LocaleController.getString(R.string.NoResult));
            k80Var.f34263r.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            return;
        }
        k80Var.E = false;
        k80Var.f34267y = false;
        g80 g80Var2 = k80Var.f34264s;
        if (g80Var2.h) {
            g80Var2.h = false;
            g80Var2.l();
        }
        k80Var.f34264s.E(null);
        k80Var.h.setFastScrollVisible(true);
        k80Var.h.setVerticalScrollBarEnabled(false);
        k80Var.f34263r.e(false, true);
        k80Var.f34263r.setStickerType(0);
        k80Var.f34263r.d.setText(LocaleController.getString(R.string.NoContacts));
        k80Var.f34263r.e.setText("");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
