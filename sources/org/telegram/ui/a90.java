package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
public final class a90 implements TextWatcher {
    public final int f43689a;
    public final e90 f43690b;

    public a90(e90 e90Var, int i3) {
        this.f43689a = i3;
        this.f43690b = e90Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f43689a) {
            case 0:
                e90 e90Var = this.f43690b;
                if (!e90Var.O) {
                    if (editable.toString().equals("0")) {
                        e90Var.G.setText("");
                        return;
                    }
                    try {
                        int parseInt = Integer.parseInt(editable.toString());
                        if (parseInt > 100000) {
                            e90Var.c0();
                            return;
                        } else {
                            e90Var.b0(parseInt);
                            return;
                        }
                    } catch (NumberFormatException unused) {
                        e90Var.c0();
                        return;
                    }
                }
                return;
            default:
                org.telegram.messenger.i6.l(editable, this.f43690b.L.getPaint().getFontMetricsInt(), false);
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        int i12 = this.f43689a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        int i12 = this.f43689a;
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
