package org.telegram.ui.Wallet;

import org.telegram.messenger.u10;
import org.telegram.ui.PasscodeActivity;
public final class x extends PasscodeActivity {
    public final boolean[] X;
    public final u10 Y;

    public x(boolean[] zArr, u10 u10Var) {
        super(3);
        this.X = zArr;
        this.Y = u10Var;
    }

    @Override
    public final void onFragmentDestroy() {
        u10 u10Var;
        super.onFragmentDestroy();
        if (!this.X[0] && (u10Var = this.Y) != null) {
            u10Var.a("PASSCODE_FAILED");
        }
    }
}
