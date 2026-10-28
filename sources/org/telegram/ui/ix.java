package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
public final class ix implements org.telegram.ui.Components.e5 {
    public final ey f40284a;

    public ix(ey eyVar) {
        this.f40284a = eyVar;
    }

    @Override
    public final void G(int i10, int i11, boolean z10) {
        ey eyVar = this.f40284a;
        ArrayList arrayList = eyVar.I2;
        eyVar.K2 = i10;
        eyVar.L2 = i11;
        eyVar.M2 = false;
        if (eyVar.C2 != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i12)).longValue(), 0L));
            }
            eyVar.C2.v(eyVar, arrayList2, eyVar.B1.getFieldText(), false, z10, i10, i11, null);
        }
    }
}
