package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class xq implements TextWatcher {
    public final mg f42164a;
    public final vq f42165b;

    public xq(mg mgVar, vq vqVar) {
        this.f42164a = mgVar;
        this.f42165b = vqVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f42164a.run();
        this.f42165b.run();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
