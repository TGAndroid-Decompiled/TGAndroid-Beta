package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class f80 implements TextWatcher {
    public final g80 f33221a;

    public f80(g80 g80Var) {
        this.f33221a = g80Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        i80 i80Var = this.f33221a.f33485f;
        if (i80Var.d.d.length() != 0) {
            i80Var.E = true;
            i80Var.f34072y = true;
            e80 e80Var = i80Var.f34069s;
            if (!e80Var.h) {
                e80Var.h = true;
                e80Var.l();
            }
            i80Var.f34069s.E(i80Var.d.d.toString());
            i80Var.h.setFastScrollVisible(false);
            i80Var.h.setVerticalScrollBarEnabled(true);
            i80Var.f34068r.e(true, true);
            i80Var.f34068r.setStickerType(1);
            i80Var.f34068r.d.setText(LocaleController.getString(R.string.NoResult));
            i80Var.f34068r.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            return;
        }
        i80Var.E = false;
        i80Var.f34072y = false;
        e80 e80Var2 = i80Var.f34069s;
        if (e80Var2.h) {
            e80Var2.h = false;
            e80Var2.l();
        }
        i80Var.f34069s.E(null);
        i80Var.h.setFastScrollVisible(true);
        i80Var.h.setVerticalScrollBarEnabled(false);
        i80Var.f34068r.e(false, true);
        i80Var.f34068r.setStickerType(0);
        i80Var.f34068r.d.setText(LocaleController.getString(R.string.NoContacts));
        i80Var.f34068r.e.setText("");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
