package org.telegram.ui.Wallet;

import android.text.Editable;
import android.text.TextWatcher;
public final class p8 implements TextWatcher {
    public final y3 f34750a;

    public p8(y3 y3Var) {
        this.f34750a = y3Var;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        this.f34750a.run(charSequence.toString());
    }

    @Override
    public final void afterTextChanged(Editable editable) {
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
