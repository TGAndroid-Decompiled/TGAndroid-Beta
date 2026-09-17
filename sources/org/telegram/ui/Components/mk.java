package org.telegram.ui.Components;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.MessageObject;
public final class mk implements ViewTreeObserver.OnPreDrawListener {
    public final int f26153a;
    public final MessageObject f26154b;
    public final boolean f26155c;
    public final ViewGroup d;
    public final ll0 e;

    public mk(ll0 ll0Var, ViewGroup viewGroup, MessageObject messageObject, boolean z10, int i10) {
        this.f26153a = i10;
        this.e = ll0Var;
        this.d = viewGroup;
        this.f26154b = messageObject;
        this.f26155c = z10;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f26153a) {
            case 0:
                org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) this.d;
                j7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                nk nkVar = (nk) this.e;
                org.telegram.ui.r10 r10Var = nkVar.H;
                ok okVar = nkVar.X;
                boolean s10 = okVar.f26460b.X0.s();
                boolean z10 = this.f26155c;
                if (s10) {
                    MessageObject messageObject = this.f26154b;
                    int id2 = messageObject.getId();
                    r10Var.f37062a = messageObject.getDialogId();
                    r10Var.f37063b = id2;
                    j7Var.b(okVar.T.containsKey(r10Var), z10);
                    return true;
                }
                j7Var.b(false, z10);
                return true;
            case 1:
                org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) this.d;
                r2Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.z10 z10Var = ((org.telegram.ui.s10) this.e).f37359c;
                boolean g10 = z10Var.f40087o0.g();
                boolean z11 = this.f26155c;
                if (g10) {
                    org.telegram.ui.r10 r10Var2 = z10Var.S;
                    MessageObject messageObject2 = this.f26154b;
                    int id3 = messageObject2.getId();
                    r10Var2.f37062a = messageObject2.getDialogId();
                    r10Var2.f37063b = id3;
                    r2Var.V(z10Var.f40087o0.c(z10Var.S), z11);
                    return true;
                }
                r2Var.V(false, z11);
                return true;
            case 2:
                org.telegram.ui.Cells.j7 j7Var2 = (org.telegram.ui.Cells.j7) this.d;
                j7Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.z10 z10Var2 = ((org.telegram.ui.u10) this.e).v;
                boolean g11 = z10Var2.f40087o0.g();
                boolean z12 = this.f26155c;
                if (g11) {
                    org.telegram.ui.r10 r10Var3 = z10Var2.S;
                    MessageObject messageObject3 = this.f26154b;
                    int id4 = messageObject3.getId();
                    r10Var3.f37062a = messageObject3.getDialogId();
                    r10Var3.f37063b = id4;
                    j7Var2.b(z10Var2.f40087o0.c(z10Var2.S), z12);
                    return true;
                }
                j7Var2.b(false, z12);
                return true;
            case 3:
                org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) this.d;
                i7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.z10 z10Var3 = ((org.telegram.ui.u10) this.e).v;
                boolean g12 = z10Var3.f40087o0.g();
                boolean z13 = this.f26155c;
                if (g12) {
                    org.telegram.ui.r10 r10Var4 = z10Var3.S;
                    MessageObject messageObject4 = this.f26154b;
                    int id5 = messageObject4.getId();
                    r10Var4.f37062a = messageObject4.getDialogId();
                    r10Var4.f37063b = id5;
                    i7Var.e(z10Var3.f40087o0.c(z10Var3.S), z13);
                    return true;
                }
                i7Var.e(false, z13);
                return true;
            default:
                org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) this.d;
                n7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.z10 z10Var4 = ((org.telegram.ui.w10) this.e).v;
                boolean g13 = z10Var4.f40087o0.g();
                boolean z14 = this.f26155c;
                if (g13) {
                    org.telegram.ui.r10 r10Var5 = z10Var4.S;
                    MessageObject messageObject5 = this.f26154b;
                    int id6 = messageObject5.getId();
                    r10Var5.f37062a = messageObject5.getDialogId();
                    r10Var5.f37063b = id6;
                    n7Var.f(z10Var4.f40087o0.c(z10Var4.S), z14);
                    return true;
                }
                n7Var.f(false, z14);
                return true;
        }
    }
}
