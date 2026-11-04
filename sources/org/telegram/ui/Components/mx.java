package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class mx {
    public final ArrayList f36264a = new ArrayList();
    public final ey f36265b;

    public mx(ey eyVar) {
        this.f36265b = eyVar;
    }

    public final void a(String str, boolean z10) {
        ey eyVar = this.f36265b;
        int i3 = eyVar.f33529d1;
        String q10 = a1.g.q("gif_search_", str, "_");
        if (!z10 || !eyVar.m0.containsKey(q10)) {
            String str2 = str;
            ci.o3 o3Var = new ci.o3(this, str2, z10, q10, 6);
            ArrayList arrayList = this.f36264a;
            if (z10) {
                arrayList.add(q10);
                org.telegram.messenger.qr.a0(i3).M(q10, o3Var);
                return;
            }
            org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(i3);
            TLObject f22 = s12.f2(s12.L3);
            if (!(f22 instanceof TLRPC.User)) {
                return;
            }
            arrayList.add(q10);
            TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
            if (str2 == null) {
                str2 = "";
            }
            tL_messages_getInlineBotResults.query = str2;
            tL_messages_getInlineBotResults.bot = s12.q1((TLRPC.User) f22);
            tL_messages_getInlineBotResults.offset = "";
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            ConnectionsManager.getInstance(i3).sendRequest(tL_messages_getInlineBotResults, o3Var, 2);
        }
    }
}
