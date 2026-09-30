package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class er implements TextWatcher {
    public final org.telegram.messenger.jb f24038a;

    public er(org.telegram.messenger.jb jbVar) {
        this.f24038a = jbVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f24038a.run();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
