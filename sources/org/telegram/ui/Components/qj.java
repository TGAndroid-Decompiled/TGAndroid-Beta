package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
public final class qj implements Runnable {
    public final int f29933a;
    public final rj f29934b;
    public final String f29935c;
    public final int d;

    public qj(rj rjVar, String str, int i10, int i11) {
        this.f29933a = i11;
        this.f29934b = rjVar;
        this.f29935c = str;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f29933a) {
            case 0:
                rj rjVar = this.f29934b;
                String str = this.f29935c;
                int i10 = this.d;
                rjVar.getClass();
                AndroidUtilities.runOnUIThread(new qj(rjVar, str, i10, 1));
                return;
            default:
                rj rjVar2 = this.f29934b;
                String str2 = this.f29935c;
                int i11 = this.d;
                rjVar2.getClass();
                int i12 = UserConfig.selectedAccount;
                Utilities.searchQueue.postRunnable(new ki.h0(rjVar2, str2, new ArrayList(ContactsController.getInstance(i12).contactsBook.values()), new ArrayList(ContactsController.getInstance(i12).contacts), i12, i11));
                return;
        }
    }
}
