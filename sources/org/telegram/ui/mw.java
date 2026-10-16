package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.UndoView;
public final class mw implements Runnable {
    public final int f38078a;
    public final yy f38079b;

    public mw(yy yyVar, int i10) {
        this.f38078a = i10;
        this.f38079b = yyVar;
    }

    @Override
    public final void run() {
        switch (this.f38078a) {
            case 0:
                yy yyVar = this.f38079b;
                iy iyVar = yyVar.C0;
                if (iyVar != null && iyVar.f31640y0) {
                    iyVar.Q(false);
                    return;
                }
                yyVar.X.f27510r.getText().clear();
                AndroidUtilities.hideKeyboard(yyVar.X.f27510r);
                yyVar.X.f27510r.clearFocus();
                yyVar.Y.b(false);
                return;
            case 1:
                yy yyVar2 = this.f38079b;
                if (yyVar2.R0 != 10) {
                    yyVar2.a4(false);
                }
                if (yyVar2.L && yyVar2.V3().G()) {
                    yyVar2.E0.h();
                    return;
                } else {
                    yyVar2.v4(true, true);
                    return;
                }
            case 2:
                yy yyVar3 = this.f38079b;
                ih.f fVar = yyVar3.f42108y1;
                if (fVar != null) {
                    fVar.d();
                }
                yyVar3.q3();
                yyVar3.j3();
                yyVar3.r3();
                ji.y1 y1Var = yyVar3.C1;
                if (y1Var != null) {
                    y1Var.setTranslationY(-yyVar3.v.d());
                    return;
                }
                return;
            case 3:
                this.f38079b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.forceImportContactsStart, new Object[0]);
                return;
            case 4:
                this.f38079b.K3();
                return;
            case 5:
                this.f38079b.S4();
                return;
            case 6:
                yy.x0(this.f38079b);
                return;
            case 7:
                this.f38079b.getMessagesController().removeSuggestion(0L, "SETUP_LOGIN_EMAIL");
                return;
            case 8:
                yy yyVar4 = this.f38079b;
                di.d4 d4Var = yyVar4.f42063q0;
                if (d4Var != null) {
                    d4Var.e(true);
                }
                yyVar4.presentFragment(new PremiumPreviewFragment(0, "stories"));
                return;
            case 9:
                this.f38079b.f42004e0[0].d.l();
                return;
            case 10:
                yy yyVar5 = this.f38079b;
                UndoView W3 = yyVar5.W3();
                if (W3 != null) {
                    W3.l(0L, 15, null, new uv(yyVar5, 27));
                    return;
                }
                return;
            case 11:
                yy yyVar6 = this.f38079b;
                yyVar6.getClass();
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                long j10 = globalMainSettings.getLong("cache_hint_period", 604800000L);
                if (j10 <= 604800000) {
                    j10 = 2592000000L;
                }
                globalMainSettings.edit().putLong("cache_hint_showafter", System.currentTimeMillis() + j10).putLong("cache_hint_period", j10).apply();
                yyVar6.S4();
                return;
            case 12:
                MessagesController.getInstance(this.f38079b.currentAccount).getMainSettings().edit().putBoolean("storyhint", false).commit();
                return;
            default:
                this.f38079b.Y4();
                return;
        }
    }
}
