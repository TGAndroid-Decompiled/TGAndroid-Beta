package org.telegram.ui;

import java.util.ArrayList;
public final class l31 implements Runnable {
    public final int f47093a;
    public final r41 f47094b;
    public final ArrayList f47095c;

    public l31(r41 r41Var, ArrayList arrayList, int i3) {
        this.f47093a = i3;
        this.f47094b = r41Var;
        this.f47095c = arrayList;
    }

    @Override
    public final void run() {
        boolean z10;
        switch (this.f47093a) {
            case 0:
                r41 r41Var = this.f47094b;
                ei.r6 r6Var = r41Var.D0;
                r6Var.getClass();
                ArrayList arrayList = this.f47095c;
                int size = arrayList.size();
                int i3 = 0;
                while (true) {
                    if (i3 < size) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        if (!r6Var.f10877j.containsKey((Integer) obj)) {
                            z10 = true;
                        }
                    } else {
                        z10 = false;
                    }
                }
                if (!r6Var.q(0, arrayList, z10)) {
                    r41Var.m0();
                    r41Var.r0();
                    return;
                }
                return;
            default:
                r41 r41Var2 = this.f47094b;
                ArrayList arrayList2 = r41Var2.f49093w0;
                ArrayList arrayList3 = r41Var2.f49091v0;
                int i10 = 0;
                r41Var2.A0 = false;
                ArrayList arrayList4 = this.f47095c;
                if (!arrayList4.isEmpty()) {
                    int size2 = arrayList4.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) arrayList4.get(i11);
                        int i12 = r41Var2.f49089t0.get(ziVar.f1(), -1);
                        if (i12 >= 0 && ((o41) arrayList3.get(i12)).b() == ziVar.f1()) {
                            ((o41) arrayList3.get(i12)).f48186b = ziVar;
                        }
                    }
                    arrayList2.clear();
                    int size3 = arrayList3.size();
                    while (true) {
                        if (i10 < size3) {
                            o41 o41Var = (o41) arrayList3.get(i10);
                            if (o41Var.f48186b == null) {
                                r41Var2.f49088s0 = o41Var.b();
                            } else {
                                arrayList2.add(o41Var);
                                i10++;
                            }
                        }
                    }
                    r41Var2.r0();
                    r41Var2.T.setItemAnimator(null);
                    r41Var2.C0.f();
                    return;
                }
                return;
        }
    }
}
