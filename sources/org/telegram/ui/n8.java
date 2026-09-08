package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class n8 implements View.OnClickListener {
    public final int f38876a;
    public final k9 f38877b;

    public n8(k9 k9Var, int i10) {
        this.f38876a = i10;
        this.f38877b = k9Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f38876a) {
            case 0:
                Long l4 = (Long) view.getTag();
                k9 k9Var = this.f38877b;
                ChatObject.Call groupCall = k9Var.getMessagesController().getGroupCall(l4.longValue(), false);
                TLRPC.Chat chat = k9Var.getMessagesController().getChat(l4);
                k9Var.Q = chat;
                if (groupCall != null) {
                    org.telegram.ui.Components.voip.d2.l(chat, null, false, null, k9Var.getParentActivity(), k9Var, k9Var.getAccountInstance());
                    return;
                }
                k9Var.R = l4;
                k9Var.getMessagesController().loadFullChat(l4.longValue(), 0, true);
                return;
            case 1:
                this.f38877b.k0(true);
                return;
            case 2:
                k9 k9Var2 = this.f38877b;
                org.telegram.ui.Components.n70 H = org.telegram.ui.Components.n70.H(k9Var2, k9Var2.F);
                H.f28687s = 8;
                if (k9Var2.getUserConfig().showCallsTab) {
                    H.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new j8(k9Var2, 1), false);
                }
                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.DeleteAllCalls), new j8(k9Var2, 2), true);
                H.Z();
                H.X(-AndroidUtilities.dp(64.0f));
                return;
            default:
                k9 k9Var3 = this.f38877b;
                k9Var3.getClass();
                k9.m0(k9Var3);
                return;
        }
    }
}
