package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class vq implements TextWatcher {
    public final jh.r6 f34167a;

    public vq(jh.r6 r6Var) {
        this.f34167a = r6Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f34167a.run();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
