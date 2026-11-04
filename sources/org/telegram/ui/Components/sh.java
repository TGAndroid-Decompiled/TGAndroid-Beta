package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
public final class sh extends org.telegram.ui.eq0 {
    public final org.telegram.messenger.ye f38031a;
    public final bi f38032b;

    public sh(bi biVar, org.telegram.messenger.ye yeVar) {
        this.f38032b = biVar;
        this.f38031a = yeVar;
    }

    @Override
    public final void o(int i3, org.telegram.messenger.b20 b20Var, final boolean z10, final int i10, int i11, final boolean z11) {
        bi biVar = this.f38032b;
        biVar.f32265q4 = true;
        if (biVar.U3 == null) {
            return;
        }
        final org.telegram.messenger.ye yeVar = this.f38031a;
        yeVar.f25325s = b20Var;
        t4.Z(biVar.E3, biVar.X0() + 1, 0L, new org.telegram.messenger.u10() {
            @Override
            public final void a(Object obj) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.f31261u1;
                arrayList.clear();
                HashMap hashMap = ChatAttachAlertPhotoLayout.f31260t1;
                hashMap.clear();
                arrayList.add(0);
                hashMap.put(0, yeVar);
                sh.this.f38032b.U3.o1(7, true, z10, i10, 0, 0L, false, z11, ((Long) obj).longValue());
            }
        });
    }
}
