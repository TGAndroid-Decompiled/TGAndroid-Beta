package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class ar implements TextWatcher {
    public final org.telegram.messenger.jb f24471a;

    public ar(org.telegram.messenger.jb jbVar) {
        this.f24471a = jbVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f24471a.run();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
