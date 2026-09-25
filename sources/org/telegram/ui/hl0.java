package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
public final class hl0 implements TextWatcher {
    public final int f34248a;
    public final PasscodeActivity f34249b;

    public hl0(PasscodeActivity passcodeActivity, int i10) {
        this.f34248a = i10;
        this.f34249b = passcodeActivity;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10 = this.f34248a;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f34248a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f34249b;
                dl0 dl0Var = passcodeActivity.O;
                if (passcodeActivity.N) {
                    passcodeActivity.f31175n.removeCallbacks(dl0Var);
                    dl0Var.run();
                    return;
                }
                return;
            default:
                PasscodeActivity passcodeActivity2 = this.f34249b;
                dl0 dl0Var2 = passcodeActivity2.O;
                if (passcodeActivity2.N) {
                    passcodeActivity2.f31175n.removeCallbacks(dl0Var2);
                    dl0Var2.run();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f34248a;
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
