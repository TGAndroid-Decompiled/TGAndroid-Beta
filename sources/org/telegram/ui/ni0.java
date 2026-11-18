package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
public final class ni0 implements TextWatcher {
    public final int f50206a;
    public final PasscodeActivity f50207b;

    public ni0(PasscodeActivity passcodeActivity, int i7) {
        this.f50206a = i7;
        this.f50207b = passcodeActivity;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i7 = this.f50206a;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        switch (this.f50206a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f50207b;
                ii0 ii0Var = passcodeActivity.T;
                if (passcodeActivity.S) {
                    passcodeActivity.f43143n.removeCallbacks(ii0Var);
                    ii0Var.run();
                    return;
                }
                return;
            default:
                PasscodeActivity passcodeActivity2 = this.f50207b;
                ii0 ii0Var2 = passcodeActivity2.T;
                if (passcodeActivity2.S) {
                    passcodeActivity2.f43143n.removeCallbacks(ii0Var2);
                    ii0Var2.run();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f50206a;
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
