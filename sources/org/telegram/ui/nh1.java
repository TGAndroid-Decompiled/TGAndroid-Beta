package org.telegram.ui;

import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class nh1 implements Utilities.Callback {
    public final int f36051a;
    public final UserInfoActivity f36052b;

    public nh1(UserInfoActivity userInfoActivity, int i10) {
        this.f36051a = i10;
        this.f36052b = userInfoActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f36051a) {
            case 0:
                UserInfoActivity userInfoActivity = this.f36052b;
                userInfoActivity.K = (TL_account.TL_birthday) obj;
                org.telegram.ui.Components.o61 o61Var = userInfoActivity.f31912y;
                if (o61Var != null) {
                    o61Var.Y2.N(true);
                }
                userInfoActivity.b0(true);
                return;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                UserInfoActivity userInfoActivity2 = this.f36052b;
                if (userInfoActivity2.L != chat) {
                    userInfoActivity2.L = chat;
                    if (chat != null) {
                        org.telegram.messenger.l0.o(R.string.EditProfileChannelSet, org.telegram.ui.Components.xc.a0(userInfoActivity2), R.raw.contact_check, 36);
                    }
                    userInfoActivity2.b0(true);
                    org.telegram.ui.Components.o61 o61Var2 = userInfoActivity2.f31912y;
                    if (o61Var2 != null) {
                        o61Var2.Y2.N(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
