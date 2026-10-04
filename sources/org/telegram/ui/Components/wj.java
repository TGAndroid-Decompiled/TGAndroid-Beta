package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
public final class wj implements Runnable {
    public final int f32573a;
    public final xj f32574b;
    public final String f32575c;
    public final int d;

    public wj(xj xjVar, String str, int i10, int i11) {
        this.f32573a = i11;
        this.f32574b = xjVar;
        this.f32575c = str;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f32573a) {
            case 0:
                xj xjVar = this.f32574b;
                String str = this.f32575c;
                int i10 = this.d;
                xjVar.getClass();
                AndroidUtilities.runOnUIThread(new wj(xjVar, str, i10, 1));
                return;
            default:
                xj xjVar2 = this.f32574b;
                String str2 = this.f32575c;
                int i11 = this.d;
                xjVar2.getClass();
                int i12 = UserConfig.selectedAccount;
                Utilities.searchQueue.postRunnable(new ii.i0(xjVar2, str2, new ArrayList(ContactsController.getInstance(i12).contactsBook.values()), new ArrayList(ContactsController.getInstance(i12).contacts), i12, i11));
                return;
        }
    }
}
