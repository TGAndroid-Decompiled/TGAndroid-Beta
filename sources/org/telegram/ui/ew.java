package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.UndoView;
public final class ew implements Runnable {
    public final int f36597a;
    public final py f36598b;

    public ew(py pyVar, int i10) {
        this.f36597a = i10;
        this.f36598b = pyVar;
    }

    @Override
    public final void run() {
        switch (this.f36597a) {
            case 0:
                py pyVar = this.f36598b;
                if (pyVar.O0 != 10) {
                    pyVar.c4(false);
                }
                if (pyVar.I && pyVar.X3().G()) {
                    pyVar.B0.h();
                    return;
                } else {
                    pyVar.x4(true, true);
                    return;
                }
            case 1:
                py pyVar2 = this.f36598b;
                vg.f fVar = pyVar2.f40258v1;
                if (fVar != null) {
                    fVar.d();
                }
                pyVar2.s3();
                pyVar2.m3();
                pyVar2.t3();
                org.telegram.ui.Components.qp0 qp0Var = pyVar2.f40277z1;
                if (qp0Var != null) {
                    qp0Var.setTranslationY(-pyVar2.v.c());
                    return;
                }
                return;
            case 2:
                this.f36598b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.forceImportContactsStart, new Object[0]);
                return;
            case 3:
                this.f36598b.M3();
                return;
            case 4:
                this.f36598b.U4();
                return;
            case 5:
                py.F0(this.f36598b);
                return;
            case 6:
                this.f36598b.getMessagesController().removeSuggestion(0L, "SETUP_LOGIN_EMAIL");
                return;
            case 7:
                py pyVar3 = this.f36598b;
                qh.e3 e3Var = pyVar3.f40216n0;
                if (e3Var != null) {
                    e3Var.e(true);
                }
                pyVar3.presentFragment(new PremiumPreviewFragment(0, "stories"));
                return;
            case 8:
                this.f36598b.f40155b0[0].d.l();
                return;
            case 9:
                py pyVar4 = this.f36598b;
                UndoView Y3 = pyVar4.Y3();
                if (Y3 != null) {
                    Y3.l(0L, 15, null, new nv(pyVar4, 25));
                    return;
                }
                return;
            case 10:
                py pyVar5 = this.f36598b;
                pyVar5.getClass();
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                long j10 = globalMainSettings.getLong("cache_hint_period", 604800000L);
                if (j10 <= 604800000) {
                    j10 = 2592000000L;
                }
                globalMainSettings.edit().putLong("cache_hint_showafter", System.currentTimeMillis() + j10).putLong("cache_hint_period", j10).apply();
                pyVar5.U4();
                return;
            case 11:
                MessagesController.getInstance(this.f36598b.currentAccount).getMainSettings().edit().putBoolean("storyhint", false).commit();
                return;
            default:
                this.f36598b.a5();
                return;
        }
    }
}
