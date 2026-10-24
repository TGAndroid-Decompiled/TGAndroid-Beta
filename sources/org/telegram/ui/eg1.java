package org.telegram.ui;

import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class eg1 implements Utilities.Callback {
    public final int f36908a;
    public final UserInfoActivity f36909b;

    public eg1(UserInfoActivity userInfoActivity, int i10) {
        this.f36908a = i10;
        this.f36909b = userInfoActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f36908a) {
            case 0:
                UserInfoActivity userInfoActivity = this.f36909b;
                userInfoActivity.K = (TL_account.TL_birthday) obj;
                org.telegram.ui.Components.c71 c71Var = userInfoActivity.f34258y;
                if (c71Var != null) {
                    c71Var.Z2.N(true);
                }
                userInfoActivity.b0(true);
                return;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                UserInfoActivity userInfoActivity2 = this.f36909b;
                if (userInfoActivity2.L != chat) {
                    userInfoActivity2.L = chat;
                    if (chat != null) {
                        org.telegram.messenger.v0.p(R.string.EditProfileChannelSet, org.telegram.ui.Components.vc.a0(userInfoActivity2), R.raw.contact_check, 36);
                    }
                    userInfoActivity2.b0(true);
                    org.telegram.ui.Components.c71 c71Var2 = userInfoActivity2.f34258y;
                    if (c71Var2 != null) {
                        c71Var2.Z2.N(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
