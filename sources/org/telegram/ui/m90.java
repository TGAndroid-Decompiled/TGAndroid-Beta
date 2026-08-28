package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class m90 implements RequestDelegate {
    public final int f40356a;
    public final LaunchActivity f40357b;

    public m90(LaunchActivity launchActivity, int i9) {
        this.f40356a = i9;
        this.f40357b = launchActivity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i9 = this.f40356a;
        LaunchActivity launchActivity = this.f40357b;
        switch (i9) {
            case 0:
                Pattern pattern = LaunchActivity.f35493x1;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new x20(12, launchActivity, (TL_account.Password) tLObject));
                    return;
                }
                return;
            default:
                Pattern pattern2 = LaunchActivity.f35493x1;
                AndroidUtilities.runOnUIThread(new x20(8, launchActivity, tLObject));
                return;
        }
    }
}
