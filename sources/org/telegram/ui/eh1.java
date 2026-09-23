package org.telegram.ui;

import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class eh1 implements Utilities.Callback {
    public final int f32926a;
    public final UserInfoActivity f32927b;

    public eh1(UserInfoActivity userInfoActivity, int i10) {
        this.f32926a = i10;
        this.f32927b = userInfoActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f32926a) {
            case 0:
                UserInfoActivity userInfoActivity = this.f32927b;
                userInfoActivity.J = (TL_account.TL_birthday) obj;
                org.telegram.ui.Components.x51 x51Var = userInfoActivity.f31577x;
                if (x51Var != null) {
                    x51Var.Y2.N(true);
                }
                userInfoActivity.b0(true);
                return;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                UserInfoActivity userInfoActivity2 = this.f32927b;
                if (userInfoActivity2.K != chat) {
                    userInfoActivity2.K = chat;
                    if (chat != null) {
                        org.telegram.messenger.z0.o(R.string.EditProfileChannelSet, org.telegram.ui.Components.xc.a0(userInfoActivity2), R.raw.contact_check, 36);
                    }
                    userInfoActivity2.b0(true);
                    org.telegram.ui.Components.x51 x51Var2 = userInfoActivity2.f31577x;
                    if (x51Var2 != null) {
                        x51Var2.Y2.N(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
