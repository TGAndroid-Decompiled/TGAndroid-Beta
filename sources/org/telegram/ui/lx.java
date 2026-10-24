package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
public final class lx implements org.telegram.ui.Components.b5 {
    public final ey f39407a;

    public lx(ey eyVar) {
        this.f39407a = eyVar;
    }

    @Override
    public final void C(int i10, int i11, boolean z10) {
        ey eyVar = this.f39407a;
        ArrayList arrayList = eyVar.I2;
        eyVar.K2 = i10;
        eyVar.L2 = i11;
        eyVar.M2 = false;
        if (eyVar.C2 != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i12)).longValue(), 0L));
            }
            eyVar.C2.w(eyVar, arrayList2, eyVar.B1.getFieldText(), false, z10, i10, i11, null);
        }
    }
}
