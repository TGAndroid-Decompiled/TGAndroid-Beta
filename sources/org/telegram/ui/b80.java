package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class b80 implements TextWatcher {
    public final c80 f32769a;

    public b80(c80 c80Var) {
        this.f32769a = c80Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        e80 e80Var = this.f32769a.f33042f;
        if (e80Var.d.d.length() != 0) {
            e80Var.B = true;
            e80Var.f33742y = true;
            a80 a80Var = e80Var.f33739s;
            if (!a80Var.h) {
                a80Var.h = true;
                a80Var.l();
            }
            e80Var.f33739s.E(e80Var.d.d.toString());
            e80Var.h.setFastScrollVisible(false);
            e80Var.h.setVerticalScrollBarEnabled(true);
            e80Var.f33738r.e(true, true);
            e80Var.f33738r.setStickerType(1);
            e80Var.f33738r.d.setText(LocaleController.getString(R.string.NoResult));
            e80Var.f33738r.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            return;
        }
        e80Var.B = false;
        e80Var.f33742y = false;
        a80 a80Var2 = e80Var.f33739s;
        if (a80Var2.h) {
            a80Var2.h = false;
            a80Var2.l();
        }
        e80Var.f33739s.E(null);
        e80Var.h.setFastScrollVisible(true);
        e80Var.h.setVerticalScrollBarEnabled(false);
        e80Var.f33738r.e(false, true);
        e80Var.f33738r.setStickerType(0);
        e80Var.f33738r.d.setText(LocaleController.getString(R.string.NoContacts));
        e80Var.f33738r.e.setText("");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
