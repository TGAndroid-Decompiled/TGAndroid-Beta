package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class zq implements TextWatcher {
    public final mf f42964a;
    public final xq f42965b;

    public zq(mf mfVar, xq xqVar) {
        this.f42964a = mfVar;
        this.f42965b = xqVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f42964a.run();
        this.f42965b.run();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
