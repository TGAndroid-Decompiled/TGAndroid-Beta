package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
public final class g90 implements TextWatcher {
    public final int f46049a;
    public final k90 f46050b;

    public g90(k90 k90Var, int i7) {
        this.f46049a = i7;
        this.f46050b = k90Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f46049a) {
            case 0:
                k90 k90Var = this.f46050b;
                if (!k90Var.N) {
                    if (editable.toString().equals("0")) {
                        k90Var.F.setText("");
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
                org.telegram.messenger.i6.l(editable, this.f46050b.K.getPaint().getFontMetricsInt(), false);
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f46049a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f46049a;
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
