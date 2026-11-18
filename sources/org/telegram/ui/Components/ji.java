package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
public final class ji extends org.telegram.ui.oq0 {
    public final org.telegram.messenger.ef f36442a;
    public final si f36443b;

    public ji(si siVar, org.telegram.messenger.ef efVar) {
        this.f36443b = siVar;
        this.f36442a = efVar;
    }

    @Override
    public final void o(int i7, org.telegram.messenger.e20 e20Var, final boolean z10, final int i10, int i11, final boolean z11) {
        si siVar = this.f36443b;
        siVar.f39722t4 = true;
        if (siVar.X3 == null) {
            return;
        }
        final org.telegram.messenger.ef efVar = this.f36442a;
        efVar.f27864s = e20Var;
        b5.X(siVar.H3, siVar.Y0() + 1, 0L, new org.telegram.messenger.x10() {
            @Override
            public final void a(Object obj) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.f32765u1;
                arrayList.clear();
                HashMap hashMap = ChatAttachAlertPhotoLayout.f32764t1;
                hashMap.clear();
                arrayList.add(0);
                hashMap.put(0, efVar);
                ji.this.f36443b.X3.y1(7, true, z10, i10, 0, 0L, false, z11, ((Long) obj).longValue());
            }
        });
    }
}
