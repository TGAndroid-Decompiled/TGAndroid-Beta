package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class qq implements TextWatcher {
    public final od f38741a;
    public final oq f38742b;

    public qq(od odVar, oq oqVar) {
        this.f38741a = odVar;
        this.f38742b = oqVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f38741a.run();
        this.f38742b.run();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
