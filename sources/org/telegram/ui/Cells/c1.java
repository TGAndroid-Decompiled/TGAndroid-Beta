package org.telegram.ui.Cells;

import java.util.ArrayList;
import org.telegram.messenger.wi;
import org.telegram.messenger.xi;
import org.telegram.messenger.zi;
public final class c1 implements Runnable {
    public final int f29030a;
    public final q1 f29031b;

    public c1(q1 q1Var, int i3) {
        this.f29030a = i3;
        this.f29031b = q1Var;
    }

    @Override
    public final void run() {
        switch (this.f29030a) {
            case 0:
                this.f29031b.p2();
                return;
            case 1:
                this.f29031b.q2();
                return;
            case 2:
                q1 q1Var = this.f29031b;
                org.telegram.ui.Components.i9 i9Var = q1Var.f30133x;
                i9Var.p(q1Var.Xb);
                i9Var.p(q1Var.Yb);
                q1Var.f3();
                zi ziVar = q1Var.P5;
                if (ziVar != null) {
                    ziVar.n0(null);
                    zi ziVar2 = q1Var.P5;
                    if (ziVar2.f26924z != null) {
                        ziVar2.f26924z = null;
                        ziVar2.k0();
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
                q1 q1Var2 = this.f29031b;
                if (q1Var2.f29888d8 && !q1Var2.f29902e8 && q1Var2.f29916f8) {
                    q1Var2.f29902e8 = true;
                    q1Var2.Ja.setState(new int[]{16842919, 16842910});
                    return;
                }
                return;
            case 4:
                q1 q1Var3 = this.f29031b;
                q1Var3.Ja.setState(new int[0]);
                q1Var3.invalidate();
                return;
            case 5:
                q1 q1Var4 = this.f29031b;
                q1Var4.Ja.setState(new int[0]);
                q1Var4.invalidate();
                return;
            case 6:
                q1 q1Var5 = this.f29031b;
                int i3 = 0;
                q1Var5.O5 = false;
                q1Var5.getMessageObject().L0 = true;
                xi xiVar = q1Var5.f30034p3;
                if (xiVar != null) {
                    ArrayList arrayList = xiVar.f26387e;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((wi) obj).f26217y.clear();
                    }
                }
                xi xiVar2 = q1Var5.f29985l3;
                if (xiVar2 != null) {
                    ArrayList arrayList2 = xiVar2.f26387e;
                    int size2 = arrayList2.size();
                    while (i3 < size2) {
                        Object obj2 = arrayList2.get(i3);
                        i3++;
                        ((wi) obj2).f26217y.clear();
                    }
                } else {
                    ArrayList arrayList3 = q1Var5.P5.f26927z2;
                    if (arrayList3 != null) {
                        int size3 = arrayList3.size();
                        while (i3 < size3) {
                            Object obj3 = arrayList3.get(i3);
                            i3++;
                            ((wi) obj3).f26217y.clear();
                        }
                    }
                }
                q1Var5.invalidate();
                return;
            case 7:
                q1 q1Var6 = this.f29031b;
                q1Var6.getMessageObject().C.L0 = true;
                q1Var6.Sb.clear();
                q1Var6.invalidate();
                return;
            case 8:
                q1 q1Var7 = this.f29031b;
                q1Var7.post(new c1(q1Var7, 6));
                return;
            case 9:
                q1 q1Var8 = this.f29031b;
                l1 l1Var2 = q1Var8.Ra;
                if (l1Var2 != null) {
                    l1Var2.s(q1Var8);
                    return;
                }
                return;
            default:
                this.f29031b.f3();
                return;
        }
    }
}
