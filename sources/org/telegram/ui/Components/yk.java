package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class yk implements TextWatcher {
    public final al f32669a;

    public yk(al alVar) {
        this.f32669a = alVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f32669a.g0();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
