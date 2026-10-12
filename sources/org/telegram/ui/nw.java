package org.telegram.ui;

import android.content.SharedPreferences;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.UndoView;
public final class nw implements Runnable {
    public final int f38803a;
    public final yy f38804b;

    public nw(yy yyVar, int i10) {
        this.f38803a = i10;
        this.f38804b = yyVar;
    }

    @Override
    public final void run() {
        switch (this.f38803a) {
            case 0:
                yy yyVar = this.f38804b;
                iy iyVar = yyVar.C0;
                if (iyVar != null && iyVar.f31937y0) {
                    iyVar.Q(false);
                    return;
                }
                yyVar.X.f27815r.getText().clear();
                AndroidUtilities.hideKeyboard(yyVar.X.f27815r);
                yyVar.X.f27815r.clearFocus();
                yyVar.Y.b(false);
                return;
            case 1:
                yy yyVar2 = this.f38804b;
                if (yyVar2.R0 != 10) {
                    yyVar2.Z3(false);
                }
                if (yyVar2.L && yyVar2.U3().G()) {
                    yyVar2.E0.h();
                    return;
                } else {
                    yyVar2.u4(true, true);
                    return;
                }
            case 2:
                yy yyVar3 = this.f38804b;
                ih.f fVar = yyVar3.f42428y1;
                if (fVar != null) {
                    fVar.d();
                }
                yyVar3.p3();
                yyVar3.j3();
                yyVar3.q3();
                ji.y1 y1Var = yyVar3.C1;
                if (y1Var != null) {
                    y1Var.setTranslationY(-yyVar3.v.d());
                    return;
                }
                return;
            case 3:
                this.f38804b.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.forceImportContactsStart, new Object[0]);
                return;
            case 4:
                this.f38804b.J3();
                return;
            case 5:
                this.f38804b.R4();
                return;
            case 6:
                yy.C0(this.f38804b);
                return;
            case 7:
                this.f38804b.getMessagesController().removeSuggestion(0L, "SETUP_LOGIN_EMAIL");
                return;
            case 8:
                yy yyVar4 = this.f38804b;
                di.d4 d4Var = yyVar4.f42384q0;
                if (d4Var != null) {
                    d4Var.e(true);
                }
                yyVar4.presentFragment(new PremiumPreviewFragment(0, "stories"));
                return;
            case 9:
                this.f38804b.f42325e0[0].d.l();
                return;
            case 10:
                yy yyVar5 = this.f38804b;
                UndoView V3 = yyVar5.V3();
                if (V3 != null) {
                    V3.l(0L, 15, null, new uv(yyVar5, 26));
                    return;
                }
                return;
            case 11:
                yy yyVar6 = this.f38804b;
                yyVar6.getClass();
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                long j10 = globalMainSettings.getLong("cache_hint_period", 604800000L);
                if (j10 <= 604800000) {
                    j10 = 2592000000L;
                }
                globalMainSettings.edit().putLong("cache_hint_showafter", System.currentTimeMillis() + j10).putLong("cache_hint_period", j10).apply();
                yyVar6.R4();
                return;
            case 12:
                MessagesController.getInstance(this.f38804b.currentAccount).getMainSettings().edit().putBoolean("storyhint", false).commit();
                return;
            default:
                this.f38804b.X4();
                return;
        }
    }
}
