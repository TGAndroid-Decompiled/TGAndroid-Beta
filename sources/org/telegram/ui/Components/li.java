package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
public final class li extends org.telegram.ui.oq0 {
    public final org.telegram.messenger.ff f37194a;
    public final ui f37195b;

    public li(ui uiVar, org.telegram.messenger.ff ffVar) {
        this.f37195b = uiVar;
        this.f37194a = ffVar;
    }

    @Override
    public final void o(int i7, org.telegram.messenger.f20 f20Var, final boolean z10, final int i10, int i11, final boolean z11) {
        ui uiVar = this.f37195b;
        uiVar.f40431t4 = true;
        if (uiVar.X3 == null) {
            return;
        }
        final org.telegram.messenger.ff ffVar = this.f37194a;
        ffVar.f28074s = f20Var;
        c5.X(uiVar.H3, uiVar.Y0() + 1, 0L, new org.telegram.messenger.y10() {
            @Override
            public final void a(Object obj) {
                ArrayList arrayList = ChatAttachAlertPhotoLayout.f32801u1;
                arrayList.clear();
                HashMap hashMap = ChatAttachAlertPhotoLayout.f32800t1;
                hashMap.clear();
                arrayList.add(0);
                hashMap.put(0, ffVar);
                li.this.f37195b.X3.y1(7, true, z10, i10, 0, 0L, false, z11, ((Long) obj).longValue());
            }
        });
    }
}
