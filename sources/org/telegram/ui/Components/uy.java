package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class uy {
    public final ArrayList f28960a = new ArrayList();
    public final mz f28961b;

    public uy(mz mzVar) {
        this.f28961b = mzVar;
    }

    public final void a(String str, boolean z10) {
        mz mzVar = this.f28961b;
        int i10 = mzVar.f26574c1;
        String p5 = a4.a.p("gif_search_", str, "_");
        if (!z10 || !mzVar.f26601l0.containsKey(p5)) {
            ci.t1 t1Var = new ci.t1(this, str, z10, p5);
            ArrayList arrayList = this.f28960a;
            if (z10) {
                arrayList.add(p5);
                MessagesStorage.getInstance(i10).getBotCache(p5, t1Var);
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
            ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getInlineBotResults, t1Var, 2);
        }
    }
}
