package org.telegram.ui;

import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class fg1 implements Utilities.Callback {
    public final int f37333a;
    public final UserInfoActivity f37334b;

    public fg1(UserInfoActivity userInfoActivity, int i10) {
        this.f37333a = i10;
        this.f37334b = userInfoActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f37333a) {
            case 0:
                UserInfoActivity userInfoActivity = this.f37334b;
                userInfoActivity.K = (TL_account.TL_birthday) obj;
                org.telegram.ui.Components.d71 d71Var = userInfoActivity.f34256y;
                if (d71Var != null) {
                    d71Var.Z2.N(true);
                }
                userInfoActivity.b0(true);
                return;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                UserInfoActivity userInfoActivity2 = this.f37334b;
                if (userInfoActivity2.L != chat) {
                    userInfoActivity2.L = chat;
                    if (chat != null) {
                        org.telegram.messenger.v0.p(R.string.EditProfileChannelSet, org.telegram.ui.Components.xc.a0(userInfoActivity2), R.raw.contact_check, 36);
                    }
                    userInfoActivity2.b0(true);
                    org.telegram.ui.Components.d71 d71Var2 = userInfoActivity2.f34256y;
                    if (d71Var2 != null) {
                        d71Var2.Z2.N(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
