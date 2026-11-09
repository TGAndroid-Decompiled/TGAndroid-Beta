package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class b80 implements RequestDelegate {
    public final int f43931a;
    public final LaunchActivity f43932b;

    public b80(LaunchActivity launchActivity, int i7) {
        this.f43931a = i7;
        this.f43932b = launchActivity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.f43931a;
        LaunchActivity launchActivity = this.f43932b;
        switch (i7) {
            case 0:
                String str = LaunchActivity.B1;
                if (tLObject != null) {
                    org.telegram.messenger.g0.h3(new s10(13, launchActivity, (TL_account.Password) tLObject));
                    return;
                }
                return;
            default:
                String str2 = LaunchActivity.B1;
                org.telegram.messenger.g0.h3(new s10(9, launchActivity, tLObject));
                return;
        }
    }
}
