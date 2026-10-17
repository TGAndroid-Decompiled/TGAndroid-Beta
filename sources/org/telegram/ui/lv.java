package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
public final class lv implements MessagesStorage.IntCallback {
    public final int f38953a;
    public final ey f38954b;

    public lv(ey eyVar, int i10) {
        this.f38953a = i10;
        this.f38954b = eyVar;
    }

    @Override
    public final void run(int i10) {
        boolean z10;
        boolean z11;
        switch (this.f38953a) {
            case 0:
                ey eyVar = this.f38954b;
                eyVar.getClass();
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                eyVar.U1 = z10;
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts", eyVar.U1).apply();
                eyVar.h3(false);
                return;
            default:
                ey eyVar2 = this.f38954b;
                eyVar2.getClass();
                if (i10 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                eyVar2.U1 = z11;
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts", eyVar2.U1).commit();
                eyVar2.h3(false);
                return;
        }
    }
}
