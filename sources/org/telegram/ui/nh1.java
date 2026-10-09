package org.telegram.ui;

import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class nh1 implements Utilities.Callback {
    public final int f40215a;
    public final UserInfoActivity f40216b;

    public nh1(UserInfoActivity userInfoActivity, int i10) {
        this.f40215a = i10;
        this.f40216b = userInfoActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f40215a) {
            case 0:
                UserInfoActivity userInfoActivity = this.f40216b;
                userInfoActivity.J = (TL_account.TL_birthday) obj;
                org.telegram.ui.Components.e71 e71Var = userInfoActivity.f34590x;
                if (e71Var != null) {
                    e71Var.W2.N(true);
                }
                userInfoActivity.b0(true);
                return;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                UserInfoActivity userInfoActivity2 = this.f40216b;
                if (userInfoActivity2.K != chat) {
                    userInfoActivity2.K = chat;
                    if (chat != null) {
                        org.telegram.messenger.q.q(R.string.EditProfileChannelSet, org.telegram.ui.Components.ad.a0(userInfoActivity2), R.raw.contact_check, 36);
                    }
                    userInfoActivity2.b0(true);
                    org.telegram.ui.Components.e71 e71Var2 = userInfoActivity2.f34590x;
                    if (e71Var2 != null) {
                        e71Var2.W2.N(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
