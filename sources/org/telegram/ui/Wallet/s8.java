package org.telegram.ui.Wallet;

import android.text.Editable;
import android.text.TextWatcher;
public final class s8 implements TextWatcher {
    public final z3 f34920a;

    public s8(z3 z3Var) {
        this.f34920a = z3Var;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        this.f34920a.run(charSequence.toString());
    }

    @Override
    public final void afterTextChanged(Editable editable) {
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
