package org.telegram.ui.Wallet;

import org.telegram.messenger.r20;
import org.telegram.ui.PasscodeActivity;
public final class x extends PasscodeActivity {
    public final boolean[] W;
    public final r20 X;

    public x(boolean[] zArr, r20 r20Var) {
        super(3);
        this.W = zArr;
        this.X = r20Var;
    }

    @Override
    public final void onFragmentDestroy() {
        r20 r20Var;
        super.onFragmentDestroy();
        if (!this.W[0] && (r20Var = this.X) != null) {
            r20Var.a("PASSCODE_FAILED");
        }
    }
}
