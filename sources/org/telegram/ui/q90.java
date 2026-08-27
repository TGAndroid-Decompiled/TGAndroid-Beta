package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

public final class q90 implements RequestDelegate {

    public final int f41547a;

    public final LaunchActivity f41548b;

    public q90(LaunchActivity launchActivity, int i10) {
        this.f41547a = i10;
        this.f41548b = launchActivity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f41547a;
        LaunchActivity launchActivity = this.f41548b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.f35496x1;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new a30(12, launchActivity, (TL_account.Password) tLObject));
                }
                break;
            default:
                Pattern pattern2 = LaunchActivity.f35496x1;
                AndroidUtilities.runOnUIThread(new a30(8, launchActivity, tLObject));
                break;
        }
    }
}
