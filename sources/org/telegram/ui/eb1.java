package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class eb1 implements org.telegram.messenger.x10 {
    public final int f47152a;
    public final UserInfoActivity f47153b;

    public eb1(UserInfoActivity userInfoActivity, int i7) {
        this.f47152a = i7;
        this.f47153b = userInfoActivity;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f47152a;
        UserInfoActivity userInfoActivity = this.f47153b;
        switch (i7) {
            case 0:
                userInfoActivity.K = (TL_account.TL_birthday) obj;
                bi.c6 c6Var = userInfoActivity.f43893y;
                if (c6Var != null) {
                    c6Var.f34607g3.O(true);
                }
                userInfoActivity.g0(true);
                return;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                if (userInfoActivity.L != chat) {
                    userInfoActivity.L = chat;
                    if (chat != null) {
                        org.telegram.messenger.f3.n(null, 2131751222, org.telegram.ui.Components.lc.b0(userInfoActivity), 2131623990, 36);
                    }
                    userInfoActivity.g0(true);
                    bi.c6 c6Var2 = userInfoActivity.f43893y;
                    if (c6Var2 != null) {
                        c6Var2.f34607g3.O(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
