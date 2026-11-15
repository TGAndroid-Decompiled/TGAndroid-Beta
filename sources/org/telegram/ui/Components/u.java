package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class u implements TextWatcher {
    public final int f39841a;
    public final y f39842b;

    public u(y yVar, int i7) {
        this.f39841a = i7;
        this.f39842b = yVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f39841a) {
            case 0:
                this.f39842b.e1();
                return;
            default:
                this.f39842b.e1();
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f39841a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f39841a;
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
