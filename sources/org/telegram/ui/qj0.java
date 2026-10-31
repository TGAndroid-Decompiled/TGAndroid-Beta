package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
public final class qj0 implements TextWatcher {
    public final int f40996a;
    public final PasscodeActivity f40997b;

    public qj0(PasscodeActivity passcodeActivity, int i10) {
        this.f40996a = i10;
        this.f40997b = passcodeActivity;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10 = this.f40996a;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f40996a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f40997b;
                lj0 lj0Var = passcodeActivity.S;
                if (passcodeActivity.R) {
                    passcodeActivity.f33421n.removeCallbacks(lj0Var);
                    lj0Var.run();
                    return;
                }
                return;
            default:
                PasscodeActivity passcodeActivity2 = this.f40997b;
                lj0 lj0Var2 = passcodeActivity2.S;
                if (passcodeActivity2.R) {
                    passcodeActivity2.f33421n.removeCallbacks(lj0Var2);
                    lj0Var2.run();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f40996a;
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
