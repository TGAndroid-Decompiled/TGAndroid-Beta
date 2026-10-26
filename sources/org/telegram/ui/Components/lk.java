package org.telegram.ui.Components;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.MessageObject;
public final class lk implements ViewTreeObserver.OnPreDrawListener {
    public final int f30222a;
    public final MessageObject f30223b;
    public final boolean f30224c;
    public final ViewGroup d;
    public final lm0 e;

    public lk(lm0 lm0Var, ViewGroup viewGroup, MessageObject messageObject, boolean z10, int i10) {
        this.f30222a = i10;
        this.e = lm0Var;
        this.d = viewGroup;
        this.f30223b = messageObject;
        this.f30224c = z10;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f30222a) {
            case 0:
                org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) this.d;
                o7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                mk mkVar = (mk) this.e;
                org.telegram.ui.z00 z00Var = mkVar.H;
                nk nkVar = mkVar.X;
                boolean q5 = nkVar.f30215b.f33005a1.q();
                boolean z10 = this.f30224c;
                if (q5) {
                    MessageObject messageObject = this.f30223b;
                    int id2 = messageObject.getId();
                    z00Var.f46148a = messageObject.getDialogId();
                    z00Var.f46149b = id2;
                    o7Var.b(nkVar.T.containsKey(z00Var), z10);
                    return true;
                }
                o7Var.b(false, z10);
                return true;
            case 1:
                org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) this.d;
                p2Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.h10 h10Var = ((org.telegram.ui.a10) this.e).f37615c;
                boolean g7 = h10Var.f39844o0.g();
                boolean z11 = this.f30224c;
                if (g7) {
                    org.telegram.ui.z00 z00Var2 = h10Var.S;
                    MessageObject messageObject2 = this.f30223b;
                    int id3 = messageObject2.getId();
                    z00Var2.f46148a = messageObject2.getDialogId();
                    z00Var2.f46149b = id3;
                    p2Var.U(h10Var.f39844o0.c(h10Var.S), z11);
                    return true;
                }
                p2Var.U(false, z11);
                return true;
            case 2:
                org.telegram.ui.Cells.o7 o7Var2 = (org.telegram.ui.Cells.o7) this.d;
                o7Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.h10 h10Var2 = ((org.telegram.ui.c10) this.e).v;
                boolean g10 = h10Var2.f39844o0.g();
                boolean z12 = this.f30224c;
                if (g10) {
                    org.telegram.ui.z00 z00Var3 = h10Var2.S;
                    MessageObject messageObject3 = this.f30223b;
                    int id4 = messageObject3.getId();
                    z00Var3.f46148a = messageObject3.getDialogId();
                    z00Var3.f46149b = id4;
                    o7Var2.b(h10Var2.f39844o0.c(h10Var2.S), z12);
                    return true;
                }
                o7Var2.b(false, z12);
                return true;
            case 3:
                org.telegram.ui.Cells.n7 n7Var = (org.telegram.ui.Cells.n7) this.d;
                n7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.h10 h10Var3 = ((org.telegram.ui.c10) this.e).v;
                boolean g11 = h10Var3.f39844o0.g();
                boolean z13 = this.f30224c;
                if (g11) {
                    org.telegram.ui.z00 z00Var4 = h10Var3.S;
                    MessageObject messageObject4 = this.f30223b;
                    int id5 = messageObject4.getId();
                    z00Var4.f46148a = messageObject4.getDialogId();
                    z00Var4.f46149b = id5;
                    n7Var.e(h10Var3.f39844o0.c(h10Var3.S), z13);
                    return true;
                }
                n7Var.e(false, z13);
                return true;
            default:
                org.telegram.ui.Cells.r7 r7Var = (org.telegram.ui.Cells.r7) this.d;
                r7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.h10 h10Var4 = ((org.telegram.ui.e10) this.e).v;
                boolean g12 = h10Var4.f39844o0.g();
                boolean z14 = this.f30224c;
                if (g12) {
                    org.telegram.ui.z00 z00Var5 = h10Var4.S;
                    MessageObject messageObject5 = this.f30223b;
                    int id6 = messageObject5.getId();
                    z00Var5.f46148a = messageObject5.getDialogId();
                    z00Var5.f46149b = id6;
                    r7Var.f(h10Var4.f39844o0.c(h10Var4.S), z14);
                    return true;
                }
                r7Var.f(false, z14);
                return true;
        }
    }
}
