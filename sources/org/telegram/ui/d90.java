package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
public final class d90 implements TextWatcher {
    public final int f45004a;
    public final h90 f45005b;

    public d90(h90 h90Var, int i7) {
        this.f45004a = i7;
        this.f45005b = h90Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f45004a) {
            case 0:
                h90 h90Var = this.f45005b;
                if (!h90Var.N) {
                    if (editable.toString().equals("0")) {
                        h90Var.F.setText("");
                        return;
                    }
                    try {
                        int parseInt = Integer.parseInt(editable.toString());
                        if (parseInt > 100000) {
                            h90Var.c0();
                            return;
                        } else {
                            h90Var.b0(parseInt);
                            return;
                        }
                    } catch (NumberFormatException unused) {
                        h90Var.c0();
                        return;
                    }
                }
                return;
            default:
                org.telegram.messenger.i6.l(editable, this.f45005b.K.getPaint().getFontMetricsInt(), false);
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f45004a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f45004a;
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
