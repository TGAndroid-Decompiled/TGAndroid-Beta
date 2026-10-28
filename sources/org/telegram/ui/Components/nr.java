package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class nr implements TextWatcher {
    public final so f31028a;
    public final lr f31029b;

    public nr(so soVar, lr lrVar) {
        this.f31028a = soVar;
        this.f31029b = lrVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f31028a.run();
        this.f31029b.run();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
