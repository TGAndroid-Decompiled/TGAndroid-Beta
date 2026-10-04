package org.telegram.ui;

import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class gh1 implements Utilities.Callback {
    public final int f36653a;
    public final UserInfoActivity f36654b;

    public gh1(UserInfoActivity userInfoActivity, int i10) {
        this.f36653a = i10;
        this.f36654b = userInfoActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f36653a) {
            case 0:
                UserInfoActivity userInfoActivity = this.f36654b;
                userInfoActivity.K = (TL_account.TL_birthday) obj;
                org.telegram.ui.Components.w61 w61Var = userInfoActivity.f34588y;
                if (w61Var != null) {
                    w61Var.f25250f3.N(true);
                }
                userInfoActivity.b0(true);
                return;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                UserInfoActivity userInfoActivity2 = this.f36654b;
                if (userInfoActivity2.L != chat) {
                    userInfoActivity2.L = chat;
                    if (chat != null) {
                        org.telegram.messenger.q.p(R.string.EditProfileChannelSet, org.telegram.ui.Components.yc.a0(userInfoActivity2), R.raw.contact_check, 36);
                    }
                    userInfoActivity2.b0(true);
                    org.telegram.ui.Components.w61 w61Var2 = userInfoActivity2.f34588y;
                    if (w61Var2 != null) {
                        w61Var2.f25250f3.N(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
