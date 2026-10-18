package org.telegram.ui.Components;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.MessageObject;
public final class lk implements ViewTreeObserver.OnPreDrawListener {
    public final int f28253a;
    public final MessageObject f28254b;
    public final boolean f28255c;
    public final ViewGroup d;
    public final hm0 e;

    public lk(hm0 hm0Var, ViewGroup viewGroup, MessageObject messageObject, boolean z10, int i10) {
        this.f28253a = i10;
        this.e = hm0Var;
        this.d = viewGroup;
        this.f28254b = messageObject;
        this.f28255c = z10;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f28253a) {
            case 0:
                org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) this.d;
                i7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                mk mkVar = (mk) this.e;
                org.telegram.ui.y00 y00Var = mkVar.H;
                nk nkVar = mkVar.X;
                boolean s10 = nkVar.f28238b.f30558a1.s();
                boolean z10 = this.f28255c;
                if (s10) {
                    MessageObject messageObject = this.f28254b;
                    int id2 = messageObject.getId();
                    y00Var.f43287a = messageObject.getDialogId();
                    y00Var.f43288b = id2;
                    i7Var.b(nkVar.T.containsKey(y00Var), z10);
                    return true;
                }
                i7Var.b(false, z10);
                return true;
            case 1:
                org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) this.d;
                r2Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.g10 g10Var = ((org.telegram.ui.z00) this.e).f43501c;
                boolean g10 = g10Var.f37034o0.g();
                boolean z11 = this.f28255c;
                if (g10) {
                    org.telegram.ui.y00 y00Var2 = g10Var.S;
                    MessageObject messageObject2 = this.f28254b;
                    int id3 = messageObject2.getId();
                    y00Var2.f43287a = messageObject2.getDialogId();
                    y00Var2.f43288b = id3;
                    r2Var.V(g10Var.f37034o0.b(g10Var.S), z11);
                    return true;
                }
                r2Var.V(false, z11);
                return true;
            case 2:
                org.telegram.ui.Cells.i7 i7Var2 = (org.telegram.ui.Cells.i7) this.d;
                i7Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.g10 g10Var2 = ((org.telegram.ui.b10) this.e).v;
                boolean g11 = g10Var2.f37034o0.g();
                boolean z12 = this.f28255c;
                if (g11) {
                    org.telegram.ui.y00 y00Var3 = g10Var2.S;
                    MessageObject messageObject3 = this.f28254b;
                    int id4 = messageObject3.getId();
                    y00Var3.f43287a = messageObject3.getDialogId();
                    y00Var3.f43288b = id4;
                    i7Var2.b(g10Var2.f37034o0.b(g10Var2.S), z12);
                    return true;
                }
                i7Var2.b(false, z12);
                return true;
            case 3:
                org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) this.d;
                h7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.g10 g10Var3 = ((org.telegram.ui.b10) this.e).v;
                boolean g12 = g10Var3.f37034o0.g();
                boolean z13 = this.f28255c;
                if (g12) {
                    org.telegram.ui.y00 y00Var4 = g10Var3.S;
                    MessageObject messageObject4 = this.f28254b;
                    int id5 = messageObject4.getId();
                    y00Var4.f43287a = messageObject4.getDialogId();
                    y00Var4.f43288b = id5;
                    h7Var.e(g10Var3.f37034o0.b(g10Var3.S), z13);
                    return true;
                }
                h7Var.e(false, z13);
                return true;
            default:
                org.telegram.ui.Cells.m7 m7Var = (org.telegram.ui.Cells.m7) this.d;
                m7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.g10 g10Var4 = ((org.telegram.ui.d10) this.e).v;
                boolean g13 = g10Var4.f37034o0.g();
                boolean z14 = this.f28255c;
                if (g13) {
                    org.telegram.ui.y00 y00Var5 = g10Var4.S;
                    MessageObject messageObject5 = this.f28254b;
                    int id6 = messageObject5.getId();
                    y00Var5.f43287a = messageObject5.getDialogId();
                    y00Var5.f43288b = id6;
                    m7Var.f(g10Var4.f37034o0.b(g10Var4.S), z14);
                    return true;
                }
                m7Var.f(false, z14);
                return true;
        }
    }
}
