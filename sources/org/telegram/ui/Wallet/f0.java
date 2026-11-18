package org.telegram.ui.Wallet;

import org.telegram.messenger.x10;
import org.telegram.ui.PasscodeActivity;
public final class f0 extends PasscodeActivity {
    public final boolean[] X;
    public final x10 Y;

    public f0(boolean[] zArr, x10 x10Var) {
        super(3);
        this.X = zArr;
        this.Y = x10Var;
    }

    @Override
    public final void onFragmentDestroy() {
        x10 x10Var;
        super.onFragmentDestroy();
        if (!this.X[0] && (x10Var = this.Y) != null) {
            x10Var.a("PASSCODE_FAILED");
        }
    }
}
