package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
public final class fl0 implements TextWatcher {
    public final int f36910a;
    public final PasscodeActivity f36911b;

    public fl0(PasscodeActivity passcodeActivity, int i10) {
        this.f36910a = i10;
        this.f36911b = passcodeActivity;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10 = this.f36910a;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f36910a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f36911b;
                al0 al0Var = passcodeActivity.L;
                if (passcodeActivity.K) {
                    passcodeActivity.f34211n.removeCallbacks(al0Var);
                    al0Var.run();
                    return;
                }
                return;
            default:
                PasscodeActivity passcodeActivity2 = this.f36911b;
                al0 al0Var2 = passcodeActivity2.L;
                if (passcodeActivity2.K) {
                    passcodeActivity2.f34211n.removeCallbacks(al0Var2);
                    al0Var2.run();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f36910a;
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
