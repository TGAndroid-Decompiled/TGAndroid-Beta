package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class jr implements TextWatcher {
    public final ce f27789a;
    public final hr f27790b;

    public jr(ce ceVar, hr hrVar) {
        this.f27789a = ceVar;
        this.f27790b = hrVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f27789a.run();
        this.f27790b.run();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
