package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class e0 implements TextWatcher {
    public final int f34611a;
    public final i0 f34612b;

    public e0(i0 i0Var, int i7) {
        this.f34611a = i7;
        this.f34612b = i0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f34611a) {
            case 0:
                this.f34612b.f1();
                return;
            default:
                this.f34612b.f1();
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f34611a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f34611a;
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
