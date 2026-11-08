package org.telegram.ui.Wallet;

import org.telegram.messenger.c20;
import org.telegram.ui.PasscodeActivity;
public final class z extends PasscodeActivity {
    public final boolean[] W;
    public final c20 X;

    public z(boolean[] zArr, c20 c20Var) {
        super(3);
        this.W = zArr;
        this.X = c20Var;
    }

    @Override
    public final void onFragmentDestroy() {
        c20 c20Var;
        super.onFragmentDestroy();
        if (!this.W[0] && (c20Var = this.X) != null) {
            c20Var.a("PASSCODE_FAILED");
        }
    }
}
