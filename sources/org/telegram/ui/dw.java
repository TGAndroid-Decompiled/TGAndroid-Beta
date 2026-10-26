package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
public final class dw implements w60 {
    public final cy f38942a;

    public dw(cy cyVar) {
        this.f38942a = cyVar;
    }

    @Override
    public final void a(x60 x60Var, long j10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MessagesStorage.TopicKey.of(-j10, 0L));
        cy cyVar = this.f38942a;
        ux uxVar = cyVar.C2;
        if (cyVar.B2) {
            cyVar.removeSelfFromStack();
        }
        uxVar.v(cyVar, arrayList, null, true, cyVar.J2, cyVar.K2, cyVar.L2, null);
    }
}
