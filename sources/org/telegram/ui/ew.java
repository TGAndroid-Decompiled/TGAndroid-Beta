package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.UndoView;
public final class ew implements Runnable {
    public final int f33471a;
    public final qy f33472b;

    public ew(qy qyVar, int i10) {
        this.f33471a = i10;
        this.f33472b = qyVar;
    }

    @Override
    public final void run() {
        switch (this.f33471a) {
            case 0:
                qy qyVar = this.f33472b;
                if (qyVar.R0 != 10) {
                    qyVar.c4(false);
                }
                if (qyVar.L && qyVar.X3().G()) {
                    qyVar.E0.h();
                    return;
                } else {
                    qyVar.x4(true, true);
                    return;
                }
            case 1:
                qy qyVar2 = this.f33472b;
                hh.g gVar = qyVar2.f37134y1;
                if (gVar != null) {
                    gVar.d();
                }
                qyVar2.s3();
                qyVar2.m3();
                qyVar2.t3();
                ii.z1 z1Var = qyVar2.C1;
                if (z1Var != null) {
                    z1Var.setTranslationY(-qyVar2.v.c());
                    return;
                }
                return;
            case 2:
                this.f33472b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.forceImportContactsStart, new Object[0]);
                return;
            case 3:
                this.f33472b.M3();
                return;
            case 4:
                this.f33472b.U4();
                return;
            case 5:
                qy.F0(this.f33472b);
                return;
            case 6:
                this.f33472b.getMessagesController().removeSuggestion(0L, "SETUP_LOGIN_EMAIL");
                return;
            case 7:
                qy qyVar3 = this.f33472b;
                ci.e4 e4Var = qyVar3.f37090q0;
                if (e4Var != null) {
                    e4Var.e(true);
                }
                qyVar3.presentFragment(new PremiumPreviewFragment(0, "stories"));
                return;
            case 8:
                this.f33472b.f37032e0[0].d.l();
                return;
            case 9:
                qy qyVar4 = this.f33472b;
                UndoView Y3 = qyVar4.Y3();
                if (Y3 != null) {
                    Y3.l(0L, 15, null, new lv(qyVar4, 25));
                    return;
                }
                return;
            case 10:
                qy qyVar5 = this.f33472b;
                qyVar5.getClass();
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                long j3 = globalMainSettings.getLong("cache_hint_period", 604800000L);
                if (j3 <= 604800000) {
                    j3 = 2592000000L;
                }
                globalMainSettings.edit().putLong("cache_hint_showafter", System.currentTimeMillis() + j3).putLong("cache_hint_period", j3).apply();
                qyVar5.U4();
                return;
            case 11:
                MessagesController.getInstance(this.f33472b.currentAccount).getMainSettings().edit().putBoolean("storyhint", false).commit();
                return;
            default:
                this.f33472b.a5();
                return;
        }
    }
}
