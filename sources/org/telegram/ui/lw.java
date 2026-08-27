package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;

public final class lw implements t60 {

    public final gy f40255a;

    public lw(gy gyVar) {
        this.f40255a = gyVar;
    }

    @Override
    public final void a(u60 u60Var, long j10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MessagesStorage.TopicKey.of(-j10, 0L));
        gy gyVar = this.f40255a;
        zx zxVar = gyVar.f38621y2;
        if (gyVar.f38616x2) {
            gyVar.removeSelfFromStack();
        }
        zxVar.w(gyVar, arrayList, null, true, gyVar.F2, gyVar.G2, gyVar.H2, null);
    }
}
