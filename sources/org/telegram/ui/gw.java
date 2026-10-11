package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.UndoView;
public final class gw implements Runnable {
    public final int f38202a;
    public final sy f38203b;

    public gw(sy syVar, int i10) {
        this.f38202a = i10;
        this.f38203b = syVar;
    }

    @Override
    public final void run() {
        switch (this.f38202a) {
            case 0:
                sy syVar = this.f38203b;
                cy cyVar = syVar.C0;
                if (cyVar != null && cyVar.f26187y0) {
                    cyVar.Q(false);
                    return;
                }
                syVar.X.f31038r.getText().clear();
                AndroidUtilities.hideKeyboard(syVar.X.f31038r);
                syVar.X.f31038r.clearFocus();
                syVar.Y.b(false);
                return;
            case 1:
                sy syVar2 = this.f38203b;
                if (syVar2.R0 != 10) {
                    syVar2.Z3(false);
                }
                if (syVar2.L && syVar2.U3().G()) {
                    syVar2.E0.h();
                    return;
                } else {
                    syVar2.u4(true, true);
                    return;
                }
            case 2:
                sy syVar3 = this.f38203b;
                hh.f fVar = syVar3.f42043y1;
                if (fVar != null) {
                    fVar.d();
                }
                syVar3.p3();
                syVar3.j3();
                syVar3.q3();
                ii.z1 z1Var = syVar3.C1;
                if (z1Var != null) {
                    z1Var.setTranslationY(-syVar3.v.d());
                    return;
                }
                return;
            case 3:
                this.f38203b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.forceImportContactsStart, new Object[0]);
                return;
            case 4:
                this.f38203b.J3();
                return;
            case 5:
                this.f38203b.R4();
                return;
            case 6:
                sy.C0(this.f38203b);
                return;
            case 7:
                this.f38203b.getMessagesController().removeSuggestion(0L, "SETUP_LOGIN_EMAIL");
                return;
            case 8:
                sy syVar4 = this.f38203b;
                ci.d4 d4Var = syVar4.f41999q0;
                if (d4Var != null) {
                    d4Var.e(true);
                }
                syVar4.presentFragment(new PremiumPreviewFragment(0, "stories"));
                return;
            case 9:
                this.f38203b.f41941e0[0].d.l();
                return;
            case 10:
                sy syVar5 = this.f38203b;
                UndoView V3 = syVar5.V3();
                if (V3 != null) {
                    V3.l(0L, 15, null, new nv(syVar5, 26));
                    return;
                }
                return;
            case 11:
                sy syVar6 = this.f38203b;
                syVar6.getClass();
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                long j3 = globalMainSettings.getLong("cache_hint_period", 604800000L);
                if (j3 <= 604800000) {
                    j3 = 2592000000L;
                }
                globalMainSettings.edit().putLong("cache_hint_showafter", System.currentTimeMillis() + j3).putLong("cache_hint_period", j3).apply();
                syVar6.R4();
                return;
            case 12:
                MessagesController.getInstance(this.f38203b.currentAccount).getMainSettings().edit().putBoolean("storyhint", false).commit();
                return;
            default:
                this.f38203b.X4();
                return;
        }
    }
}
