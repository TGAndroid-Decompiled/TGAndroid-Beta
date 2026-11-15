package org.telegram.ui.Wallet;

import org.telegram.messenger.z10;
import org.telegram.ui.PasscodeActivity;
public final class y extends PasscodeActivity {
    public final boolean[] X;
    public final z10 Y;

    public y(boolean[] zArr, z10 z10Var) {
        super(3);
        this.X = zArr;
        this.Y = z10Var;
    }

    @Override
    public final void onFragmentDestroy() {
        z10 z10Var;
        super.onFragmentDestroy();
        if (!this.X[0] && (z10Var = this.Y) != null) {
            z10Var.a("PASSCODE_FAILED");
        }
    }
}
