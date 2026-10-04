package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class p8 implements View.OnClickListener {
    public final int f39370a;
    public final m9 f39371b;

    public p8(m9 m9Var, int i10) {
        this.f39370a = i10;
        this.f39371b = m9Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39370a) {
            case 0:
                Long l4 = (Long) view.getTag();
                m9 m9Var = this.f39371b;
                ChatObject.Call groupCall = m9Var.getMessagesController().getGroupCall(l4.longValue(), false);
                TLRPC.Chat chat = m9Var.getMessagesController().getChat(l4);
                m9Var.P = chat;
                if (groupCall != null) {
                    org.telegram.ui.Components.voip.g2.l(chat, null, false, null, m9Var.getParentActivity(), m9Var, m9Var.getAccountInstance());
                    return;
                }
                m9Var.Q = l4;
                m9Var.getMessagesController().loadFullChat(l4.longValue(), 0, true);
                return;
            case 1:
                this.f39371b.e0(true);
                return;
            case 2:
                m9 m9Var2 = this.f39371b;
                org.telegram.ui.Components.b80 H = org.telegram.ui.Components.b80.H(m9Var2, m9Var2.E);
                H.f24849s = 8;
                if (m9Var2.getUserConfig().showCallsTab) {
                    H.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new n8(m9Var2, 0), false);
                }
                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.DeleteAllCalls), new n8(m9Var2, 1), true);
                H.Z();
                H.X(-AndroidUtilities.dp(64.0f));
                return;
            default:
                m9 m9Var3 = this.f39371b;
                m9Var3.getClass();
                m9.g0(m9Var3);
                return;
        }
    }
}
