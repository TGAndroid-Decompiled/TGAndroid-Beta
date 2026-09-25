package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.NotificationsSettingsActivity;
public final class yb implements Runnable {
    public final int f18212a;
    public final NotificationCenter.NotificationCenterDelegate f18213b;
    public final Cloneable f18214c;
    public final Cloneable d;
    public final Cloneable e;
    public final Cloneable f18215f;
    public final Cloneable h;
    public final Cloneable f18216n;
    public final Cloneable f18217r;
    public final Object f18218s;
    public final Cloneable v;

    public yb(MessagesController messagesController, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray, a0.i iVar, a0.i iVar2, a0.i iVar3, a0.i iVar4, a0.i iVar5, LongSparseIntArray longSparseIntArray3, int i10) {
        this.f18212a = i10;
        this.f18213b = messagesController;
        this.f18214c = longSparseIntArray;
        this.d = longSparseIntArray2;
        this.e = sparseIntArray;
        this.f18215f = iVar;
        this.h = iVar2;
        this.f18216n = iVar3;
        this.f18217r = iVar4;
        this.f18218s = iVar5;
        this.v = longSparseIntArray3;
    }

    @Override
    public final void run() {
        switch (this.f18212a) {
            case 0:
                ((MessagesController) this.f18213b).lambda$processUpdateArray$416((LongSparseIntArray) this.f18214c, (LongSparseIntArray) this.d, (SparseIntArray) this.e, (a0.i) this.f18215f, (a0.i) this.h, (a0.i) this.f18216n, (a0.i) this.f18217r, (a0.i) this.f18218s, (LongSparseIntArray) this.v);
                return;
            case 1:
                ((MessagesController) this.f18213b).lambda$processUpdateArray$417((LongSparseIntArray) this.f18214c, (LongSparseIntArray) this.d, (SparseIntArray) this.e, (a0.i) this.f18215f, (a0.i) this.h, (a0.i) this.f18216n, (a0.i) this.f18217r, (a0.i) this.f18218s, (LongSparseIntArray) this.v);
                return;
            default:
                NotificationsSettingsActivity.U((NotificationsSettingsActivity) this.f18213b, (ArrayList) this.f18214c, (ArrayList) this.d, (ArrayList) this.v, (ArrayList) this.e, (ArrayList) this.f18215f, (ArrayList) this.h, (ArrayList) this.f18216n, (ArrayList) this.f18217r, (Runnable) this.f18218s);
                return;
        }
    }

    public yb(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        this.f18212a = 2;
        this.f18213b = notificationsSettingsActivity;
        this.f18214c = arrayList;
        this.d = arrayList2;
        this.v = arrayList3;
        this.e = arrayList4;
        this.f18215f = arrayList5;
        this.h = arrayList6;
        this.f18216n = arrayList7;
        this.f18217r = arrayList8;
        this.f18218s = runnable;
    }
}
