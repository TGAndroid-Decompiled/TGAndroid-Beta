package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
public final class li0 implements TextWatcher {
    public final int f47619a;
    public final PasscodeActivity f47620b;

    public li0(PasscodeActivity passcodeActivity, int i7) {
        this.f47619a = i7;
        this.f47620b = passcodeActivity;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i7 = this.f47619a;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        switch (this.f47619a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f47620b;
                gi0 gi0Var = passcodeActivity.S;
                if (passcodeActivity.R) {
                    passcodeActivity.f41328n.removeCallbacks(gi0Var);
                    gi0Var.run();
                    return;
                }
                return;
            default:
                PasscodeActivity passcodeActivity2 = this.f47620b;
                gi0 gi0Var2 = passcodeActivity2.S;
                if (passcodeActivity2.R) {
                    passcodeActivity2.f41328n.removeCallbacks(gi0Var2);
                    gi0Var2.run();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f47619a;
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
