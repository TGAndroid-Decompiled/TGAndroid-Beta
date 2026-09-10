package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.UndoView;
public final class kw implements Runnable {
    public final int f34463a;
    public final wy f34464b;

    public kw(wy wyVar, int i10) {
        this.f34463a = i10;
        this.f34464b = wyVar;
    }

    @Override
    public final void run() {
        switch (this.f34463a) {
            case 0:
                wy wyVar = this.f34464b;
                if (wyVar.R0 != 10) {
                    wyVar.c4(false);
                }
                if (wyVar.L && wyVar.X3().G()) {
                    wyVar.E0.h();
                    return;
                } else {
                    wyVar.x4(true, true);
                    return;
                }
            case 1:
                wy wyVar2 = this.f34464b;
                gh.g gVar = wyVar2.f38534y1;
                if (gVar != null) {
                    gVar.d();
                }
                wyVar2.s3();
                wyVar2.m3();
                wyVar2.t3();
                hi.b2 b2Var = wyVar2.C1;
                if (b2Var != null) {
                    b2Var.setTranslationY(-wyVar2.v.c());
                    return;
                }
                return;
            case 2:
                this.f34464b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.forceImportContactsStart, new Object[0]);
                return;
            case 3:
                this.f34464b.M3();
                return;
            case 4:
                this.f34464b.U4();
                return;
            case 5:
                wy.F0(this.f34464b);
                return;
            case 6:
                this.f34464b.getMessagesController().removeSuggestion(0L, "SETUP_LOGIN_EMAIL");
                return;
            case 7:
                wy wyVar3 = this.f34464b;
                bi.x4 x4Var = wyVar3.f38489q0;
                if (x4Var != null) {
                    x4Var.e(true);
                }
                wyVar3.presentFragment(new PremiumPreviewFragment(0, "stories"));
                return;
            case 8:
                this.f34464b.f38431e0[0].d.l();
                return;
            case 9:
                wy wyVar4 = this.f34464b;
                UndoView Y3 = wyVar4.Y3();
                if (Y3 != null) {
                    Y3.l(0L, 15, null, new rv(wyVar4, 25));
                    return;
                }
                return;
            case 10:
                wy wyVar5 = this.f34464b;
                wyVar5.getClass();
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                long j3 = globalMainSettings.getLong("cache_hint_period", 604800000L);
                if (j3 <= 604800000) {
                    j3 = 2592000000L;
                }
                globalMainSettings.edit().putLong("cache_hint_showafter", System.currentTimeMillis() + j3).putLong("cache_hint_period", j3).apply();
                wyVar5.U4();
                return;
            case 11:
                MessagesController.getInstance(this.f34464b.currentAccount).getMainSettings().edit().putBoolean("storyhint", false).commit();
                return;
            default:
                this.f34464b.a5();
                return;
        }
    }
}
