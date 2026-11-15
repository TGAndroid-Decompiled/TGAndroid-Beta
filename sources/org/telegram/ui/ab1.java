package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class ab1 implements org.telegram.messenger.z10 {
    public final int f44987a;
    public final UserInfoActivity f44988b;

    public ab1(UserInfoActivity userInfoActivity, int i7) {
        this.f44987a = i7;
        this.f44988b = userInfoActivity;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f44987a;
        UserInfoActivity userInfoActivity = this.f44988b;
        switch (i7) {
            case 0:
                userInfoActivity.K = (TL_account.TL_birthday) obj;
                bi.v3 v3Var = userInfoActivity.f43447y;
                if (v3Var != null) {
                    v3Var.f39895g3.O(true);
                }
                userInfoActivity.g0(true);
                return;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                if (userInfoActivity.L != chat) {
                    userInfoActivity.L = chat;
                    if (chat != null) {
                        org.telegram.messenger.k5.n(null, 2131751233, org.telegram.ui.Components.cc.a0(userInfoActivity), 2131623990, 36);
                    }
                    userInfoActivity.g0(true);
                    bi.v3 v3Var2 = userInfoActivity.f43447y;
                    if (v3Var2 != null) {
                        v3Var2.f39895g3.O(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
