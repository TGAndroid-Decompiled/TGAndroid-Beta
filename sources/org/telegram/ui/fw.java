package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.UndoView;
public final class fw implements Runnable {
    public final int f33369a;
    public final ry f33370b;

    public fw(ry ryVar, int i10) {
        this.f33369a = i10;
        this.f33370b = ryVar;
    }

    @Override
    public final void run() {
        switch (this.f33369a) {
            case 0:
                ry ryVar = this.f33370b;
                if (ryVar.R0 != 10) {
                    ryVar.c4(false);
                }
                if (ryVar.L && ryVar.X3().G()) {
                    ryVar.E0.h();
                    return;
                } else {
                    ryVar.x4(true, true);
                    return;
                }
            case 1:
                ry ryVar2 = this.f33370b;
                hh.g gVar = ryVar2.f37080y1;
                if (gVar != null) {
                    gVar.d();
                }
                ryVar2.s3();
                ryVar2.m3();
                ryVar2.t3();
                ii.z1 z1Var = ryVar2.C1;
                if (z1Var != null) {
                    z1Var.setTranslationY(-ryVar2.v.c());
                    return;
                }
                return;
            case 2:
                this.f33370b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.forceImportContactsStart, new Object[0]);
                return;
            case 3:
                this.f33370b.M3();
                return;
            case 4:
                this.f33370b.U4();
                return;
            case 5:
                ry.F0(this.f33370b);
                return;
            case 6:
                this.f33370b.getMessagesController().removeSuggestion(0L, "SETUP_LOGIN_EMAIL");
                return;
            case 7:
                ry ryVar3 = this.f33370b;
                ci.e4 e4Var = ryVar3.f37036q0;
                if (e4Var != null) {
                    e4Var.e(true);
                }
                ryVar3.presentFragment(new PremiumPreviewFragment(0, "stories"));
                return;
            case 8:
                this.f33370b.f36978e0[0].d.l();
                return;
            case 9:
                ry ryVar4 = this.f33370b;
                UndoView Y3 = ryVar4.Y3();
                if (Y3 != null) {
                    Y3.l(0L, 15, null, new mv(ryVar4, 25));
                    return;
                }
                return;
            case 10:
                ry ryVar5 = this.f33370b;
                ryVar5.getClass();
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                long j3 = globalMainSettings.getLong("cache_hint_period", 604800000L);
                if (j3 <= 604800000) {
                    j3 = 2592000000L;
                }
                globalMainSettings.edit().putLong("cache_hint_showafter", System.currentTimeMillis() + j3).putLong("cache_hint_period", j3).apply();
                ryVar5.U4();
                return;
            case 11:
                MessagesController.getInstance(this.f33370b.currentAccount).getMainSettings().edit().putBoolean("storyhint", false).commit();
                return;
            default:
                this.f33370b.a5();
                return;
        }
    }
}
