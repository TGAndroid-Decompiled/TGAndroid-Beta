package org.telegram.ui.Components;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.MessageObject;
public final class ok implements ViewTreeObserver.OnPreDrawListener {
    public final int f27051a;
    public final MessageObject f27052b;
    public final boolean f27053c;
    public final ViewGroup d;
    public final wl0 e;

    public ok(wl0 wl0Var, ViewGroup viewGroup, MessageObject messageObject, boolean z10, int i10) {
        this.f27051a = i10;
        this.e = wl0Var;
        this.d = viewGroup;
        this.f27052b = messageObject;
        this.f27053c = z10;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f27051a) {
            case 0:
                org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) this.d;
                k7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                pk pkVar = (pk) this.e;
                org.telegram.ui.l10 l10Var = pkVar.H;
                qk qkVar = pkVar.X;
                boolean s10 = qkVar.f27043b.X0.s();
                boolean z10 = this.f27053c;
                if (s10) {
                    MessageObject messageObject = this.f27052b;
                    int id2 = messageObject.getId();
                    l10Var.f35204a = messageObject.getDialogId();
                    l10Var.f35205b = id2;
                    k7Var.b(qkVar.T.containsKey(l10Var), z10);
                    return true;
                }
                k7Var.b(false, z10);
                return true;
            case 1:
                org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) this.d;
                s2Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.t10 t10Var = ((org.telegram.ui.m10) this.e).f35443c;
                boolean g10 = t10Var.f37936o0.g();
                boolean z11 = this.f27053c;
                if (g10) {
                    org.telegram.ui.l10 l10Var2 = t10Var.S;
                    MessageObject messageObject2 = this.f27052b;
                    int id3 = messageObject2.getId();
                    l10Var2.f35204a = messageObject2.getDialogId();
                    l10Var2.f35205b = id3;
                    s2Var.V(t10Var.f37936o0.c(t10Var.S), z11);
                    return true;
                }
                s2Var.V(false, z11);
                return true;
            case 2:
                org.telegram.ui.Cells.k7 k7Var2 = (org.telegram.ui.Cells.k7) this.d;
                k7Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.t10 t10Var2 = ((org.telegram.ui.o10) this.e).v;
                boolean g11 = t10Var2.f37936o0.g();
                boolean z12 = this.f27053c;
                if (g11) {
                    org.telegram.ui.l10 l10Var3 = t10Var2.S;
                    MessageObject messageObject3 = this.f27052b;
                    int id4 = messageObject3.getId();
                    l10Var3.f35204a = messageObject3.getDialogId();
                    l10Var3.f35205b = id4;
                    k7Var2.b(t10Var2.f37936o0.c(t10Var2.S), z12);
                    return true;
                }
                k7Var2.b(false, z12);
                return true;
            case 3:
                org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) this.d;
                j7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.t10 t10Var3 = ((org.telegram.ui.o10) this.e).v;
                boolean g12 = t10Var3.f37936o0.g();
                boolean z13 = this.f27053c;
                if (g12) {
                    org.telegram.ui.l10 l10Var4 = t10Var3.S;
                    MessageObject messageObject4 = this.f27052b;
                    int id5 = messageObject4.getId();
                    l10Var4.f35204a = messageObject4.getDialogId();
                    l10Var4.f35205b = id5;
                    j7Var.e(t10Var3.f37936o0.c(t10Var3.S), z13);
                    return true;
                }
                j7Var.e(false, z13);
                return true;
            default:
                org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) this.d;
                n7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.t10 t10Var4 = ((org.telegram.ui.q10) this.e).v;
                boolean g13 = t10Var4.f37936o0.g();
                boolean z14 = this.f27053c;
                if (g13) {
                    org.telegram.ui.l10 l10Var5 = t10Var4.S;
                    MessageObject messageObject5 = this.f27052b;
                    int id6 = messageObject5.getId();
                    l10Var5.f35204a = messageObject5.getDialogId();
                    l10Var5.f35205b = id6;
                    n7Var.f(t10Var4.f37936o0.c(t10Var4.S), z14);
                    return true;
                }
                n7Var.f(false, z14);
                return true;
        }
    }
}
