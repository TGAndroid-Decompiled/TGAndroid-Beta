package org.telegram.ui.Components;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.MessageObject;
public final class dk implements ViewTreeObserver.OnPreDrawListener {
    public final int f27741a;
    public final MessageObject f27742b;
    public final boolean f27743c;
    public final ViewGroup d;
    public final vk0 f27744e;

    public dk(vk0 vk0Var, ViewGroup viewGroup, MessageObject messageObject, boolean z10, int i9) {
        this.f27741a = i9;
        this.f27744e = vk0Var;
        this.d = viewGroup;
        this.f27742b = messageObject;
        this.f27743c = z10;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f27741a) {
            case 0:
                org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) this.d;
                i7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                ek ekVar = (ek) this.f27744e;
                org.telegram.ui.x00 x00Var = ekVar.D;
                fk fkVar = ekVar.T;
                boolean s10 = fkVar.f27493b.T0.s();
                boolean z10 = this.f27743c;
                if (s10) {
                    MessageObject messageObject = this.f27742b;
                    int id2 = messageObject.getId();
                    x00Var.f44299a = messageObject.getDialogId();
                    x00Var.f44300b = id2;
                    i7Var.b(fkVar.P.containsKey(x00Var), z10);
                    return true;
                }
                i7Var.b(false, z10);
                return true;
            case 1:
                org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) this.d;
                r2Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.f10 f10Var = ((org.telegram.ui.y00) this.f27744e).f44665c;
                boolean f10 = f10Var.f38100k0.f();
                boolean z11 = this.f27743c;
                if (f10) {
                    org.telegram.ui.x00 x00Var2 = f10Var.O;
                    MessageObject messageObject2 = this.f27742b;
                    int id3 = messageObject2.getId();
                    x00Var2.f44299a = messageObject2.getDialogId();
                    x00Var2.f44300b = id3;
                    r2Var.U(f10Var.f38100k0.b(f10Var.O), z11);
                    return true;
                }
                r2Var.U(false, z11);
                return true;
            case 2:
                org.telegram.ui.Cells.i7 i7Var2 = (org.telegram.ui.Cells.i7) this.d;
                i7Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.f10 f10Var2 = ((org.telegram.ui.a10) this.f27744e).v;
                boolean f11 = f10Var2.f38100k0.f();
                boolean z12 = this.f27743c;
                if (f11) {
                    org.telegram.ui.x00 x00Var3 = f10Var2.O;
                    MessageObject messageObject3 = this.f27742b;
                    int id4 = messageObject3.getId();
                    x00Var3.f44299a = messageObject3.getDialogId();
                    x00Var3.f44300b = id4;
                    i7Var2.b(f10Var2.f38100k0.b(f10Var2.O), z12);
                    return true;
                }
                i7Var2.b(false, z12);
                return true;
            case 3:
                org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) this.d;
                h7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.f10 f10Var3 = ((org.telegram.ui.a10) this.f27744e).v;
                boolean f12 = f10Var3.f38100k0.f();
                boolean z13 = this.f27743c;
                if (f12) {
                    org.telegram.ui.x00 x00Var4 = f10Var3.O;
                    MessageObject messageObject4 = this.f27742b;
                    int id5 = messageObject4.getId();
                    x00Var4.f44299a = messageObject4.getDialogId();
                    x00Var4.f44300b = id5;
                    h7Var.e(f10Var3.f38100k0.b(f10Var3.O), z13);
                    return true;
                }
                h7Var.e(false, z13);
                return true;
            default:
                org.telegram.ui.Cells.l7 l7Var = (org.telegram.ui.Cells.l7) this.d;
                l7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.f10 f10Var4 = ((org.telegram.ui.c10) this.f27744e).v;
                boolean f13 = f10Var4.f38100k0.f();
                boolean z14 = this.f27743c;
                if (f13) {
                    org.telegram.ui.x00 x00Var5 = f10Var4.O;
                    MessageObject messageObject5 = this.f27742b;
                    int id6 = messageObject5.getId();
                    x00Var5.f44299a = messageObject5.getDialogId();
                    x00Var5.f44300b = id6;
                    l7Var.f(f10Var4.f38100k0.b(f10Var4.O), z14);
                    return true;
                }
                l7Var.f(false, z14);
                return true;
        }
    }
}
