package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
public final class gi0 implements TextWatcher {
    public final int f45669a;
    public final PasscodeActivity f45670b;

    public gi0(PasscodeActivity passcodeActivity, int i3) {
        this.f45669a = i3;
        this.f45670b = passcodeActivity;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i3 = this.f45669a;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        switch (this.f45669a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f45670b;
                ai0 ai0Var = passcodeActivity.T;
                if (passcodeActivity.S) {
                    passcodeActivity.f41359n.removeCallbacks(ai0Var);
                    ai0Var.run();
                    return;
                }
                return;
            default:
                PasscodeActivity passcodeActivity2 = this.f45670b;
                ai0 ai0Var2 = passcodeActivity2.T;
                if (passcodeActivity2.S) {
                    passcodeActivity2.f41359n.removeCallbacks(ai0Var2);
                    ai0Var2.run();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i3, int i10, int i11) {
        int i12 = this.f45669a;
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(int i3, int i10, int i11, CharSequence charSequence) {
    }

    private final void d(int i3, int i10, int i11, CharSequence charSequence) {
    }
}
