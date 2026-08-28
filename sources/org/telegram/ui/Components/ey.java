package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ey {
    public final ArrayList f28216a = new ArrayList();
    public final wy f28217b;

    public ey(wy wyVar) {
        this.f28217b = wyVar;
    }

    public final void a(String str, boolean z10) {
        wy wyVar = this.f28217b;
        int i9 = wyVar.Y0;
        String o6 = aa.d.o("gif_search_", str, "_");
        if (!z10 || !wyVar.f34408h0.containsKey(o6)) {
            kh.t1 t1Var = new kh.t1(this, str, z10, o6);
            ArrayList arrayList = this.f28216a;
            if (z10) {
                arrayList.add(o6);
                MessagesStorage.getInstance(i9).getBotCache(o6, t1Var);
                return;
            }
            MessagesController messagesController = MessagesController.getInstance(i9);
            TLObject userOrChat = messagesController.getUserOrChat(messagesController.gifSearchBot);
            if (!(userOrChat instanceof TLRPC.User)) {
                return;
            }
            arrayList.add(o6);
            TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
            if (str == null) {
                str = "";
            }
            tL_messages_getInlineBotResults.query = str;
            tL_messages_getInlineBotResults.bot = messagesController.getInputUser((TLRPC.User) userOrChat);
            tL_messages_getInlineBotResults.offset = "";
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            ConnectionsManager.getInstance(i9).sendRequest(tL_messages_getInlineBotResults, t1Var, 2);
        }
    }
}
