package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
public final class ll0 implements TextWatcher {
    public final int f41297a;
    public final PasscodeActivity f41298b;

    public ll0(PasscodeActivity passcodeActivity, int i10) {
        this.f41297a = i10;
        this.f41298b = passcodeActivity;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10 = this.f41297a;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f41297a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f41298b;
                fl0 fl0Var = passcodeActivity.S;
                if (passcodeActivity.R) {
                    passcodeActivity.f35597n.removeCallbacks(fl0Var);
                    fl0Var.run();
                    return;
                }
                return;
            default:
                PasscodeActivity passcodeActivity2 = this.f41298b;
                fl0 fl0Var2 = passcodeActivity2.S;
                if (passcodeActivity2.R) {
                    passcodeActivity2.f35597n.removeCallbacks(fl0Var2);
                    fl0Var2.run();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f41297a;
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
