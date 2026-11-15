package org.telegram.ui.Cells;

import java.util.ArrayList;
import org.telegram.messenger.dj;
import org.telegram.messenger.ej;
import org.telegram.messenger.gj;
public final class d1 implements Runnable {
    public final int f30131a;
    public final q1 f30132b;

    public d1(q1 q1Var, int i7) {
        this.f30131a = i7;
        this.f30132b = q1Var;
    }

    @Override
    public final void run() {
        switch (this.f30131a) {
            case 0:
                this.f30132b.q2();
                return;
            case 1:
                this.f30132b.r2();
                return;
            case 2:
                q1 q1Var = this.f30132b;
                b9.g0 g0Var = q1Var.f31208x;
                g0Var.a(q1Var.Yb);
                g0Var.a(q1Var.Zb);
                q1Var.i3();
                gj gjVar = q1Var.Q5;
                if (gjVar != null) {
                    gjVar.n0(null);
                    gj gjVar2 = q1Var.Q5;
                    if (gjVar2.f23877z != null) {
                        gjVar2.f23877z = null;
                        gjVar2.k0();
                    }
                    l1 l1Var = q1Var.Sa;
                    if (l1Var != null) {
                        l1Var.V(q1Var);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                q1 q1Var2 = this.f30132b;
                if (q1Var2.f30963e8 && !q1Var2.f30977f8 && q1Var2.f30989g8) {
                    q1Var2.f30977f8 = true;
                    q1Var2.Ka.setState(new int[]{16842919, 16842910});
                    return;
                }
                return;
            case 4:
                q1 q1Var3 = this.f30132b;
                q1Var3.Ka.setState(new int[0]);
                q1Var3.invalidate();
                return;
            case 5:
                q1 q1Var4 = this.f30132b;
                q1Var4.Ka.setState(new int[0]);
                q1Var4.invalidate();
                return;
            case 6:
                q1 q1Var5 = this.f30132b;
                int i7 = 0;
                q1Var5.P5 = false;
                q1Var5.getMessageObject().N0 = true;
                ej ejVar = q1Var5.f31115q3;
                if (ejVar != null) {
                    ArrayList arrayList = ejVar.f23317e;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((dj) obj).f23108y.clear();
                    }
                }
                ej ejVar2 = q1Var5.f31062m3;
                if (ejVar2 != null) {
                    ArrayList arrayList2 = ejVar2.f23317e;
                    int size2 = arrayList2.size();
                    while (i7 < size2) {
                        Object obj2 = arrayList2.get(i7);
                        i7++;
                        ((dj) obj2).f23108y.clear();
                    }
                } else {
                    ArrayList arrayList3 = q1Var5.Q5.B2;
                    if (arrayList3 != null) {
                        int size3 = arrayList3.size();
                        while (i7 < size3) {
                            Object obj3 = arrayList3.get(i7);
                            i7++;
                            ((dj) obj3).f23108y.clear();
                        }
                    }
                }
                q1Var5.invalidate();
                return;
            case 7:
                q1 q1Var6 = this.f30132b;
                q1Var6.getMessageObject().C.N0 = true;
                q1Var6.Tb.clear();
                q1Var6.invalidate();
                return;
            case 8:
                q1 q1Var7 = this.f30132b;
                q1Var7.post(new d1(q1Var7, 6));
                return;
            case 9:
                q1 q1Var8 = this.f30132b;
                l1 l1Var2 = q1Var8.Sa;
                if (l1Var2 != null) {
                    l1Var2.r(q1Var8);
                    return;
                }
                return;
            default:
                this.f30132b.i3();
                return;
        }
    }
}
