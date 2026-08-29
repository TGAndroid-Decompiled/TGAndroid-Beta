package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class q90 implements RequestDelegate {
    public final int f41599a;
    public final LaunchActivity f41600b;

    public q90(LaunchActivity launchActivity, int i10) {
        this.f41599a = i10;
        this.f41600b = launchActivity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f41599a;
        LaunchActivity launchActivity = this.f41600b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.f35560x1;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new x60(9, launchActivity, (TL_account.Password) tLObject));
                    return;
                }
                return;
            default:
                Pattern pattern2 = LaunchActivity.f35560x1;
                AndroidUtilities.runOnUIThread(new x60(5, launchActivity, tLObject));
                return;
        }
    }
}
