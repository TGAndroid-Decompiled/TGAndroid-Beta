package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class c80 implements RequestDelegate {
    public final int f44274a;
    public final LaunchActivity f44275b;

    public c80(LaunchActivity launchActivity, int i7) {
        this.f44274a = i7;
        this.f44275b = launchActivity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.f44274a;
        LaunchActivity launchActivity = this.f44275b;
        switch (i7) {
            case 0:
                String str = LaunchActivity.B1;
                if (tLObject != null) {
                    org.telegram.messenger.g0.h3(new f10(14, launchActivity, (TL_account.Password) tLObject));
                    return;
                }
                return;
            default:
                String str2 = LaunchActivity.B1;
                org.telegram.messenger.g0.h3(new f10(10, launchActivity, tLObject));
                return;
        }
    }
}
