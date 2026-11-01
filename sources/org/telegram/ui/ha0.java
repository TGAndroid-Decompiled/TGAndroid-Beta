package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
public final class ha0 implements TextWatcher {
    public final int f37767a;
    public final la0 f37768b;

    public ha0(la0 la0Var, int i10) {
        this.f37767a = i10;
        this.f37768b = la0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f37767a) {
            case 0:
                la0 la0Var = this.f37768b;
                if (!la0Var.N) {
                    if (editable.toString().equals("0")) {
                        la0Var.F.setText("");
                        return;
                    }
                    try {
                        int parseInt = Integer.parseInt(editable.toString());
                        if (parseInt > 100000) {
                            la0Var.c0();
                            return;
                        } else {
                            la0Var.b0(parseInt);
                            return;
                        }
                    } catch (NumberFormatException unused) {
                        la0Var.c0();
                        return;
                    }
                }
                return;
            default:
                org.telegram.messenger.k6.l(editable, this.f37768b.K.getPaint().getFontMetricsInt(), false);
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f37767a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f37767a;
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
