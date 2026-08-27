package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class fy {

    public final ArrayList f28465a = new ArrayList();

    public final yy f28466b;

    public fy(yy yyVar) {
        this.f28466b = yyVar;
    }

    public final void a(String str, boolean z10) {
        yy yyVar = this.f28466b;
        int i10 = yyVar.Y0;
        String strM = a9.p.m("gif_search_", str, "_");
        if (z10 && yyVar.f35001h0.containsKey(strM)) {
            return;
        }
        lh.r1 r1Var = new lh.r1(this, str, z10, strM);
        ArrayList arrayList = this.f28465a;
        if (z10) {
            arrayList.add(strM);
            MessagesStorage.getInstance(i10).getBotCache(strM, r1Var);
            return;
        }
        MessagesController messagesController = MessagesController.getInstance(i10);
        TLObject userOrChat = messagesController.getUserOrChat(messagesController.gifSearchBot);
        if (userOrChat instanceof TLRPC.User) {
            arrayList.add(strM);
            TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
            if (str == null) {
                str = "";
            }
            tL_messages_getInlineBotResults.query = str;
            tL_messages_getInlineBotResults.bot = messagesController.getInputUser((TLRPC.User) userOrChat);
            tL_messages_getInlineBotResults.offset = "";
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getInlineBotResults, r1Var, 2);
        }
    }
}
