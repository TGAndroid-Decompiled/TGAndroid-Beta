package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class my {
    public final ArrayList f30779a = new ArrayList();
    public final fz f30780b;

    public my(fz fzVar) {
        this.f30780b = fzVar;
    }

    public final void a(String str, boolean z10) {
        fz fzVar = this.f30780b;
        int i10 = fzVar.Y0;
        String n10 = a4.w.n("gif_search_", str, "_");
        if (!z10 || !fzVar.f28599h0.containsKey(n10)) {
            nh.q1 q1Var = new nh.q1(this, str, z10, n10);
            ArrayList arrayList = this.f30779a;
            if (z10) {
                arrayList.add(n10);
                MessagesStorage.getInstance(i10).getBotCache(n10, q1Var);
                return;
            }
            MessagesController messagesController = MessagesController.getInstance(i10);
            TLObject userOrChat = messagesController.getUserOrChat(messagesController.gifSearchBot);
            if (!(userOrChat instanceof TLRPC.User)) {
                return;
            }
            arrayList.add(n10);
            TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
            if (str == null) {
                str = "";
            }
            tL_messages_getInlineBotResults.query = str;
            tL_messages_getInlineBotResults.bot = messagesController.getInputUser((TLRPC.User) userOrChat);
            tL_messages_getInlineBotResults.offset = "";
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getInlineBotResults, q1Var, 2);
        }
    }
}
