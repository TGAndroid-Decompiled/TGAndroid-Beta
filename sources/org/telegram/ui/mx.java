package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
public final class mx implements org.telegram.ui.Components.b5 {
    public final fy f40647a;

    public mx(fy fyVar) {
        this.f40647a = fyVar;
    }

    @Override
    public final void I(int i10, int i11, boolean z10) {
        fy fyVar = this.f40647a;
        ArrayList arrayList = fyVar.E2;
        fyVar.G2 = i10;
        fyVar.H2 = i11;
        if (fyVar.f38379y2 != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i12)).longValue(), 0L));
            }
            fyVar.f38379y2.v(fyVar, arrayList2, fyVar.f38373x1.getFieldText(), false, z10, i10, i11, null);
        }
    }
}
