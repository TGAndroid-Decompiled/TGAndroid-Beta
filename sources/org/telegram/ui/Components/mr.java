package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class mr implements TextWatcher {
    public final ee f28584a;
    public final kr f28585b;

    public mr(ee eeVar, kr krVar) {
        this.f28584a = eeVar;
        this.f28585b = krVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f28584a.run();
        this.f28585b.run();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
