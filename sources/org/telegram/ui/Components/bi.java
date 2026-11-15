package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
public final class bi extends org.telegram.ui.mq0 {
    public final org.telegram.messenger.ff f33281a;
    public final ki f33282b;

    public bi(ki kiVar, org.telegram.messenger.ff ffVar) {
        this.f33282b = kiVar;
        this.f33281a = ffVar;
    }

    @Override
    public final void o(int i7, org.telegram.messenger.g20 g20Var, final boolean z10, final int i10, int i11, final boolean z11) {
        ki kiVar = this.f33282b;
        kiVar.f36499t4 = true;
        if (kiVar.X3 == null) {
            return;
        }
        final org.telegram.messenger.ff ffVar = this.f33281a;
        ffVar.f27723s = g20Var;
        t4.X(kiVar.H3, kiVar.X0() + 1, 0L, new org.telegram.messenger.z10() {
            @Override
            public final void a(Object obj) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.f32368u1;
                arrayList.clear();
                HashMap hashMap = ChatAttachAlertPhotoLayout.f32367t1;
                hashMap.clear();
                arrayList.add(0);
                hashMap.put(0, ffVar);
                bi.this.f33282b.X3.y1(7, true, z10, i10, 0, 0L, false, z11, ((Long) obj).longValue());
            }
        });
    }
}
