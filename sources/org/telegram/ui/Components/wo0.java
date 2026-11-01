package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class wo0 implements TextWatcher {
    public final int f32290a;
    public final pp0 f32291b;

    public wo0(pp0 pp0Var, int i10) {
        this.f32290a = i10;
        this.f32291b = pp0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f32290a) {
            case 0:
                org.telegram.messenger.i0.g3(new vo0(this, 0));
                return;
            default:
                pp0 pp0Var = this.f32291b;
                ip0 ip0Var = pp0Var.C1;
                ew0 ew0Var = pp0Var.I1;
                h10 h10Var = pp0Var.f29491q2;
                if (!TextUtils.isEmpty(h10Var.f26635r.getText())) {
                    pp0Var.K0(false);
                }
                if (pp0Var.f29495s2) {
                    String obj = h10Var.f26635r.getText().toString();
                    if (obj.length() != 0) {
                        if (ew0Var != null) {
                            ew0Var.d.setText(org.telegram.messenger.dd.L0(2131748183, null));
                        }
                    } else if (pp0Var.f29504x1.getAdapter() != ip0Var) {
                        int J0 = pp0.J0(pp0Var);
                        ew0Var.d.setText(org.telegram.messenger.dd.L0(2131748183, null));
                        ew0Var.e(false, true);
                        pp0Var.K0(false);
                        ip0Var.f();
                        if (J0 > 0) {
                            pp0Var.f29508z1.h1(0, -J0);
                        }
                    }
                    mp0 mp0Var = pp0Var.E1;
                    if (mp0Var != null) {
                        mp0Var.E(obj);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f32290a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f32290a;
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
