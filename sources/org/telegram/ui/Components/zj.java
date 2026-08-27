package org.telegram.ui.Components;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.MessageObject;

public final class zj implements ViewTreeObserver.OnPreDrawListener {

    public final int f35249a;

    public final MessageObject f35250b;

    public final boolean f35251c;
    public final ViewGroup d;

    public final yk0 f35252e;

    public zj(yk0 yk0Var, ViewGroup viewGroup, MessageObject messageObject, boolean z10, int i10) {
        this.f35249a = i10;
        this.f35252e = yk0Var;
        this.d = viewGroup;
        this.f35250b = messageObject;
        this.f35251c = z10;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f35249a) {
            case 0:
                org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) this.d;
                f7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                ak akVar = (ak) this.f35252e;
                org.telegram.ui.a10 a10Var = akVar.D;
                bk bkVar = akVar.T;
                boolean zT = bkVar.f34900b.T0.t();
                boolean z10 = this.f35251c;
                if (!zT) {
                    f7Var.b(false, z10);
                } else {
                    MessageObject messageObject = this.f35250b;
                    int id2 = messageObject.getId();
                    a10Var.f36332a = messageObject.getDialogId();
                    a10Var.f36333b = id2;
                    f7Var.b(bkVar.P.containsKey(a10Var), z10);
                }
                break;
            case 1:
                org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) this.d;
                p2Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.i10 i10Var = ((org.telegram.ui.b10) this.f35252e).f36664c;
                boolean zF = i10Var.f38949k0.f();
                boolean z11 = this.f35251c;
                if (!zF) {
                    p2Var.V(false, z11);
                } else {
                    org.telegram.ui.a10 a10Var2 = i10Var.O;
                    MessageObject messageObject2 = this.f35250b;
                    int id3 = messageObject2.getId();
                    a10Var2.f36332a = messageObject2.getDialogId();
                    a10Var2.f36333b = id3;
                    p2Var.V(i10Var.f38949k0.b(i10Var.O), z11);
                }
                break;
            case 2:
                org.telegram.ui.Cells.f7 f7Var2 = (org.telegram.ui.Cells.f7) this.d;
                f7Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.i10 i10Var2 = ((org.telegram.ui.d10) this.f35252e).v;
                boolean zF2 = i10Var2.f38949k0.f();
                boolean z12 = this.f35251c;
                if (!zF2) {
                    f7Var2.b(false, z12);
                } else {
                    org.telegram.ui.a10 a10Var3 = i10Var2.O;
                    MessageObject messageObject3 = this.f35250b;
                    int id4 = messageObject3.getId();
                    a10Var3.f36332a = messageObject3.getDialogId();
                    a10Var3.f36333b = id4;
                    f7Var2.b(i10Var2.f38949k0.b(i10Var2.O), z12);
                }
                break;
            case 3:
                org.telegram.ui.Cells.e7 e7Var = (org.telegram.ui.Cells.e7) this.d;
                e7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.i10 i10Var3 = ((org.telegram.ui.d10) this.f35252e).v;
                boolean zF3 = i10Var3.f38949k0.f();
                boolean z13 = this.f35251c;
                if (!zF3) {
                    e7Var.e(false, z13);
                } else {
                    org.telegram.ui.a10 a10Var4 = i10Var3.O;
                    MessageObject messageObject4 = this.f35250b;
                    int id5 = messageObject4.getId();
                    a10Var4.f36332a = messageObject4.getDialogId();
                    a10Var4.f36333b = id5;
                    e7Var.e(i10Var3.f38949k0.b(i10Var3.O), z13);
                }
                break;
            default:
                org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) this.d;
                i7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.i10 i10Var4 = ((org.telegram.ui.f10) this.f35252e).v;
                boolean zF4 = i10Var4.f38949k0.f();
                boolean z14 = this.f35251c;
                if (!zF4) {
                    i7Var.f(false, z14);
                } else {
                    org.telegram.ui.a10 a10Var5 = i10Var4.O;
                    MessageObject messageObject5 = this.f35250b;
                    int id6 = messageObject5.getId();
                    a10Var5.f36332a = messageObject5.getDialogId();
                    a10Var5.f36333b = id6;
                    i7Var.f(i10Var4.f38949k0.b(i10Var4.O), z14);
                }
                break;
        }
        return true;
    }
}
