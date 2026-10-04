package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class er implements TextWatcher {
    public final be f26107a;
    public final org.telegram.messenger.fe f26108b;

    public er(be beVar, org.telegram.messenger.fe feVar) {
        this.f26107a = beVar;
        this.f26108b = feVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f26107a.run();
        this.f26108b.run();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
