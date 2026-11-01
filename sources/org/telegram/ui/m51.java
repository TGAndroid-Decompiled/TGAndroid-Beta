package org.telegram.ui;

import java.util.ArrayList;
public final class m51 implements Runnable {
    public final int f39434a;
    public final s61 f39435b;
    public final ArrayList f39436c;

    public m51(s61 s61Var, ArrayList arrayList, int i10) {
        this.f39434a = i10;
        this.f39435b = s61Var;
        this.f39436c = arrayList;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f39434a) {
            case 0:
                s61 s61Var = this.f39435b;
                th.x4 x4Var = s61Var.C0;
                x4Var.getClass();
                ArrayList arrayList = this.f39436c;
                int size = arrayList.size();
                int i10 = 0;
                while (true) {
                    if (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        if (!x4Var.f49651j.containsKey((Integer) obj)) {
                            z10 = true;
                        }
                    } else {
                        z10 = false;
                    }
                }
                if (!x4Var.q(0, arrayList, z10)) {
                    s61Var.m0();
                    s61Var.r0();
                    return;
                }
                return;
            default:
                s61 s61Var2 = this.f39435b;
                ArrayList arrayList2 = s61Var2.f41263v0;
                ArrayList arrayList3 = s61Var2.f41262u0;
                int i11 = 0;
                s61Var2.f41270z0 = false;
                ArrayList arrayList4 = this.f39436c;
                if (!arrayList4.isEmpty()) {
                    int size2 = arrayList4.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) arrayList4.get(i12);
                        int i13 = s61Var2.f41260s0.get(kjVar.f1(), -1);
                        if (i13 >= 0 && ((p61) arrayList3.get(i13)).b() == kjVar.f1()) {
                            ((p61) arrayList3.get(i13)).f40379b = kjVar;
                        }
                    }
                    arrayList2.clear();
                    int size3 = arrayList3.size();
                    while (true) {
                        if (i11 < size3) {
                            p61 p61Var = (p61) arrayList3.get(i11);
                            if (p61Var.f40379b == null) {
                                s61Var2.f41258r0 = p61Var.b();
                            } else {
                                arrayList2.add(p61Var);
                                i11++;
                            }
                        }
                    }
                    s61Var2.r0();
                    s61Var2.S.setItemAnimator(null);
                    s61Var2.B0.f();
                    return;
                }
                return;
        }
    }
}
