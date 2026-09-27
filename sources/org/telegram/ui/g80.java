package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class g80 implements TextWatcher {
    public final h80 f33842a;

    public g80(h80 h80Var) {
        this.f33842a = h80Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        j80 j80Var = this.f33842a.f34163f;
        if (j80Var.d.d.length() != 0) {
            j80Var.E = true;
            j80Var.f34667y = true;
            f80 f80Var = j80Var.f34664s;
            if (!f80Var.h) {
                f80Var.h = true;
                f80Var.l();
            }
            j80Var.f34664s.E(j80Var.d.d.toString());
            j80Var.h.setFastScrollVisible(false);
            j80Var.h.setVerticalScrollBarEnabled(true);
            j80Var.f34663r.e(true, true);
            j80Var.f34663r.setStickerType(1);
            j80Var.f34663r.d.setText(LocaleController.getString(R.string.NoResult));
            j80Var.f34663r.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            return;
        }
        j80Var.E = false;
        j80Var.f34667y = false;
        f80 f80Var2 = j80Var.f34664s;
        if (f80Var2.h) {
            f80Var2.h = false;
            f80Var2.l();
        }
        j80Var.f34664s.E(null);
        j80Var.h.setFastScrollVisible(true);
        j80Var.h.setVerticalScrollBarEnabled(false);
        j80Var.f34663r.e(false, true);
        j80Var.f34663r.setStickerType(0);
        j80Var.f34663r.d.setText(LocaleController.getString(R.string.NoContacts));
        j80Var.f34663r.e.setText("");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
