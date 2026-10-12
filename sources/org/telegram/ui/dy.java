package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
public final class dy implements org.telegram.ui.Components.f5 {
    public final vy f36930a;

    public dy(vy vyVar) {
        this.f36930a = vyVar;
    }

    @Override
    public final void J(int i10, int i11, boolean z10) {
        vy vyVar = this.f36930a;
        ArrayList arrayList = vyVar.I2;
        vyVar.K2 = i10;
        vyVar.L2 = i11;
        if (vyVar.C2 != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i12)).longValue(), 0L));
            }
            vyVar.C2.w(vyVar, arrayList2, vyVar.B1.getFieldText(), false, z10, i10, i11, null);
        }
    }
}
