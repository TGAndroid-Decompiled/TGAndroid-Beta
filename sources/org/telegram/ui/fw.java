package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
public final class fw implements y60 {
    public final ey f39435a;

    public fw(ey eyVar) {
        this.f39435a = eyVar;
    }

    @Override
    public final void a(z60 z60Var, long j10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MessagesStorage.TopicKey.of(-j10, 0L));
        ey eyVar = this.f39435a;
        xx xxVar = eyVar.C2;
        if (eyVar.B2) {
            eyVar.removeSelfFromStack();
        }
        xxVar.v(eyVar, arrayList, null, true, eyVar.J2, eyVar.K2, eyVar.L2, null);
    }
}
