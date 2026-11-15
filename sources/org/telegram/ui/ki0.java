package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
public final class ki0 implements TextWatcher {
    public final int f48708a;
    public final PasscodeActivity f48709b;

    public ki0(PasscodeActivity passcodeActivity, int i7) {
        this.f48708a = i7;
        this.f48709b = passcodeActivity;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i7 = this.f48708a;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        switch (this.f48708a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f48709b;
                fi0 fi0Var = passcodeActivity.T;
                if (passcodeActivity.S) {
                    passcodeActivity.f42698n.removeCallbacks(fi0Var);
                    fi0Var.run();
                    return;
                }
                return;
            default:
                PasscodeActivity passcodeActivity2 = this.f48709b;
                fi0 fi0Var2 = passcodeActivity2.T;
                if (passcodeActivity2.S) {
                    passcodeActivity2.f42698n.removeCallbacks(fi0Var2);
                    fi0Var2.run();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f48708a;
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
