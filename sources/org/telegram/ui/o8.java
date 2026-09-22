package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class o8 implements View.OnClickListener {
    public final int f36221a;
    public final l9 f36222b;

    public o8(l9 l9Var, int i10) {
        this.f36221a = i10;
        this.f36222b = l9Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36221a) {
            case 0:
                Long l4 = (Long) view.getTag();
                l9 l9Var = this.f36222b;
                ChatObject.Call groupCall = l9Var.getMessagesController().getGroupCall(l4.longValue(), false);
                TLRPC.Chat chat = l9Var.getMessagesController().getChat(l4);
                l9Var.Q = chat;
                if (groupCall != null) {
                    org.telegram.ui.Components.voip.f2.l(chat, null, false, null, l9Var.getParentActivity(), l9Var, l9Var.getAccountInstance());
                    return;
                }
                l9Var.R = l4;
                l9Var.getMessagesController().loadFullChat(l4.longValue(), 0, true);
                return;
            case 1:
                this.f36222b.k0(true);
                return;
            case 2:
                l9 l9Var2 = this.f36222b;
                org.telegram.ui.Components.y70 H = org.telegram.ui.Components.y70.H(l9Var2, l9Var2.F);
                H.f30568s = 8;
                if (l9Var2.getUserConfig().showCallsTab) {
                    H.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new k8(l9Var2, 1), false);
                }
                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.DeleteAllCalls), new k8(l9Var2, 2), true);
                H.Z();
                H.X(-AndroidUtilities.dp(64.0f));
                return;
            default:
                l9 l9Var3 = this.f36222b;
                l9Var3.getClass();
                l9.m0(l9Var3);
                return;
        }
    }
}
