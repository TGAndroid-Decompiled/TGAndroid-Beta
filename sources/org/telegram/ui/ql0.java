package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
public final class ql0 implements TextWatcher {
    public final int f41232a;
    public final PasscodeActivity f41233b;

    public ql0(PasscodeActivity passcodeActivity, int i10) {
        this.f41232a = i10;
        this.f41233b = passcodeActivity;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10 = this.f41232a;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f41232a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f41233b;
                ml0 ml0Var = passcodeActivity.S;
                if (passcodeActivity.R) {
                    passcodeActivity.f33916n.removeCallbacks(ml0Var);
                    ml0Var.run();
                    return;
                }
                return;
            default:
                PasscodeActivity passcodeActivity2 = this.f41233b;
                ml0 ml0Var2 = passcodeActivity2.S;
                if (passcodeActivity2.R) {
                    passcodeActivity2.f33916n.removeCallbacks(ml0Var2);
                    ml0Var2.run();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f41232a;
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
