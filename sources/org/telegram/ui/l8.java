package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class l8 implements View.OnClickListener {
    public final int f40114a;
    public final h9 f40115b;

    public l8(h9 h9Var, int i10) {
        this.f40114a = i10;
        this.f40115b = h9Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40114a) {
            case 0:
                Long l10 = (Long) view.getTag();
                h9 h9Var = this.f40115b;
                ChatObject.Call groupCall = h9Var.getMessagesController().getGroupCall(l10.longValue(), false);
                TLRPC.Chat chat = h9Var.getMessagesController().getChat(l10);
                h9Var.M = chat;
                if (groupCall != null) {
                    org.telegram.ui.Components.voip.h2.m(chat, null, false, null, h9Var.getParentActivity(), h9Var, h9Var.getAccountInstance());
                    return;
                }
                h9Var.N = l10;
                h9Var.getMessagesController().loadFullChat(l10.longValue(), 0, true);
                return;
            case 1:
                this.f40115b.k0(true);
                return;
            case 2:
                h9 h9Var2 = this.f40115b;
                org.telegram.ui.Components.j70 H = org.telegram.ui.Components.j70.H(h9Var2, h9Var2.B);
                H.f29600s = 8;
                if (h9Var2.getUserConfig().showCallsTab) {
                    H.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new h8(h9Var2, 1), false);
                }
                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.DeleteAllCalls), new h8(h9Var2, 2), true);
                H.Z();
                H.X(-AndroidUtilities.dp(64.0f));
                return;
            default:
                h9 h9Var3 = this.f40115b;
                h9Var3.getClass();
                h9.m0(h9Var3);
                return;
        }
    }
}
