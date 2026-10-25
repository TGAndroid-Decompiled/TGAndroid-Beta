package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class nr implements TextWatcher {
    public final so f31064a;
    public final lr f31065b;

    public nr(so soVar, lr lrVar) {
        this.f31064a = soVar;
        this.f31065b = lrVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f31064a.run();
        this.f31065b.run();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
