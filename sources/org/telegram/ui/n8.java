package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

public final class n8 implements View.OnClickListener {

    public final int f40683a;

    public final j9 f40684b;

    public n8(j9 j9Var, int i10) {
        this.f40683a = i10;
        this.f40684b = j9Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f40683a) {
            case 0:
                Long l10 = (Long) view.getTag();
                j9 j9Var = this.f40684b;
                ChatObject.Call groupCall = j9Var.getMessagesController().getGroupCall(l10.longValue(), false);
                TLRPC.Chat chat = j9Var.getMessagesController().getChat(l10);
                j9Var.M = chat;
                if (groupCall == null) {
                    j9Var.N = l10;
                    j9Var.getMessagesController().loadFullChat(l10.longValue(), 0, true);
                } else {
                    org.telegram.ui.Components.voip.e2.m(chat, null, false, null, j9Var.getParentActivity(), j9Var, j9Var.getAccountInstance());
                }
                break;
            case 1:
                this.f40684b.k0(true);
                break;
            case 2:
                j9 j9Var2 = this.f40684b;
                org.telegram.ui.Components.b70 b70VarH = org.telegram.ui.Components.b70.H(j9Var2, j9Var2.B);
                b70VarH.f26992s = 8;
                if (j9Var2.getUserConfig().showCallsTab) {
                    b70VarH.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new j8(j9Var2, 1), false);
                }
                b70VarH.c(R.drawable.msg_delete, LocaleController.getString(R.string.DeleteAllCalls), new j8(j9Var2, 2), true);
                b70VarH.Z();
                b70VarH.X(-AndroidUtilities.dp(64.0f));
                break;
            default:
                j9 j9Var3 = this.f40684b;
                j9Var3.getClass();
                j9.m0(j9Var3);
                break;
        }
    }
}
