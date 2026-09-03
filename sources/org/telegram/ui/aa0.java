package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class aa0 implements RequestDelegate {
    public final int f32524a;
    public final LaunchActivity f32525b;

    public aa0(LaunchActivity launchActivity, int i10) {
        this.f32524a = i10;
        this.f32525b = launchActivity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f32524a;
        LaunchActivity launchActivity = this.f32525b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.f31586y1;
                if (tLObject != null) {
                    AndroidUtilities.runOnUIThread(new w10(17, launchActivity, (TL_account.Password) tLObject));
                    return;
                }
                return;
            default:
                Pattern pattern2 = LaunchActivity.f31586y1;
                AndroidUtilities.runOnUIThread(new w10(13, launchActivity, tLObject));
                return;
        }
    }
}
