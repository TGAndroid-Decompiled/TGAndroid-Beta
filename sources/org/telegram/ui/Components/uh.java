package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
public final class uh extends org.telegram.ui.nq0 {
    public final org.telegram.messenger.gf f38631a;
    public final di f38632b;

    public uh(di diVar, org.telegram.messenger.gf gfVar) {
        this.f38632b = diVar;
        this.f38631a = gfVar;
    }

    @Override
    public final void o(int i7, org.telegram.messenger.j20 j20Var, final boolean z9, final int i10, int i11, final boolean z10) {
        di diVar = this.f38632b;
        diVar.f32974p4 = true;
        if (diVar.T3 == null) {
            return;
        }
        final org.telegram.messenger.gf gfVar = this.f38631a;
        gfVar.f26839s = j20Var;
        v4.X(diVar.D3, diVar.X0() + 1, 0L, new org.telegram.messenger.c20() {
            @Override
            public final void a(Object obj) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.f31187t1;
                arrayList.clear();
                HashMap hashMap = ChatAttachAlertPhotoLayout.f31186s1;
                hashMap.clear();
                arrayList.add(0);
                hashMap.put(0, gfVar);
                uh.this.f38632b.T3.o1(7, true, z9, i10, 0, 0L, false, z10, ((Long) obj).longValue());
            }
        });
    }
}
