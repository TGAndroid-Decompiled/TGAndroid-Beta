package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.UndoView;
public final class fw implements Runnable {
    public final int f34236a;
    public final qy f34237b;

    public fw(qy qyVar, int i10) {
        this.f34236a = i10;
        this.f34237b = qyVar;
    }

    @Override
    public final void run() {
        switch (this.f34236a) {
            case 0:
                qy qyVar = this.f34237b;
                if (qyVar.O0 != 10) {
                    qyVar.c4(false);
                }
                if (qyVar.I && qyVar.X3().G()) {
                    qyVar.B0.h();
                    return;
                } else {
                    qyVar.x4(true, true);
                    return;
                }
            case 1:
                qy qyVar2 = this.f34237b;
                ug.f fVar = qyVar2.f37629v1;
                if (fVar != null) {
                    fVar.d();
                }
                qyVar2.s3();
                qyVar2.m3();
                qyVar2.t3();
                org.telegram.ui.Components.pp0 pp0Var = qyVar2.f37648z1;
                if (pp0Var != null) {
                    pp0Var.setTranslationY(-qyVar2.v.c());
                    return;
                }
                return;
            case 2:
                this.f34237b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.forceImportContactsStart, new Object[0]);
                return;
            case 3:
                this.f34237b.M3();
                return;
            case 4:
                this.f34237b.U4();
                return;
            case 5:
                qy.F0(this.f34237b);
                return;
            case 6:
                this.f34237b.getMessagesController().removeSuggestion(0L, "SETUP_LOGIN_EMAIL");
                return;
            case 7:
                qy qyVar3 = this.f34237b;
                ph.f3 f3Var = qyVar3.f37587n0;
                if (f3Var != null) {
                    f3Var.e(true);
                }
                qyVar3.presentFragment(new PremiumPreviewFragment(0, "stories"));
                return;
            case 8:
                this.f34237b.f37527b0[0].d.l();
                return;
            case 9:
                qy qyVar4 = this.f34237b;
                UndoView Y3 = qyVar4.Y3();
                if (Y3 != null) {
                    Y3.l(0L, 15, null, new ov(qyVar4, 25));
                    return;
                }
                return;
            case 10:
                qy qyVar5 = this.f34237b;
                qyVar5.getClass();
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                long j10 = globalMainSettings.getLong("cache_hint_period", 604800000L);
                if (j10 <= 604800000) {
                    j10 = 2592000000L;
                }
                globalMainSettings.edit().putLong("cache_hint_showafter", System.currentTimeMillis() + j10).putLong("cache_hint_period", j10).apply();
                qyVar5.U4();
                return;
            case 11:
                MessagesController.getInstance(this.f34237b.currentAccount).getMainSettings().edit().putBoolean("storyhint", false).commit();
                return;
            default:
                this.f34237b.a5();
                return;
        }
    }
}
