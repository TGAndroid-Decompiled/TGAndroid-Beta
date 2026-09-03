package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
public final class kj implements Runnable {
    public final int f26298a;
    public final mj f26299b;
    public final String f26300c;
    public final int d;

    public kj(mj mjVar, String str, int i10, int i11) {
        this.f26298a = i11;
        this.f26299b = mjVar;
        this.f26300c = str;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f26298a) {
            case 0:
                mj mjVar = this.f26299b;
                String str = this.f26300c;
                int i10 = this.d;
                mjVar.getClass();
                AndroidUtilities.runOnUIThread(new kj(mjVar, str, i10, 1));
                return;
            default:
                mj mjVar2 = this.f26299b;
                String str2 = this.f26300c;
                int i11 = this.d;
                mjVar2.getClass();
                int i12 = UserConfig.selectedAccount;
                Utilities.searchQueue.postRunnable(new lj(mjVar2, str2, new ArrayList(ContactsController.getInstance(i12).contactsBook.values()), new ArrayList(ContactsController.getInstance(i12).contacts), i12, i11));
                return;
        }
    }
}
