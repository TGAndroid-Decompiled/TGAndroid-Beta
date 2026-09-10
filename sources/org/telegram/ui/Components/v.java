package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class v implements TextWatcher {
    public final int f27768a;
    public final z f27769b;

    public v(z zVar, int i10) {
        this.f27768a = i10;
        this.f27769b = zVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f27768a) {
            case 0:
                this.f27769b.W();
                return;
            default:
                this.f27769b.W();
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f27768a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f27768a;
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
