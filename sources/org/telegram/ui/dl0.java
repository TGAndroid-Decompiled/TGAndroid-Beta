package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
public final class dl0 implements TextWatcher {
    public final int f33676a;
    public final PasscodeActivity f33677b;

    public dl0(PasscodeActivity passcodeActivity, int i10) {
        this.f33676a = i10;
        this.f33677b = passcodeActivity;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10 = this.f33676a;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f33676a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f33677b;
                yk0 yk0Var = passcodeActivity.L;
                if (passcodeActivity.K) {
                    passcodeActivity.f31686n.removeCallbacks(yk0Var);
                    yk0Var.run();
                    return;
                }
                return;
            default:
                PasscodeActivity passcodeActivity2 = this.f33677b;
                yk0 yk0Var2 = passcodeActivity2.L;
                if (passcodeActivity2.K) {
                    passcodeActivity2.f31686n.removeCallbacks(yk0Var2);
                    yk0Var2.run();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f33676a;
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
