package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class cb1 implements org.telegram.messenger.w10 {
    public final int f46758a;
    public final UserInfoActivity f46759b;

    public cb1(UserInfoActivity userInfoActivity, int i7) {
        this.f46758a = i7;
        this.f46759b = userInfoActivity;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f46758a;
        UserInfoActivity userInfoActivity = this.f46759b;
        switch (i7) {
            case 0:
                userInfoActivity.K = (TL_account.TL_birthday) obj;
                bi.i6 i6Var = userInfoActivity.f44019y;
                if (i6Var != null) {
                    i6Var.f35323g3.O(true);
                }
                userInfoActivity.g0(true);
                return;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                if (userInfoActivity.L != chat) {
                    userInfoActivity.L = chat;
                    if (chat != null) {
                        org.telegram.messenger.f3.n(null, 2131751221, org.telegram.ui.Components.kc.b0(userInfoActivity), 2131623990, 36);
                    }
                    userInfoActivity.g0(true);
                    bi.i6 i6Var2 = userInfoActivity.f44019y;
                    if (i6Var2 != null) {
                        i6Var2.f35323g3.O(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
