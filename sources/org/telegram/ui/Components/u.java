package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class u implements TextWatcher {
    public final int f31221a;
    public final y f31222b;

    public u(y yVar, int i10) {
        this.f31221a = i10;
        this.f31222b = yVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f31221a) {
            case 0:
                this.f31222b.U();
                return;
            default:
                this.f31222b.U();
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f31221a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f31221a;
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
