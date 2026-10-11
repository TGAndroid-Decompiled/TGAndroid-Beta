package org.telegram.ui;

import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class mh1 implements Utilities.Callback {
    public final int f39949a;
    public final UserInfoActivity f39950b;

    public mh1(UserInfoActivity userInfoActivity, int i10) {
        this.f39949a = i10;
        this.f39950b = userInfoActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f39949a) {
            case 0:
                UserInfoActivity userInfoActivity = this.f39950b;
                userInfoActivity.J = (TL_account.TL_birthday) obj;
                org.telegram.ui.Components.g71 g71Var = userInfoActivity.f34618x;
                if (g71Var != null) {
                    g71Var.W2.N(true);
                }
                userInfoActivity.b0(true);
                return;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                UserInfoActivity userInfoActivity2 = this.f39950b;
                if (userInfoActivity2.K != chat) {
                    userInfoActivity2.K = chat;
                    if (chat != null) {
                        org.telegram.messenger.q.q(R.string.EditProfileChannelSet, org.telegram.ui.Components.ad.a0(userInfoActivity2), R.raw.contact_check, 36);
                    }
                    userInfoActivity2.b0(true);
                    org.telegram.ui.Components.g71 g71Var2 = userInfoActivity2.f34618x;
                    if (g71Var2 != null) {
                        g71Var2.W2.N(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
