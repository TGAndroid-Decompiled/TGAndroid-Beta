package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
public final class ki0 implements TextWatcher {
    public final int f47300a;
    public final PasscodeActivity f47301b;

    public ki0(PasscodeActivity passcodeActivity, int i7) {
        this.f47300a = i7;
        this.f47301b = passcodeActivity;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i7 = this.f47300a;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        switch (this.f47300a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f47301b;
                fi0 fi0Var = passcodeActivity.S;
                if (passcodeActivity.R) {
                    passcodeActivity.f41337n.removeCallbacks(fi0Var);
                    fi0Var.run();
                    return;
                }
                return;
            default:
                PasscodeActivity passcodeActivity2 = this.f47301b;
                fi0 fi0Var2 = passcodeActivity2.S;
                if (passcodeActivity2.R) {
                    passcodeActivity2.f41337n.removeCallbacks(fi0Var2);
                    fi0Var2.run();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f47300a;
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(int i7, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i7, int i10, int i11, CharSequence charSequence) {
    }
}
