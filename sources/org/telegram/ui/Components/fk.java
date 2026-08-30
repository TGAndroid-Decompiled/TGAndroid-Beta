package org.telegram.ui.Components;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.MessageObject;
public final class fk implements ViewTreeObserver.OnPreDrawListener {
    public final int f24893a;
    public final MessageObject f24894b;
    public final boolean f24895c;
    public final ViewGroup d;
    public final rl0 e;

    public fk(rl0 rl0Var, ViewGroup viewGroup, MessageObject messageObject, boolean z4, int i10) {
        this.f24893a = i10;
        this.e = rl0Var;
        this.d = viewGroup;
        this.f24894b = messageObject;
        this.f24895c = z4;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f24893a) {
            case 0:
                org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) this.d;
                i7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                gk gkVar = (gk) this.e;
                org.telegram.ui.l10 l10Var = gkVar.E;
                hk hkVar = gkVar.U;
                boolean s6 = hkVar.f24278b.U0.s();
                boolean z4 = this.f24895c;
                if (s6) {
                    MessageObject messageObject = this.f24894b;
                    int id2 = messageObject.getId();
                    l10Var.f35872a = messageObject.getDialogId();
                    l10Var.f35873b = id2;
                    i7Var.b(hkVar.Q.containsKey(l10Var), z4);
                    return true;
                }
                i7Var.b(false, z4);
                return true;
            case 1:
                org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) this.d;
                r2Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.t10 t10Var = ((org.telegram.ui.m10) this.e).f36162c;
                boolean f10 = t10Var.f38487l0.f();
                boolean z10 = this.f24895c;
                if (f10) {
                    org.telegram.ui.l10 l10Var2 = t10Var.P;
                    MessageObject messageObject2 = this.f24894b;
                    int id3 = messageObject2.getId();
                    l10Var2.f35872a = messageObject2.getDialogId();
                    l10Var2.f35873b = id3;
                    r2Var.V(t10Var.f38487l0.b(t10Var.P), z10);
                    return true;
                }
                r2Var.V(false, z10);
                return true;
            case 2:
                org.telegram.ui.Cells.i7 i7Var2 = (org.telegram.ui.Cells.i7) this.d;
                i7Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.t10 t10Var2 = ((org.telegram.ui.o10) this.e).v;
                boolean f11 = t10Var2.f38487l0.f();
                boolean z11 = this.f24895c;
                if (f11) {
                    org.telegram.ui.l10 l10Var3 = t10Var2.P;
                    MessageObject messageObject3 = this.f24894b;
                    int id4 = messageObject3.getId();
                    l10Var3.f35872a = messageObject3.getDialogId();
                    l10Var3.f35873b = id4;
                    i7Var2.b(t10Var2.f38487l0.b(t10Var2.P), z11);
                    return true;
                }
                i7Var2.b(false, z11);
                return true;
            case 3:
                org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) this.d;
                h7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.t10 t10Var3 = ((org.telegram.ui.o10) this.e).v;
                boolean f12 = t10Var3.f38487l0.f();
                boolean z12 = this.f24895c;
                if (f12) {
                    org.telegram.ui.l10 l10Var4 = t10Var3.P;
                    MessageObject messageObject4 = this.f24894b;
                    int id5 = messageObject4.getId();
                    l10Var4.f35872a = messageObject4.getDialogId();
                    l10Var4.f35873b = id5;
                    h7Var.e(t10Var3.f38487l0.b(t10Var3.P), z12);
                    return true;
                }
                h7Var.e(false, z12);
                return true;
            default:
                org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) this.d;
                l7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.t10 t10Var4 = ((org.telegram.ui.q10) this.e).v;
                boolean f13 = t10Var4.f38487l0.f();
                boolean z13 = this.f24895c;
                if (f13) {
                    org.telegram.ui.l10 l10Var5 = t10Var4.P;
                    MessageObject messageObject5 = this.f24894b;
                    int id6 = messageObject5.getId();
                    l10Var5.f35872a = messageObject5.getDialogId();
                    l10Var5.f35873b = id6;
                    l7Var.f(t10Var4.f38487l0.b(t10Var4.P), z13);
                    return true;
                }
                l7Var.f(false, z13);
                return true;
        }
    }
}
