package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class m8 implements View.OnClickListener {
    public final int f39828a;
    public final j9 f39829b;

    public m8(j9 j9Var, int i10) {
        this.f39828a = i10;
        this.f39829b = j9Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39828a) {
            case 0:
                Long l4 = (Long) view.getTag();
                j9 j9Var = this.f39829b;
                ChatObject.Call groupCall = j9Var.getMessagesController().getGroupCall(l4.longValue(), false);
                TLRPC.Chat chat = j9Var.getMessagesController().getChat(l4);
                j9Var.Q = chat;
                if (groupCall != null) {
                    org.telegram.ui.Components.voip.f2.l(chat, null, false, null, j9Var.getParentActivity(), j9Var, j9Var.getAccountInstance());
                    return;
                }
                j9Var.R = l4;
                j9Var.getMessagesController().loadFullChat(l4.longValue(), 0, true);
                return;
            case 1:
                this.f39829b.k0(true);
                return;
            case 2:
                j9 j9Var2 = this.f39829b;
                org.telegram.ui.Components.q80 H = org.telegram.ui.Components.q80.H(j9Var2, j9Var2.F);
                H.f30120s = 8;
                if (j9Var2.getUserConfig().showCallsTab) {
                    H.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new i8(j9Var2, 1), false);
                }
                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.DeleteAllCalls), new i8(j9Var2, 2), true);
                H.Z();
                H.X(-AndroidUtilities.dp(64.0f));
                return;
            default:
                j9 j9Var3 = this.f39829b;
                j9Var3.getClass();
                j9.m0(j9Var3);
                return;
        }
    }
}
