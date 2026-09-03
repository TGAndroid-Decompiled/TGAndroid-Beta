package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class a80 implements TextWatcher {
    public final b80 f35058a;

    public a80(b80 b80Var) {
        this.f35058a = b80Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        d80 d80Var = this.f35058a.f35400f;
        if (d80Var.d.d.length() != 0) {
            d80Var.B = true;
            d80Var.f36121y = true;
            z70 z70Var = d80Var.f36118s;
            if (!z70Var.h) {
                z70Var.h = true;
                z70Var.l();
            }
            d80Var.f36118s.E(d80Var.d.d.toString());
            d80Var.h.setFastScrollVisible(false);
            d80Var.h.setVerticalScrollBarEnabled(true);
            d80Var.f36117r.e(true, true);
            d80Var.f36117r.setStickerType(1);
            d80Var.f36117r.d.setText(LocaleController.getString(R.string.NoResult));
            d80Var.f36117r.f34033e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            return;
        }
        d80Var.B = false;
        d80Var.f36121y = false;
        z70 z70Var2 = d80Var.f36118s;
        if (z70Var2.h) {
            z70Var2.h = false;
            z70Var2.l();
        }
        d80Var.f36118s.E(null);
        d80Var.h.setFastScrollVisible(true);
        d80Var.h.setVerticalScrollBarEnabled(false);
        d80Var.f36117r.e(false, true);
        d80Var.f36117r.setStickerType(0);
        d80Var.f36117r.d.setText(LocaleController.getString(R.string.NoContacts));
        d80Var.f36117r.f34033e.setText("");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
