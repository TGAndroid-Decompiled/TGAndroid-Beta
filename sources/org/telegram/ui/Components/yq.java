package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class yq implements TextWatcher {
    public final lh.s6 f31098a;

    public yq(lh.s6 s6Var) {
        this.f31098a = s6Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f31098a.run();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
