package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
public final class ml0 implements TextWatcher {
    public final int f38657a;
    public final PasscodeActivity f38658b;

    public ml0(PasscodeActivity passcodeActivity, int i10) {
        this.f38657a = i10;
        this.f38658b = passcodeActivity;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10 = this.f38657a;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f38657a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f38658b;
                hl0 hl0Var = passcodeActivity.O;
                if (passcodeActivity.N) {
                    passcodeActivity.f33864n.removeCallbacks(hl0Var);
                    hl0Var.run();
                    return;
                }
                return;
            default:
                PasscodeActivity passcodeActivity2 = this.f38658b;
                hl0 hl0Var2 = passcodeActivity2.O;
                if (passcodeActivity2.N) {
                    passcodeActivity2.f33864n.removeCallbacks(hl0Var2);
                    hl0Var2.run();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f38657a;
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
