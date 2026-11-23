package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
public final class ki extends org.telegram.ui.oq0 {
    public final org.telegram.messenger.ef f36751a;
    public final ti f36752b;

    public ki(ti tiVar, org.telegram.messenger.ef efVar) {
        this.f36752b = tiVar;
        this.f36751a = efVar;
    }

    @Override
    public final void o(int i7, org.telegram.messenger.d20 d20Var, final boolean z10, final int i10, int i11, final boolean z11) {
        ti tiVar = this.f36752b;
        tiVar.f40019t4 = true;
        if (tiVar.X3 == null) {
            return;
        }
        final org.telegram.messenger.ef efVar = this.f36751a;
        efVar.f27978s = d20Var;
        b5.X(tiVar.H3, tiVar.Y0() + 1, 0L, new org.telegram.messenger.w10() {
            @Override
            public final void a(Object obj) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.f32865u1;
                arrayList.clear();
                HashMap hashMap = ChatAttachAlertPhotoLayout.f32864t1;
                hashMap.clear();
                arrayList.add(0);
                hashMap.put(0, efVar);
                ki.this.f36752b.X3.y1(7, true, z10, i10, 0, 0L, false, z11, ((Long) obj).longValue());
            }
        });
    }
}
