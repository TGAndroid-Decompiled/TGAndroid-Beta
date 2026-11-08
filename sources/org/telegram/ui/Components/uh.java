package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
public final class uh extends org.telegram.ui.nq0 {
    public final org.telegram.messenger.gf f38646a;
    public final di f38647b;

    public uh(di diVar, org.telegram.messenger.gf gfVar) {
        this.f38647b = diVar;
        this.f38646a = gfVar;
    }

    @Override
    public final void o(int i7, org.telegram.messenger.j20 j20Var, final boolean z9, final int i10, int i11, final boolean z10) {
        di diVar = this.f38647b;
        diVar.f32982p4 = true;
        if (diVar.T3 == null) {
            return;
        }
        final org.telegram.messenger.gf gfVar = this.f38646a;
        gfVar.f26860s = j20Var;
        v4.X(diVar.D3, diVar.X0() + 1, 0L, new org.telegram.messenger.c20() {
            @Override
            public final void a(Object obj) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.f31191t1;
                arrayList.clear();
                HashMap hashMap = ChatAttachAlertPhotoLayout.f31190s1;
                hashMap.clear();
                arrayList.add(0);
                hashMap.put(0, gfVar);
                uh.this.f38647b.T3.o1(7, true, z9, i10, 0, 0L, false, z10, ((Long) obj).longValue());
            }
        });
    }
}
