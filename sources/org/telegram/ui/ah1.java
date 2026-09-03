package org.telegram.ui;

import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class ah1 implements Utilities.Callback {
    public final int f32591a;
    public final UserInfoActivity f32592b;

    public ah1(UserInfoActivity userInfoActivity, int i10) {
        this.f32591a = i10;
        this.f32592b = userInfoActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f32591a) {
            case 0:
                UserInfoActivity userInfoActivity = this.f32592b;
                userInfoActivity.G = (TL_account.TL_birthday) obj;
                org.telegram.ui.Components.a61 a61Var = userInfoActivity.f32359x;
                if (a61Var != null) {
                    a61Var.V2.N(true);
                }
                userInfoActivity.b0(true);
                return;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                UserInfoActivity userInfoActivity2 = this.f32592b;
                if (userInfoActivity2.H != chat) {
                    userInfoActivity2.H = chat;
                    if (chat != null) {
                        kf.k0.v(R.string.EditProfileChannelSet, org.telegram.ui.Components.qc.a0(userInfoActivity2), R.raw.contact_check, 36);
                    }
                    userInfoActivity2.b0(true);
                    org.telegram.ui.Components.a61 a61Var2 = userInfoActivity2.f32359x;
                    if (a61Var2 != null) {
                        a61Var2.V2.N(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
