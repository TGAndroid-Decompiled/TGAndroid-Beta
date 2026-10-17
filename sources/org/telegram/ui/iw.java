package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
public final class iw implements t60 {
    public final ey f37990a;

    public iw(ey eyVar) {
        this.f37990a = eyVar;
    }

    @Override
    public final void a(u60 u60Var, long j10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MessagesStorage.TopicKey.of(-j10, 0L));
        ey eyVar = this.f37990a;
        xx xxVar = eyVar.C2;
        if (eyVar.B2) {
            eyVar.removeSelfFromStack();
        }
        xxVar.w(eyVar, arrayList, null, true, eyVar.J2, eyVar.K2, eyVar.L2, null);
    }
}
