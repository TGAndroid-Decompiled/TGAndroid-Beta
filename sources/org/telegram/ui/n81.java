package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class n81 implements Runnable {
    public final int f40746a;
    public final t91 f40747b;
    public final ArrayList f40748c;

    public n81(t91 t91Var, ArrayList arrayList, int i10) {
        this.f40746a = i10;
        this.f40747b = t91Var;
        this.f40748c = arrayList;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f40746a) {
            case 0:
                t91 t91Var = this.f40747b;
                ArrayList arrayList = t91Var.f42607o0;
                ArrayList arrayList2 = t91Var.f42606n0;
                int i10 = 0;
                t91Var.f42613s0 = false;
                ArrayList arrayList3 = this.f40748c;
                if (!arrayList3.isEmpty()) {
                    int size = arrayList3.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        MessageObject messageObject = (MessageObject) arrayList3.get(i11);
                        int i12 = t91Var.f42604l0.get(messageObject.getId(), -1);
                        if (i12 >= 0 && ((q91) arrayList2.get(i12)).b() == messageObject.getId()) {
                            ((q91) arrayList2.get(i12)).f41602b = messageObject;
                        }
                    }
                    arrayList.clear();
                    int size2 = arrayList2.size();
                    while (true) {
                        if (i10 < size2) {
                            q91 q91Var = (q91) arrayList2.get(i10);
                            if (q91Var.f41602b == null) {
                                t91Var.f42603k0 = q91Var.b();
                            } else {
                                arrayList.add(q91Var);
                                i10++;
                            }
                        }
                    }
                    t91Var.o0();
                    t91Var.O.setItemAnimator(null);
                    t91Var.f42615u0.f();
                    return;
                }
                return;
            default:
                t91 t91Var2 = this.f40747b;
                lh.k6 k6Var = t91Var2.f42616v0;
                k6Var.getClass();
                ArrayList arrayList4 = this.f40748c;
                int size3 = arrayList4.size();
                int i13 = 0;
                while (true) {
                    if (i13 < size3) {
                        Object obj = arrayList4.get(i13);
                        i13++;
                        if (!k6Var.f15839j.containsKey((Integer) obj)) {
                            z10 = true;
                        }
                    } else {
                        z10 = false;
                    }
                }
                if (!k6Var.q(0, arrayList4, z10)) {
                    t91Var2.j0();
                    t91Var2.o0();
                    return;
                }
                return;
        }
    }
}
