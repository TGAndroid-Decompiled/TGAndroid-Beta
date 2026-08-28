package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class m8 implements View.OnClickListener {
    public final int f40347a;
    public final i9 f40348b;

    public m8(i9 i9Var, int i9) {
        this.f40347a = i9;
        this.f40348b = i9Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40347a) {
            case 0:
                Long l10 = (Long) view.getTag();
                i9 i9Var = this.f40348b;
                ChatObject.Call groupCall = i9Var.getMessagesController().getGroupCall(l10.longValue(), false);
                TLRPC.Chat chat = i9Var.getMessagesController().getChat(l10);
                i9Var.M = chat;
                if (groupCall != null) {
                    org.telegram.ui.Components.voip.e2.m(chat, null, false, null, i9Var.getParentActivity(), i9Var, i9Var.getAccountInstance());
                    return;
                }
                i9Var.N = l10;
                i9Var.getMessagesController().loadFullChat(l10.longValue(), 0, true);
                return;
            case 1:
                this.f40348b.j0(true);
                return;
            case 2:
                i9 i9Var2 = this.f40348b;
                org.telegram.ui.Components.x60 H = org.telegram.ui.Components.x60.H(i9Var2, i9Var2.B);
                H.f34580s = 8;
                if (i9Var2.getUserConfig().showCallsTab) {
                    H.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new i8(i9Var2, 1), false);
                }
                H.c(R.drawable.msg_delete, LocaleController.getString(R.string.DeleteAllCalls), new i8(i9Var2, 2), true);
                H.Z();
                H.X(-AndroidUtilities.dp(64.0f));
                return;
            default:
                i9 i9Var3 = this.f40348b;
                i9Var3.getClass();
                i9.l0(i9Var3);
                return;
        }
    }
}
