package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
public final class mj implements Runnable {
    public final int f29120a;
    public final oj f29121b;
    public final String f29122c;
    public final int d;

    public mj(oj ojVar, String str, int i10, int i11) {
        this.f29120a = i11;
        this.f29121b = ojVar;
        this.f29122c = str;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f29120a) {
            case 0:
                oj ojVar = this.f29121b;
                String str = this.f29122c;
                int i10 = this.d;
                ojVar.getClass();
                AndroidUtilities.runOnUIThread(new mj(ojVar, str, i10, 1));
                return;
            default:
                oj ojVar2 = this.f29121b;
                String str2 = this.f29122c;
                int i11 = this.d;
                ojVar2.getClass();
                int i12 = UserConfig.selectedAccount;
                Utilities.searchQueue.postRunnable(new nj(ojVar2, str2, new ArrayList(ContactsController.getInstance(i12).contactsBook.values()), new ArrayList(ContactsController.getInstance(i12).contacts), i12, i11));
                return;
        }
    }
}
