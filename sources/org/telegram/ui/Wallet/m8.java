package org.telegram.ui.Wallet;

import android.text.Editable;
import android.text.TextWatcher;
public final class m8 implements TextWatcher {
    public final a4 f34558a;

    public m8(a4 a4Var) {
        this.f34558a = a4Var;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        this.f34558a.run(charSequence.toString());
    }

    @Override
    public final void afterTextChanged(Editable editable) {
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
