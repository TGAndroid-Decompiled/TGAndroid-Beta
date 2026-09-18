package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
public final class ax implements m70 {
    public final wy f32000a;

    public ax(wy wyVar) {
        this.f32000a = wyVar;
    }

    @Override
    public final void a(n70 n70Var, long j3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MessagesStorage.TopicKey.of(-j3, 0L));
        wy wyVar = this.f32000a;
        qy qyVar = wyVar.C2;
        if (wyVar.B2) {
            wyVar.removeSelfFromStack();
        }
        qyVar.u(wyVar, arrayList, null, true, wyVar.J2, wyVar.K2, wyVar.L2, null);
    }
}
