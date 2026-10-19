package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class o90 implements RequestDelegate {
    public final int f39796a;
    public final LaunchActivity f39797b;

    public o90(LaunchActivity launchActivity, int i10) {
        this.f39796a = i10;
        this.f39797b = launchActivity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f39796a;
        LaunchActivity launchActivity = this.f39797b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.C1;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new z70(5, launchActivity, (TL_account.Password) tLObject));
                    return;
                }
                return;
            default:
                Pattern pattern2 = LaunchActivity.C1;
                AndroidUtilities.runOnUIThread(new z70(1, launchActivity, tLObject));
                return;
        }
    }
}
