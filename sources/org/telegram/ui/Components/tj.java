package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
public final class tj implements Runnable {
    public final int f30611a;
    public final uj f30612b;
    public final String f30613c;
    public final int d;

    public tj(uj ujVar, String str, int i10, int i11) {
        this.f30611a = i11;
        this.f30612b = ujVar;
        this.f30613c = str;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f30611a) {
            case 0:
                uj ujVar = this.f30612b;
                String str = this.f30613c;
                int i10 = this.d;
                ujVar.getClass();
                AndroidUtilities.runOnUIThread(new tj(ujVar, str, i10, 1));
                return;
            default:
                uj ujVar2 = this.f30612b;
                String str2 = this.f30613c;
                int i11 = this.d;
                ujVar2.getClass();
                int i12 = UserConfig.selectedAccount;
                Utilities.searchQueue.postRunnable(new ji.h0(ujVar2, str2, new ArrayList(ContactsController.getInstance(i12).contactsBook.values()), new ArrayList(ContactsController.getInstance(i12).contacts), i12, i11));
                return;
        }
    }
}
