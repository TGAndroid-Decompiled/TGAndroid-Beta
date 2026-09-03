package org.telegram.ui.Components;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import org.telegram.messenger.MessageObject;
public final class fk implements ViewTreeObserver.OnPreDrawListener {
    public final int f24906a;
    public final MessageObject f24907b;
    public final boolean f24908c;
    public final ViewGroup d;
    public final ql0 e;

    public fk(ql0 ql0Var, ViewGroup viewGroup, MessageObject messageObject, boolean z4, int i10) {
        this.f24906a = i10;
        this.e = ql0Var;
        this.d = viewGroup;
        this.f24907b = messageObject;
        this.f24908c = z4;
    }

    @Override
    public final boolean onPreDraw() {
        switch (this.f24906a) {
            case 0:
                org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) this.d;
                h7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                gk gkVar = (gk) this.e;
                org.telegram.ui.m10 m10Var = gkVar.E;
                hk hkVar = gkVar.U;
                boolean s6 = hkVar.f24282b.U0.s();
                boolean z4 = this.f24908c;
                if (s6) {
                    MessageObject messageObject = this.f24907b;
                    int id2 = messageObject.getId();
                    m10Var.f35953a = messageObject.getDialogId();
                    m10Var.f35954b = id2;
                    h7Var.b(hkVar.Q.containsKey(m10Var), z4);
                    return true;
                }
                h7Var.b(false, z4);
                return true;
            case 1:
                org.telegram.ui.Cells.q2 q2Var = (org.telegram.ui.Cells.q2) this.d;
                q2Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.u10 u10Var = ((org.telegram.ui.n10) this.e).f36308c;
                boolean f10 = u10Var.f38653l0.f();
                boolean z10 = this.f24908c;
                if (f10) {
                    org.telegram.ui.m10 m10Var2 = u10Var.P;
                    MessageObject messageObject2 = this.f24907b;
                    int id3 = messageObject2.getId();
                    m10Var2.f35953a = messageObject2.getDialogId();
                    m10Var2.f35954b = id3;
                    q2Var.V(u10Var.f38653l0.b(u10Var.P), z10);
                    return true;
                }
                q2Var.V(false, z10);
                return true;
            case 2:
                org.telegram.ui.Cells.h7 h7Var2 = (org.telegram.ui.Cells.h7) this.d;
                h7Var2.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.u10 u10Var2 = ((org.telegram.ui.p10) this.e).v;
                boolean f11 = u10Var2.f38653l0.f();
                boolean z11 = this.f24908c;
                if (f11) {
                    org.telegram.ui.m10 m10Var3 = u10Var2.P;
                    MessageObject messageObject3 = this.f24907b;
                    int id4 = messageObject3.getId();
                    m10Var3.f35953a = messageObject3.getDialogId();
                    m10Var3.f35954b = id4;
                    h7Var2.b(u10Var2.f38653l0.b(u10Var2.P), z11);
                    return true;
                }
                h7Var2.b(false, z11);
                return true;
            case 3:
                org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) this.d;
                g7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.u10 u10Var3 = ((org.telegram.ui.p10) this.e).v;
                boolean f12 = u10Var3.f38653l0.f();
                boolean z12 = this.f24908c;
                if (f12) {
                    org.telegram.ui.m10 m10Var4 = u10Var3.P;
                    MessageObject messageObject4 = this.f24907b;
                    int id5 = messageObject4.getId();
                    m10Var4.f35953a = messageObject4.getDialogId();
                    m10Var4.f35954b = id5;
                    g7Var.e(u10Var3.f38653l0.b(u10Var3.P), z12);
                    return true;
                }
                g7Var.e(false, z12);
                return true;
            default:
                org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) this.d;
                k7Var.getViewTreeObserver().removeOnPreDrawListener(this);
                org.telegram.ui.u10 u10Var4 = ((org.telegram.ui.r10) this.e).v;
                boolean f13 = u10Var4.f38653l0.f();
                boolean z13 = this.f24908c;
                if (f13) {
                    org.telegram.ui.m10 m10Var5 = u10Var4.P;
                    MessageObject messageObject5 = this.f24907b;
                    int id6 = messageObject5.getId();
                    m10Var5.f35953a = messageObject5.getDialogId();
                    m10Var5.f35954b = id6;
                    k7Var.f(u10Var4.f38653l0.b(u10Var4.P), z13);
                    return true;
                }
                k7Var.f(false, z13);
                return true;
        }
    }
}
