package org.telegram.ui.Components;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.MessageObject;
public final class mk implements ViewTreeObserver.OnPreDrawListener {
    public final int f28485a;
    public final MessageObject f28486b;
    public final boolean f28487c;
    public final ViewGroup d;
    public final kl0 f28488e;

    public mk(kl0 kl0Var, ViewGroup viewGroup, MessageObject messageObject, boolean z10, int i10) {
        this.f28485a = i10;
        this.f28488e = kl0Var;
        this.d = viewGroup;
        this.f28486b = messageObject;
        this.f28487c = z10;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f28485a) {
            case 0:
                org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) this.d;
                j7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                nk nkVar = (nk) this.f28488e;
                org.telegram.ui.p10 p10Var = nkVar.H;
                ok okVar = nkVar.X;
                boolean s10 = okVar.f28780b.X0.s();
                boolean z10 = this.f28487c;
                if (s10) {
                    MessageObject messageObject = this.f28486b;
                    int id2 = messageObject.getId();
                    p10Var.f39408a = messageObject.getDialogId();
                    p10Var.f39409b = id2;
                    j7Var.b(okVar.T.containsKey(p10Var), z10);
                    return true;
                }
                j7Var.b(false, z10);
                return true;
            case 1:
                org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) this.d;
                r2Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.x10 x10Var = ((org.telegram.ui.q10) this.f28488e).f39696c;
                boolean g10 = x10Var.f42581o0.g();
                boolean z11 = this.f28487c;
                if (g10) {
                    org.telegram.ui.p10 p10Var2 = x10Var.S;
                    MessageObject messageObject2 = this.f28486b;
                    int id3 = messageObject2.getId();
                    p10Var2.f39408a = messageObject2.getDialogId();
                    p10Var2.f39409b = id3;
                    r2Var.V(x10Var.f42581o0.b(x10Var.S), z11);
                    return true;
                }
                r2Var.V(false, z11);
                return true;
            case 2:
                org.telegram.ui.Cells.j7 j7Var2 = (org.telegram.ui.Cells.j7) this.d;
                j7Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.x10 x10Var2 = ((org.telegram.ui.s10) this.f28488e).v;
                boolean g11 = x10Var2.f42581o0.g();
                boolean z12 = this.f28487c;
                if (g11) {
                    org.telegram.ui.p10 p10Var3 = x10Var2.S;
                    MessageObject messageObject3 = this.f28486b;
                    int id4 = messageObject3.getId();
                    p10Var3.f39408a = messageObject3.getDialogId();
                    p10Var3.f39409b = id4;
                    j7Var2.b(x10Var2.f42581o0.b(x10Var2.S), z12);
                    return true;
                }
                j7Var2.b(false, z12);
                return true;
            case 3:
                org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) this.d;
                i7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.x10 x10Var3 = ((org.telegram.ui.s10) this.f28488e).v;
                boolean g12 = x10Var3.f42581o0.g();
                boolean z13 = this.f28487c;
                if (g12) {
                    org.telegram.ui.p10 p10Var4 = x10Var3.S;
                    MessageObject messageObject4 = this.f28486b;
                    int id5 = messageObject4.getId();
                    p10Var4.f39408a = messageObject4.getDialogId();
                    p10Var4.f39409b = id5;
                    i7Var.e(x10Var3.f42581o0.b(x10Var3.S), z13);
                    return true;
                }
                i7Var.e(false, z13);
                return true;
            default:
                org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) this.d;
                n7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.x10 x10Var4 = ((org.telegram.ui.u10) this.f28488e).v;
                boolean g13 = x10Var4.f42581o0.g();
                boolean z14 = this.f28487c;
                if (g13) {
                    org.telegram.ui.p10 p10Var5 = x10Var4.S;
                    MessageObject messageObject5 = this.f28486b;
                    int id6 = messageObject5.getId();
                    p10Var5.f39408a = messageObject5.getDialogId();
                    p10Var5.f39409b = id6;
                    n7Var.f(x10Var4.f42581o0.b(x10Var4.S), z14);
                    return true;
                }
                n7Var.f(false, z14);
                return true;
        }
    }
}
