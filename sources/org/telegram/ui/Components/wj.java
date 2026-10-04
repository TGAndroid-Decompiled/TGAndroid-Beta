package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
public final class wj implements Runnable {
    public final int f32566a;
    public final xj f32567b;
    public final String f32568c;
    public final int d;

    public wj(xj xjVar, String str, int i10, int i11) {
        this.f32566a = i11;
        this.f32567b = xjVar;
        this.f32568c = str;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f32566a) {
            case 0:
                xj xjVar = this.f32567b;
                String str = this.f32568c;
                int i10 = this.d;
                xjVar.getClass();
                AndroidUtilities.runOnUIThread(new wj(xjVar, str, i10, 1));
                return;
            default:
                xj xjVar2 = this.f32567b;
                String str2 = this.f32568c;
                int i11 = this.d;
                xjVar2.getClass();
                int i12 = UserConfig.selectedAccount;
                Utilities.searchQueue.postRunnable(new ii.i0(xjVar2, str2, new ArrayList(ContactsController.getInstance(i12).contactsBook.values()), new ArrayList(ContactsController.getInstance(i12).contacts), i12, i11));
                return;
        }
    }
}
