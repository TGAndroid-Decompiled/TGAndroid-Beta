package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class v implements TextWatcher {
    public final int f31128a;
    public final z f31129b;

    public v(z zVar, int i10) {
        this.f31128a = i10;
        this.f31129b = zVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f31128a) {
            case 0:
                this.f31129b.e1();
                return;
            default:
                this.f31129b.e1();
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f31128a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f31128a;
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
