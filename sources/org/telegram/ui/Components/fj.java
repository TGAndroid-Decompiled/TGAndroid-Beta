package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;

public final class fj implements Runnable {

    public final int f28393a;

    public final hj f28394b;

    public final String f28395c;
    public final int d;

    public fj(hj hjVar, String str, int i10, int i11) {
        this.f28393a = i11;
        this.f28394b = hjVar;
        this.f28395c = str;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f28393a) {
            case 0:
                hj hjVar = this.f28394b;
                String str = this.f28395c;
                int i10 = this.d;
                hjVar.getClass();
                AndroidUtilities.runOnUIThread(new fj(hjVar, str, i10, 1));
                break;
            default:
                hj hjVar2 = this.f28394b;
                String str2 = this.f28395c;
                int i11 = this.d;
                hjVar2.getClass();
                int i12 = UserConfig.selectedAccount;
                Utilities.searchQueue.postRunnable(new gj(hjVar2, str2, new ArrayList(ContactsController.getInstance(i12).contactsBook.values()), new ArrayList(ContactsController.getInstance(i12).contacts), i12, i11));
                break;
        }
    }
}
