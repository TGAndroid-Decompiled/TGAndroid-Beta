package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class zq implements TextWatcher {
    public final og f42920a;
    public final xq f42921b;

    public zq(og ogVar, xq xqVar) {
        this.f42920a = ogVar;
        this.f42921b = xqVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f42920a.run();
        this.f42921b.run();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
