package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
public final class ia0 implements TextWatcher {
    public final int f38221a;
    public final ma0 f38222b;

    public ia0(ma0 ma0Var, int i10) {
        this.f38221a = i10;
        this.f38222b = ma0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f38221a) {
            case 0:
                ma0 ma0Var = this.f38222b;
                if (!ma0Var.N) {
                    if (editable.toString().equals("0")) {
                        ma0Var.F.setText("");
                        return;
                    }
                    try {
                        int parseInt = Integer.parseInt(editable.toString());
                        if (parseInt > 100000) {
                            ma0Var.b0();
                            return;
                        } else {
                            ma0Var.a0(parseInt);
                            return;
                        }
                    } catch (NumberFormatException unused) {
                        ma0Var.b0();
                        return;
                    }
                }
                return;
            default:
                org.telegram.messenger.k6.l(editable, this.f38222b.K.getPaint().getFontMetricsInt(), false);
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f38221a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f38221a;
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
