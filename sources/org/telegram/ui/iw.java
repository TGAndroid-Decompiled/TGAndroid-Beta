package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.UndoView;
public final class iw implements Runnable {
    public final int f34540a;
    public final ty f34541b;

    public iw(ty tyVar, int i10) {
        this.f34540a = i10;
        this.f34541b = tyVar;
    }

    @Override
    public final void run() {
        wf1 wf1Var;
        switch (this.f34540a) {
            case 0:
                ty tyVar = this.f34541b;
                hh.g gVar = tyVar.f38077y1;
                if (gVar != null) {
                    gVar.d();
                }
                tyVar.B3();
                tyVar.C3();
                ii.z1 z1Var = tyVar.C1;
                if (z1Var != null) {
                    z1Var.setTranslationY(-tyVar.v.c());
                    return;
                }
                return;
            case 1:
                this.f34541b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.forceImportContactsStart, new Object[0]);
                return;
            case 2:
                this.f34541b.V3();
                return;
            case 3:
                this.f34541b.d5();
                return;
            case 4:
                MessagesController.getInstance(this.f34541b.currentAccount).getMainSettings().edit().putBoolean("storyhint", false).commit();
                return;
            case 5:
                ty.G0(this.f34541b);
                return;
            case 6:
                this.f34541b.getMessagesController().removeSuggestion(0L, "SETUP_LOGIN_EMAIL");
                return;
            case 7:
                ty tyVar2 = this.f34541b;
                ci.e4 e4Var = tyVar2.f38034q0;
                if (e4Var != null) {
                    e4Var.e(true);
                }
                tyVar2.presentFragment(new PremiumPreviewFragment(0, "stories"));
                return;
            case 8:
                this.f34541b.f37976e0[0].d.l();
                return;
            case 9:
                ty tyVar3 = this.f34541b;
                UndoView h42 = tyVar3.h4();
                if (h42 != null) {
                    h42.l(0L, 15, null, new nv(tyVar3, 24));
                    return;
                }
                return;
            case 10:
                ty tyVar4 = this.f34541b;
                tyVar4.f37976e0[0].f37593a.requestLayout();
                kx kxVar = tyVar4.F3;
                if (kxVar != null && (kxVar.getFragment() instanceof wf1)) {
                    wf1Var = (wf1) tyVar4.F3.getFragment();
                } else {
                    wf1Var = null;
                }
                if (wf1Var != null) {
                    wf1Var.B0();
                }
                tyVar4.P3(false);
                tyVar4.b5();
                ay ayVar = tyVar4.C0;
                if (ayVar != null) {
                    ayVar.invalidate();
                    return;
                }
                return;
            default:
                this.f34541b.j5();
                return;
        }
    }
}
