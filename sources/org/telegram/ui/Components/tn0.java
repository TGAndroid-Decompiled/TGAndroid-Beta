package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class tn0 implements TextWatcher {
    public final int f38368a;
    public final mo0 f38369b;

    public tn0(mo0 mo0Var, int i7) {
        this.f38368a = i7;
        this.f38369b = mo0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f38368a) {
            case 0:
                org.telegram.messenger.g0.h3(new ob0(this, 25));
                return;
            default:
                mo0 mo0Var = this.f38369b;
                fo0 fo0Var = mo0Var.C1;
                av0 av0Var = mo0Var.I1;
                r00 r00Var = mo0Var.f36030q2;
                if (!TextUtils.isEmpty(r00Var.f37441r.getText())) {
                    mo0Var.K0(false);
                }
                if (mo0Var.f36034s2) {
                    String obj = r00Var.f37441r.getText().toString();
                    if (obj.length() != 0) {
                        if (av0Var != null) {
                            av0Var.d.setText(org.telegram.messenger.hd.M0(2131748166, null));
                        }
                    } else if (mo0Var.f36043x1.getAdapter() != fo0Var) {
                        int J0 = mo0.J0(mo0Var);
                        av0Var.d.setText(org.telegram.messenger.hd.M0(2131748166, null));
                        av0Var.e(false, true);
                        mo0Var.K0(false);
                        fo0Var.f();
                        if (J0 > 0) {
                            mo0Var.f36047z1.h1(0, -J0);
                        }
                    }
                    jo0 jo0Var = mo0Var.E1;
                    if (jo0Var != null) {
                        jo0Var.E(obj);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f38368a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f38368a;
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
