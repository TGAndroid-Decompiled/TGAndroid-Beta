package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
public final class cl0 implements TextWatcher {
    public final int f35939a;
    public final PasscodeActivity f35940b;

    public cl0(PasscodeActivity passcodeActivity, int i10) {
        this.f35939a = i10;
        this.f35940b = passcodeActivity;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10 = this.f35939a;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f35939a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f35940b;
                yk0 yk0Var = passcodeActivity.S;
                if (passcodeActivity.R) {
                    passcodeActivity.f33217n.removeCallbacks(yk0Var);
                    yk0Var.run();
                    return;
                }
                return;
            default:
                PasscodeActivity passcodeActivity2 = this.f35940b;
                yk0 yk0Var2 = passcodeActivity2.S;
                if (passcodeActivity2.R) {
                    passcodeActivity2.f33217n.removeCallbacks(yk0Var2);
                    yk0Var2.run();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f35939a;
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
