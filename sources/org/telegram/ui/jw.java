package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.UndoView;
public final class jw implements Runnable {
    public final int f37784a;
    public final uy f37785b;

    public jw(uy uyVar, int i10) {
        this.f37784a = i10;
        this.f37785b = uyVar;
    }

    @Override
    public final void run() {
        yf1 yf1Var;
        switch (this.f37784a) {
            case 0:
                uy uyVar = this.f37785b;
                hh.g gVar = uyVar.f41501y1;
                if (gVar != null) {
                    gVar.d();
                }
                uyVar.B3();
                uyVar.C3();
                ii.z1 z1Var = uyVar.C1;
                if (z1Var != null) {
                    z1Var.setTranslationY(-uyVar.v.c());
                    return;
                }
                return;
            case 1:
                this.f37785b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.forceImportContactsStart, new Object[0]);
                return;
            case 2:
                this.f37785b.V3();
                return;
            case 3:
                this.f37785b.d5();
                return;
            case 4:
                MessagesController.getInstance(this.f37785b.currentAccount).getMainSettings().edit().putBoolean("storyhint", false).commit();
                return;
            case 5:
                uy.G0(this.f37785b);
                return;
            case 6:
                this.f37785b.getMessagesController().removeSuggestion(0L, "SETUP_LOGIN_EMAIL");
                return;
            case 7:
                uy uyVar2 = this.f37785b;
                ci.e4 e4Var = uyVar2.f41458q0;
                if (e4Var != null) {
                    e4Var.e(true);
                }
                uyVar2.presentFragment(new PremiumPreviewFragment(0, "stories"));
                return;
            case 8:
                this.f37785b.f41400e0[0].d.l();
                return;
            case 9:
                uy uyVar3 = this.f37785b;
                UndoView h42 = uyVar3.h4();
                if (h42 != null) {
                    h42.l(0L, 15, null, new pv(uyVar3, 24));
                    return;
                }
                return;
            case 10:
                uy uyVar4 = this.f37785b;
                uyVar4.f41400e0[0].f40990a.requestLayout();
                mx mxVar = uyVar4.F3;
                if (mxVar != null && (mxVar.getFragment() instanceof yf1)) {
                    yf1Var = (yf1) uyVar4.F3.getFragment();
                } else {
                    yf1Var = null;
                }
                if (yf1Var != null) {
                    yf1Var.B0();
                }
                uyVar4.P3(false);
                uyVar4.b5();
                dy dyVar = uyVar4.C0;
                if (dyVar != null) {
                    dyVar.invalidate();
                    return;
                }
                return;
            default:
                this.f37785b.j5();
                return;
        }
    }
}
