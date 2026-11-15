package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
public final class e90 implements TextWatcher {
    public final int f46652a;
    public final i90 f46653b;

    public e90(i90 i90Var, int i7) {
        this.f46652a = i7;
        this.f46653b = i90Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f46652a) {
            case 0:
                i90 i90Var = this.f46653b;
                if (!i90Var.O) {
                    if (editable.toString().equals("0")) {
                        i90Var.G.setText("");
                        return;
                    }
                    try {
                        int parseInt = Integer.parseInt(editable.toString());
                        if (parseInt > 100000) {
                            i90Var.c0();
                            return;
                        } else {
                            i90Var.b0(parseInt);
                            return;
                        }
                    } catch (NumberFormatException unused) {
                        i90Var.c0();
                        return;
                    }
                }
                return;
            default:
                org.telegram.messenger.j6.l(editable, this.f46653b.L.getPaint().getFontMetricsInt(), false);
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f46652a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f46652a;
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
