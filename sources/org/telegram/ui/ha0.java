package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class ha0 implements RequestDelegate {
    public final int f33337a;
    public final LaunchActivity f33338b;

    public ha0(LaunchActivity launchActivity, int i10) {
        this.f33337a = i10;
        this.f33338b = launchActivity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f33337a;
        LaunchActivity launchActivity = this.f33338b;
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
                AndroidUtilities.runOnUIThread(new uv(29, launchActivity, tLObject));
                return;
        }
    }
}
