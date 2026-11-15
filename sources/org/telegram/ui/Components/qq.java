package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class qq implements TextWatcher {
    public final od f38743a;
    public final oq f38744b;

    public qq(od odVar, oq oqVar) {
        this.f38743a = odVar;
        this.f38744b = oqVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f38743a.run();
        this.f38744b.run();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
