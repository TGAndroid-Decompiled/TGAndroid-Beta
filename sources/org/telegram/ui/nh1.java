package org.telegram.ui;

import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class nh1 implements Utilities.Callback {
    public final int f36116a;
    public final UserInfoActivity f36117b;

    public nh1(UserInfoActivity userInfoActivity, int i10) {
        this.f36116a = i10;
        this.f36117b = userInfoActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f36116a) {
            case 0:
                UserInfoActivity userInfoActivity = this.f36117b;
                userInfoActivity.K = (TL_account.TL_birthday) obj;
                org.telegram.ui.Components.z51 z51Var = userInfoActivity.f31624y;
                if (z51Var != null) {
                    z51Var.Y2.N(true);
                }
                userInfoActivity.b0(true);
                return;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                UserInfoActivity userInfoActivity2 = this.f36117b;
                if (userInfoActivity2.L != chat) {
                    userInfoActivity2.L = chat;
                    if (chat != null) {
                        org.telegram.messenger.w1.o(R.string.EditProfileChannelSet, org.telegram.ui.Components.vc.a0(userInfoActivity2), R.raw.contact_check, 36);
                    }
                    userInfoActivity2.b0(true);
                    org.telegram.ui.Components.z51 z51Var2 = userInfoActivity2.f31624y;
                    if (z51Var2 != null) {
                        z51Var2.Y2.N(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
