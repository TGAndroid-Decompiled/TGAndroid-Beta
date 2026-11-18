package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class fo0 implements TextWatcher {
    public final int f35145a;
    public final yo0 f35146b;

    public fo0(yo0 yo0Var, int i7) {
        this.f35145a = i7;
        this.f35146b = yo0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f35145a) {
            case 0:
                org.telegram.messenger.g0.g3(new gb0(this, 28));
                return;
            default:
                yo0 yo0Var = this.f35146b;
                ro0 ro0Var = yo0Var.G1;
                kv0 kv0Var = yo0Var.M1;
                c10 c10Var = yo0Var.f42580u2;
                if (!TextUtils.isEmpty(c10Var.f33845r.getText())) {
                    yo0Var.L0(false);
                }
                if (yo0Var.f42584w2) {
                    String obj = c10Var.f33845r.getText().toString();
                    if (obj.length() != 0) {
                        if (kv0Var != null) {
                            kv0Var.d.setText(org.telegram.messenger.gd.M0(2131747975, null));
                        }
                    } else if (yo0Var.B1.getAdapter() != ro0Var) {
                        int K0 = yo0.K0(yo0Var);
                        kv0Var.d.setText(org.telegram.messenger.gd.M0(2131747975, null));
                        kv0Var.e(false, true);
                        yo0Var.L0(false);
                        ro0Var.f();
                        if (K0 > 0) {
                            yo0Var.D1.h1(0, -K0);
                        }
                    }
                    vo0 vo0Var = yo0Var.I1;
                    if (vo0Var != null) {
                        vo0Var.E(obj);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f35145a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f35145a;
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
