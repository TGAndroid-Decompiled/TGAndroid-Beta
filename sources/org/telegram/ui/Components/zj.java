package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
public final class zj implements Runnable {
    public final int f33389a;
    public final ak f33390b;
    public final String f33391c;
    public final int d;

    public zj(ak akVar, String str, int i10, int i11) {
        this.f33389a = i11;
        this.f33390b = akVar;
        this.f33391c = str;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f33389a) {
            case 0:
                ak akVar = this.f33390b;
                String str = this.f33391c;
                int i10 = this.d;
                akVar.getClass();
                AndroidUtilities.runOnUIThread(new zj(akVar, str, i10, 1));
                return;
            default:
                ak akVar2 = this.f33390b;
                String str2 = this.f33391c;
                int i11 = this.d;
                akVar2.getClass();
                int i12 = UserConfig.selectedAccount;
                Utilities.searchQueue.postRunnable(new ii.i0(akVar2, str2, new ArrayList(ContactsController.getInstance(i12).contactsBook.values()), new ArrayList(ContactsController.getInstance(i12).contacts), i12, i11));
                return;
        }
    }
}
