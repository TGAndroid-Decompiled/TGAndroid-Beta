package org.telegram.ui.Components;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.MessageObject;
public final class lk implements ViewTreeObserver.OnPreDrawListener {
    public final int f28240a;
    public final MessageObject f28241b;
    public final boolean f28242c;
    public final ViewGroup d;
    public final hm0 e;

    public lk(hm0 hm0Var, ViewGroup viewGroup, MessageObject messageObject, boolean z10, int i10) {
        this.f28240a = i10;
        this.e = hm0Var;
        this.d = viewGroup;
        this.f28241b = messageObject;
        this.f28242c = z10;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f28240a) {
            case 0:
                org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) this.d;
                i7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                mk mkVar = (mk) this.e;
                org.telegram.ui.w00 w00Var = mkVar.H;
                nk nkVar = mkVar.X;
                boolean t10 = nkVar.f28225b.f30520a1.t();
                boolean z10 = this.f28242c;
                if (t10) {
                    MessageObject messageObject = this.f28241b;
                    int id2 = messageObject.getId();
                    w00Var.f42418a = messageObject.getDialogId();
                    w00Var.f42419b = id2;
                    i7Var.b(nkVar.T.containsKey(w00Var), z10);
                    return true;
                }
                i7Var.b(false, z10);
                return true;
            case 1:
                org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) this.d;
                r2Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.e10 e10Var = ((org.telegram.ui.x00) this.e).f42982c;
                boolean g10 = e10Var.f36512o0.g();
                boolean z11 = this.f28242c;
                if (g10) {
                    org.telegram.ui.w00 w00Var2 = e10Var.S;
                    MessageObject messageObject2 = this.f28241b;
                    int id3 = messageObject2.getId();
                    w00Var2.f42418a = messageObject2.getDialogId();
                    w00Var2.f42419b = id3;
                    r2Var.V(e10Var.f36512o0.b(e10Var.S), z11);
                    return true;
                }
                r2Var.V(false, z11);
                return true;
            case 2:
                org.telegram.ui.Cells.i7 i7Var2 = (org.telegram.ui.Cells.i7) this.d;
                i7Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.e10 e10Var2 = ((org.telegram.ui.z00) this.e).v;
                boolean g11 = e10Var2.f36512o0.g();
                boolean z12 = this.f28242c;
                if (g11) {
                    org.telegram.ui.w00 w00Var3 = e10Var2.S;
                    MessageObject messageObject3 = this.f28241b;
                    int id4 = messageObject3.getId();
                    w00Var3.f42418a = messageObject3.getDialogId();
                    w00Var3.f42419b = id4;
                    i7Var2.b(e10Var2.f36512o0.b(e10Var2.S), z12);
                    return true;
                }
                i7Var2.b(false, z12);
                return true;
            case 3:
                org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) this.d;
                h7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.e10 e10Var3 = ((org.telegram.ui.z00) this.e).v;
                boolean g12 = e10Var3.f36512o0.g();
                boolean z13 = this.f28242c;
                if (g12) {
                    org.telegram.ui.w00 w00Var4 = e10Var3.S;
                    MessageObject messageObject4 = this.f28241b;
                    int id5 = messageObject4.getId();
                    w00Var4.f42418a = messageObject4.getDialogId();
                    w00Var4.f42419b = id5;
                    h7Var.e(e10Var3.f36512o0.b(e10Var3.S), z13);
                    return true;
                }
                h7Var.e(false, z13);
                return true;
            default:
                org.telegram.ui.Cells.m7 m7Var = (org.telegram.ui.Cells.m7) this.d;
                m7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.e10 e10Var4 = ((org.telegram.ui.b10) this.e).v;
                boolean g13 = e10Var4.f36512o0.g();
                boolean z14 = this.f28242c;
                if (g13) {
                    org.telegram.ui.w00 w00Var5 = e10Var4.S;
                    MessageObject messageObject5 = this.f28241b;
                    int id6 = messageObject5.getId();
                    w00Var5.f42418a = messageObject5.getDialogId();
                    w00Var5.f42419b = id6;
                    m7Var.f(e10Var4.f36512o0.b(e10Var4.S), z14);
                    return true;
                }
                m7Var.f(false, z14);
                return true;
        }
    }
}
