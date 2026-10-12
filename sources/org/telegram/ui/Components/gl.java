package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class gl implements TextWatcher {
    public final il f26451a;

    public gl(il ilVar) {
        this.f26451a = ilVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f26451a.g0();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
