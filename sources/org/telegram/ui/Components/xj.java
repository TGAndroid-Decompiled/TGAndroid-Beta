package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
public final class xj implements Runnable {
    public final int f32934a;
    public final yj f32935b;
    public final String f32936c;
    public final int d;

    public xj(yj yjVar, String str, int i10, int i11) {
        this.f32934a = i11;
        this.f32935b = yjVar;
        this.f32936c = str;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f32934a) {
            case 0:
                yj yjVar = this.f32935b;
                String str = this.f32936c;
                int i10 = this.d;
                yjVar.getClass();
                AndroidUtilities.runOnUIThread(new xj(yjVar, str, i10, 1));
                return;
            default:
                yj yjVar2 = this.f32935b;
                String str2 = this.f32936c;
                int i11 = this.d;
                yjVar2.getClass();
                int i12 = UserConfig.selectedAccount;
                Utilities.searchQueue.postRunnable(new ii.i0(yjVar2, str2, new ArrayList(ContactsController.getInstance(i12).contactsBook.values()), new ArrayList(ContactsController.getInstance(i12).contacts), i12, i11));
                return;
        }
    }
}
