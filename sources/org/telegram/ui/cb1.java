package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class cb1 implements org.telegram.messenger.c20 {
    public final int f44742a;
    public final UserInfoActivity f44743b;

    public cb1(UserInfoActivity userInfoActivity, int i7) {
        this.f44742a = i7;
        this.f44743b = userInfoActivity;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f44742a;
        UserInfoActivity userInfoActivity = this.f44743b;
        switch (i7) {
            case 0:
                userInfoActivity.J = (TL_account.TL_birthday) obj;
                fi.w3 w3Var = userInfoActivity.f42073y;
                if (w3Var != null) {
                    w3Var.f37190f3.O(true);
                }
                userInfoActivity.g0(true);
                return;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                if (userInfoActivity.K != chat) {
                    userInfoActivity.K = chat;
                    if (chat != null) {
                        org.telegram.messenger.k5.o(null, 2131751234, org.telegram.ui.Components.hc.a0(userInfoActivity), 2131623989, 36);
                    }
                    userInfoActivity.g0(true);
                    fi.w3 w3Var2 = userInfoActivity.f42073y;
                    if (w3Var2 != null) {
                        w3Var2.f37190f3.O(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
