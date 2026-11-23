package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
public final class f90 implements TextWatcher {
    public final int f47730a;
    public final j90 f47731b;

    public f90(j90 j90Var, int i7) {
        this.f47730a = i7;
        this.f47731b = j90Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f47730a) {
            case 0:
                j90 j90Var = this.f47731b;
                if (!j90Var.O) {
                    if (editable.toString().equals("0")) {
                        j90Var.G.setText("");
                        return;
                    }
                    try {
                        int parseInt = Integer.parseInt(editable.toString());
                        if (parseInt > 100000) {
                            j90Var.c0();
                            return;
                        } else {
                            j90Var.b0(parseInt);
                            return;
                        }
                    } catch (NumberFormatException unused) {
                        j90Var.c0();
                        return;
                    }
                }
                return;
            default:
                org.telegram.messenger.j6.l(editable, this.f47731b.L.getPaint().getFontMetricsInt(), false);
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f47730a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f47730a;
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
