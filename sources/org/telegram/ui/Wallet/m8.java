package org.telegram.ui.Wallet;

import android.text.Editable;
import android.text.TextWatcher;
public final class m8 implements TextWatcher {
    public final w3 f34539a;

    public m8(w3 w3Var) {
        this.f34539a = w3Var;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        this.f34539a.run(charSequence.toString());
    }

    @Override
    public final void afterTextChanged(Editable editable) {
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
