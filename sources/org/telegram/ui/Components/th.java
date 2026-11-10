package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
public final class th extends org.telegram.ui.qq0 {
    public final org.telegram.messenger.gf f38308a;
    public final ci f38309b;

    public th(ci ciVar, org.telegram.messenger.gf gfVar) {
        this.f38309b = ciVar;
        this.f38308a = gfVar;
    }

    @Override
    public final void o(int i7, org.telegram.messenger.j20 j20Var, final boolean z9, final int i10, int i11, final boolean z10) {
        ci ciVar = this.f38309b;
        ciVar.f32650s4 = true;
        if (ciVar.W3 == null) {
            return;
        }
        final org.telegram.messenger.gf gfVar = this.f38308a;
        gfVar.f26864s = j20Var;
        u4.X(ciVar.G3, ciVar.X0() + 1, 0L, new org.telegram.messenger.c20() {
            @Override
            public final void a(Object obj) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.f31207t1;
                arrayList.clear();
                HashMap hashMap = ChatAttachAlertPhotoLayout.f31206s1;
                hashMap.clear();
                arrayList.add(0);
                hashMap.put(0, gfVar);
                th.this.f38309b.W3.o1(7, true, z9, i10, 0, 0L, false, z10, ((Long) obj).longValue());
            }
        });
    }
}
