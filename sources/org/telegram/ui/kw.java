package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.UndoView;
public final class kw implements Runnable {
    public final int f35366a;
    public final wy f35367b;

    public kw(wy wyVar, int i10) {
        this.f35366a = i10;
        this.f35367b = wyVar;
    }

    @Override
    public final void run() {
        switch (this.f35366a) {
            case 0:
                wy wyVar = this.f35367b;
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
                wy wyVar2 = this.f35367b;
                hh.g gVar = wyVar2.f39318y1;
                if (gVar != null) {
                    gVar.d();
                }
                wyVar2.s3();
                wyVar2.m3();
                wyVar2.t3();
                ii.y1 y1Var = wyVar2.C1;
                if (y1Var != null) {
                    y1Var.setTranslationY(-wyVar2.v.c());
                    return;
                }
                return;
            case 2:
                this.f35367b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.forceImportContactsStart, new Object[0]);
                return;
            case 3:
                this.f35367b.M3();
                return;
            case 4:
                this.f35367b.U4();
                return;
            case 5:
                wy.F0(this.f35367b);
                return;
            case 6:
                this.f35367b.getMessagesController().removeSuggestion(0L, "SETUP_LOGIN_EMAIL");
                return;
            case 7:
                wy wyVar3 = this.f35367b;
                ci.f4 f4Var = wyVar3.f39273q0;
                if (f4Var != null) {
                    f4Var.e(true);
                }
                wyVar3.presentFragment(new PremiumPreviewFragment(0, "stories"));
                return;
            case 8:
                this.f35367b.f39215e0[0].d.l();
                return;
            case 9:
                wy wyVar4 = this.f35367b;
                UndoView Y3 = wyVar4.Y3();
                if (Y3 != null) {
                    Y3.l(0L, 15, null, new rv(wyVar4, 25));
                    return;
                }
                return;
            case 10:
                wy wyVar5 = this.f35367b;
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
                MessagesController.getInstance(this.f35367b.currentAccount).getMainSettings().edit().putBoolean("storyhint", false).commit();
                return;
            default:
                this.f35367b.a5();
                return;
        }
    }
}
