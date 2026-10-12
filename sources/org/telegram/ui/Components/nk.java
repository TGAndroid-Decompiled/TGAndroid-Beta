package org.telegram.ui.Components;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.MessageObject;
public final class nk implements ViewTreeObserver.OnPreDrawListener {
    public final int f27681a;
    public final MessageObject f27682b;
    public final boolean f27683c;
    public final ViewGroup d;
    public final lm0 e;

    public nk(lm0 lm0Var, ViewGroup viewGroup, MessageObject messageObject, boolean z10, int i10) {
        this.f27681a = i10;
        this.e = lm0Var;
        this.d = viewGroup;
        this.f27682b = messageObject;
        this.f27683c = z10;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f27681a) {
            case 0:
                org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) this.d;
                k7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                ok okVar = (ok) this.e;
                org.telegram.ui.u10 u10Var = okVar.H;
                pk pkVar = okVar.X;
                boolean t10 = pkVar.f27671b.f29985a1.t();
                boolean z10 = this.f27683c;
                if (t10) {
                    MessageObject messageObject = this.f27682b;
                    int id2 = messageObject.getId();
                    u10Var.f40516a = messageObject.getDialogId();
                    u10Var.f40517b = id2;
                    k7Var.b(pkVar.T.containsKey(u10Var), z10);
                    return true;
                }
                k7Var.b(false, z10);
                return true;
            case 1:
                org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) this.d;
                s2Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.c20 c20Var = ((org.telegram.ui.v10) this.e).f40856c;
                boolean g10 = c20Var.f34697o0.g();
                boolean z11 = this.f27683c;
                if (g10) {
                    org.telegram.ui.u10 u10Var2 = c20Var.S;
                    MessageObject messageObject2 = this.f27682b;
                    int id3 = messageObject2.getId();
                    u10Var2.f40516a = messageObject2.getDialogId();
                    u10Var2.f40517b = id3;
                    s2Var.V(c20Var.f34697o0.b(c20Var.S), z11);
                    return true;
                }
                s2Var.V(false, z11);
                return true;
            case 2:
                org.telegram.ui.Cells.k7 k7Var2 = (org.telegram.ui.Cells.k7) this.d;
                k7Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.c20 c20Var2 = ((org.telegram.ui.x10) this.e).v;
                boolean g11 = c20Var2.f34697o0.g();
                boolean z12 = this.f27683c;
                if (g11) {
                    org.telegram.ui.u10 u10Var3 = c20Var2.S;
                    MessageObject messageObject3 = this.f27682b;
                    int id4 = messageObject3.getId();
                    u10Var3.f40516a = messageObject3.getDialogId();
                    u10Var3.f40517b = id4;
                    k7Var2.b(c20Var2.f34697o0.b(c20Var2.S), z12);
                    return true;
                }
                k7Var2.b(false, z12);
                return true;
            case 3:
                org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) this.d;
                j7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.c20 c20Var3 = ((org.telegram.ui.x10) this.e).v;
                boolean g12 = c20Var3.f34697o0.g();
                boolean z13 = this.f27683c;
                if (g12) {
                    org.telegram.ui.u10 u10Var4 = c20Var3.S;
                    MessageObject messageObject4 = this.f27682b;
                    int id5 = messageObject4.getId();
                    u10Var4.f40516a = messageObject4.getDialogId();
                    u10Var4.f40517b = id5;
                    j7Var.e(c20Var3.f34697o0.b(c20Var3.S), z13);
                    return true;
                }
                j7Var.e(false, z13);
                return true;
            default:
                org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) this.d;
                n7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.c20 c20Var4 = ((org.telegram.ui.z10) this.e).v;
                boolean g13 = c20Var4.f34697o0.g();
                boolean z14 = this.f27683c;
                if (g13) {
                    org.telegram.ui.u10 u10Var5 = c20Var4.S;
                    MessageObject messageObject5 = this.f27682b;
                    int id6 = messageObject5.getId();
                    u10Var5.f40516a = messageObject5.getDialogId();
                    u10Var5.f40517b = id6;
                    n7Var.f(c20Var4.f34697o0.b(c20Var4.S), z14);
                    return true;
                }
                n7Var.f(false, z14);
                return true;
        }
    }
}
