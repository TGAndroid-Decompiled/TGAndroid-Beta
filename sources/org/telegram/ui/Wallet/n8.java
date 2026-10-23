package org.telegram.ui.Wallet;

import android.text.Editable;
import android.text.TextWatcher;
public final class n8 implements TextWatcher {
    public final v3 f34911a;

    public n8(v3 v3Var) {
        this.f34911a = v3Var;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        this.f34911a.run(charSequence.toString());
    }

    @Override
    public final void afterTextChanged(Editable editable) {
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
