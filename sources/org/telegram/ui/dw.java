package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.UndoView;
public final class dw implements Runnable {
    public final int f33812a;
    public final oy f33813b;

    public dw(oy oyVar, int i10) {
        this.f33812a = i10;
        this.f33813b = oyVar;
    }

    @Override
    public final void run() {
        switch (this.f33812a) {
            case 0:
                oy oyVar = this.f33813b;
                if (oyVar.O0 != 10) {
                    oyVar.c4(false);
                }
                if (oyVar.I && oyVar.X3().G()) {
                    oyVar.B0.h();
                    return;
                } else {
                    oyVar.x4(true, true);
                    return;
                }
            case 1:
                oy oyVar2 = this.f33813b;
                ug.f fVar = oyVar2.f37111v1;
                if (fVar != null) {
                    fVar.d();
                }
                oyVar2.s3();
                oyVar2.m3();
                oyVar2.t3();
                org.telegram.ui.Components.qp0 qp0Var = oyVar2.f37130z1;
                if (qp0Var != null) {
                    qp0Var.setTranslationY(-oyVar2.v.c());
                    return;
                }
                return;
            case 2:
                this.f33813b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.forceImportContactsStart, new Object[0]);
                return;
            case 3:
                this.f33813b.M3();
                return;
            case 4:
                this.f33813b.U4();
                return;
            case 5:
                oy.F0(this.f33813b);
                return;
            case 6:
                this.f33813b.getMessagesController().removeSuggestion(0L, "SETUP_LOGIN_EMAIL");
                return;
            case 7:
                oy oyVar3 = this.f33813b;
                ph.f3 f3Var = oyVar3.f37069n0;
                if (f3Var != null) {
                    f3Var.e(true);
                }
                oyVar3.presentFragment(new PremiumPreviewFragment(0, "stories"));
                return;
            case 8:
                this.f33813b.f37009b0[0].d.l();
                return;
            case 9:
                oy oyVar4 = this.f33813b;
                UndoView Y3 = oyVar4.Y3();
                if (Y3 != null) {
                    Y3.l(0L, 15, null, new mv(oyVar4, 25));
                    return;
                }
                return;
            case 10:
                oy oyVar5 = this.f33813b;
                oyVar5.getClass();
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                long j10 = globalMainSettings.getLong("cache_hint_period", 604800000L);
                if (j10 <= 604800000) {
                    j10 = 2592000000L;
                }
                globalMainSettings.edit().putLong("cache_hint_showafter", System.currentTimeMillis() + j10).putLong("cache_hint_period", j10).apply();
                oyVar5.U4();
                return;
            case 11:
                MessagesController.getInstance(this.f33813b.currentAccount).getMainSettings().edit().putBoolean("storyhint", false).commit();
                return;
            default:
                this.f33813b.a5();
                return;
        }
    }
}
