package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
public final class fx implements org.telegram.ui.Components.e5 {
    public final cy f39491a;

    public fx(cy cyVar) {
        this.f39491a = cyVar;
    }

    @Override
    public final void G(int i10, int i11, boolean z10) {
        cy cyVar = this.f39491a;
        ArrayList arrayList = cyVar.I2;
        cyVar.K2 = i10;
        cyVar.L2 = i11;
        cyVar.M2 = false;
        if (cyVar.C2 != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i12)).longValue(), 0L));
            }
            cyVar.C2.v(cyVar, arrayList2, cyVar.B1.getFieldText(), false, z10, i10, i11, null);
        }
    }
}
