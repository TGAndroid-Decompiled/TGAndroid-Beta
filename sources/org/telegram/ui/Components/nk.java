package org.telegram.ui.Components;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.MessageObject;
public final class nk implements ViewTreeObserver.OnPreDrawListener {
    public final int f26736a;
    public final MessageObject f26737b;
    public final boolean f26738c;
    public final ViewGroup d;
    public final vl0 e;

    public nk(vl0 vl0Var, ViewGroup viewGroup, MessageObject messageObject, boolean z10, int i10) {
        this.f26736a = i10;
        this.e = vl0Var;
        this.d = viewGroup;
        this.f26737b = messageObject;
        this.f26738c = z10;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f26736a) {
            case 0:
                org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) this.d;
                k7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                ok okVar = (ok) this.e;
                org.telegram.ui.l10 l10Var = okVar.H;
                pk pkVar = okVar.X;
                boolean s10 = pkVar.f27087b.X0.s();
                boolean z10 = this.f26738c;
                if (s10) {
                    MessageObject messageObject = this.f26737b;
                    int id2 = messageObject.getId();
                    l10Var.f35205a = messageObject.getDialogId();
                    l10Var.f35206b = id2;
                    k7Var.b(pkVar.T.containsKey(l10Var), z10);
                    return true;
                }
                k7Var.b(false, z10);
                return true;
            case 1:
                org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) this.d;
                s2Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.t10 t10Var = ((org.telegram.ui.m10) this.e).f35444c;
                boolean g10 = t10Var.f37937o0.g();
                boolean z11 = this.f26738c;
                if (g10) {
                    org.telegram.ui.l10 l10Var2 = t10Var.S;
                    MessageObject messageObject2 = this.f26737b;
                    int id3 = messageObject2.getId();
                    l10Var2.f35205a = messageObject2.getDialogId();
                    l10Var2.f35206b = id3;
                    s2Var.V(t10Var.f37937o0.c(t10Var.S), z11);
                    return true;
                }
                s2Var.V(false, z11);
                return true;
            case 2:
                org.telegram.ui.Cells.k7 k7Var2 = (org.telegram.ui.Cells.k7) this.d;
                k7Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.t10 t10Var2 = ((org.telegram.ui.o10) this.e).v;
                boolean g11 = t10Var2.f37937o0.g();
                boolean z12 = this.f26738c;
                if (g11) {
                    org.telegram.ui.l10 l10Var3 = t10Var2.S;
                    MessageObject messageObject3 = this.f26737b;
                    int id4 = messageObject3.getId();
                    l10Var3.f35205a = messageObject3.getDialogId();
                    l10Var3.f35206b = id4;
                    k7Var2.b(t10Var2.f37937o0.c(t10Var2.S), z12);
                    return true;
                }
                k7Var2.b(false, z12);
                return true;
            case 3:
                org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) this.d;
                j7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.t10 t10Var3 = ((org.telegram.ui.o10) this.e).v;
                boolean g12 = t10Var3.f37937o0.g();
                boolean z13 = this.f26738c;
                if (g12) {
                    org.telegram.ui.l10 l10Var4 = t10Var3.S;
                    MessageObject messageObject4 = this.f26737b;
                    int id5 = messageObject4.getId();
                    l10Var4.f35205a = messageObject4.getDialogId();
                    l10Var4.f35206b = id5;
                    j7Var.e(t10Var3.f37937o0.c(t10Var3.S), z13);
                    return true;
                }
                j7Var.e(false, z13);
                return true;
            default:
                org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) this.d;
                n7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.t10 t10Var4 = ((org.telegram.ui.q10) this.e).v;
                boolean g13 = t10Var4.f37937o0.g();
                boolean z14 = this.f26738c;
                if (g13) {
                    org.telegram.ui.l10 l10Var5 = t10Var4.S;
                    MessageObject messageObject5 = this.f26737b;
                    int id6 = messageObject5.getId();
                    l10Var5.f35205a = messageObject5.getDialogId();
                    l10Var5.f35206b = id6;
                    n7Var.f(t10Var4.f37937o0.c(t10Var4.S), z14);
                    return true;
                }
                n7Var.f(false, z14);
                return true;
        }
    }
}
