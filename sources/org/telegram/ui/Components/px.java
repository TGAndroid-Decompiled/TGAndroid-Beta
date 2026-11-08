package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class px {
    public final ArrayList f37114a = new ArrayList();
    public final hy f37115b;

    public px(hy hyVar) {
        this.f37115b = hyVar;
    }

    public final void a(String str, boolean z9) {
        hy hyVar = this.f37115b;
        int i7 = hyVar.f34400c1;
        String p10 = a8.p0.p("gif_search_", str, "_");
        if (!z9 || !hyVar.f34427l0.containsKey(p10)) {
            String str2 = str;
            bi.d4 d4Var = new bi.d4(this, str2, z9, p10, 6);
            ArrayList arrayList = this.f37114a;
            if (z9) {
                arrayList.add(p10);
                org.telegram.messenger.yr.a0(i7).M(p10, d4Var);
                return;
            }
            org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(i7);
            TLObject f22 = s12.f2(s12.K3);
            if (!(f22 instanceof TLRPC.User)) {
                return;
            }
            arrayList.add(p10);
            TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
            if (str2 == null) {
                str2 = "";
            }
            tL_messages_getInlineBotResults.query = str2;
            tL_messages_getInlineBotResults.bot = s12.q1((TLRPC.User) f22);
            tL_messages_getInlineBotResults.offset = "";
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getInlineBotResults, d4Var, 2);
        }
    }
}
