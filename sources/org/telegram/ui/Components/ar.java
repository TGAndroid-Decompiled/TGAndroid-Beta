package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class ar implements TextWatcher {
    public final org.telegram.messenger.ib f24444a;

    public ar(org.telegram.messenger.ib ibVar) {
        this.f24444a = ibVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f24444a.run();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
