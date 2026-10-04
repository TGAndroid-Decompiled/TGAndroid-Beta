package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class ga0 implements RequestDelegate {
    public final int f36549a;
    public final LaunchActivity f36550b;

    public ga0(LaunchActivity launchActivity, int i10) {
        this.f36549a = i10;
        this.f36550b = launchActivity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f36549a;
        LaunchActivity launchActivity = this.f36550b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new h90(3, launchActivity, (TL_account.Password) tLObject));
                    return;
                }
                return;
            default:
                Pattern pattern2 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new cu(29, launchActivity, tLObject));
                return;
        }
    }
}
