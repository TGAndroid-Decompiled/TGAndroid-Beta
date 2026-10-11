package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class l8 implements View.OnClickListener {
    public final int f39572a;
    public final i9 f39573b;

    public l8(i9 i9Var, int i10) {
        this.f39572a = i10;
        this.f39573b = i9Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f39572a) {
            case 0:
                Long l4 = (Long) view.getTag();
                i9 i9Var = this.f39573b;
                ChatObject.Call groupCall = i9Var.getMessagesController().getGroupCall(l4.longValue(), false);
                TLRPC.Chat chat = i9Var.getMessagesController().getChat(l4);
                i9Var.Q = chat;
                if (groupCall != null) {
                    org.telegram.ui.Components.voip.g2.l(chat, null, false, null, i9Var.getParentActivity(), i9Var, i9Var.getAccountInstance());
                    return;
                }
                i9Var.R = l4;
                i9Var.getMessagesController().loadFullChat(l4.longValue(), 0, true);
                return;
            case 1:
                this.f39573b.k0(true);
                return;
            case 2:
                i9 i9Var2 = this.f39573b;
                org.telegram.ui.Components.p80 H = org.telegram.ui.Components.p80.H(i9Var2, i9Var2.F);
                H.f29779s = 8;
                if (i9Var2.getUserConfig().showCallsTab) {
                    H.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new h8(i9Var2, 1), false);
                }
                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.DeleteAllCalls), new h8(i9Var2, 2), true);
                H.Z();
                H.X(-AndroidUtilities.dp(64.0f));
                return;
            default:
                i9 i9Var3 = this.f39573b;
                i9Var3.getClass();
                i9.m0(i9Var3);
                return;
        }
    }
}
