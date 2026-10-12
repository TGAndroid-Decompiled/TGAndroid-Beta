package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class ur implements TextWatcher {
    public final md f31252a;
    public final sr f31253b;

    public ur(md mdVar, sr srVar) {
        this.f31252a = mdVar;
        this.f31253b = srVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f31252a.run();
        this.f31253b.run();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
