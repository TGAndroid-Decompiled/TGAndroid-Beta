package org.telegram.ui.Components;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.MessageObject;
public final class pk implements ViewTreeObserver.OnPreDrawListener {
    public final int f29652a;
    public final MessageObject f29653b;
    public final boolean f29654c;
    public final ViewGroup d;
    public final yl0 f29655e;

    public pk(yl0 yl0Var, ViewGroup viewGroup, MessageObject messageObject, boolean z10, int i10) {
        this.f29652a = i10;
        this.f29655e = yl0Var;
        this.d = viewGroup;
        this.f29653b = messageObject;
        this.f29654c = z10;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f29652a) {
            case 0:
                org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) this.d;
                k7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                qk qkVar = (qk) this.f29655e;
                org.telegram.ui.p10 p10Var = qkVar.H;
                rk rkVar = qkVar.X;
                boolean s10 = rkVar.f29642b.X0.s();
                boolean z10 = this.f29654c;
                if (s10) {
                    MessageObject messageObject = this.f29653b;
                    int id2 = messageObject.getId();
                    p10Var.f39310a = messageObject.getDialogId();
                    p10Var.f39311b = id2;
                    k7Var.b(rkVar.T.containsKey(p10Var), z10);
                    return true;
                }
                k7Var.b(false, z10);
                return true;
            case 1:
                org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) this.d;
                s2Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.x10 x10Var = ((org.telegram.ui.q10) this.f29655e).f39573c;
                boolean g10 = x10Var.f42699o0.g();
                boolean z11 = this.f29654c;
                if (g10) {
                    org.telegram.ui.p10 p10Var2 = x10Var.S;
                    MessageObject messageObject2 = this.f29653b;
                    int id3 = messageObject2.getId();
                    p10Var2.f39310a = messageObject2.getDialogId();
                    p10Var2.f39311b = id3;
                    s2Var.T(x10Var.f42699o0.c(x10Var.S), z11);
                    return true;
                }
                s2Var.T(false, z11);
                return true;
            case 2:
                org.telegram.ui.Cells.k7 k7Var2 = (org.telegram.ui.Cells.k7) this.d;
                k7Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.x10 x10Var2 = ((org.telegram.ui.s10) this.f29655e).v;
                boolean g11 = x10Var2.f42699o0.g();
                boolean z12 = this.f29654c;
                if (g11) {
                    org.telegram.ui.p10 p10Var3 = x10Var2.S;
                    MessageObject messageObject3 = this.f29653b;
                    int id4 = messageObject3.getId();
                    p10Var3.f39310a = messageObject3.getDialogId();
                    p10Var3.f39311b = id4;
                    k7Var2.b(x10Var2.f42699o0.c(x10Var2.S), z12);
                    return true;
                }
                k7Var2.b(false, z12);
                return true;
            case 3:
                org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) this.d;
                j7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.x10 x10Var3 = ((org.telegram.ui.s10) this.f29655e).v;
                boolean g12 = x10Var3.f42699o0.g();
                boolean z13 = this.f29654c;
                if (g12) {
                    org.telegram.ui.p10 p10Var4 = x10Var3.S;
                    MessageObject messageObject4 = this.f29653b;
                    int id5 = messageObject4.getId();
                    p10Var4.f39310a = messageObject4.getDialogId();
                    p10Var4.f39311b = id5;
                    j7Var.e(x10Var3.f42699o0.c(x10Var3.S), z13);
                    return true;
                }
                j7Var.e(false, z13);
                return true;
            default:
                org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) this.d;
                n7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.x10 x10Var4 = ((org.telegram.ui.u10) this.f29655e).v;
                boolean g13 = x10Var4.f42699o0.g();
                boolean z14 = this.f29654c;
                if (g13) {
                    org.telegram.ui.p10 p10Var5 = x10Var4.S;
                    MessageObject messageObject5 = this.f29653b;
                    int id6 = messageObject5.getId();
                    p10Var5.f39310a = messageObject5.getDialogId();
                    p10Var5.f39311b = id6;
                    n7Var.f(x10Var4.f42699o0.c(x10Var4.S), z14);
                    return true;
                }
                n7Var.f(false, z14);
                return true;
        }
    }
}
