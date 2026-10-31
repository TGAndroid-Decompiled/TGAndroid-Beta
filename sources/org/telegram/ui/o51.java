package org.telegram.ui;

import java.util.ArrayList;
public final class o51 implements Runnable {
    public final int f40144a;
    public final u61 f40145b;
    public final ArrayList f40146c;

    public o51(u61 u61Var, ArrayList arrayList, int i10) {
        this.f40144a = i10;
        this.f40145b = u61Var;
        this.f40146c = arrayList;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f40144a) {
            case 0:
                u61 u61Var = this.f40145b;
                th.x4 x4Var = u61Var.C0;
                x4Var.getClass();
                ArrayList arrayList = this.f40146c;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    if (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        if (!x4Var.f49637j.containsKey((Integer) obj)) {
                            z10 = true;
                        }
                    } else {
                        z10 = false;
                    }
                }
                if (!x4Var.q(0, arrayList, z10)) {
                    u61Var.l0();
                    u61Var.q0();
                    return;
                }
                return;
            default:
                u61 u61Var2 = this.f40145b;
                ArrayList arrayList2 = u61Var2.f42050v0;
                ArrayList arrayList3 = u61Var2.f42049u0;
                int i11 = 0;
                u61Var2.f42057z0 = false;
                ArrayList arrayList4 = this.f40146c;
                if (!arrayList4.isEmpty()) {
                    int size2 = arrayList4.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) arrayList4.get(i12);
                        int i13 = u61Var2.f42047s0.get(jjVar.f1(), -1);
                        if (i13 >= 0 && ((r61) arrayList3.get(i13)).b() == jjVar.f1()) {
                            ((r61) arrayList3.get(i13)).f41150b = jjVar;
                        }
                    }
                    arrayList2.clear();
                    int size3 = arrayList3.size();
                    while (true) {
                        if (i11 < size3) {
                            r61 r61Var = (r61) arrayList3.get(i11);
                            if (r61Var.f41150b == null) {
                                u61Var2.f42045r0 = r61Var.b();
                            } else {
                                arrayList2.add(r61Var);
                                i11++;
                            }
                        }
                    }
                    u61Var2.q0();
                    u61Var2.S.setItemAnimator(null);
                    u61Var2.B0.f();
                    return;
                }
                return;
        }
    }
}
