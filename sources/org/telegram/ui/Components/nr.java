package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class nr implements TextWatcher {
    public final so f31066a;
    public final lr f31067b;

    public nr(so soVar, lr lrVar) {
        this.f31066a = soVar;
        this.f31067b = lrVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f31066a.run();
        this.f31067b.run();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
