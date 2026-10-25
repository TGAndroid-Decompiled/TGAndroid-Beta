package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class u implements TextWatcher {
    public final int f33185a;
    public final y f33186b;

    public u(y yVar, int i10) {
        this.f33185a = i10;
        this.f33186b = yVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f33185a) {
            case 0:
                this.f33186b.W();
                return;
            default:
                this.f33186b.W();
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f33185a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f33185a;
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
