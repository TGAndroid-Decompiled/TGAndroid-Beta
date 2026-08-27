package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;

public final class nx implements org.telegram.ui.Components.x4 {

    public final gy f40954a;

    public nx(gy gyVar) {
        this.f40954a = gyVar;
    }

    @Override
    public final void I(int i10, int i11, boolean z10) {
        gy gyVar = this.f40954a;
        ArrayList arrayList = gyVar.E2;
        gyVar.G2 = i10;
        gyVar.H2 = i11;
        if (gyVar.f38621y2 == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i12)).longValue(), 0L));
        }
        gyVar.f38621y2.w(gyVar, arrayList2, gyVar.f38615x1.getFieldText(), false, z10, i10, i11, null);
    }
}
