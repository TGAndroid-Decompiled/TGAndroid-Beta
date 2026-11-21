package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
public final class li extends org.telegram.ui.oq0 {
    public final org.telegram.messenger.ef f37188a;
    public final ui f37189b;

    public li(ui uiVar, org.telegram.messenger.ef efVar) {
        this.f37189b = uiVar;
        this.f37188a = efVar;
    }

    @Override
    public final void o(int i7, org.telegram.messenger.e20 e20Var, final boolean z10, final int i10, int i11, final boolean z11) {
        ui uiVar = this.f37189b;
        uiVar.f40438t4 = true;
        if (uiVar.X3 == null) {
            return;
        }
        final org.telegram.messenger.ef efVar = this.f37188a;
        efVar.f27890s = e20Var;
        c5.X(uiVar.H3, uiVar.Y0() + 1, 0L, new org.telegram.messenger.x10() {
            @Override
            public final void a(Object obj) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.f32798u1;
                arrayList.clear();
                HashMap hashMap = ChatAttachAlertPhotoLayout.f32797t1;
                hashMap.clear();
                arrayList.add(0);
                hashMap.put(0, efVar);
                li.this.f37189b.X3.y1(7, true, z10, i10, 0, 0L, false, z11, ((Long) obj).longValue());
            }
        });
    }
}
