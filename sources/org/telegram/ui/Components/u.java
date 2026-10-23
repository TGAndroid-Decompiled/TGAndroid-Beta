package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class u implements TextWatcher {
    public final int f30806a;
    public final y f30807b;

    public u(y yVar, int i10) {
        this.f30806a = i10;
        this.f30807b = yVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f30806a) {
            case 0:
                this.f30807b.X();
                return;
            default:
                this.f30807b.X();
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f30806a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f30806a;
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
