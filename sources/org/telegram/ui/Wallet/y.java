package org.telegram.ui.Wallet;

import org.telegram.messenger.Utilities;
import org.telegram.ui.PasscodeActivity;
public final class y extends PasscodeActivity {
    public final boolean[] W;
    public final Utilities.Callback X;

    public y(boolean[] zArr, Utilities.Callback callback) {
        super(3);
        this.W = zArr;
        this.X = callback;
    }

    @Override
    public final void onFragmentDestroy() {
        Utilities.Callback callback;
        super.onFragmentDestroy();
        if (!this.W[0] && (callback = this.X) != null) {
            callback.run("PASSCODE_FAILED");
        }
    }
}
