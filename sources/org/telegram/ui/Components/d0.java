package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class d0 implements TextWatcher {
    public final int f34177a;
    public final h0 f34178b;

    public d0(h0 h0Var, int i7) {
        this.f34177a = i7;
        this.f34178b = h0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f34177a) {
            case 0:
                this.f34178b.f1();
                return;
            default:
                this.f34178b.f1();
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f34177a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f34177a;
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
