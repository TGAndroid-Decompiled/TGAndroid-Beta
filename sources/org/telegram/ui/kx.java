package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
public final class kx implements org.telegram.ui.Components.x4 {
    public final dy f39942a;

    public kx(dy dyVar) {
        this.f39942a = dyVar;
    }

    @Override
    public final void B(int i9, int i10, boolean z10) {
        dy dyVar = this.f39942a;
        ArrayList arrayList = dyVar.E2;
        dyVar.G2 = i9;
        dyVar.H2 = i10;
        if (dyVar.f37752y2 != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i11)).longValue(), 0L));
            }
            dyVar.f37752y2.v(dyVar, arrayList2, dyVar.f37746x1.getFieldText(), false, z10, i9, i10, null);
        }
    }
}
