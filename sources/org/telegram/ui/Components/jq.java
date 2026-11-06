package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class jq implements TextWatcher {
    public final fq f35056a;
    public final hq f35057b;

    public jq(fq fqVar, hq hqVar) {
        this.f35056a = fqVar;
        this.f35057b = hqVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f35056a.run();
        this.f35057b.run();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
