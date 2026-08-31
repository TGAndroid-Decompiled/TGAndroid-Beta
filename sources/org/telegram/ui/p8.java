package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class p8 implements View.OnClickListener {
    public final int f39943a;
    public final l9 f39944b;

    public p8(l9 l9Var, int i10) {
        this.f39943a = i10;
        this.f39944b = l9Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39943a) {
            case 0:
                Long l10 = (Long) view.getTag();
                l9 l9Var = this.f39944b;
                ChatObject.Call groupCall = l9Var.getMessagesController().getGroupCall(l10.longValue(), false);
                TLRPC.Chat chat = l9Var.getMessagesController().getChat(l10);
                l9Var.N = chat;
                if (groupCall != null) {
                    org.telegram.ui.Components.voip.g2.m(chat, null, false, null, l9Var.getParentActivity(), l9Var, l9Var.getAccountInstance());
                    return;
                }
                l9Var.O = l10;
                l9Var.getMessagesController().loadFullChat(l10.longValue(), 0, true);
                return;
            case 1:
                this.f39944b.k0(true);
                return;
            case 2:
                l9 l9Var2 = this.f39944b;
                org.telegram.ui.Components.q70 H = org.telegram.ui.Components.q70.H(l9Var2, l9Var2.C);
                H.f30329s = 8;
                if (l9Var2.getUserConfig().showCallsTab) {
                    H.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new l8(l9Var2, 1), false);
                }
                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.DeleteAllCalls), new l8(l9Var2, 2), true);
                H.Z();
                H.X(-AndroidUtilities.dp(64.0f));
                return;
            default:
                l9 l9Var3 = this.f39944b;
                l9Var3.getClass();
                l9.m0(l9Var3);
                return;
        }
    }
}
