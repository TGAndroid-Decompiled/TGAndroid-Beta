package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class jq implements TextWatcher {
    public final fq f35043a;
    public final hq f35044b;

    public jq(fq fqVar, hq hqVar) {
        this.f35043a = fqVar;
        this.f35044b = hqVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f35043a.run();
        this.f35044b.run();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
