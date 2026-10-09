package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class rr implements TextWatcher {
    public final ea f30485a;
    public final org.telegram.messenger.ge f30486b;

    public rr(ea eaVar, org.telegram.messenger.ge geVar) {
        this.f30485a = eaVar;
        this.f30486b = geVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f30485a.run();
        this.f30486b.run();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
