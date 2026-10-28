package org.telegram.ui.Components;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.MessageObject;
public final class lk implements ViewTreeObserver.OnPreDrawListener {
    public final int f30261a;
    public final MessageObject f30262b;
    public final boolean f30263c;
    public final ViewGroup d;
    public final mm0 e;

    public lk(mm0 mm0Var, ViewGroup viewGroup, MessageObject messageObject, boolean z10, int i10) {
        this.f30261a = i10;
        this.e = mm0Var;
        this.d = viewGroup;
        this.f30262b = messageObject;
        this.f30263c = z10;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f30261a) {
            case 0:
                org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) this.d;
                o7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                mk mkVar = (mk) this.e;
                org.telegram.ui.b10 b10Var = mkVar.H;
                nk nkVar = mkVar.X;
                boolean q5 = nkVar.f30254b.f32974a1.q();
                boolean z10 = this.f30263c;
                if (q5) {
                    MessageObject messageObject = this.f30262b;
                    int id2 = messageObject.getId();
                    b10Var.f37862a = messageObject.getDialogId();
                    b10Var.f37863b = id2;
                    o7Var.b(nkVar.T.containsKey(b10Var), z10);
                    return true;
                }
                o7Var.b(false, z10);
                return true;
            case 1:
                org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) this.d;
                p2Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.j10 j10Var = ((org.telegram.ui.c10) this.e).f38145c;
                boolean g7 = j10Var.f40338o0.g();
                boolean z11 = this.f30263c;
                if (g7) {
                    org.telegram.ui.b10 b10Var2 = j10Var.S;
                    MessageObject messageObject2 = this.f30262b;
                    int id3 = messageObject2.getId();
                    b10Var2.f37862a = messageObject2.getDialogId();
                    b10Var2.f37863b = id3;
                    p2Var.U(j10Var.f40338o0.c(j10Var.S), z11);
                    return true;
                }
                p2Var.U(false, z11);
                return true;
            case 2:
                org.telegram.ui.Cells.o7 o7Var2 = (org.telegram.ui.Cells.o7) this.d;
                o7Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.j10 j10Var2 = ((org.telegram.ui.e10) this.e).v;
                boolean g10 = j10Var2.f40338o0.g();
                boolean z12 = this.f30263c;
                if (g10) {
                    org.telegram.ui.b10 b10Var3 = j10Var2.S;
                    MessageObject messageObject3 = this.f30262b;
                    int id4 = messageObject3.getId();
                    b10Var3.f37862a = messageObject3.getDialogId();
                    b10Var3.f37863b = id4;
                    o7Var2.b(j10Var2.f40338o0.c(j10Var2.S), z12);
                    return true;
                }
                o7Var2.b(false, z12);
                return true;
            case 3:
                org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) this.d;
                n7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.j10 j10Var3 = ((org.telegram.ui.e10) this.e).v;
                boolean g11 = j10Var3.f40338o0.g();
                boolean z13 = this.f30263c;
                if (g11) {
                    org.telegram.ui.b10 b10Var4 = j10Var3.S;
                    MessageObject messageObject4 = this.f30262b;
                    int id5 = messageObject4.getId();
                    b10Var4.f37862a = messageObject4.getDialogId();
                    b10Var4.f37863b = id5;
                    n7Var.e(j10Var3.f40338o0.c(j10Var3.S), z13);
                    return true;
                }
                n7Var.e(false, z13);
                return true;
            default:
                org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) this.d;
                r7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.j10 j10Var4 = ((org.telegram.ui.g10) this.e).v;
                boolean g12 = j10Var4.f40338o0.g();
                boolean z14 = this.f30263c;
                if (g12) {
                    org.telegram.ui.b10 b10Var5 = j10Var4.S;
                    MessageObject messageObject5 = this.f30262b;
                    int id6 = messageObject5.getId();
                    b10Var5.f37862a = messageObject5.getDialogId();
                    b10Var5.f37863b = id6;
                    r7Var.f(j10Var4.f40338o0.c(j10Var4.S), z14);
                    return true;
                }
                r7Var.f(false, z14);
                return true;
        }
    }
}
