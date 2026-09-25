package org.telegram.ui;

import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class eh1 implements Utilities.Callback {
    public final int f33413a;
    public final UserInfoActivity f33414b;

    public eh1(UserInfoActivity userInfoActivity, int i10) {
        this.f33413a = i10;
        this.f33414b = userInfoActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f33413a) {
            case 0:
                UserInfoActivity userInfoActivity = this.f33414b;
                userInfoActivity.J = (TL_account.TL_birthday) obj;
                org.telegram.ui.Components.l61 l61Var = userInfoActivity.f31893x;
                if (l61Var != null) {
                    l61Var.Y2.N(true);
                }
                userInfoActivity.b0(true);
                return;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                UserInfoActivity userInfoActivity2 = this.f33414b;
                if (userInfoActivity2.K != chat) {
                    userInfoActivity2.K = chat;
                    if (chat != null) {
                        org.telegram.messenger.f0.p(R.string.EditProfileChannelSet, org.telegram.ui.Components.xc.a0(userInfoActivity2), R.raw.contact_check, 36);
                    }
                    userInfoActivity2.b0(true);
                    org.telegram.ui.Components.l61 l61Var2 = userInfoActivity2.f31893x;
                    if (l61Var2 != null) {
                        l61Var2.Y2.N(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
