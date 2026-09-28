package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class ca0 implements RequestDelegate {
    public final int f32610a;
    public final LaunchActivity f32611b;

    public ca0(LaunchActivity launchActivity, int i10) {
        this.f32610a = i10;
        this.f32611b = launchActivity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f32610a;
        LaunchActivity launchActivity = this.f32611b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new n80(5, launchActivity, (TL_account.Password) tLObject));
                    return;
                }
                return;
            default:
                Pattern pattern2 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new n80(1, launchActivity, tLObject));
                return;
        }
    }
}
