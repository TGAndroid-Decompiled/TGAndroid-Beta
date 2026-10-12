package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
public final class zj implements Runnable {
    public final int f33391a;
    public final ak f33392b;
    public final String f33393c;
    public final int d;

    public zj(ak akVar, String str, int i10, int i11) {
        this.f33391a = i11;
        this.f33392b = akVar;
        this.f33393c = str;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f33391a) {
            case 0:
                ak akVar = this.f33392b;
                String str = this.f33393c;
                int i10 = this.d;
                akVar.getClass();
                AndroidUtilities.runOnUIThread(new zj(akVar, str, i10, 1));
                return;
            default:
                ak akVar2 = this.f33392b;
                String str2 = this.f33393c;
                int i11 = this.d;
                akVar2.getClass();
                int i12 = UserConfig.selectedAccount;
                Utilities.searchQueue.postRunnable(new ii.i0(akVar2, str2, new ArrayList(ContactsController.getInstance(i12).contactsBook.values()), new ArrayList(ContactsController.getInstance(i12).contacts), i12, i11));
                return;
        }
    }
}
