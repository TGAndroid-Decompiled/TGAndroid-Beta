package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
public final class uj implements Runnable {
    public final int f28786a;
    public final vj f28787b;
    public final String f28788c;
    public final int d;

    public uj(vj vjVar, String str, int i10, int i11) {
        this.f28786a = i11;
        this.f28787b = vjVar;
        this.f28788c = str;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f28786a) {
            case 0:
                vj vjVar = this.f28787b;
                String str = this.f28788c;
                int i10 = this.d;
                vjVar.getClass();
                AndroidUtilities.runOnUIThread(new uj(vjVar, str, i10, 1));
                return;
            default:
                vj vjVar2 = this.f28787b;
                String str2 = this.f28788c;
                int i11 = this.d;
                vjVar2.getClass();
                int i12 = UserConfig.selectedAccount;
                Utilities.searchQueue.postRunnable(new ii.i0(vjVar2, str2, new ArrayList(ContactsController.getInstance(i12).contactsBook.values()), new ArrayList(ContactsController.getInstance(i12).contacts), i12, i11));
                return;
        }
    }
}
