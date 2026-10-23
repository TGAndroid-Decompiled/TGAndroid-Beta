package org.telegram.ui;

import android.text.Editable;
import android.text.TextWatcher;
public final class dl0 implements TextWatcher {
    public final int f36653a;
    public final PasscodeActivity f36654b;

    public dl0(PasscodeActivity passcodeActivity, int i10) {
        this.f36653a = i10;
        this.f36654b = passcodeActivity;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10 = this.f36653a;
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        switch (this.f36653a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f36654b;
                zk0 zk0Var = passcodeActivity.S;
                if (passcodeActivity.R) {
                    passcodeActivity.f33531n.removeCallbacks(zk0Var);
                    zk0Var.run();
                    return;
                }
                return;
            default:
                PasscodeActivity passcodeActivity2 = this.f36654b;
                zk0 zk0Var2 = passcodeActivity2.S;
                if (passcodeActivity2.R) {
                    passcodeActivity2.f33531n.removeCallbacks(zk0Var2);
                    zk0Var2.run();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        int i13 = this.f36653a;
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
