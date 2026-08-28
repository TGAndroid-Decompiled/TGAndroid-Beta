package org.telegram.ui;

import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class eg1 implements Utilities.Callback {
    public final int f37943a;
    public final UserInfoActivity f37944b;

    public eg1(UserInfoActivity userInfoActivity, int i9) {
        this.f37943a = i9;
        this.f37944b = userInfoActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f37943a) {
            case 0:
                UserInfoActivity userInfoActivity = this.f37944b;
                userInfoActivity.F = (TL_account.TL_birthday) obj;
                org.telegram.ui.Components.c51 c51Var = userInfoActivity.f36283x;
                if (c51Var != null) {
                    c51Var.U2.N(true);
                }
                userInfoActivity.a0(true);
                return;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                UserInfoActivity userInfoActivity2 = this.f37944b;
                if (userInfoActivity2.G != chat) {
                    userInfoActivity2.G = chat;
                    if (chat != null) {
                        org.telegram.messenger.l0.p(R.string.EditProfileChannelSet, org.telegram.ui.Components.oc.a0(userInfoActivity2), R.raw.contact_check, 36);
                    }
                    userInfoActivity2.a0(true);
                    org.telegram.ui.Components.c51 c51Var2 = userInfoActivity2.f36283x;
                    if (c51Var2 != null) {
                        c51Var2.U2.N(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
