package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dz {
    public final ArrayList f24202a = new ArrayList();
    public final wz f24203b;

    public dz(wz wzVar) {
        this.f24203b = wzVar;
    }

    public final void a(String str, boolean z10) {
        wz wzVar = this.f24203b;
        int i10 = wzVar.f30707c1;
        String p5 = a1.g.p("gif_search_", str, "_");
        if (!z10 || !wzVar.f30734l0.containsKey(p5)) {
            di.s1 s1Var = new di.s1(this, str, z10, p5);
            ArrayList arrayList = this.f24202a;
            if (z10) {
                arrayList.add(p5);
                MessagesStorage.getInstance(i10).getBotCache(p5, s1Var);
                return;
            }
            MessagesController messagesController = MessagesController.getInstance(i10);
            TLObject userOrChat = messagesController.getUserOrChat(messagesController.gifSearchBot);
            if (!(userOrChat instanceof TLRPC.User)) {
                return;
            }
            arrayList.add(p5);
            TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
            if (str == null) {
                str = "";
            }
            tL_messages_getInlineBotResults.query = str;
            tL_messages_getInlineBotResults.bot = messagesController.getInputUser((TLRPC.User) userOrChat);
            tL_messages_getInlineBotResults.offset = "";
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getInlineBotResults, s1Var, 2);
        }
    }
}
