package org.telegram.ui;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class a80 implements RequestDelegate {
    public final int f45529a;
    public final LaunchActivity f45530b;

    public a80(LaunchActivity launchActivity, int i7) {
        this.f45529a = i7;
        this.f45530b = launchActivity;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.f45529a;
        LaunchActivity launchActivity = this.f45530b;
        switch (i7) {
            case 0:
                String str = LaunchActivity.C1;
                if (tLObject != null) {
                    org.telegram.messenger.g0.g3(new h60(6, launchActivity, (TL_account.Password) tLObject));
                    return;
                }
                return;
            default:
                String str2 = LaunchActivity.C1;
                org.telegram.messenger.g0.g3(new h60(2, launchActivity, tLObject));
                return;
        }
    }
}
