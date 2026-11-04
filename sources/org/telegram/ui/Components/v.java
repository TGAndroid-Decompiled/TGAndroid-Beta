package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class v implements TextWatcher {
    public final int f38916a;
    public final z f38917b;

    public v(z zVar, int i3) {
        this.f38916a = i3;
        this.f38917b = zVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f38916a) {
            case 0:
                this.f38917b.e1();
                return;
            default:
                this.f38917b.e1();
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        int i12 = this.f38916a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        int i12 = this.f38916a;
    }

    private final void a(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void b(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void c(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i3, int i10, int i11, CharSequence charSequence) {
    }
}
