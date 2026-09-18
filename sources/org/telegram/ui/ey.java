package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
public final class ey implements org.telegram.ui.Components.b5 {
    public final wy f33494a;

    public ey(wy wyVar) {
        this.f33494a = wyVar;
    }

    @Override
    public final void J(int i10, int i11, boolean z10) {
        wy wyVar = this.f33494a;
        ArrayList arrayList = wyVar.I2;
        wyVar.K2 = i10;
        wyVar.L2 = i11;
        if (wyVar.C2 != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i12)).longValue(), 0L));
            }
            wyVar.C2.u(wyVar, arrayList2, wyVar.B1.getFieldText(), false, z10, i10, i11, null);
        }
    }
}
