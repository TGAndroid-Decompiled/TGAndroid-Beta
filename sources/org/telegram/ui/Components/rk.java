package org.telegram.ui.Components;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.MessageObject;
public final class rk implements ViewTreeObserver.OnPreDrawListener {
    public final int f26678a;
    public final MessageObject f26679b;
    public final boolean f26680c;
    public final ViewGroup d;
    public final ul0 e;

    public rk(ul0 ul0Var, ViewGroup viewGroup, MessageObject messageObject, boolean z10, int i10) {
        this.f26678a = i10;
        this.e = ul0Var;
        this.d = viewGroup;
        this.f26679b = messageObject;
        this.f26680c = z10;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f26678a) {
            case 0:
                org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) this.d;
                l7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                sk skVar = (sk) this.e;
                org.telegram.ui.r10 r10Var = skVar.H;
                tk tkVar = skVar.X;
                boolean s10 = tkVar.f26422b.X0.s();
                boolean z10 = this.f26680c;
                if (s10) {
                    MessageObject messageObject = this.f26679b;
                    int id2 = messageObject.getId();
                    r10Var.f36168a = messageObject.getDialogId();
                    r10Var.f36169b = id2;
                    l7Var.b(tkVar.T.containsKey(r10Var), z10);
                    return true;
                }
                l7Var.b(false, z10);
                return true;
            case 1:
                org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) this.d;
                r2Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.z10 z10Var = ((org.telegram.ui.s10) this.e).f36510c;
                boolean f7 = z10Var.f39178o0.f();
                boolean z11 = this.f26680c;
                if (f7) {
                    org.telegram.ui.r10 r10Var2 = z10Var.S;
                    MessageObject messageObject2 = this.f26679b;
                    int id3 = messageObject2.getId();
                    r10Var2.f36168a = messageObject2.getDialogId();
                    r10Var2.f36169b = id3;
                    r2Var.V(z10Var.f39178o0.b(z10Var.S), z11);
                    return true;
                }
                r2Var.V(false, z11);
                return true;
            case 2:
                org.telegram.ui.Cells.l7 l7Var2 = (org.telegram.ui.Cells.l7) this.d;
                l7Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.z10 z10Var2 = ((org.telegram.ui.u10) this.e).v;
                boolean f10 = z10Var2.f39178o0.f();
                boolean z12 = this.f26680c;
                if (f10) {
                    org.telegram.ui.r10 r10Var3 = z10Var2.S;
                    MessageObject messageObject3 = this.f26679b;
                    int id4 = messageObject3.getId();
                    r10Var3.f36168a = messageObject3.getDialogId();
                    r10Var3.f36169b = id4;
                    l7Var2.b(z10Var2.f39178o0.b(z10Var2.S), z12);
                    return true;
                }
                l7Var2.b(false, z12);
                return true;
            case 3:
                org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) this.d;
                k7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.z10 z10Var3 = ((org.telegram.ui.u10) this.e).v;
                boolean f11 = z10Var3.f39178o0.f();
                boolean z13 = this.f26680c;
                if (f11) {
                    org.telegram.ui.r10 r10Var4 = z10Var3.S;
                    MessageObject messageObject4 = this.f26679b;
                    int id5 = messageObject4.getId();
                    r10Var4.f36168a = messageObject4.getDialogId();
                    r10Var4.f36169b = id5;
                    k7Var.e(z10Var3.f39178o0.b(z10Var3.S), z13);
                    return true;
                }
                k7Var.e(false, z13);
                return true;
            default:
                org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) this.d;
                o7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.z10 z10Var4 = ((org.telegram.ui.w10) this.e).v;
                boolean f12 = z10Var4.f39178o0.f();
                boolean z14 = this.f26680c;
                if (f12) {
                    org.telegram.ui.r10 r10Var5 = z10Var4.S;
                    MessageObject messageObject5 = this.f26679b;
                    int id6 = messageObject5.getId();
                    r10Var5.f36168a = messageObject5.getDialogId();
                    r10Var5.f36169b = id6;
                    o7Var.f(z10Var4.f39178o0.b(z10Var4.S), z14);
                    return true;
                }
                o7Var.f(false, z14);
                return true;
        }
    }
}
