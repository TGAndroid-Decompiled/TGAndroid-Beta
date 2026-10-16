package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class pr implements TextWatcher {
    public final vm f28098a;
    public final nr f28099b;

    public pr(vm vmVar, nr nrVar) {
        this.f28098a = vmVar;
        this.f28099b = nrVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f28098a.run();
        this.f28099b.run();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
