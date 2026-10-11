package org.telegram.ui.Components;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.MessageObject;
public final class qk implements ViewTreeObserver.OnPreDrawListener {
    public final int f30170a;
    public final MessageObject f30171b;
    public final boolean f30172c;
    public final ViewGroup d;
    public final rm0 f30173e;

    public qk(rm0 rm0Var, ViewGroup viewGroup, MessageObject messageObject, boolean z10, int i10) {
        this.f30170a = i10;
        this.f30173e = rm0Var;
        this.d = viewGroup;
        this.f30171b = messageObject;
        this.f30172c = z10;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f30170a) {
            case 0:
                org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) this.d;
                k7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                rk rkVar = (rk) this.f30173e;
                org.telegram.ui.n10 n10Var = rkVar.H;
                sk skVar = rkVar.X;
                boolean t10 = skVar.f30161b.f33199a1.t();
                boolean z10 = this.f30172c;
                if (t10) {
                    MessageObject messageObject = this.f30171b;
                    int id2 = messageObject.getId();
                    n10Var.f40110a = messageObject.getDialogId();
                    n10Var.f40111b = id2;
                    k7Var.b(skVar.T.containsKey(n10Var), z10);
                    return true;
                }
                k7Var.b(false, z10);
                return true;
            case 1:
                org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) this.d;
                s2Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.v10 v10Var = ((org.telegram.ui.o10) this.f30173e).f40380c;
                boolean g10 = v10Var.f42847o0.g();
                boolean z11 = this.f30172c;
                if (g10) {
                    org.telegram.ui.n10 n10Var2 = v10Var.S;
                    MessageObject messageObject2 = this.f30171b;
                    int id3 = messageObject2.getId();
                    n10Var2.f40110a = messageObject2.getDialogId();
                    n10Var2.f40111b = id3;
                    s2Var.V(v10Var.f42847o0.c(v10Var.S), z11);
                    return true;
                }
                s2Var.V(false, z11);
                return true;
            case 2:
                org.telegram.ui.Cells.k7 k7Var2 = (org.telegram.ui.Cells.k7) this.d;
                k7Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.v10 v10Var2 = ((org.telegram.ui.q10) this.f30173e).v;
                boolean g11 = v10Var2.f42847o0.g();
                boolean z12 = this.f30172c;
                if (g11) {
                    org.telegram.ui.n10 n10Var3 = v10Var2.S;
                    MessageObject messageObject3 = this.f30171b;
                    int id4 = messageObject3.getId();
                    n10Var3.f40110a = messageObject3.getDialogId();
                    n10Var3.f40111b = id4;
                    k7Var2.b(v10Var2.f42847o0.c(v10Var2.S), z12);
                    return true;
                }
                k7Var2.b(false, z12);
                return true;
            case 3:
                org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) this.d;
                j7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.v10 v10Var3 = ((org.telegram.ui.q10) this.f30173e).v;
                boolean g12 = v10Var3.f42847o0.g();
                boolean z13 = this.f30172c;
                if (g12) {
                    org.telegram.ui.n10 n10Var4 = v10Var3.S;
                    MessageObject messageObject4 = this.f30171b;
                    int id5 = messageObject4.getId();
                    n10Var4.f40110a = messageObject4.getDialogId();
                    n10Var4.f40111b = id5;
                    j7Var.e(v10Var3.f42847o0.c(v10Var3.S), z13);
                    return true;
                }
                j7Var.e(false, z13);
                return true;
            default:
                org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) this.d;
                n7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.v10 v10Var4 = ((org.telegram.ui.s10) this.f30173e).v;
                boolean g13 = v10Var4.f42847o0.g();
                boolean z14 = this.f30172c;
                if (g13) {
                    org.telegram.ui.n10 n10Var5 = v10Var4.S;
                    MessageObject messageObject5 = this.f30171b;
                    int id6 = messageObject5.getId();
                    n10Var5.f40110a = messageObject5.getDialogId();
                    n10Var5.f40111b = id6;
                    n7Var.f(v10Var4.f42847o0.c(v10Var4.S), z14);
                    return true;
                }
                n7Var.f(false, z14);
                return true;
        }
    }
}
