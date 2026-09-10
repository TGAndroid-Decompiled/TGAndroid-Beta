package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class hr implements TextWatcher {
    public final org.telegram.messenger.qb f23750a;

    public hr(org.telegram.messenger.qb qbVar) {
        this.f23750a = qbVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f23750a.run();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
