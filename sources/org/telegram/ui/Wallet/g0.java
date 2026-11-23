package org.telegram.ui.Wallet;

import org.telegram.messenger.w10;
import org.telegram.ui.PasscodeActivity;
public final class g0 extends PasscodeActivity {
    public final boolean[] X;
    public final w10 Y;

    public g0(boolean[] zArr, w10 w10Var) {
        super(3);
        this.X = zArr;
        this.Y = w10Var;
    }

    @Override
    public final void onFragmentDestroy() {
        w10 w10Var;
        super.onFragmentDestroy();
        if (!this.X[0] && (w10Var = this.Y) != null) {
            w10Var.a("PASSCODE_FAILED");
        }
    }
}
