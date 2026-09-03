package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class br implements TextWatcher {
    public final mh.s6 f25680a;

    public br(mh.s6 s6Var) {
        this.f25680a = s6Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f25680a.run();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
