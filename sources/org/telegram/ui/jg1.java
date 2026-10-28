package org.telegram.ui;

import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class jg1 implements Utilities.Callback {
    public final int f40534a;
    public final UserInfoActivity f40535b;

    public jg1(UserInfoActivity userInfoActivity, int i10) {
        this.f40534a = i10;
        this.f40535b = userInfoActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f40534a) {
            case 0:
                UserInfoActivity userInfoActivity = this.f40535b;
                userInfoActivity.J = (TL_account.TL_birthday) obj;
                org.telegram.ui.Components.m71 m71Var = userInfoActivity.f36344x;
                if (m71Var != null) {
                    m71Var.f32504g3.O(true);
                }
                userInfoActivity.c0(true);
                return;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                UserInfoActivity userInfoActivity2 = this.f40535b;
                if (userInfoActivity2.K != chat) {
                    userInfoActivity2.K = chat;
                    if (chat != null) {
                        org.telegram.messenger.t.q(R.string.EditProfileChannelSet, org.telegram.ui.Components.wc.b0(userInfoActivity2), R.raw.contact_check, 36);
                    }
                    userInfoActivity2.c0(true);
                    org.telegram.ui.Components.m71 m71Var2 = userInfoActivity2.f36344x;
                    if (m71Var2 != null) {
                        m71Var2.f32504g3.O(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
