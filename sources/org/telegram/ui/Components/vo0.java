package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class vo0 implements TextWatcher {
    public final int f31299a;
    public final op0 f31300b;

    public vo0(op0 op0Var, int i10) {
        this.f31299a = i10;
        this.f31300b = op0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f31299a) {
            case 0:
                org.telegram.messenger.i0.g3(new uo0(this, 0));
                return;
            default:
                op0 op0Var = this.f31300b;
                hp0 hp0Var = op0Var.C1;
                dw0 dw0Var = op0Var.I1;
                h10 h10Var = op0Var.f29136q2;
                if (!TextUtils.isEmpty(h10Var.f26588r.getText())) {
                    op0Var.K0(false);
                }
                if (op0Var.f29140s2) {
                    String obj = h10Var.f26588r.getText().toString();
                    if (obj.length() != 0) {
                        if (dw0Var != null) {
                            dw0Var.d.setText(org.telegram.messenger.cd.L0(2131748183, null));
                        }
                    } else if (op0Var.f29149x1.getAdapter() != hp0Var) {
                        int J0 = op0.J0(op0Var);
                        dw0Var.d.setText(org.telegram.messenger.cd.L0(2131748183, null));
                        dw0Var.e(false, true);
                        op0Var.K0(false);
                        hp0Var.f();
                        if (J0 > 0) {
                            op0Var.f29153z1.h1(0, -J0);
                        }
                    }
                    lp0 lp0Var = op0Var.E1;
                    if (lp0Var != null) {
                        lp0Var.E(obj);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f31299a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f31299a;
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
