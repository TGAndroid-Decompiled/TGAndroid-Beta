package org.telegram.ui;

import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class gg1 implements Utilities.Callback {
    public final int f38584a;
    public final UserInfoActivity f38585b;

    public gg1(UserInfoActivity userInfoActivity, int i10) {
        this.f38584a = i10;
        this.f38585b = userInfoActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f38584a) {
            case 0:
                UserInfoActivity userInfoActivity = this.f38585b;
                userInfoActivity.F = (TL_account.TL_birthday) obj;
                org.telegram.ui.Components.o51 o51Var = userInfoActivity.f36348x;
                if (o51Var != null) {
                    o51Var.U2.N(true);
                }
                userInfoActivity.b0(true);
                return;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                UserInfoActivity userInfoActivity2 = this.f38585b;
                if (userInfoActivity2.G != chat) {
                    userInfoActivity2.G = chat;
                    if (chat != null) {
                        j7.l1.v(R.string.EditProfileChannelSet, org.telegram.ui.Components.tc.a0(userInfoActivity2), R.raw.contact_check, 36);
                    }
                    userInfoActivity2.b0(true);
                    org.telegram.ui.Components.o51 o51Var2 = userInfoActivity2.f36348x;
                    if (o51Var2 != null) {
                        o51Var2.U2.N(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
