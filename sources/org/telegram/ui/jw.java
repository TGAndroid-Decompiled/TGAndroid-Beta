package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.UndoView;
public final class jw implements Runnable {
    public final int f39289a;
    public final vy f39290b;

    public jw(vy vyVar, int i10) {
        this.f39289a = i10;
        this.f39290b = vyVar;
    }

    @Override
    public final void run() {
        switch (this.f39289a) {
            case 0:
                vy vyVar = this.f39290b;
                fy fyVar = vyVar.C0;
                if (fyVar != null && fyVar.f27613y0) {
                    fyVar.Q(false);
                    return;
                }
                vyVar.X.f31362r.getText().clear();
                AndroidUtilities.hideKeyboard(vyVar.X.f31362r);
                vyVar.X.f31362r.clearFocus();
                vyVar.Y.b(false);
                return;
            case 1:
                vy vyVar2 = this.f39290b;
                if (vyVar2.R0 != 10) {
                    vyVar2.Z3(false);
                }
                if (vyVar2.L && vyVar2.U3().G()) {
                    vyVar2.E0.h();
                    return;
                } else {
                    vyVar2.u4(true, true);
                    return;
                }
            case 2:
                vy vyVar3 = this.f39290b;
                hh.f fVar = vyVar3.f43005y1;
                if (fVar != null) {
                    fVar.d();
                }
                vyVar3.p3();
                vyVar3.j3();
                vyVar3.q3();
                ii.z1 z1Var = vyVar3.C1;
                if (z1Var != null) {
                    z1Var.setTranslationY(-vyVar3.v.d());
                    return;
                }
                return;
            case 3:
                this.f39290b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.forceImportContactsStart, new Object[0]);
                return;
            case 4:
                this.f39290b.J3();
                return;
            case 5:
                this.f39290b.R4();
                return;
            case 6:
                vy.C0(this.f39290b);
                return;
            case 7:
                this.f39290b.getMessagesController().removeSuggestion(0L, "SETUP_LOGIN_EMAIL");
                return;
            case 8:
                vy vyVar4 = this.f39290b;
                ci.d4 d4Var = vyVar4.f42961q0;
                if (d4Var != null) {
                    d4Var.e(true);
                }
                vyVar4.presentFragment(new PremiumPreviewFragment(0, "stories"));
                return;
            case 9:
                this.f39290b.f42903e0[0].d.l();
                return;
            case 10:
                vy vyVar5 = this.f39290b;
                UndoView V3 = vyVar5.V3();
                if (V3 != null) {
                    V3.l(0L, 15, null, new rv(vyVar5, 26));
                    return;
                }
                return;
            case 11:
                vy vyVar6 = this.f39290b;
                vyVar6.getClass();
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                long j3 = globalMainSettings.getLong("cache_hint_period", 604800000L);
                if (j3 <= 604800000) {
                    j3 = 2592000000L;
                }
                globalMainSettings.edit().putLong("cache_hint_showafter", System.currentTimeMillis() + j3).putLong("cache_hint_period", j3).apply();
                vyVar6.R4();
                return;
            case 12:
                MessagesController.getInstance(this.f39290b.currentAccount).getMainSettings().edit().putBoolean("storyhint", false).commit();
                return;
            default:
                this.f39290b.X4();
                return;
        }
    }
}
