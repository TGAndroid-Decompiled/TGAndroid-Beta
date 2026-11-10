package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class v implements TextWatcher {
    public final int f38787a;
    public final z f38788b;

    public v(z zVar, int i7) {
        this.f38787a = i7;
        this.f38788b = zVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f38787a) {
            case 0:
                this.f38788b.e1();
                return;
            default:
                this.f38788b.e1();
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f38787a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f38787a;
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
