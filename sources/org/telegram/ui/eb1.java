package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class eb1 implements org.telegram.messenger.x10 {
    public final int f47221a;
    public final UserInfoActivity f47222b;

    public eb1(UserInfoActivity userInfoActivity, int i7) {
        this.f47221a = i7;
        this.f47222b = userInfoActivity;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f47221a;
        UserInfoActivity userInfoActivity = this.f47222b;
        switch (i7) {
            case 0:
                userInfoActivity.K = (TL_account.TL_birthday) obj;
                bi.g6 g6Var = userInfoActivity.f43934y;
                if (g6Var != null) {
                    g6Var.f35796g3.O(true);
                }
                userInfoActivity.g0(true);
                return;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                if (userInfoActivity.L != chat) {
                    userInfoActivity.L = chat;
                    if (chat != null) {
                        org.telegram.messenger.f3.n(null, 2131751221, org.telegram.ui.Components.lc.b0(userInfoActivity), 2131623990, 36);
                    }
                    userInfoActivity.g0(true);
                    bi.g6 g6Var2 = userInfoActivity.f43934y;
                    if (g6Var2 != null) {
                        g6Var2.f35796g3.O(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
