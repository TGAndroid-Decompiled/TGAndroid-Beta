package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class sr implements TextWatcher {
    public final ea f30837a;
    public final qr f30838b;

    public sr(ea eaVar, qr qrVar) {
        this.f30837a = eaVar;
        this.f30838b = qrVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f30837a.run();
        this.f30838b.run();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
