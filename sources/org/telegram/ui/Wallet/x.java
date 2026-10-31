package org.telegram.ui.Wallet;

import org.telegram.messenger.q20;
import org.telegram.ui.PasscodeActivity;
public final class x extends PasscodeActivity {
    public final boolean[] W;
    public final q20 X;

    public x(boolean[] zArr, q20 q20Var) {
        super(3);
        this.W = zArr;
        this.X = q20Var;
    }

    @Override
    public final void onFragmentDestroy() {
        q20 q20Var;
        super.onFragmentDestroy();
        if (!this.W[0] && (q20Var = this.X) != null) {
            q20Var.a("PASSCODE_FAILED");
        }
    }
}
