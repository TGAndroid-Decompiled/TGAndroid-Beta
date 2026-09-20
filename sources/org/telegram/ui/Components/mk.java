package org.telegram.ui.Components;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.MessageObject;
public final class mk implements ViewTreeObserver.OnPreDrawListener {
    public final int f26411a;
    public final MessageObject f26412b;
    public final boolean f26413c;
    public final ViewGroup d;
    public final ul0 e;

    public mk(ul0 ul0Var, ViewGroup viewGroup, MessageObject messageObject, boolean z10, int i10) {
        this.f26411a = i10;
        this.e = ul0Var;
        this.d = viewGroup;
        this.f26412b = messageObject;
        this.f26413c = z10;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f26411a) {
            case 0:
                org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) this.d;
                l7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                nk nkVar = (nk) this.e;
                org.telegram.ui.p10 p10Var = nkVar.H;
                ok okVar = nkVar.X;
                boolean s10 = okVar.f26655b.X0.s();
                boolean z10 = this.f26413c;
                if (s10) {
                    MessageObject messageObject = this.f26412b;
                    int id2 = messageObject.getId();
                    p10Var.f36423a = messageObject.getDialogId();
                    p10Var.f36424b = id2;
                    l7Var.b(okVar.T.containsKey(p10Var), z10);
                    return true;
                }
                l7Var.b(false, z10);
                return true;
            case 1:
                org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) this.d;
                s2Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.x10 x10Var = ((org.telegram.ui.q10) this.e).f36735c;
                boolean g10 = x10Var.f39310o0.g();
                boolean z11 = this.f26413c;
                if (g10) {
                    org.telegram.ui.p10 p10Var2 = x10Var.S;
                    MessageObject messageObject2 = this.f26412b;
                    int id3 = messageObject2.getId();
                    p10Var2.f36423a = messageObject2.getDialogId();
                    p10Var2.f36424b = id3;
                    s2Var.V(x10Var.f39310o0.c(x10Var.S), z11);
                    return true;
                }
                s2Var.V(false, z11);
                return true;
            case 2:
                org.telegram.ui.Cells.l7 l7Var2 = (org.telegram.ui.Cells.l7) this.d;
                l7Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.x10 x10Var2 = ((org.telegram.ui.s10) this.e).v;
                boolean g11 = x10Var2.f39310o0.g();
                boolean z12 = this.f26413c;
                if (g11) {
                    org.telegram.ui.p10 p10Var3 = x10Var2.S;
                    MessageObject messageObject3 = this.f26412b;
                    int id4 = messageObject3.getId();
                    p10Var3.f36423a = messageObject3.getDialogId();
                    p10Var3.f36424b = id4;
                    l7Var2.b(x10Var2.f39310o0.c(x10Var2.S), z12);
                    return true;
                }
                l7Var2.b(false, z12);
                return true;
            case 3:
                org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) this.d;
                k7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.x10 x10Var3 = ((org.telegram.ui.s10) this.e).v;
                boolean g12 = x10Var3.f39310o0.g();
                boolean z13 = this.f26413c;
                if (g12) {
                    org.telegram.ui.p10 p10Var4 = x10Var3.S;
                    MessageObject messageObject4 = this.f26412b;
                    int id5 = messageObject4.getId();
                    p10Var4.f36423a = messageObject4.getDialogId();
                    p10Var4.f36424b = id5;
                    k7Var.e(x10Var3.f39310o0.c(x10Var3.S), z13);
                    return true;
                }
                k7Var.e(false, z13);
                return true;
            default:
                org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) this.d;
                o7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.x10 x10Var4 = ((org.telegram.ui.u10) this.e).v;
                boolean g13 = x10Var4.f39310o0.g();
                boolean z14 = this.f26413c;
                if (g13) {
                    org.telegram.ui.p10 p10Var5 = x10Var4.S;
                    MessageObject messageObject5 = this.f26412b;
                    int id6 = messageObject5.getId();
                    p10Var5.f36423a = messageObject5.getDialogId();
                    p10Var5.f36424b = id6;
                    o7Var.f(x10Var4.f39310o0.c(x10Var4.S), z14);
                    return true;
                }
                o7Var.f(false, z14);
                return true;
        }
    }
}
