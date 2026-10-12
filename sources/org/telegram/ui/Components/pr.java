package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class pr implements TextWatcher {
    public final sk f28407a;
    public final nr f28408b;

    public pr(sk skVar, nr nrVar) {
        this.f28407a = skVar;
        this.f28408b = nrVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f28407a.run();
        this.f28408b.run();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
