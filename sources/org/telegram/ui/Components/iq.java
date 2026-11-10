package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class iq implements TextWatcher {
    public final ro f34719a;
    public final gq f34720b;

    public iq(ro roVar, gq gqVar) {
        this.f34719a = roVar;
        this.f34720b = gqVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f34719a.run();
        this.f34720b.run();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
