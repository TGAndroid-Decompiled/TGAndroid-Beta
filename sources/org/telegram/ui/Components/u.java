package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class u implements TextWatcher {
    public final int f32861a;
    public final y f32862b;

    public u(y yVar, int i9) {
        this.f32861a = i9;
        this.f32862b = yVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f32861a) {
            case 0:
                this.f32862b.V();
                return;
            default:
                this.f32862b.V();
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        int i12 = this.f32861a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        int i12 = this.f32861a;
    }

    private final void a(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void b(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i9, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i9, int i10, int i11, CharSequence charSequence) {
    }
}
