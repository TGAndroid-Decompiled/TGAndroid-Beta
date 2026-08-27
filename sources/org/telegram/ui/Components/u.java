package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;

public final class u implements TextWatcher {

    public final int f32928a;

    public final y f32929b;

    public u(y yVar, int i10) {
        this.f32928a = i10;
        this.f32929b = yVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f32928a) {
            case 0:
                this.f32929b.W();
                break;
            default:
                this.f32929b.W();
                break;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f32928a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f32928a;
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
