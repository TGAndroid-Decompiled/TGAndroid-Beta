package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class jq implements TextWatcher {
    public final cl f35167a;
    public final hq f35168b;

    public jq(cl clVar, hq hqVar) {
        this.f35167a = clVar;
        this.f35168b = hqVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f35167a.run();
        this.f35168b.run();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
    }
}
