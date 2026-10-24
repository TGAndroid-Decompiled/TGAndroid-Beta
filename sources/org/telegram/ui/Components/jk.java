package org.telegram.ui.Components;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.MessageObject;
public final class jk implements ViewTreeObserver.OnPreDrawListener {
    public final int f27716a;
    public final MessageObject f27717b;
    public final boolean f27718c;
    public final ViewGroup d;
    public final km0 e;

    public jk(km0 km0Var, ViewGroup viewGroup, MessageObject messageObject, boolean z10, int i10) {
        this.f27716a = i10;
        this.e = km0Var;
        this.d = viewGroup;
        this.f27717b = messageObject;
        this.f27718c = z10;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f27716a) {
            case 0:
                org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) this.d;
                k7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                kk kkVar = (kk) this.e;
                org.telegram.ui.a10 a10Var = kkVar.H;
                lk lkVar = kkVar.X;
                boolean s10 = lkVar.f27704b.f30130a1.s();
                boolean z10 = this.f27718c;
                if (s10) {
                    MessageObject messageObject = this.f27717b;
                    int id2 = messageObject.getId();
                    a10Var.f35547a = messageObject.getDialogId();
                    a10Var.f35548b = id2;
                    k7Var.b(lkVar.T.containsKey(a10Var), z10);
                    return true;
                }
                k7Var.b(false, z10);
                return true;
            case 1:
                org.telegram.ui.Cells.q2 q2Var = (org.telegram.ui.Cells.q2) this.d;
                q2Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.i10 i10Var = ((org.telegram.ui.b10) this.e).f35888c;
                boolean g10 = i10Var.f38111o0.g();
                boolean z11 = this.f27718c;
                if (g10) {
                    org.telegram.ui.a10 a10Var2 = i10Var.S;
                    MessageObject messageObject2 = this.f27717b;
                    int id3 = messageObject2.getId();
                    a10Var2.f35547a = messageObject2.getDialogId();
                    a10Var2.f35548b = id3;
                    q2Var.U(i10Var.f38111o0.b(i10Var.S), z11);
                    return true;
                }
                q2Var.U(false, z11);
                return true;
            case 2:
                org.telegram.ui.Cells.k7 k7Var2 = (org.telegram.ui.Cells.k7) this.d;
                k7Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.i10 i10Var2 = ((org.telegram.ui.d10) this.e).v;
                boolean g11 = i10Var2.f38111o0.g();
                boolean z12 = this.f27718c;
                if (g11) {
                    org.telegram.ui.a10 a10Var3 = i10Var2.S;
                    MessageObject messageObject3 = this.f27717b;
                    int id4 = messageObject3.getId();
                    a10Var3.f35547a = messageObject3.getDialogId();
                    a10Var3.f35548b = id4;
                    k7Var2.b(i10Var2.f38111o0.b(i10Var2.S), z12);
                    return true;
                }
                k7Var2.b(false, z12);
                return true;
            case 3:
                org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) this.d;
                j7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.i10 i10Var3 = ((org.telegram.ui.d10) this.e).v;
                boolean g12 = i10Var3.f38111o0.g();
                boolean z13 = this.f27718c;
                if (g12) {
                    org.telegram.ui.a10 a10Var4 = i10Var3.S;
                    MessageObject messageObject4 = this.f27717b;
                    int id5 = messageObject4.getId();
                    a10Var4.f35547a = messageObject4.getDialogId();
                    a10Var4.f35548b = id5;
                    j7Var.e(i10Var3.f38111o0.b(i10Var3.S), z13);
                    return true;
                }
                j7Var.e(false, z13);
                return true;
            default:
                org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) this.d;
                n7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.i10 i10Var4 = ((org.telegram.ui.f10) this.e).v;
                boolean g13 = i10Var4.f38111o0.g();
                boolean z14 = this.f27718c;
                if (g13) {
                    org.telegram.ui.a10 a10Var5 = i10Var4.S;
                    MessageObject messageObject5 = this.f27717b;
                    int id6 = messageObject5.getId();
                    a10Var5.f35547a = messageObject5.getDialogId();
                    a10Var5.f35548b = id6;
                    n7Var.f(i10Var4.f38111o0.b(i10Var4.S), z14);
                    return true;
                }
                n7Var.f(false, z14);
                return true;
        }
    }
}
