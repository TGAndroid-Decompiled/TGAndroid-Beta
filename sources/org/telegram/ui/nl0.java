package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
public final class nl0 implements TextWatcher {
    public final int f41820a;
    public final PasscodeActivity f41821b;

    public nl0(PasscodeActivity passcodeActivity, int i10) {
        this.f41820a = i10;
        this.f41821b = passcodeActivity;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10 = this.f41820a;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f41820a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f41821b;
                hl0 hl0Var = passcodeActivity.S;
                if (passcodeActivity.R) {
                    passcodeActivity.f35621n.removeCallbacks(hl0Var);
                    hl0Var.run();
                    return;
                }
                return;
            default:
                PasscodeActivity passcodeActivity2 = this.f41821b;
                hl0 hl0Var2 = passcodeActivity2.S;
                if (passcodeActivity2.R) {
                    passcodeActivity2.f35621n.removeCallbacks(hl0Var2);
                    hl0Var2.run();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f41820a;
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
