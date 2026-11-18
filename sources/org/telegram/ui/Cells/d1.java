package org.telegram.ui.Cells;

import java.util.ArrayList;
import org.telegram.messenger.cj;
import org.telegram.messenger.dj;
import org.telegram.messenger.fj;
public final class d1 implements Runnable {
    public final int f30512a;
    public final q1 f30513b;

    public d1(q1 q1Var, int i7) {
        this.f30512a = i7;
        this.f30513b = q1Var;
    }

    @Override
    public final void run() {
        switch (this.f30512a) {
            case 0:
                this.f30513b.q2();
                return;
            case 1:
                this.f30513b.r2();
                return;
            case 2:
                q1 q1Var = this.f30513b;
                b9.g0 g0Var = q1Var.f31580x;
                g0Var.a(q1Var.Yb);
                g0Var.a(q1Var.Zb);
                q1Var.j3();
                fj fjVar = q1Var.Q5;
                if (fjVar != null) {
                    fjVar.n0(null);
                    fj fjVar2 = q1Var.Q5;
                    if (fjVar2.f24026z != null) {
                        fjVar2.f24026z = null;
                        fjVar2.k0();
                    }
                    l1 l1Var = q1Var.Sa;
                    if (l1Var != null) {
                        l1Var.Y(q1Var);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                q1 q1Var2 = this.f30513b;
                if (q1Var2.f31335e8 && !q1Var2.f31349f8 && q1Var2.f31361g8) {
                    q1Var2.f31349f8 = true;
                    q1Var2.Ka.setState(new int[]{16842919, 16842910});
                    return;
                }
                return;
            case 4:
                q1 q1Var3 = this.f30513b;
                q1Var3.Ka.setState(new int[0]);
                q1Var3.invalidate();
                return;
            case 5:
                q1 q1Var4 = this.f30513b;
                q1Var4.Ka.setState(new int[0]);
                q1Var4.invalidate();
                return;
            case 6:
                q1 q1Var5 = this.f30513b;
                int i7 = 0;
                q1Var5.P5 = false;
                q1Var5.getMessageObject().N0 = true;
                dj djVar = q1Var5.f31487q3;
                if (djVar != null) {
                    ArrayList arrayList = djVar.f23536e;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((cj) obj).f23371y.clear();
                    }
                }
                dj djVar2 = q1Var5.f31434m3;
                if (djVar2 != null) {
                    ArrayList arrayList2 = djVar2.f23536e;
                    int size2 = arrayList2.size();
                    while (i7 < size2) {
                        Object obj2 = arrayList2.get(i7);
                        i7++;
                        ((cj) obj2).f23371y.clear();
                    }
                } else {
                    ArrayList arrayList3 = q1Var5.Q5.B2;
                    if (arrayList3 != null) {
                        int size3 = arrayList3.size();
                        while (i7 < size3) {
                            Object obj3 = arrayList3.get(i7);
                            i7++;
                            ((cj) obj3).f23371y.clear();
                        }
                    }
                }
                q1Var5.invalidate();
                return;
            case 7:
                q1 q1Var6 = this.f30513b;
                q1Var6.getMessageObject().C.N0 = true;
                q1Var6.Tb.clear();
                q1Var6.invalidate();
                return;
            case 8:
                q1 q1Var7 = this.f30513b;
                q1Var7.post(new d1(q1Var7, 6));
                return;
            case 9:
                q1 q1Var8 = this.f30513b;
                l1 l1Var2 = q1Var8.Sa;
                if (l1Var2 != null) {
                    l1Var2.s(q1Var8);
                    return;
                }
                return;
            default:
                this.f30513b.j3();
                return;
        }
    }
}
