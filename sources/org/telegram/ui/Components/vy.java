package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vy {
    public final ArrayList f32436a = new ArrayList();
    public final nz f32437b;

    public vy(nz nzVar) {
        this.f32437b = nzVar;
    }

    public final void a(String str, boolean z10) {
        nz nzVar = this.f32437b;
        int i10 = nzVar.f29194c1;
        String q6 = a4.a.q("gif_search_", str, "_");
        if (!z10 || !nzVar.f29222l0.containsKey(q6)) {
            ci.t1 t1Var = new ci.t1(this, str, z10, q6);
            ArrayList arrayList = this.f32436a;
            if (z10) {
                arrayList.add(q6);
                MessagesStorage.getInstance(i10).getBotCache(q6, t1Var);
                return;
            }
            MessagesController messagesController = MessagesController.getInstance(i10);
            TLObject userOrChat = messagesController.getUserOrChat(messagesController.gifSearchBot);
            if (!(userOrChat instanceof TLRPC.User)) {
                return;
            }
            arrayList.add(q6);
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
