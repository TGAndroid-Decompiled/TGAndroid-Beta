package org.telegram.ui.Components;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.MessageObject;
public final class nk implements ViewTreeObserver.OnPreDrawListener {
    public final int f26433a;
    public final MessageObject f26434b;
    public final boolean f26435c;
    public final ViewGroup d;
    public final ll0 e;

    public nk(ll0 ll0Var, ViewGroup viewGroup, MessageObject messageObject, boolean z10, int i10) {
        this.f26433a = i10;
        this.e = ll0Var;
        this.d = viewGroup;
        this.f26434b = messageObject;
        this.f26435c = z10;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f26433a) {
            case 0:
                org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) this.d;
                j7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                ok okVar = (ok) this.e;
                org.telegram.ui.m10 m10Var = okVar.H;
                pk pkVar = okVar.X;
                boolean s10 = pkVar.f26744b.X0.s();
                boolean z10 = this.f26435c;
                if (s10) {
                    MessageObject messageObject = this.f26434b;
                    int id2 = messageObject.getId();
                    m10Var.f35122a = messageObject.getDialogId();
                    m10Var.f35123b = id2;
                    j7Var.b(pkVar.T.containsKey(m10Var), z10);
                    return true;
                }
                j7Var.b(false, z10);
                return true;
            case 1:
                org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) this.d;
                r2Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.u10 u10Var = ((org.telegram.ui.n10) this.e).f35419c;
                boolean g10 = u10Var.f37862o0.g();
                boolean z11 = this.f26435c;
                if (g10) {
                    org.telegram.ui.m10 m10Var2 = u10Var.S;
                    MessageObject messageObject2 = this.f26434b;
                    int id3 = messageObject2.getId();
                    m10Var2.f35122a = messageObject2.getDialogId();
                    m10Var2.f35123b = id3;
                    r2Var.V(u10Var.f37862o0.c(u10Var.S), z11);
                    return true;
                }
                r2Var.V(false, z11);
                return true;
            case 2:
                org.telegram.ui.Cells.j7 j7Var2 = (org.telegram.ui.Cells.j7) this.d;
                j7Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.u10 u10Var2 = ((org.telegram.ui.p10) this.e).v;
                boolean g11 = u10Var2.f37862o0.g();
                boolean z12 = this.f26435c;
                if (g11) {
                    org.telegram.ui.m10 m10Var3 = u10Var2.S;
                    MessageObject messageObject3 = this.f26434b;
                    int id4 = messageObject3.getId();
                    m10Var3.f35122a = messageObject3.getDialogId();
                    m10Var3.f35123b = id4;
                    j7Var2.b(u10Var2.f37862o0.c(u10Var2.S), z12);
                    return true;
                }
                j7Var2.b(false, z12);
                return true;
            case 3:
                org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) this.d;
                i7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.u10 u10Var3 = ((org.telegram.ui.p10) this.e).v;
                boolean g12 = u10Var3.f37862o0.g();
                boolean z13 = this.f26435c;
                if (g12) {
                    org.telegram.ui.m10 m10Var4 = u10Var3.S;
                    MessageObject messageObject4 = this.f26434b;
                    int id5 = messageObject4.getId();
                    m10Var4.f35122a = messageObject4.getDialogId();
                    m10Var4.f35123b = id5;
                    i7Var.e(u10Var3.f37862o0.c(u10Var3.S), z13);
                    return true;
                }
                i7Var.e(false, z13);
                return true;
            default:
                org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) this.d;
                n7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.u10 u10Var4 = ((org.telegram.ui.r10) this.e).v;
                boolean g13 = u10Var4.f37862o0.g();
                boolean z14 = this.f26435c;
                if (g13) {
                    org.telegram.ui.m10 m10Var5 = u10Var4.S;
                    MessageObject messageObject5 = this.f26434b;
                    int id6 = messageObject5.getId();
                    m10Var5.f35122a = messageObject5.getDialogId();
                    m10Var5.f35123b = id6;
                    n7Var.f(u10Var4.f37862o0.c(u10Var4.S), z14);
                    return true;
                }
                n7Var.f(false, z14);
                return true;
        }
    }
}
