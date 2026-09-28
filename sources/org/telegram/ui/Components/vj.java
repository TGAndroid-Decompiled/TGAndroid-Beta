package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
public final class vj implements Runnable {
    public final int f29144a;
    public final wj f29145b;
    public final String f29146c;
    public final int d;

    public vj(wj wjVar, String str, int i10, int i11) {
        this.f29144a = i11;
        this.f29145b = wjVar;
        this.f29146c = str;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f29144a) {
            case 0:
                wj wjVar = this.f29145b;
                String str = this.f29146c;
                int i10 = this.d;
                wjVar.getClass();
                AndroidUtilities.runOnUIThread(new vj(wjVar, str, i10, 1));
                return;
            default:
                wj wjVar2 = this.f29145b;
                String str2 = this.f29146c;
                int i11 = this.d;
                wjVar2.getClass();
                int i12 = UserConfig.selectedAccount;
                Utilities.searchQueue.postRunnable(new ii.i0(wjVar2, str2, new ArrayList(ContactsController.getInstance(i12).contactsBook.values()), new ArrayList(ContactsController.getInstance(i12).contacts), i12, i11));
                return;
        }
    }
}
