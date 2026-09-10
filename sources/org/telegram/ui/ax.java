package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
public final class ax implements j70 {
    public final wy f31099a;

    public ax(wy wyVar) {
        this.f31099a = wyVar;
    }

    @Override
    public final void a(k70 k70Var, long j3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MessagesStorage.TopicKey.of(-j3, 0L));
        wy wyVar = this.f31099a;
        qy qyVar = wyVar.C2;
        if (wyVar.B2) {
            wyVar.removeSelfFromStack();
        }
        qyVar.v(wyVar, arrayList, null, true, wyVar.J2, wyVar.K2, wyVar.L2, null);
    }
}
