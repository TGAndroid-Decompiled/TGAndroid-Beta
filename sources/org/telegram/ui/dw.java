package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
public final class dw implements MessagesStorage.IntCallback {
    public final int f35395a;
    public final yy f35396b;

    public dw(yy yyVar, int i10) {
        this.f35395a = i10;
        this.f35396b = yyVar;
    }

    @Override
    public final void run(int i10) {
        boolean z10;
        boolean z11;
        switch (this.f35395a) {
            case 0:
                yy yyVar = this.f35396b;
                yyVar.getClass();
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                yyVar.U1 = z10;
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts", yyVar.U1).apply();
                yyVar.h3(false);
                return;
            default:
                yy yyVar2 = this.f35396b;
                yyVar2.getClass();
                if (i10 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                yyVar2.U1 = z11;
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts", yyVar2.U1).commit();
                yyVar2.h3(false);
                return;
        }
    }
}
