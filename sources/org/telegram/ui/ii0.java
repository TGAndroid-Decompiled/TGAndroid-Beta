package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
public final class ii0 implements TextWatcher {
    public final int f46676a;
    public final PasscodeActivity f46677b;

    public ii0(PasscodeActivity passcodeActivity, int i7) {
        this.f46676a = i7;
        this.f46677b = passcodeActivity;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i7 = this.f46676a;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        switch (this.f46676a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f46677b;
                di0 di0Var = passcodeActivity.S;
                if (passcodeActivity.R) {
                    passcodeActivity.f41326n.removeCallbacks(di0Var);
                    di0Var.run();
                    return;
                }
                return;
            default:
                PasscodeActivity passcodeActivity2 = this.f46677b;
                di0 di0Var2 = passcodeActivity2.S;
                if (passcodeActivity2.R) {
                    passcodeActivity2.f41326n.removeCallbacks(di0Var2);
                    di0Var2.run();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f46676a;
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
