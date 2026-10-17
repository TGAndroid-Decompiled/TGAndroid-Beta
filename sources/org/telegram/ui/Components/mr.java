package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class mr implements TextWatcher {
    public final ee f28577a;
    public final kr f28578b;

    public mr(ee eeVar, kr krVar) {
        this.f28577a = eeVar;
        this.f28578b = krVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f28577a.run();
        this.f28578b.run();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
