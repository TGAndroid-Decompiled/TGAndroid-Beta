package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
public final class pl0 implements TextWatcher {
    public final int f35863a;
    public final PasscodeActivity f35864b;

    public pl0(PasscodeActivity passcodeActivity, int i10) {
        this.f35863a = i10;
        this.f35864b = passcodeActivity;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10 = this.f35863a;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f35863a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f35864b;
                ll0 ll0Var = passcodeActivity.O;
                if (passcodeActivity.N) {
                    passcodeActivity.f30001n.removeCallbacks(ll0Var);
                    ll0Var.run();
                    return;
                }
                return;
            default:
                PasscodeActivity passcodeActivity2 = this.f35864b;
                ll0 ll0Var2 = passcodeActivity2.O;
                if (passcodeActivity2.N) {
                    passcodeActivity2.f30001n.removeCallbacks(ll0Var2);
                    ll0Var2.run();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f35863a;
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(int i10, int i11, int i12, CharSequence charSequence) {
    }

    private final void d(int i10, int i11, int i12, CharSequence charSequence) {
    }
}
