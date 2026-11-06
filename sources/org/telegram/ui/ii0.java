package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
public final class ii0 implements TextWatcher {
    public final int f46668a;
    public final PasscodeActivity f46669b;

    public ii0(PasscodeActivity passcodeActivity, int i7) {
        this.f46668a = i7;
        this.f46669b = passcodeActivity;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i7 = this.f46668a;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        switch (this.f46668a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f46669b;
                di0 di0Var = passcodeActivity.S;
                if (passcodeActivity.R) {
                    passcodeActivity.f41302n.removeCallbacks(di0Var);
                    di0Var.run();
                    return;
                }
                return;
            default:
                PasscodeActivity passcodeActivity2 = this.f46669b;
                di0 di0Var2 = passcodeActivity2.S;
                if (passcodeActivity2.R) {
                    passcodeActivity2.f41302n.removeCallbacks(di0Var2);
                    di0Var2.run();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f46668a;
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
