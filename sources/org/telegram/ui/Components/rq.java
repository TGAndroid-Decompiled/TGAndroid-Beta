package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class rq implements TextWatcher {
    public final gh.u6 f32276a;

    public rq(gh.u6 u6Var) {
        this.f32276a = u6Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f32276a.run();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
    }
}
