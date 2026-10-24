package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
public final class iw implements v60 {
    public final ey f38397a;

    public iw(ey eyVar) {
        this.f38397a = eyVar;
    }

    @Override
    public final void a(w60 w60Var, long j10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MessagesStorage.TopicKey.of(-j10, 0L));
        ey eyVar = this.f38397a;
        xx xxVar = eyVar.C2;
        if (eyVar.B2) {
            eyVar.removeSelfFromStack();
        }
        xxVar.w(eyVar, arrayList, null, true, eyVar.J2, eyVar.K2, eyVar.L2, null);
    }
}
