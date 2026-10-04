package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class o91 implements Runnable {
    public final int f39142a;
    public final va1 f39143b;
    public final ArrayList f39144c;

    public o91(va1 va1Var, ArrayList arrayList, int i10) {
        this.f39142a = i10;
        this.f39143b = va1Var;
        this.f39144c = arrayList;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f39142a) {
            case 0:
                va1 va1Var = this.f39143b;
                ai.d9 d9Var = va1Var.C0;
                d9Var.getClass();
                ArrayList arrayList = this.f39144c;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    if (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        if (!d9Var.f790j.containsKey((Integer) obj)) {
                            z10 = true;
                        }
                    } else {
                        z10 = false;
                    }
                }
                if (!d9Var.q(0, arrayList, z10)) {
                    va1Var.h0();
                    va1Var.m0();
                    return;
                }
                return;
            default:
                va1 va1Var2 = this.f39143b;
                ArrayList arrayList2 = va1Var2.f41665v0;
                ArrayList arrayList3 = va1Var2.f41664u0;
                int i11 = 0;
                va1Var2.f41672z0 = false;
                ArrayList arrayList4 = this.f39144c;
                if (!arrayList4.isEmpty()) {
                    int size2 = arrayList4.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        MessageObject messageObject = (MessageObject) arrayList4.get(i12);
                        int i13 = va1Var2.f41662s0.get(messageObject.getId(), -1);
                        if (i13 >= 0 && ((sa1) arrayList3.get(i13)).b() == messageObject.getId()) {
                            ((sa1) arrayList3.get(i13)).f40437b = messageObject;
                        }
                    }
                    arrayList2.clear();
                    int size3 = arrayList3.size();
                    while (true) {
                        if (i11 < size3) {
                            sa1 sa1Var = (sa1) arrayList3.get(i11);
                            if (sa1Var.f40437b == null) {
                                va1Var2.f41660r0 = sa1Var.b();
                            } else {
                                arrayList2.add(sa1Var);
                                i11++;
                            }
                        }
                    }
                    va1Var2.m0();
                    va1Var2.S.setItemAnimator(null);
                    va1Var2.B0.f();
                    return;
                }
                return;
        }
    }
}
