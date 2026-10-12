package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class ur implements TextWatcher {
    public final md f31244a;
    public final sr f31245b;

    public ur(md mdVar, sr srVar) {
        this.f31244a = mdVar;
        this.f31245b = srVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f31244a.run();
        this.f31245b.run();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
