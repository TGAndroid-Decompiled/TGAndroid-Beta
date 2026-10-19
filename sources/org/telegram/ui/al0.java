package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
public final class al0 implements TextWatcher {
    public final int f35378a;
    public final PasscodeActivity f35379b;

    public al0(PasscodeActivity passcodeActivity, int i10) {
        this.f35378a = i10;
        this.f35379b = passcodeActivity;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10 = this.f35378a;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f35378a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f35379b;
                wk0 wk0Var = passcodeActivity.S;
                if (passcodeActivity.R) {
                    passcodeActivity.f33223n.removeCallbacks(wk0Var);
                    wk0Var.run();
                    return;
                }
                return;
            default:
                PasscodeActivity passcodeActivity2 = this.f35379b;
                wk0 wk0Var2 = passcodeActivity2.S;
                if (passcodeActivity2.R) {
                    passcodeActivity2.f33223n.removeCallbacks(wk0Var2);
                    wk0Var2.run();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f35378a;
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
