package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
public final class ol0 implements TextWatcher {
    public final int f36246a;
    public final PasscodeActivity f36247b;

    public ol0(PasscodeActivity passcodeActivity, int i10) {
        this.f36246a = i10;
        this.f36247b = passcodeActivity;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10 = this.f36246a;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f36246a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f36247b;
                jl0 jl0Var = passcodeActivity.O;
                if (passcodeActivity.N) {
                    passcodeActivity.f30885n.removeCallbacks(jl0Var);
                    jl0Var.run();
                    return;
                }
                return;
            default:
                PasscodeActivity passcodeActivity2 = this.f36247b;
                jl0 jl0Var2 = passcodeActivity2.O;
                if (passcodeActivity2.N) {
                    passcodeActivity2.f30885n.removeCallbacks(jl0Var2);
                    jl0Var2.run();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f36246a;
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
