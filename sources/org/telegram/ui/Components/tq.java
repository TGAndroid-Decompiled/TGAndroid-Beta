package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class tq implements TextWatcher {
    public final cd f30700a;
    public final rq f30701b;

    public tq(cd cdVar, rq rqVar) {
        this.f30700a = cdVar;
        this.f30701b = rqVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f30700a.run();
        this.f30701b.run();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
