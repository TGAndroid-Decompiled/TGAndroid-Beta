package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class w implements TextWatcher {
    public final int f34247a;
    public final a0 f34248b;

    public w(a0 a0Var, int i10) {
        this.f34247a = i10;
        this.f34248b = a0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f34247a) {
            case 0:
                this.f34248b.W();
                return;
            default:
                this.f34248b.W();
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f34247a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f34247a;
    }

    private final void a(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void b(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void d(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
