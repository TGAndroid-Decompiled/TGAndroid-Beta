package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
public final class mv implements MessagesStorage.IntCallback {
    public final int f39708a;
    public final ey f39709b;

    public mv(ey eyVar, int i10) {
        this.f39708a = i10;
        this.f39709b = eyVar;
    }

    @Override
    public final void run(int i10) {
        boolean z10;
        boolean z11;
        switch (this.f39708a) {
            case 0:
                ey eyVar = this.f39709b;
                eyVar.getClass();
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                eyVar.U1 = z10;
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts", eyVar.U1).apply();
                eyVar.g3(false);
                return;
            default:
                ey eyVar2 = this.f39709b;
                eyVar2.getClass();
                if (i10 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                eyVar2.U1 = z11;
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts", eyVar2.U1).commit();
                eyVar2.g3(false);
                return;
        }
    }
}
