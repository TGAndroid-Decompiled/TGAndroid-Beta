package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class p8 implements View.OnClickListener {
    public final int f39986a;
    public final m9 f39987b;

    public p8(m9 m9Var, int i10) {
        this.f39986a = i10;
        this.f39987b = m9Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39986a) {
            case 0:
                Long l4 = (Long) view.getTag();
                m9 m9Var = this.f39987b;
                ChatObject.Call groupCall = m9Var.getMessagesController().getGroupCall(l4.longValue(), false);
                TLRPC.Chat chat = m9Var.getMessagesController().getChat(l4);
                m9Var.Q = chat;
                if (groupCall != null) {
                    org.telegram.ui.Components.voip.d2.l(chat, null, false, null, m9Var.getParentActivity(), m9Var, m9Var.getAccountInstance());
                    return;
                }
                m9Var.R = l4;
                m9Var.getMessagesController().loadFullChat(l4.longValue(), 0, true);
                return;
            case 1:
                this.f39987b.k0(true);
                return;
            case 2:
                m9 m9Var2 = this.f39987b;
                org.telegram.ui.Components.i80 H = org.telegram.ui.Components.i80.H(m9Var2, m9Var2.F);
                H.f27134s = 8;
                if (m9Var2.getUserConfig().showCallsTab) {
                    H.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new m8(m9Var2, 1), false);
                }
                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.DeleteAllCalls), new m8(m9Var2, 2), true);
                H.Z();
                H.X(-AndroidUtilities.dp(64.0f));
                return;
            default:
                m9 m9Var3 = this.f39987b;
                m9Var3.getClass();
                m9.m0(m9Var3);
                return;
        }
    }
}
