package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
public final class yg implements Runnable {
    public final int f22255a;
    public final NotificationsController f22256b;
    public final LongSparseIntArray f22257c;
    public final ArrayList d;

    public yg(NotificationsController notificationsController, LongSparseIntArray longSparseIntArray, ArrayList arrayList, int i9) {
        this.f22255a = i9;
        this.f22256b = notificationsController;
        this.f22257c = longSparseIntArray;
        this.d = arrayList;
    }

    @Override
    public final void run() {
        switch (this.f22255a) {
            case 0:
                this.f22256b.lambda$processDialogsUpdateRead$30(this.f22257c, this.d);
                return;
            default:
                this.f22256b.lambda$removeDeletedHisoryFromNotifications$13(this.f22257c, this.d);
                return;
        }
    }
}
