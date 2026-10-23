package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class lr implements TextWatcher {
    public final ee f28410a;
    public final jr f28411b;

    public lr(ee eeVar, jr jrVar) {
        this.f28410a = eeVar;
        this.f28411b = jrVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f28410a.run();
        this.f28411b.run();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
