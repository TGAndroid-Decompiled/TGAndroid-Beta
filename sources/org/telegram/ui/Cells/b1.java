package org.telegram.ui.Cells;

import java.util.ArrayList;
import org.telegram.messenger.hj;
import org.telegram.messenger.ij;
import org.telegram.messenger.kj;
public final class b1 implements Runnable {
    public final int f21708a;
    public final q1 f21709b;

    public b1(q1 q1Var, int i10) {
        this.f21708a = i10;
        this.f21709b = q1Var;
    }

    @Override
    public final void run() {
        switch (this.f21708a) {
            case 0:
                this.f21709b.n2();
                return;
            case 1:
                this.f21709b.o2();
                return;
            case 2:
                q1 q1Var = this.f21709b;
                m2.t tVar = q1Var.f22775x;
                tVar.n(q1Var.Wb);
                tVar.n(q1Var.Xb);
                q1Var.d3();
                kj kjVar = q1Var.O5;
                if (kjVar != null) {
                    kjVar.n0(null);
                    kj kjVar2 = q1Var.O5;
                    if (kjVar2.f16747z != null) {
                        kjVar2.f16747z = null;
                        kjVar2.k0();
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
                q1 q1Var2 = this.f21709b;
                if (q1Var2.f22521c8 && !q1Var2.f22535d8 && q1Var2.f22548e8) {
                    q1Var2.f22535d8 = true;
                    q1Var2.Ia.setState(new int[]{16842919, 16842910});
                    return;
                }
                return;
            case 4:
                q1 q1Var3 = this.f21709b;
                q1Var3.Ia.setState(new int[0]);
                q1Var3.invalidate();
                return;
            case 5:
                q1 q1Var4 = this.f21709b;
                q1Var4.Ia.setState(new int[0]);
                q1Var4.invalidate();
                return;
            case 6:
                q1 q1Var5 = this.f21709b;
                int i10 = 0;
                q1Var5.N5 = false;
                q1Var5.getMessageObject().L0 = true;
                ij ijVar = q1Var5.f22666o3;
                if (ijVar != null) {
                    ArrayList arrayList = ijVar.e;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        ((hj) obj).f16072y.clear();
                    }
                }
                ij ijVar2 = q1Var5.f22616k3;
                if (ijVar2 != null) {
                    ArrayList arrayList2 = ijVar2.e;
                    int size2 = arrayList2.size();
                    while (i10 < size2) {
                        Object obj2 = arrayList2.get(i10);
                        i10++;
                        ((hj) obj2).f16072y.clear();
                    }
                } else {
                    ArrayList arrayList3 = q1Var5.O5.f16750z2;
                    if (arrayList3 != null) {
                        int size3 = arrayList3.size();
                        while (i10 < size3) {
                            Object obj3 = arrayList3.get(i10);
                            i10++;
                            ((hj) obj3).f16072y.clear();
                        }
                    }
                }
                q1Var5.invalidate();
                return;
            case 7:
                q1 q1Var6 = this.f21709b;
                q1Var6.getMessageObject().C.L0 = true;
                q1Var6.Rb.clear();
                q1Var6.invalidate();
                return;
            case 8:
                q1 q1Var7 = this.f21709b;
                q1Var7.post(new b1(q1Var7, 6));
                return;
            case 9:
                q1 q1Var8 = this.f21709b;
                l1 l1Var2 = q1Var8.Qa;
                if (l1Var2 != null) {
                    l1Var2.q(q1Var8);
                    return;
                }
                return;
            default:
                this.f21709b.d3();
                return;
        }
    }
}
