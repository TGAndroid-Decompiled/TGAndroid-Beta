package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class bl implements TextWatcher {
    public final dl f23797a;

    public bl(dl dlVar) {
        this.f23797a = dlVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f23797a.g0();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
