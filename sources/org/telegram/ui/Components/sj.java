package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
public final class sj implements Runnable {
    public final int f30303a;
    public final tj f30304b;
    public final String f30305c;
    public final int d;

    public sj(tj tjVar, String str, int i10, int i11) {
        this.f30303a = i11;
        this.f30304b = tjVar;
        this.f30305c = str;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f30303a) {
            case 0:
                tj tjVar = this.f30304b;
                String str = this.f30305c;
                int i10 = this.d;
                tjVar.getClass();
                AndroidUtilities.runOnUIThread(new sj(tjVar, str, i10, 1));
                return;
            default:
                tj tjVar2 = this.f30304b;
                String str2 = this.f30305c;
                int i11 = this.d;
                tjVar2.getClass();
                int i12 = UserConfig.selectedAccount;
                Utilities.searchQueue.postRunnable(new ki.h0(tjVar2, str2, new ArrayList(ContactsController.getInstance(i12).contactsBook.values()), new ArrayList(ContactsController.getInstance(i12).contacts), i12, i11));
                return;
        }
    }
}
