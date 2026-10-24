package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class wk implements TextWatcher {
    public final yk f32261a;

    public wk(yk ykVar) {
        this.f32261a = ykVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f32261a.g0();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
