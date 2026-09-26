package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class dr implements TextWatcher {
    public final org.telegram.messenger.jb f23737a;

    public dr(org.telegram.messenger.jb jbVar) {
        this.f23737a = jbVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f23737a.run();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
