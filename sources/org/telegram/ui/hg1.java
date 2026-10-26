package org.telegram.ui;

import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class hg1 implements Utilities.Callback {
    public final int f40007a;
    public final UserInfoActivity f40008b;

    public hg1(UserInfoActivity userInfoActivity, int i10) {
        this.f40007a = i10;
        this.f40008b = userInfoActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f40007a) {
            case 0:
                UserInfoActivity userInfoActivity = this.f40008b;
                userInfoActivity.J = (TL_account.TL_birthday) obj;
                org.telegram.ui.Components.l71 l71Var = userInfoActivity.f36320x;
                if (l71Var != null) {
                    l71Var.f32152g3.O(true);
                }
                userInfoActivity.c0(true);
                return;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                UserInfoActivity userInfoActivity2 = this.f40008b;
                if (userInfoActivity2.K != chat) {
                    userInfoActivity2.K = chat;
                    if (chat != null) {
                        org.telegram.messenger.t.q(R.string.EditProfileChannelSet, org.telegram.ui.Components.wc.b0(userInfoActivity2), R.raw.contact_check, 36);
                    }
                    userInfoActivity2.c0(true);
                    org.telegram.ui.Components.l71 l71Var2 = userInfoActivity2.f36320x;
                    if (l71Var2 != null) {
                        l71Var2.f32152g3.O(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
