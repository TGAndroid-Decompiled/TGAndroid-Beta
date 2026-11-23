package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
public final class li extends org.telegram.ui.pq0 {
    public final org.telegram.messenger.ff f37149a;
    public final ui f37150b;

    public li(ui uiVar, org.telegram.messenger.ff ffVar) {
        this.f37150b = uiVar;
        this.f37149a = ffVar;
    }

    @Override
    public final void o(int i7, org.telegram.messenger.f20 f20Var, final boolean z10, final int i10, int i11, final boolean z11) {
        ui uiVar = this.f37150b;
        uiVar.f40415t4 = true;
        if (uiVar.X3 == null) {
            return;
        }
        final org.telegram.messenger.ff ffVar = this.f37149a;
        ffVar.f28038s = f20Var;
        c5.X(uiVar.H3, uiVar.Y0() + 1, 0L, new org.telegram.messenger.y10() {
            @Override
            public final void a(Object obj) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.f32767u1;
                arrayList.clear();
                HashMap hashMap = ChatAttachAlertPhotoLayout.f32766t1;
                hashMap.clear();
                arrayList.add(0);
                hashMap.put(0, ffVar);
                li.this.f37150b.X3.y1(7, true, z10, i10, 0, 0L, false, z11, ((Long) obj).longValue());
            }
        });
    }
}
