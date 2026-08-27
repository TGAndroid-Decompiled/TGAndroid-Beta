package org.telegram.ui;

import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

public final class dg1 implements Utilities.Callback {

    public final int f37399a;

    public final UserInfoActivity f37400b;

    public dg1(UserInfoActivity userInfoActivity, int i10) {
        this.f37399a = i10;
        this.f37400b = userInfoActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f37399a) {
            case 0:
                UserInfoActivity userInfoActivity = this.f37400b;
                userInfoActivity.F = (TL_account.TL_birthday) obj;
                org.telegram.ui.Components.e51 e51Var = userInfoActivity.f36286x;
                if (e51Var != null) {
                    e51Var.U2.N(true);
                }
                userInfoActivity.b0(true);
                break;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                UserInfoActivity userInfoActivity2 = this.f37400b;
                if (userInfoActivity2.G != chat) {
                    userInfoActivity2.G = chat;
                    if (chat != null) {
                        org.telegram.messenger.y1.q(R.string.EditProfileChannelSet, org.telegram.ui.Components.mc.a0(userInfoActivity2), R.raw.contact_check, 36);
                    }
                    userInfoActivity2.b0(true);
                    org.telegram.ui.Components.e51 e51Var2 = userInfoActivity2.f36286x;
                    if (e51Var2 != null) {
                        e51Var2.U2.N(true);
                    }
                    break;
                }
                break;
        }
    }
}
