package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
public final class wj implements Runnable {
    public final int f32655a;
    public final xj f32656b;
    public final String f32657c;
    public final int d;

    public wj(xj xjVar, String str, int i10, int i11) {
        this.f32655a = i11;
        this.f32656b = xjVar;
        this.f32657c = str;
        this.d = i10;
    }

    @Override
    public final void run() {
        switch (this.f32655a) {
            case 0:
                xj xjVar = this.f32656b;
                String str = this.f32657c;
                int i10 = this.d;
                xjVar.getClass();
                AndroidUtilities.runOnUIThread(new wj(xjVar, str, i10, 1));
                return;
            default:
                xj xjVar2 = this.f32656b;
                String str2 = this.f32657c;
                int i11 = this.d;
                xjVar2.getClass();
                int i12 = UserConfig.selectedAccount;
                Utilities.searchQueue.postRunnable(new ii.i0(xjVar2, str2, new ArrayList(ContactsController.getInstance(i12).contactsBook.values()), new ArrayList(ContactsController.getInstance(i12).contacts), i12, i11));
                return;
        }
    }
}
