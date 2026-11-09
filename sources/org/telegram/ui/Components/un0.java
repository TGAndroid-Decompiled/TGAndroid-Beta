package org.telegram.ui.Components;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class un0 implements TextWatcher {
    public final int f38758a;
    public final no0 f38759b;

    public un0(no0 no0Var, int i7) {
        this.f38758a = i7;
        this.f38759b = no0Var;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.f38758a) {
            case 0:
                org.telegram.messenger.g0.h3(new pb0(this, 25));
                return;
            default:
                no0 no0Var = this.f38759b;
                go0 go0Var = no0Var.C1;
                cv0 cv0Var = no0Var.I1;
                s00 s00Var = no0Var.f36452q2;
                if (!TextUtils.isEmpty(s00Var.f37857r.getText())) {
                    no0Var.K0(false);
                }
                if (no0Var.f36456s2) {
                    String obj = s00Var.f37857r.getText().toString();
                    if (obj.length() != 0) {
                        if (cv0Var != null) {
                            cv0Var.d.setText(org.telegram.messenger.id.M0(2131748167, null));
                        }
                    } else if (no0Var.f36465x1.getAdapter() != go0Var) {
                        int J0 = no0.J0(no0Var);
                        cv0Var.d.setText(org.telegram.messenger.id.M0(2131748167, null));
                        cv0Var.e(false, true);
                        no0Var.K0(false);
                        go0Var.f();
                        if (J0 > 0) {
                            no0Var.f36469z1.h1(0, -J0);
                        }
                    }
                    ko0 ko0Var = no0Var.E1;
                    if (ko0Var != null) {
                        ko0Var.E(obj);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f38758a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f38758a;
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
