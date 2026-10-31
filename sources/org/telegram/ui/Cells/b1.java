package org.telegram.ui.Cells;

import java.util.ArrayList;
import org.telegram.messenger.gj;
import org.telegram.messenger.hj;
import org.telegram.messenger.jj;
public final class b1 implements Runnable {
    public final int f21707a;
    public final q1 f21708b;

    public b1(q1 q1Var, int i10) {
        this.f21707a = i10;
        this.f21708b = q1Var;
    }

    @Override
    public final void run() {
        switch (this.f21707a) {
            case 0:
                this.f21708b.n2();
                return;
            case 1:
                this.f21708b.o2();
                return;
            case 2:
                q1 q1Var = this.f21708b;
                m2.t tVar = q1Var.f22774x;
                tVar.n(q1Var.Wb);
                tVar.n(q1Var.Xb);
                q1Var.d3();
                jj jjVar = q1Var.O5;
                if (jjVar != null) {
                    jjVar.n0(null);
                    jj jjVar2 = q1Var.O5;
                    if (jjVar2.f16394z != null) {
                        jjVar2.f16394z = null;
                        jjVar2.k0();
                    }
                    l1 l1Var = q1Var.Qa;
                    if (l1Var != null) {
                        l1Var.U(q1Var);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                q1 q1Var2 = this.f21708b;
                if (q1Var2.f22520c8 && !q1Var2.f22534d8 && q1Var2.f22547e8) {
                    q1Var2.f22534d8 = true;
                    q1Var2.Ia.setState(new int[]{16842919, 16842910});
                    return;
                }
                return;
            case 4:
                q1 q1Var3 = this.f21708b;
                q1Var3.Ia.setState(new int[0]);
                q1Var3.invalidate();
                return;
            case 5:
                q1 q1Var4 = this.f21708b;
                q1Var4.Ia.setState(new int[0]);
                q1Var4.invalidate();
                return;
            case 6:
                q1 q1Var5 = this.f21708b;
                int i10 = 0;
                q1Var5.N5 = false;
                q1Var5.getMessageObject().L0 = true;
                hj hjVar = q1Var5.f22665o3;
                if (hjVar != null) {
                    ArrayList arrayList = hjVar.e;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        ((gj) obj).f15723y.clear();
                    }
                }
                hj hjVar2 = q1Var5.f22615k3;
                if (hjVar2 != null) {
                    ArrayList arrayList2 = hjVar2.e;
                    int size2 = arrayList2.size();
                    while (i10 < size2) {
                        Object obj2 = arrayList2.get(i10);
                        i10++;
                        ((gj) obj2).f15723y.clear();
                    }
                } else {
                    ArrayList arrayList3 = q1Var5.O5.f16397z2;
                    if (arrayList3 != null) {
                        int size3 = arrayList3.size();
                        while (i10 < size3) {
                            Object obj3 = arrayList3.get(i10);
                            i10++;
                            ((gj) obj3).f15723y.clear();
                        }
                    }
                }
                q1Var5.invalidate();
                return;
            case 7:
                q1 q1Var6 = this.f21708b;
                q1Var6.getMessageObject().C.L0 = true;
                q1Var6.Rb.clear();
                q1Var6.invalidate();
                return;
            case 8:
                q1 q1Var7 = this.f21708b;
                q1Var7.post(new b1(q1Var7, 6));
                return;
            case 9:
                q1 q1Var8 = this.f21708b;
                l1 l1Var2 = q1Var8.Qa;
                if (l1Var2 != null) {
                    l1Var2.q(q1Var8);
                    return;
                }
                return;
            default:
                this.f21708b.d3();
                return;
        }
    }
}
