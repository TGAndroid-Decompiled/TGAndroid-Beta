package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
public final class gw implements r60 {
    public final cy f37421a;

    public gw(cy cyVar) {
        this.f37421a = cyVar;
    }

    @Override
    public final void a(s60 s60Var, long j10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MessagesStorage.TopicKey.of(-j10, 0L));
        cy cyVar = this.f37421a;
        vx vxVar = cyVar.C2;
        if (cyVar.B2) {
            cyVar.removeSelfFromStack();
        }
        vxVar.w(cyVar, arrayList, null, true, cyVar.J2, cyVar.K2, cyVar.L2, null);
    }
}
