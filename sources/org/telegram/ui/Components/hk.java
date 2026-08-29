package org.telegram.ui.Components;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.MessageObject;
public final class hk implements ViewTreeObserver.OnPreDrawListener {
    public final int f29191a;
    public final MessageObject f29192b;
    public final boolean f29193c;
    public final ViewGroup d;
    public final il0 f29194e;

    public hk(il0 il0Var, ViewGroup viewGroup, MessageObject messageObject, boolean z10, int i10) {
        this.f29191a = i10;
        this.f29194e = il0Var;
        this.d = viewGroup;
        this.f29192b = messageObject;
        this.f29193c = z10;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f29191a) {
            case 0:
                org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) this.d;
                g7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                ik ikVar = (ik) this.f29194e;
                org.telegram.ui.z00 z00Var = ikVar.D;
                jk jkVar = ikVar.T;
                boolean s10 = jkVar.f28403b.T0.s();
                boolean z10 = this.f29193c;
                if (s10) {
                    MessageObject messageObject = this.f29192b;
                    int id2 = messageObject.getId();
                    z00Var.f45005a = messageObject.getDialogId();
                    z00Var.f45006b = id2;
                    g7Var.b(jkVar.P.containsKey(z00Var), z10);
                    return true;
                }
                g7Var.b(false, z10);
                return true;
            case 1:
                org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) this.d;
                p2Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.h10 h10Var = ((org.telegram.ui.a10) this.f29194e).f36394c;
                boolean f9 = h10Var.f38733k0.f();
                boolean z11 = this.f29193c;
                if (f9) {
                    org.telegram.ui.z00 z00Var2 = h10Var.O;
                    MessageObject messageObject2 = this.f29192b;
                    int id3 = messageObject2.getId();
                    z00Var2.f45005a = messageObject2.getDialogId();
                    z00Var2.f45006b = id3;
                    p2Var.V(h10Var.f38733k0.b(h10Var.O), z11);
                    return true;
                }
                p2Var.V(false, z11);
                return true;
            case 2:
                org.telegram.ui.Cells.g7 g7Var2 = (org.telegram.ui.Cells.g7) this.d;
                g7Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.h10 h10Var2 = ((org.telegram.ui.c10) this.f29194e).v;
                boolean f10 = h10Var2.f38733k0.f();
                boolean z12 = this.f29193c;
                if (f10) {
                    org.telegram.ui.z00 z00Var3 = h10Var2.O;
                    MessageObject messageObject3 = this.f29192b;
                    int id4 = messageObject3.getId();
                    z00Var3.f45005a = messageObject3.getDialogId();
                    z00Var3.f45006b = id4;
                    g7Var2.b(h10Var2.f38733k0.b(h10Var2.O), z12);
                    return true;
                }
                g7Var2.b(false, z12);
                return true;
            case 3:
                org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) this.d;
                f7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.h10 h10Var3 = ((org.telegram.ui.c10) this.f29194e).v;
                boolean f11 = h10Var3.f38733k0.f();
                boolean z13 = this.f29193c;
                if (f11) {
                    org.telegram.ui.z00 z00Var4 = h10Var3.O;
                    MessageObject messageObject4 = this.f29192b;
                    int id5 = messageObject4.getId();
                    z00Var4.f45005a = messageObject4.getDialogId();
                    z00Var4.f45006b = id5;
                    f7Var.e(h10Var3.f38733k0.b(h10Var3.O), z13);
                    return true;
                }
                f7Var.e(false, z13);
                return true;
            default:
                org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) this.d;
                j7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.h10 h10Var4 = ((org.telegram.ui.e10) this.f29194e).v;
                boolean f12 = h10Var4.f38733k0.f();
                boolean z14 = this.f29193c;
                if (f12) {
                    org.telegram.ui.z00 z00Var5 = h10Var4.O;
                    MessageObject messageObject5 = this.f29192b;
                    int id6 = messageObject5.getId();
                    z00Var5.f45005a = messageObject5.getDialogId();
                    z00Var5.f45006b = id6;
                    j7Var.f(h10Var4.f38733k0.b(h10Var4.O), z14);
                    return true;
                }
                j7Var.f(false, z14);
                return true;
        }
    }
}
