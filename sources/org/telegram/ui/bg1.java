package org.telegram.ui;

import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class bg1 implements Utilities.Callback {
    public final int f35673a;
    public final UserInfoActivity f35674b;

    public bg1(UserInfoActivity userInfoActivity, int i10) {
        this.f35673a = i10;
        this.f35674b = userInfoActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f35673a) {
            case 0:
                UserInfoActivity userInfoActivity = this.f35674b;
                userInfoActivity.J = (TL_account.TL_birthday) obj;
                org.telegram.ui.Components.u61 u61Var = userInfoActivity.f33939x;
                if (u61Var != null) {
                    u61Var.W2.N(true);
                }
                userInfoActivity.b0(true);
                return;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                UserInfoActivity userInfoActivity2 = this.f35674b;
                if (userInfoActivity2.K != chat) {
                    userInfoActivity2.K = chat;
                    if (chat != null) {
                        org.telegram.messenger.q.q(R.string.EditProfileChannelSet, org.telegram.ui.Components.xc.a0(userInfoActivity2), R.raw.contact_check, 36);
                    }
                    userInfoActivity2.b0(true);
                    org.telegram.ui.Components.u61 u61Var2 = userInfoActivity2.f33939x;
                    if (u61Var2 != null) {
                        u61Var2.W2.N(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
