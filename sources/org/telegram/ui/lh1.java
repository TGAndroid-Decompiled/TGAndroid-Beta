package org.telegram.ui;

import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class lh1 implements Utilities.Callback {
    public final int f35385a;
    public final UserInfoActivity f35386b;

    public lh1(UserInfoActivity userInfoActivity, int i10) {
        this.f35385a = i10;
        this.f35386b = userInfoActivity;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f35385a) {
            case 0:
                UserInfoActivity userInfoActivity = this.f35386b;
                userInfoActivity.K = (TL_account.TL_birthday) obj;
                org.telegram.ui.Components.n61 n61Var = userInfoActivity.f31851y;
                if (n61Var != null) {
                    n61Var.Y2.N(true);
                }
                userInfoActivity.b0(true);
                return;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                UserInfoActivity userInfoActivity2 = this.f35386b;
                if (userInfoActivity2.L != chat) {
                    userInfoActivity2.L = chat;
                    if (chat != null) {
                        org.telegram.messenger.q.q(R.string.EditProfileChannelSet, org.telegram.ui.Components.xc.a0(userInfoActivity2), R.raw.contact_check, 36);
                    }
                    userInfoActivity2.b0(true);
                    org.telegram.ui.Components.n61 n61Var2 = userInfoActivity2.f31851y;
                    if (n61Var2 != null) {
                        n61Var2.Y2.N(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
