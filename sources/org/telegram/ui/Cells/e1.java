package org.telegram.ui.Cells;

import java.util.ArrayList;
import org.telegram.messenger.cj;
import org.telegram.messenger.dj;
import org.telegram.messenger.fj;
public final class e1 implements Runnable {
    public final int f30649a;
    public final r1 f30650b;

    public e1(r1 r1Var, int i7) {
        this.f30649a = i7;
        this.f30650b = r1Var;
    }

    @Override
    public final void run() {
        switch (this.f30649a) {
            case 0:
                this.f30650b.q2();
                return;
            case 1:
                this.f30650b.r2();
                return;
            case 2:
                r1 r1Var = this.f30650b;
                l2.c cVar = r1Var.f31711x;
                cVar.a(r1Var.Yb);
                cVar.a(r1Var.Zb);
                r1Var.j3();
                fj fjVar = r1Var.Q5;
                if (fjVar != null) {
                    fjVar.n0(null);
                    fj fjVar2 = r1Var.Q5;
                    if (fjVar2.f24131z != null) {
                        fjVar2.f24131z = null;
                        fjVar2.k0();
                    }
                    m1 m1Var = r1Var.Sa;
                    if (m1Var != null) {
                        m1Var.d0(r1Var);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                r1 r1Var2 = this.f30650b;
                if (r1Var2.f31466e8 && !r1Var2.f31480f8 && r1Var2.f31492g8) {
                    r1Var2.f31480f8 = true;
                    r1Var2.Ka.setState(new int[]{16842919, 16842910});
                    return;
                }
                return;
            case 4:
                r1 r1Var3 = this.f30650b;
                r1Var3.Ka.setState(new int[0]);
                r1Var3.invalidate();
                return;
            case 5:
                r1 r1Var4 = this.f30650b;
                r1Var4.Ka.setState(new int[0]);
                r1Var4.invalidate();
                return;
            case 6:
                r1 r1Var5 = this.f30650b;
                int i7 = 0;
                r1Var5.P5 = false;
                r1Var5.getMessageObject().N0 = true;
                dj djVar = r1Var5.f31618q3;
                if (djVar != null) {
                    ArrayList arrayList = djVar.f23662e;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((cj) obj).f23483y.clear();
                    }
                }
                dj djVar2 = r1Var5.f31565m3;
                if (djVar2 != null) {
                    ArrayList arrayList2 = djVar2.f23662e;
                    int size2 = arrayList2.size();
                    while (i7 < size2) {
                        Object obj2 = arrayList2.get(i7);
                        i7++;
                        ((cj) obj2).f23483y.clear();
                    }
                } else {
                    ArrayList arrayList3 = r1Var5.Q5.B2;
                    if (arrayList3 != null) {
                        int size3 = arrayList3.size();
                        while (i7 < size3) {
                            Object obj3 = arrayList3.get(i7);
                            i7++;
                            ((cj) obj3).f23483y.clear();
                        }
                    }
                }
                r1Var5.invalidate();
                return;
            case 7:
                r1 r1Var6 = this.f30650b;
                r1Var6.getMessageObject().C.N0 = true;
                r1Var6.Tb.clear();
                r1Var6.invalidate();
                return;
            case 8:
                r1 r1Var7 = this.f30650b;
                r1Var7.post(new e1(r1Var7, 6));
                return;
            case 9:
                r1 r1Var8 = this.f30650b;
                m1 m1Var2 = r1Var8.Sa;
                if (m1Var2 != null) {
                    m1Var2.t(r1Var8);
                    return;
                }
                return;
            default:
                this.f30650b.j3();
                return;
        }
    }
}
