package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class tx {
    public final ArrayList f39830a = new ArrayList();
    public final ly f39831b;

    public tx(ly lyVar) {
        this.f39831b = lyVar;
    }

    public final void a(String str, boolean z10) {
        ly lyVar = this.f39831b;
        int i7 = lyVar.f36941d1;
        String p10 = a8.p0.p("gif_search_", str, "_");
        if (!z10 || !lyVar.m0.containsKey(p10)) {
            String str2 = str;
            di.f3 f3Var = new di.f3(this, str2, z10, p10, 6);
            ArrayList arrayList = this.f39830a;
            if (z10) {
                arrayList.add(p10);
                org.telegram.messenger.vr.a0(i7).M(p10, f3Var);
                return;
            }
            org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(i7);
            TLObject f22 = s12.f2(s12.L3);
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
            ConnectionsManager.getInstance(i7).sendRequest(tL_messages_getInlineBotResults, f3Var, 2);
        }
    }
}
