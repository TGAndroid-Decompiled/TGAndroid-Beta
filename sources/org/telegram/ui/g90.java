package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
public final class g90 implements TextWatcher {
    public final int f48011a;
    public final k90 f48012b;

    public g90(k90 k90Var, int i7) {
        this.f48011a = i7;
        this.f48012b = k90Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f48011a) {
            case 0:
                k90 k90Var = this.f48012b;
                if (!k90Var.O) {
                    if (editable.toString().equals("0")) {
                        k90Var.G.setText("");
                        return;
                    }
                    try {
                        int parseInt = Integer.parseInt(editable.toString());
                        if (parseInt > 100000) {
                            k90Var.c0();
                            return;
                        } else {
                            k90Var.b0(parseInt);
                            return;
                        }
                    } catch (NumberFormatException unused) {
                        k90Var.c0();
                        return;
                    }
                }
                return;
            default:
                org.telegram.messenger.j6.l(editable, this.f48012b.L.getPaint().getFontMetricsInt(), false);
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f48011a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f48011a;
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
