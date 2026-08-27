package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;

public final class pq implements TextWatcher {

    public final hh.t6 f31650a;

    public pq(hh.t6 t6Var) {
        this.f31650a = t6Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        this.f31650a.run();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
