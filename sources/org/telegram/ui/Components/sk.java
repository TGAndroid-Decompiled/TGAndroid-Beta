package org.telegram.ui.Components;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.MessageObject;
public final class sk implements ViewTreeObserver.OnPreDrawListener {
    public final int f30582a;
    public final MessageObject f30583b;
    public final boolean f30584c;
    public final ViewGroup d;
    public final vm0 f30585e;

    public sk(vm0 vm0Var, ViewGroup viewGroup, MessageObject messageObject, boolean z10, int i10) {
        this.f30582a = i10;
        this.f30585e = vm0Var;
        this.d = viewGroup;
        this.f30583b = messageObject;
        this.f30584c = z10;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f30582a) {
            case 0:
                org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) this.d;
                j7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                tk tkVar = (tk) this.f30585e;
                org.telegram.ui.q10 q10Var = tkVar.H;
                uk ukVar = tkVar.X;
                boolean u10 = ukVar.f30574b.f24325a1.u();
                boolean z10 = this.f30584c;
                if (u10) {
                    MessageObject messageObject = this.f30583b;
                    int id2 = messageObject.getId();
                    q10Var.f41138a = messageObject.getDialogId();
                    q10Var.f41139b = id2;
                    j7Var.b(ukVar.T.containsKey(q10Var), z10);
                    return true;
                }
                j7Var.b(false, z10);
                return true;
            case 1:
                org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) this.d;
                s2Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.y10 y10Var = ((org.telegram.ui.r10) this.f30585e).f41465c;
                boolean g10 = y10Var.f44260o0.g();
                boolean z11 = this.f30584c;
                if (g10) {
                    org.telegram.ui.q10 q10Var2 = y10Var.S;
                    MessageObject messageObject2 = this.f30583b;
                    int id3 = messageObject2.getId();
                    q10Var2.f41138a = messageObject2.getDialogId();
                    q10Var2.f41139b = id3;
                    s2Var.V(y10Var.f44260o0.c(y10Var.S), z11);
                    return true;
                }
                s2Var.V(false, z11);
                return true;
            case 2:
                org.telegram.ui.Cells.j7 j7Var2 = (org.telegram.ui.Cells.j7) this.d;
                j7Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.y10 y10Var2 = ((org.telegram.ui.t10) this.f30585e).v;
                boolean g11 = y10Var2.f44260o0.g();
                boolean z12 = this.f30584c;
                if (g11) {
                    org.telegram.ui.q10 q10Var3 = y10Var2.S;
                    MessageObject messageObject3 = this.f30583b;
                    int id4 = messageObject3.getId();
                    q10Var3.f41138a = messageObject3.getDialogId();
                    q10Var3.f41139b = id4;
                    j7Var2.b(y10Var2.f44260o0.c(y10Var2.S), z12);
                    return true;
                }
                j7Var2.b(false, z12);
                return true;
            case 3:
                org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) this.d;
                i7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.y10 y10Var3 = ((org.telegram.ui.t10) this.f30585e).v;
                boolean g12 = y10Var3.f44260o0.g();
                boolean z13 = this.f30584c;
                if (g12) {
                    org.telegram.ui.q10 q10Var4 = y10Var3.S;
                    MessageObject messageObject4 = this.f30583b;
                    int id5 = messageObject4.getId();
                    q10Var4.f41138a = messageObject4.getDialogId();
                    q10Var4.f41139b = id5;
                    i7Var.e(y10Var3.f44260o0.c(y10Var3.S), z13);
                    return true;
                }
                i7Var.e(false, z13);
                return true;
            default:
                org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) this.d;
                n7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.y10 y10Var4 = ((org.telegram.ui.v10) this.f30585e).v;
                boolean g13 = y10Var4.f44260o0.g();
                boolean z14 = this.f30584c;
                if (g13) {
                    org.telegram.ui.q10 q10Var5 = y10Var4.S;
                    MessageObject messageObject5 = this.f30583b;
                    int id6 = messageObject5.getId();
                    q10Var5.f41138a = messageObject5.getDialogId();
                    q10Var5.f41139b = id6;
                    n7Var.f(y10Var4.f44260o0.c(y10Var4.S), z14);
                    return true;
                }
                n7Var.f(false, z14);
                return true;
        }
    }
}
