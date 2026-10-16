package org.telegram.ui.Components;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.MessageObject;
public final class nk implements ViewTreeObserver.OnPreDrawListener {
    public final int f27370a;
    public final MessageObject f27371b;
    public final boolean f27372c;
    public final ViewGroup d;
    public final lm0 e;

    public nk(lm0 lm0Var, ViewGroup viewGroup, MessageObject messageObject, boolean z10, int i10) {
        this.f27370a = i10;
        this.e = lm0Var;
        this.d = viewGroup;
        this.f27371b = messageObject;
        this.f27372c = z10;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f27370a) {
            case 0:
                org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) this.d;
                j7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                ok okVar = (ok) this.e;
                org.telegram.ui.t10 t10Var = okVar.H;
                pk pkVar = okVar.X;
                boolean t10 = pkVar.f27360b.f29656a1.t();
                boolean z10 = this.f27372c;
                if (t10) {
                    MessageObject messageObject = this.f27371b;
                    int id2 = messageObject.getId();
                    t10Var.f39980a = messageObject.getDialogId();
                    t10Var.f39981b = id2;
                    j7Var.b(pkVar.T.containsKey(t10Var), z10);
                    return true;
                }
                j7Var.b(false, z10);
                return true;
            case 1:
                org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) this.d;
                s2Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.b20 b20Var = ((org.telegram.ui.u10) this.e).f40243c;
                boolean g10 = b20Var.f34179o0.g();
                boolean z11 = this.f27372c;
                if (g10) {
                    org.telegram.ui.t10 t10Var2 = b20Var.S;
                    MessageObject messageObject2 = this.f27371b;
                    int id3 = messageObject2.getId();
                    t10Var2.f39980a = messageObject2.getDialogId();
                    t10Var2.f39981b = id3;
                    s2Var.V(b20Var.f34179o0.b(b20Var.S), z11);
                    return true;
                }
                s2Var.V(false, z11);
                return true;
            case 2:
                org.telegram.ui.Cells.j7 j7Var2 = (org.telegram.ui.Cells.j7) this.d;
                j7Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.b20 b20Var2 = ((org.telegram.ui.w10) this.e).v;
                boolean g11 = b20Var2.f34179o0.g();
                boolean z12 = this.f27372c;
                if (g11) {
                    org.telegram.ui.t10 t10Var3 = b20Var2.S;
                    MessageObject messageObject3 = this.f27371b;
                    int id4 = messageObject3.getId();
                    t10Var3.f39980a = messageObject3.getDialogId();
                    t10Var3.f39981b = id4;
                    j7Var2.b(b20Var2.f34179o0.b(b20Var2.S), z12);
                    return true;
                }
                j7Var2.b(false, z12);
                return true;
            case 3:
                org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) this.d;
                i7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.b20 b20Var3 = ((org.telegram.ui.w10) this.e).v;
                boolean g12 = b20Var3.f34179o0.g();
                boolean z13 = this.f27372c;
                if (g12) {
                    org.telegram.ui.t10 t10Var4 = b20Var3.S;
                    MessageObject messageObject4 = this.f27371b;
                    int id5 = messageObject4.getId();
                    t10Var4.f39980a = messageObject4.getDialogId();
                    t10Var4.f39981b = id5;
                    i7Var.e(b20Var3.f34179o0.b(b20Var3.S), z13);
                    return true;
                }
                i7Var.e(false, z13);
                return true;
            default:
                org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) this.d;
                n7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.b20 b20Var4 = ((org.telegram.ui.y10) this.e).v;
                boolean g13 = b20Var4.f34179o0.g();
                boolean z14 = this.f27372c;
                if (g13) {
                    org.telegram.ui.t10 t10Var5 = b20Var4.S;
                    MessageObject messageObject5 = this.f27371b;
                    int id6 = messageObject5.getId();
                    t10Var5.f39980a = messageObject5.getDialogId();
                    t10Var5.f39981b = id6;
                    n7Var.f(b20Var4.f34179o0.b(b20Var4.S), z14);
                    return true;
                }
                n7Var.f(false, z14);
                return true;
        }
    }
}
