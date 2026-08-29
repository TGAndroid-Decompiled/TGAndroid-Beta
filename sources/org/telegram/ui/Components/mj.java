package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
public final class mj implements Runnable {
    public final int f30713a;
    public final oj f30714b;
    public final String f30715c;
    public final int d;

    public mj(oj ojVar, String str, int i10, int i11) {
        this.f30713a = i11;
        this.f30714b = ojVar;
        this.f30715c = str;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f30713a) {
            case 0:
                oj ojVar = this.f30714b;
                String str = this.f30715c;
                int i10 = this.d;
                ojVar.getClass();
                AndroidUtilities.runOnUIThread(new mj(ojVar, str, i10, 1));
                return;
            default:
                oj ojVar2 = this.f30714b;
                String str2 = this.f30715c;
                int i11 = this.d;
                ojVar2.getClass();
                int i12 = UserConfig.selectedAccount;
                Utilities.searchQueue.postRunnable(new nj(ojVar2, str2, new ArrayList(ContactsController.getInstance(i12).contactsBook.values()), new ArrayList(ContactsController.getInstance(i12).contacts), i12, i11));
                return;
        }
    }
}
