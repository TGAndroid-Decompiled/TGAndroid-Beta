package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
public final class li0 implements TextWatcher {
    public final int f49768a;
    public final PasscodeActivity f49769b;

    public li0(PasscodeActivity passcodeActivity, int i7) {
        this.f49768a = i7;
        this.f49769b = passcodeActivity;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i7 = this.f49768a;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        switch (this.f49768a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f49769b;
                gi0 gi0Var = passcodeActivity.T;
                if (passcodeActivity.S) {
                    passcodeActivity.f43263n.removeCallbacks(gi0Var);
                    gi0Var.run();
                    return;
                }
                return;
            default:
                PasscodeActivity passcodeActivity2 = this.f49769b;
                gi0 gi0Var2 = passcodeActivity2.T;
                if (passcodeActivity2.S) {
                    passcodeActivity2.f43263n.removeCallbacks(gi0Var2);
                    gi0Var2.run();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        int i12 = this.f49768a;
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
