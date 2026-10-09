package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.UndoView;
public final class hw implements Runnable {
    public final int f38405a;
    public final ty f38406b;

    public hw(ty tyVar, int i10) {
        this.f38405a = i10;
        this.f38406b = tyVar;
    }

    @Override
    public final void run() {
        switch (this.f38405a) {
            case 0:
                ty tyVar = this.f38406b;
                dy dyVar = tyVar.C0;
                if (dyVar != null && dyVar.f25788y0) {
                    dyVar.Q(false);
                    return;
                }
                tyVar.X.f30614r.getText().clear();
                AndroidUtilities.hideKeyboard(tyVar.X.f30614r);
                tyVar.X.f30614r.clearFocus();
                tyVar.Y.b(false);
                return;
            case 1:
                ty tyVar2 = this.f38406b;
                if (tyVar2.R0 != 10) {
                    tyVar2.Z3(false);
                }
                if (tyVar2.L && tyVar2.U3().G()) {
                    tyVar2.E0.h();
                    return;
                } else {
                    tyVar2.u4(true, true);
                    return;
                }
            case 2:
                ty tyVar3 = this.f38406b;
                hh.f fVar = tyVar3.f42274y1;
                if (fVar != null) {
                    fVar.d();
                }
                tyVar3.p3();
                tyVar3.j3();
                tyVar3.q3();
                ii.z1 z1Var = tyVar3.C1;
                if (z1Var != null) {
                    z1Var.setTranslationY(-tyVar3.v.d());
                    return;
                }
                return;
            case 3:
                this.f38406b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.forceImportContactsStart, new Object[0]);
                return;
            case 4:
                this.f38406b.J3();
                return;
            case 5:
                this.f38406b.R4();
                return;
            case 6:
                ty.C0(this.f38406b);
                return;
            case 7:
                this.f38406b.getMessagesController().removeSuggestion(0L, "SETUP_LOGIN_EMAIL");
                return;
            case 8:
                ty tyVar4 = this.f38406b;
                ci.d4 d4Var = tyVar4.f42230q0;
                if (d4Var != null) {
                    d4Var.e(true);
                }
                tyVar4.presentFragment(new PremiumPreviewFragment(0, "stories"));
                return;
            case 9:
                this.f38406b.f42172e0[0].d.l();
                return;
            case 10:
                ty tyVar5 = this.f38406b;
                UndoView V3 = tyVar5.V3();
                if (V3 != null) {
                    V3.l(0L, 15, null, new ov(tyVar5, 26));
                    return;
                }
                return;
            case 11:
                ty tyVar6 = this.f38406b;
                tyVar6.getClass();
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                long j3 = globalMainSettings.getLong("cache_hint_period", 604800000L);
                if (j3 <= 604800000) {
                    j3 = 2592000000L;
                }
                globalMainSettings.edit().putLong("cache_hint_showafter", System.currentTimeMillis() + j3).putLong("cache_hint_period", j3).apply();
                tyVar6.R4();
                return;
            case 12:
                MessagesController.getInstance(this.f38406b.currentAccount).getMainSettings().edit().putBoolean("storyhint", false).commit();
                return;
            default:
                this.f38406b.X4();
                return;
        }
    }
}
