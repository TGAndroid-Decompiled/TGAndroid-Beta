package org.telegram.ui;

import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class eh1 implements Utilities.Callback {
    public final int f33495a;
    public final UserInfoActivity f33496b;

    public eh1(UserInfoActivity userInfoActivity, int i10) {
        this.f33495a = i10;
        this.f33496b = userInfoActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f33495a) {
            case 0:
                UserInfoActivity userInfoActivity = this.f33496b;
                userInfoActivity.J = (TL_account.TL_birthday) obj;
                org.telegram.ui.Components.o61 o61Var = userInfoActivity.f31966x;
                if (o61Var != null) {
                    o61Var.f28778f3.N(true);
                }
                userInfoActivity.b0(true);
                return;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                UserInfoActivity userInfoActivity2 = this.f33496b;
                if (userInfoActivity2.K != chat) {
                    userInfoActivity2.K = chat;
                    if (chat != null) {
                        org.telegram.messenger.f0.p(R.string.EditProfileChannelSet, org.telegram.ui.Components.yc.a0(userInfoActivity2), R.raw.contact_check, 36);
                    }
                    userInfoActivity2.b0(true);
                    org.telegram.ui.Components.o61 o61Var2 = userInfoActivity2.f31966x;
                    if (o61Var2 != null) {
                        o61Var2.f28778f3.N(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
