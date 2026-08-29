package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
public final class kw implements s60 {
    public final fy f40028a;

    public kw(fy fyVar) {
        this.f40028a = fyVar;
    }

    @Override
    public final void a(t60 t60Var, long j10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MessagesStorage.TopicKey.of(-j10, 0L));
        fy fyVar = this.f40028a;
        yx yxVar = fyVar.f38379y2;
        if (fyVar.f38374x2) {
            fyVar.removeSelfFromStack();
        }
        yxVar.v(fyVar, arrayList, null, true, fyVar.F2, fyVar.G2, fyVar.H2, null);
    }
}
