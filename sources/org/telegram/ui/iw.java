package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
public final class iw implements q60 {
    public final dy f39309a;

    public iw(dy dyVar) {
        this.f39309a = dyVar;
    }

    @Override
    public final void a(r60 r60Var, long j10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MessagesStorage.TopicKey.of(-j10, 0L));
        dy dyVar = this.f39309a;
        wx wxVar = dyVar.f37752y2;
        if (dyVar.f37747x2) {
            dyVar.removeSelfFromStack();
        }
        wxVar.v(dyVar, arrayList, null, true, dyVar.F2, dyVar.G2, dyVar.H2, null);
    }
}
