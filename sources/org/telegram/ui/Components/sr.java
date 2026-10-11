package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class sr implements TextWatcher {
    public final wc f30917a;
    public final qr f30918b;

    public sr(wc wcVar, qr qrVar) {
        this.f30917a = wcVar;
        this.f30918b = qrVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f30917a.run();
        this.f30918b.run();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
