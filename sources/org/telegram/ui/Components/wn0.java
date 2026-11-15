package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class wn0 implements TextWatcher {
    public final int f41411a;
    public final po0 f41412b;

    public wn0(po0 po0Var, int i7) {
        this.f41411a = i7;
        this.f41412b = po0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f41411a) {
            case 0:
                org.telegram.messenger.g0.h3(new wa0(this, 28));
                return;
            default:
                po0 po0Var = this.f41412b;
                io0 io0Var = po0Var.G1;
                cv0 cv0Var = po0Var.M1;
                v00 v00Var = po0Var.f38367u2;
                if (!TextUtils.isEmpty(v00Var.f40202r.getText())) {
                    po0Var.K0(false);
                }
                if (po0Var.f38371w2) {
                    String obj = v00Var.f40202r.getText().toString();
                    if (obj.length() != 0) {
                        if (cv0Var != null) {
                            cv0Var.d.setText(org.telegram.messenger.hd.M0(2131748167, null));
                        }
                    } else if (po0Var.B1.getAdapter() != io0Var) {
                        int J0 = po0.J0(po0Var);
                        cv0Var.d.setText(org.telegram.messenger.hd.M0(2131748167, null));
                        cv0Var.e(false, true);
                        po0Var.K0(false);
                        io0Var.f();
                        if (J0 > 0) {
                            po0Var.D1.h1(0, -J0);
                        }
                    }
                    mo0 mo0Var = po0Var.I1;
                    if (mo0Var != null) {
                        mo0Var.E(obj);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f41411a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f41411a;
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
