package org.telegram.ui;

import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class lh1 implements Utilities.Callback {
    public final int f35510a;
    public final UserInfoActivity f35511b;

    public lh1(UserInfoActivity userInfoActivity, int i10) {
        this.f35510a = i10;
        this.f35511b = userInfoActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f35510a) {
            case 0:
                UserInfoActivity userInfoActivity = this.f35511b;
                userInfoActivity.L = (TL_account.TL_birthday) obj;
                org.telegram.ui.Components.y51 y51Var = userInfoActivity.f31607y;
                if (y51Var != null) {
                    y51Var.Y2.N(true);
                }
                userInfoActivity.b0(true);
                return;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                UserInfoActivity userInfoActivity2 = this.f35511b;
                if (userInfoActivity2.M != chat) {
                    userInfoActivity2.M = chat;
                    if (chat != null) {
                        org.telegram.messenger.w1.o(R.string.EditProfileChannelSet, org.telegram.ui.Components.vc.a0(userInfoActivity2), R.raw.contact_check, 36);
                    }
                    userInfoActivity2.b0(true);
                    org.telegram.ui.Components.y51 y51Var2 = userInfoActivity2.f31607y;
                    if (y51Var2 != null) {
                        y51Var2.Y2.N(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
