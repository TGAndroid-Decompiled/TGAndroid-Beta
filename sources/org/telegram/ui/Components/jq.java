package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class jq implements TextWatcher {
    public final fq f35017a;
    public final hq f35018b;

    public jq(fq fqVar, hq hqVar) {
        this.f35017a = fqVar;
        this.f35018b = hqVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f35017a.run();
        this.f35018b.run();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
