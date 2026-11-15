package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
public final class bi extends org.telegram.ui.mq0 {
    public final org.telegram.messenger.ff f33284a;
    public final ki f33285b;

    public bi(ki kiVar, org.telegram.messenger.ff ffVar) {
        this.f33285b = kiVar;
        this.f33284a = ffVar;
    }

    @Override
    public final void o(int i7, org.telegram.messenger.g20 g20Var, final boolean z10, final int i10, int i11, final boolean z11) {
        ki kiVar = this.f33285b;
        kiVar.f36487t4 = true;
        if (kiVar.X3 == null) {
            return;
        }
        final org.telegram.messenger.ff ffVar = this.f33284a;
        ffVar.f27725s = g20Var;
        t4.X(kiVar.H3, kiVar.X0() + 1, 0L, new org.telegram.messenger.z10() {
            @Override
            public final void a(Object obj) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.f32368u1;
                arrayList.clear();
                HashMap hashMap = ChatAttachAlertPhotoLayout.f32367t1;
                hashMap.clear();
                arrayList.add(0);
                hashMap.put(0, ffVar);
                bi.this.f33285b.X3.y1(7, true, z10, i10, 0, 0L, false, z11, ((Long) obj).longValue());
            }
        });
    }
}
