package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class wq implements TextWatcher {
    public final xd f41703a;
    public final uq f41704b;

    public wq(xd xdVar, uq uqVar) {
        this.f41703a = xdVar;
        this.f41704b = uqVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f41703a.run();
        this.f41704b.run();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
