package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class p70 implements TextWatcher {
    public final q70 f41310a;

    public p70(q70 q70Var) {
        this.f41310a = q70Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        s70 s70Var = this.f41310a.f41559f;
        if (s70Var.d.d.length() != 0) {
            s70Var.A = true;
            s70Var.f42303y = true;
            o70 o70Var = s70Var.f42300s;
            if (!o70Var.h) {
                o70Var.h = true;
                o70Var.l();
            }
            s70Var.f42300s.E(s70Var.d.d.toString());
            s70Var.h.setFastScrollVisible(false);
            s70Var.h.setVerticalScrollBarEnabled(true);
            s70Var.f42299r.e(true, true);
            s70Var.f42299r.setStickerType(1);
            s70Var.f42299r.d.setText(LocaleController.getString(R.string.NoResult));
            s70Var.f42299r.f32122e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            return;
        }
        s70Var.A = false;
        s70Var.f42303y = false;
        o70 o70Var2 = s70Var.f42300s;
        if (o70Var2.h) {
            o70Var2.h = false;
            o70Var2.l();
        }
        s70Var.f42300s.E(null);
        s70Var.h.setFastScrollVisible(true);
        s70Var.h.setVerticalScrollBarEnabled(false);
        s70Var.f42299r.e(false, true);
        s70Var.f42299r.setStickerType(0);
        s70Var.f42299r.d.setText(LocaleController.getString(R.string.NoContacts));
        s70Var.f42299r.f32122e.setText("");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
