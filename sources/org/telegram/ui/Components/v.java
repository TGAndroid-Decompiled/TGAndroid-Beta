package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextWatcher;
public final class v implements TextWatcher {
    public final int f29314a;
    public final z f29315b;

    public v(z zVar, int i10) {
        this.f29314a = i10;
        this.f29315b = zVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f29314a) {
            case 0:
                this.f29315b.W();
                return;
            default:
                this.f29315b.W();
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f29314a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f29314a;
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
