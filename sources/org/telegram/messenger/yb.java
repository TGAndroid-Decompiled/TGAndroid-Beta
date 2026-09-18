package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.NotificationsSettingsActivity;
public final class yb implements Runnable {
    public final int f18142a;
    public final NotificationCenter.NotificationCenterDelegate f18143b;
    public final Cloneable f18144c;
    public final Cloneable d;
    public final Cloneable e;
    public final Cloneable f18145f;
    public final Cloneable h;
    public final Cloneable f18146n;
    public final Cloneable f18147r;
    public final Object f18148s;
    public final Cloneable v;

    public yb(MessagesController messagesController, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray, a0.i iVar, a0.i iVar2, a0.i iVar3, a0.i iVar4, a0.i iVar5, LongSparseIntArray longSparseIntArray3, int i10) {
        this.f18142a = i10;
        this.f18143b = messagesController;
        this.f18144c = longSparseIntArray;
        this.d = longSparseIntArray2;
        this.e = sparseIntArray;
        this.f18145f = iVar;
        this.h = iVar2;
        this.f18146n = iVar3;
        this.f18147r = iVar4;
        this.f18148s = iVar5;
        this.v = longSparseIntArray3;
    }

    @Override
    public final void run() {
        switch (this.f18142a) {
            case 0:
                ((MessagesController) this.f18143b).lambda$processUpdateArray$416((LongSparseIntArray) this.f18144c, (LongSparseIntArray) this.d, (SparseIntArray) this.e, (a0.i) this.f18145f, (a0.i) this.h, (a0.i) this.f18146n, (a0.i) this.f18147r, (a0.i) this.f18148s, (LongSparseIntArray) this.v);
                return;
            case 1:
                ((MessagesController) this.f18143b).lambda$processUpdateArray$417((LongSparseIntArray) this.f18144c, (LongSparseIntArray) this.d, (SparseIntArray) this.e, (a0.i) this.f18145f, (a0.i) this.h, (a0.i) this.f18146n, (a0.i) this.f18147r, (a0.i) this.f18148s, (LongSparseIntArray) this.v);
                return;
            default:
                NotificationsSettingsActivity.U((NotificationsSettingsActivity) this.f18143b, (ArrayList) this.f18144c, (ArrayList) this.d, (ArrayList) this.v, (ArrayList) this.e, (ArrayList) this.f18145f, (ArrayList) this.h, (ArrayList) this.f18146n, (ArrayList) this.f18147r, (Runnable) this.f18148s);
                return;
        }
    }

    public yb(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        this.f18142a = 2;
        this.f18143b = notificationsSettingsActivity;
        this.f18144c = arrayList;
        this.d = arrayList2;
        this.v = arrayList3;
        this.e = arrayList4;
        this.f18145f = arrayList5;
        this.h = arrayList6;
        this.f18146n = arrayList7;
        this.f18147r = arrayList8;
        this.f18148s = runnable;
    }
}
