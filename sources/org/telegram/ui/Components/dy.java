package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dy {
    public final ArrayList f25563a = new ArrayList();
    public final vy f25564b;

    public dy(vy vyVar) {
        this.f25564b = vyVar;
    }

    public final void a(String str, boolean z10) {
        vy vyVar = this.f25564b;
        int i10 = vyVar.f31865c1;
        String n10 = a1.g.n("gif_search_", str, "_");
        if (!z10 || !vyVar.f31892l0.containsKey(n10)) {
            String str2 = str;
            org.telegram.messenger.s6 s6Var = new org.telegram.messenger.s6(this, str2, z10, n10, 4);
            ArrayList arrayList = this.f25563a;
            if (z10) {
                arrayList.add(n10);
                org.telegram.messenger.hs.a0(i10).M(n10, s6Var);
                return;
            }
            org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(i10);
            TLObject e22 = r12.e2(r12.M3);
            if (!(e22 instanceof TLRPC.User)) {
                return;
            }
            arrayList.add(n10);
            TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
            if (str2 == null) {
                str2 = "";
            }
            tL_messages_getInlineBotResults.query = str2;
            tL_messages_getInlineBotResults.bot = r12.p1((TLRPC.User) e22);
            tL_messages_getInlineBotResults.offset = "";
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
            ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getInlineBotResults, s6Var, 2);
        }
    }
}
