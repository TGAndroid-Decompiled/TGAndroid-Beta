package org.telegram.ui;

import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class ph1 implements Utilities.Callback {
    public final int f40967a;
    public final UserInfoActivity f40968b;

    public ph1(UserInfoActivity userInfoActivity, int i10) {
        this.f40967a = i10;
        this.f40968b = userInfoActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f40967a) {
            case 0:
                UserInfoActivity userInfoActivity = this.f40968b;
                userInfoActivity.J = (TL_account.TL_birthday) obj;
                org.telegram.ui.Components.j71 j71Var = userInfoActivity.f34429x;
                if (j71Var != null) {
                    j71Var.W2.N(true);
                }
                userInfoActivity.b0(true);
                return;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                UserInfoActivity userInfoActivity2 = this.f40968b;
                if (userInfoActivity2.K != chat) {
                    userInfoActivity2.K = chat;
                    if (chat != null) {
                        org.telegram.messenger.v0.q(R.string.EditProfileChannelSet, org.telegram.ui.Components.zc.a0(userInfoActivity2), R.raw.contact_check, 36);
                    }
                    userInfoActivity2.b0(true);
                    org.telegram.ui.Components.j71 j71Var2 = userInfoActivity2.f34429x;
                    if (j71Var2 != null) {
                        j71Var2.W2.N(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
