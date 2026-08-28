package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
public final class jj implements Runnable {
    public final int f29748a;
    public final lj f29749b;
    public final String f29750c;
    public final int d;

    public jj(lj ljVar, String str, int i9, int i10) {
        this.f29748a = i10;
        this.f29749b = ljVar;
        this.f29750c = str;
        this.d = i9;
    }

    @Override
    public final void run() {
        switch (this.f29748a) {
            case 0:
                lj ljVar = this.f29749b;
                String str = this.f29750c;
                int i9 = this.d;
                ljVar.getClass();
                AndroidUtilities.runOnUIThread(new jj(ljVar, str, i9, 1));
                return;
            default:
                lj ljVar2 = this.f29749b;
                String str2 = this.f29750c;
                int i10 = this.d;
                ljVar2.getClass();
                int i11 = UserConfig.selectedAccount;
                Utilities.searchQueue.postRunnable(new kj(ljVar2, str2, new ArrayList(ContactsController.getInstance(i11).contactsBook.values()), new ArrayList(ContactsController.getInstance(i11).contacts), i11, i10));
                return;
        }
    }
}
