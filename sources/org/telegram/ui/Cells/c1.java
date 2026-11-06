package org.telegram.ui.Cells;

import java.util.ArrayList;
import org.telegram.messenger.fj;
import org.telegram.messenger.gj;
import org.telegram.messenger.ij;
public final class c1 implements Runnable {
    public final int f28969a;
    public final q1 f28970b;

    public c1(q1 q1Var, int i7) {
        this.f28969a = i7;
        this.f28970b = q1Var;
    }

    @Override
    public final void run() {
        switch (this.f28969a) {
            case 0:
                this.f28970b.p2();
                return;
            case 1:
                this.f28970b.q2();
                return;
            case 2:
                q1 q1Var = this.f28970b;
                ob.c cVar = q1Var.f30057x;
                cVar.a(q1Var.Xb);
                cVar.a(q1Var.Yb);
                q1Var.g3();
                ij ijVar = q1Var.P5;
                if (ijVar != null) {
                    ijVar.n0(null);
                    ij ijVar2 = q1Var.P5;
                    if (ijVar2.f23300z != null) {
                        ijVar2.f23300z = null;
                        ijVar2.k0();
                    }
                    l1 l1Var = q1Var.Ra;
                    if (l1Var != null) {
                        l1Var.V(q1Var);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                q1 q1Var2 = this.f28970b;
                if (q1Var2.f29814d8 && !q1Var2.f29827e8 && q1Var2.f29841f8) {
                    q1Var2.f29827e8 = true;
                    q1Var2.Ja.setState(new int[]{16842919, 16842910});
                    return;
                }
                return;
            case 4:
                q1 q1Var3 = this.f28970b;
                q1Var3.Ja.setState(new int[0]);
                q1Var3.invalidate();
                return;
            case 5:
                q1 q1Var4 = this.f28970b;
                q1Var4.Ja.setState(new int[0]);
                q1Var4.invalidate();
                return;
            case 6:
                q1 q1Var5 = this.f28970b;
                int i7 = 0;
                q1Var5.O5 = false;
                q1Var5.getMessageObject().L0 = true;
                gj gjVar = q1Var5.f29957p3;
                if (gjVar != null) {
                    ArrayList arrayList = gjVar.f22660e;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((fj) obj).f22404y.clear();
                    }
                }
                gj gjVar2 = q1Var5.f29909l3;
                if (gjVar2 != null) {
                    ArrayList arrayList2 = gjVar2.f22660e;
                    int size2 = arrayList2.size();
                    while (i7 < size2) {
                        Object obj2 = arrayList2.get(i7);
                        i7++;
                        ((fj) obj2).f22404y.clear();
                    }
                } else {
                    ArrayList arrayList3 = q1Var5.P5.f23303z2;
                    if (arrayList3 != null) {
                        int size3 = arrayList3.size();
                        while (i7 < size3) {
                            Object obj3 = arrayList3.get(i7);
                            i7++;
                            ((fj) obj3).f22404y.clear();
                        }
                    }
                }
                q1Var5.invalidate();
                return;
            case 7:
                q1 q1Var6 = this.f28970b;
                q1Var6.getMessageObject().C.L0 = true;
                q1Var6.Sb.clear();
                q1Var6.invalidate();
                return;
            case 8:
                q1 q1Var7 = this.f28970b;
                q1Var7.post(new c1(q1Var7, 6));
                return;
            case 9:
                q1 q1Var8 = this.f28970b;
                l1 l1Var2 = q1Var8.Ra;
                if (l1Var2 != null) {
                    l1Var2.r(q1Var8);
                    return;
                }
                return;
            default:
                this.f28970b.g3();
                return;
        }
    }
}
