package org.telegram.ui.Cells;

import java.util.ArrayList;
import org.telegram.messenger.cj;
import org.telegram.messenger.dj;
import org.telegram.messenger.fj;
public final class e1 implements Runnable {
    public final int f30558a;
    public final r1 f30559b;

    public e1(r1 r1Var, int i7) {
        this.f30558a = i7;
        this.f30559b = r1Var;
    }

    @Override
    public final void run() {
        switch (this.f30558a) {
            case 0:
                this.f30559b.q2();
                return;
            case 1:
                this.f30559b.r2();
                return;
            case 2:
                r1 r1Var = this.f30559b;
                b9.g0 g0Var = r1Var.f31630x;
                g0Var.a(r1Var.Yb);
                g0Var.a(r1Var.Zb);
                r1Var.j3();
                fj fjVar = r1Var.Q5;
                if (fjVar != null) {
                    fjVar.n0(null);
                    fj fjVar2 = r1Var.Q5;
                    if (fjVar2.f24023z != null) {
                        fjVar2.f24023z = null;
                        fjVar2.k0();
                    }
                    m1 m1Var = r1Var.Sa;
                    if (m1Var != null) {
                        m1Var.Y(r1Var);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                r1 r1Var2 = this.f30559b;
                if (r1Var2.f31385e8 && !r1Var2.f31399f8 && r1Var2.f31411g8) {
                    r1Var2.f31399f8 = true;
                    r1Var2.Ka.setState(new int[]{16842919, 16842910});
                    return;
                }
                return;
            case 4:
                r1 r1Var3 = this.f30559b;
                r1Var3.Ka.setState(new int[0]);
                r1Var3.invalidate();
                return;
            case 5:
                r1 r1Var4 = this.f30559b;
                r1Var4.Ka.setState(new int[0]);
                r1Var4.invalidate();
                return;
            case 6:
                r1 r1Var5 = this.f30559b;
                int i7 = 0;
                r1Var5.P5 = false;
                r1Var5.getMessageObject().N0 = true;
                dj djVar = r1Var5.f31537q3;
                if (djVar != null) {
                    ArrayList arrayList = djVar.f23533e;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((cj) obj).f23368y.clear();
                    }
                }
                dj djVar2 = r1Var5.f31484m3;
                if (djVar2 != null) {
                    ArrayList arrayList2 = djVar2.f23533e;
                    int size2 = arrayList2.size();
                    while (i7 < size2) {
                        Object obj2 = arrayList2.get(i7);
                        i7++;
                        ((cj) obj2).f23368y.clear();
                    }
                } else {
                    ArrayList arrayList3 = r1Var5.Q5.B2;
                    if (arrayList3 != null) {
                        int size3 = arrayList3.size();
                        while (i7 < size3) {
                            Object obj3 = arrayList3.get(i7);
                            i7++;
                            ((cj) obj3).f23368y.clear();
                        }
                    }
                }
                r1Var5.invalidate();
                return;
            case 7:
                r1 r1Var6 = this.f30559b;
                r1Var6.getMessageObject().C.N0 = true;
                r1Var6.Tb.clear();
                r1Var6.invalidate();
                return;
            case 8:
                r1 r1Var7 = this.f30559b;
                r1Var7.post(new e1(r1Var7, 6));
                return;
            case 9:
                r1 r1Var8 = this.f30559b;
                m1 m1Var2 = r1Var8.Sa;
                if (m1Var2 != null) {
                    m1Var2.s(r1Var8);
                    return;
                }
                return;
            default:
                this.f30559b.j3();
                return;
        }
    }
}
