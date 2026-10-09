package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
public final class xj implements Runnable {
    public final int f32885a;
    public final yj f32886b;
    public final String f32887c;
    public final int d;

    public xj(yj yjVar, String str, int i10, int i11) {
        this.f32885a = i11;
        this.f32886b = yjVar;
        this.f32887c = str;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f32885a) {
            case 0:
                yj yjVar = this.f32886b;
                String str = this.f32887c;
                int i10 = this.d;
                yjVar.getClass();
                AndroidUtilities.runOnUIThread(new xj(yjVar, str, i10, 1));
                return;
            default:
                yj yjVar2 = this.f32886b;
                String str2 = this.f32887c;
                int i11 = this.d;
                yjVar2.getClass();
                int i12 = UserConfig.selectedAccount;
                Utilities.searchQueue.postRunnable(new ii.i0(yjVar2, str2, new ArrayList(ContactsController.getInstance(i12).contactsBook.values()), new ArrayList(ContactsController.getInstance(i12).contacts), i12, i11));
                return;
        }
    }
}
