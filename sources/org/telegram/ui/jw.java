package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.UndoView;
public final class jw implements Runnable {
    public final int f37854a;
    public final uy f37855b;

    public jw(uy uyVar, int i10) {
        this.f37854a = i10;
        this.f37855b = uyVar;
    }

    @Override
    public final void run() {
        switch (this.f37854a) {
            case 0:
                uy uyVar = this.f37855b;
                if (uyVar.R0 != 10) {
                    uyVar.c4(false);
                }
                if (uyVar.L && uyVar.X3().G()) {
                    uyVar.E0.h();
                    return;
                } else {
                    uyVar.x4(true, true);
                    return;
                }
            case 1:
                uy uyVar2 = this.f37855b;
                ih.g gVar = uyVar2.f41362y1;
                if (gVar != null) {
                    gVar.d();
                }
                uyVar2.s3();
                uyVar2.m3();
                uyVar2.t3();
                ji.x1 x1Var = uyVar2.C1;
                if (x1Var != null) {
                    x1Var.setTranslationY(-uyVar2.v.c());
                    return;
                }
                return;
            case 2:
                this.f37855b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.forceImportContactsStart, new Object[0]);
                return;
            case 3:
                this.f37855b.M3();
                return;
            case 4:
                this.f37855b.U4();
                return;
            case 5:
                uy.F0(this.f37855b);
                return;
            case 6:
                this.f37855b.getMessagesController().removeSuggestion(0L, "SETUP_LOGIN_EMAIL");
                return;
            case 7:
                uy uyVar3 = this.f37855b;
                di.f4 f4Var = uyVar3.f41317q0;
                if (f4Var != null) {
                    f4Var.e(true);
                }
                uyVar3.presentFragment(new PremiumPreviewFragment(0, "stories"));
                return;
            case 8:
                this.f37855b.f41259e0[0].d.l();
                return;
            case 9:
                uy uyVar4 = this.f37855b;
                UndoView Y3 = uyVar4.Y3();
                if (Y3 != null) {
                    Y3.l(0L, 15, null, new qv(uyVar4, 25));
                    return;
                }
                return;
            case 10:
                uy uyVar5 = this.f37855b;
                uyVar5.getClass();
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                long j3 = globalMainSettings.getLong("cache_hint_period", 604800000L);
                if (j3 <= 604800000) {
                    j3 = 2592000000L;
                }
                globalMainSettings.edit().putLong("cache_hint_showafter", System.currentTimeMillis() + j3).putLong("cache_hint_period", j3).apply();
                uyVar5.U4();
                return;
            case 11:
                MessagesController.getInstance(this.f37855b.currentAccount).getMainSettings().edit().putBoolean("storyhint", false).commit();
                return;
            default:
                this.f37855b.a5();
                return;
        }
    }
}
