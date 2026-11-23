package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class e0 implements TextWatcher {
    public final int f34621a;
    public final i0 f34622b;

    public e0(i0 i0Var, int i7) {
        this.f34621a = i7;
        this.f34622b = i0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f34621a) {
            case 0:
                this.f34622b.f1();
                return;
            default:
                this.f34622b.f1();
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f34621a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f34621a;
    }

    private final void a(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void b(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i7, int i10, int i11, CharSequence charSequence) {
    }
}
