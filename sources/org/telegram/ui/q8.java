package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class q8 implements View.OnClickListener {
    public final int f36626a;
    public final n9 f36627b;

    public q8(n9 n9Var, int i10) {
        this.f36626a = i10;
        this.f36627b = n9Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f36626a) {
            case 0:
                Long l4 = (Long) view.getTag();
                n9 n9Var = this.f36627b;
                ChatObject.Call groupCall = n9Var.getMessagesController().getGroupCall(l4.longValue(), false);
                TLRPC.Chat chat = n9Var.getMessagesController().getChat(l4);
                n9Var.P = chat;
                if (groupCall != null) {
                    org.telegram.ui.Components.voip.g2.l(chat, null, false, null, n9Var.getParentActivity(), n9Var, n9Var.getAccountInstance());
                    return;
                }
                n9Var.Q = l4;
                n9Var.getMessagesController().loadFullChat(l4.longValue(), 0, true);
                return;
            case 1:
                this.f36627b.l0(true);
                return;
            case 2:
                n9 n9Var2 = this.f36627b;
                org.telegram.ui.Components.a80 H = org.telegram.ui.Components.a80.H(n9Var2, n9Var2.E);
                H.f22606s = 8;
                if (n9Var2.getUserConfig().showCallsTab) {
                    H.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new o8(n9Var2, 0), false);
                }
                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.DeleteAllCalls), new o8(n9Var2, 1), true);
                H.Z();
                H.X(-AndroidUtilities.dp(64.0f));
                return;
            default:
                n9 n9Var3 = this.f36627b;
                n9Var3.getClass();
                n9.n0(n9Var3);
                return;
        }
    }
}
