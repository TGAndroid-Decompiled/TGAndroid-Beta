package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class pu implements View.OnLongClickListener {
    public final int f51141a;
    public final bx f51142b;

    public pu(bx bxVar, int i7) {
        this.f51141a = i7;
        this.f51142b = bxVar;
    }

    @Override
    public final boolean onLongClick(View view) {
        boolean z10;
        boolean z11;
        int i7;
        int i10;
        int i11 = this.f51141a;
        bx bxVar = this.f51142b;
        switch (i11) {
            case 0:
                ArrayList arrayList = bxVar.K2;
                if (bxVar.getParentActivity() == null) {
                    return false;
                }
                boolean z12 = !arrayList.isEmpty();
                boolean z13 = true;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    long longValue = ((Long) arrayList.get(i12)).longValue();
                    if (z12 && longValue != bxVar.getUserConfig().e()) {
                        z12 = false;
                    }
                    if (org.telegram.messenger.n5.C(longValue)) {
                        z13 = false;
                    }
                    TLRPC.Chat O0 = bxVar.getMessagesController().O0(Long.valueOf(-longValue));
                    if (O0 != null && !org.telegram.messenger.v3.B(O0)) {
                        z13 = false;
                    }
                }
                if (bxVar.o4() && bxVar.x3()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    ArrayList arrayList2 = bxVar.F2;
                    int size = arrayList2.size();
                    int i13 = 0;
                    while (true) {
                        if (i13 < size) {
                            Object obj = arrayList2.get(i13);
                            i13++;
                            if (((org.telegram.messenger.ef) obj).b()) {
                                z10 = false;
                            }
                        }
                    }
                }
                ArrayList arrayList3 = bxVar.F2;
                if (arrayList3 != null && arrayList3.size() > 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.ui.Components.x60 I = org.telegram.ui.Components.x60.I(bxVar, view);
                if (z11) {
                    i7 = 2131745439;
                } else {
                    i7 = 2131745440;
                }
                I.l(2131232364, org.telegram.messenger.gd.N0(i7, null), new fu(bxVar, 13), z10);
                I.c(2131231512, org.telegram.messenger.gd.N0(2131745387, null), new fu(bxVar, 14), false);
                if (z12) {
                    i10 = 2131745318;
                } else {
                    i10 = 2131745663;
                }
                I.l(2131232082, org.telegram.messenger.gd.N0(i10, null), new org.telegram.ui.Components.qp0(7, bxVar, z12), z13);
                I.a0();
                return true;
            case 1:
                bx bxVar2 = this.f51142b;
                bxVar2.K4(bxVar2.K2, 104, true, true, null);
                return true;
            case 2:
                bxVar.G4(view);
                return true;
            default:
                bxVar.getContactsController().B();
                bxVar.e5();
                return true;
        }
    }
}
