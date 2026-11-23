package org.telegram.ui.Wallet;

import org.telegram.messenger.y10;
import org.telegram.ui.PasscodeActivity;
public final class f0 extends PasscodeActivity {
    public final boolean[] X;
    public final y10 Y;

    public f0(boolean[] zArr, y10 y10Var) {
        super(3);
        this.X = zArr;
        this.Y = y10Var;
    }

    @Override
    public final void onFragmentDestroy() {
        y10 y10Var;
        super.onFragmentDestroy();
        if (!this.X[0] && (y10Var = this.Y) != null) {
            y10Var.a("PASSCODE_FAILED");
        }
    }
}
