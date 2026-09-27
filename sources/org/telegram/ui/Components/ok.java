package org.telegram.ui.Components;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.MessageObject;
public final class ok implements ViewTreeObserver.OnPreDrawListener {
    public final int f27132a;
    public final MessageObject f27133b;
    public final boolean f27134c;
    public final ViewGroup d;
    public final xl0 e;

    public ok(xl0 xl0Var, ViewGroup viewGroup, MessageObject messageObject, boolean z10, int i10) {
        this.f27132a = i10;
        this.e = xl0Var;
        this.d = viewGroup;
        this.f27133b = messageObject;
        this.f27134c = z10;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f27132a) {
            case 0:
                org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) this.d;
                k7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                pk pkVar = (pk) this.e;
                org.telegram.ui.o10 o10Var = pkVar.H;
                qk qkVar = pkVar.X;
                boolean t10 = qkVar.f27104b.X0.t();
                boolean z10 = this.f27134c;
                if (t10) {
                    MessageObject messageObject = this.f27133b;
                    int id2 = messageObject.getId();
                    o10Var.f36121a = messageObject.getDialogId();
                    o10Var.f36122b = id2;
                    k7Var.b(qkVar.T.containsKey(o10Var), z10);
                    return true;
                }
                k7Var.b(false, z10);
                return true;
            case 1:
                org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) this.d;
                s2Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.w10 w10Var = ((org.telegram.ui.p10) this.e).f36290c;
                boolean g10 = w10Var.f38773o0.g();
                boolean z11 = this.f27134c;
                if (g10) {
                    org.telegram.ui.o10 o10Var2 = w10Var.S;
                    MessageObject messageObject2 = this.f27133b;
                    int id3 = messageObject2.getId();
                    o10Var2.f36121a = messageObject2.getDialogId();
                    o10Var2.f36122b = id3;
                    s2Var.V(w10Var.f38773o0.c(w10Var.S), z11);
                    return true;
                }
                s2Var.V(false, z11);
                return true;
            case 2:
                org.telegram.ui.Cells.k7 k7Var2 = (org.telegram.ui.Cells.k7) this.d;
                k7Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.w10 w10Var2 = ((org.telegram.ui.r10) this.e).v;
                boolean g11 = w10Var2.f38773o0.g();
                boolean z12 = this.f27134c;
                if (g11) {
                    org.telegram.ui.o10 o10Var3 = w10Var2.S;
                    MessageObject messageObject3 = this.f27133b;
                    int id4 = messageObject3.getId();
                    o10Var3.f36121a = messageObject3.getDialogId();
                    o10Var3.f36122b = id4;
                    k7Var2.b(w10Var2.f38773o0.c(w10Var2.S), z12);
                    return true;
                }
                k7Var2.b(false, z12);
                return true;
            case 3:
                org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) this.d;
                j7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.w10 w10Var3 = ((org.telegram.ui.r10) this.e).v;
                boolean g12 = w10Var3.f38773o0.g();
                boolean z13 = this.f27134c;
                if (g12) {
                    org.telegram.ui.o10 o10Var4 = w10Var3.S;
                    MessageObject messageObject4 = this.f27133b;
                    int id5 = messageObject4.getId();
                    o10Var4.f36121a = messageObject4.getDialogId();
                    o10Var4.f36122b = id5;
                    j7Var.e(w10Var3.f38773o0.c(w10Var3.S), z13);
                    return true;
                }
                j7Var.e(false, z13);
                return true;
            default:
                org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) this.d;
                n7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.w10 w10Var4 = ((org.telegram.ui.t10) this.e).v;
                boolean g13 = w10Var4.f38773o0.g();
                boolean z14 = this.f27134c;
                if (g13) {
                    org.telegram.ui.o10 o10Var5 = w10Var4.S;
                    MessageObject messageObject5 = this.f27133b;
                    int id6 = messageObject5.getId();
                    o10Var5.f36121a = messageObject5.getDialogId();
                    o10Var5.f36122b = id6;
                    n7Var.f(w10Var4.f38773o0.c(w10Var4.S), z14);
                    return true;
                }
                n7Var.f(false, z14);
                return true;
        }
    }
}
