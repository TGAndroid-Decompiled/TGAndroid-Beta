package org.telegram.ui;

import java.util.regex.Pattern;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class a90 implements RequestDelegate {
    public final int f35589a;
    public final LaunchActivity f35590b;

    public a90(LaunchActivity launchActivity, int i10) {
        this.f35589a = i10;
        this.f35590b = launchActivity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f35589a;
        LaunchActivity launchActivity = this.f35590b;
        switch (i10) {
            case 0:
                Pattern pattern = LaunchActivity.D1;
                if (tLObject != null) {
                    org.telegram.messenger.i0.g3(new f70(6, launchActivity, (TL_account.Password) tLObject));
                    return;
                }
                return;
            default:
                Pattern pattern2 = LaunchActivity.D1;
                org.telegram.messenger.i0.g3(new f70(2, launchActivity, tLObject));
                return;
        }
    }
}
