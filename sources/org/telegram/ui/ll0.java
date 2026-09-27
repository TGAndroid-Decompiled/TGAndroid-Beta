package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
public final class ll0 implements TextWatcher {
    public final int f35372a;
    public final PasscodeActivity f35373b;

    public ll0(PasscodeActivity passcodeActivity, int i10) {
        this.f35372a = i10;
        this.f35373b = passcodeActivity;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10 = this.f35372a;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f35372a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f35373b;
                gl0 gl0Var = passcodeActivity.O;
                if (passcodeActivity.N) {
                    passcodeActivity.f31176n.removeCallbacks(gl0Var);
                    gl0Var.run();
                    return;
                }
                return;
            default:
                PasscodeActivity passcodeActivity2 = this.f35373b;
                gl0 gl0Var2 = passcodeActivity2.O;
                if (passcodeActivity2.N) {
                    passcodeActivity2.f31176n.removeCallbacks(gl0Var2);
                    gl0Var2.run();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f35372a;
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
