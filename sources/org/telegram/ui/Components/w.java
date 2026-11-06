package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class w implements TextWatcher {
    public final int f39790a;
    public final a0 f39791b;

    public w(a0 a0Var, int i7) {
        this.f39790a = i7;
        this.f39791b = a0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f39790a) {
            case 0:
                this.f39791b.e1();
                return;
            default:
                this.f39791b.e1();
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f39790a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f39790a;
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
