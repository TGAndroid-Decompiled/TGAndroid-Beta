package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.NotificationsSettingsActivity;
public final class zb implements Runnable {
    public final int f22344a;
    public final NotificationCenter.NotificationCenterDelegate f22345b;
    public final Cloneable f22346c;
    public final Cloneable d;
    public final Cloneable f22347e;
    public final Cloneable f22348f;
    public final Cloneable h;
    public final Cloneable f22349n;
    public final Cloneable f22350r;
    public final Object f22351s;
    public final Cloneable v;

    public zb(MessagesController messagesController, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray, a0.h hVar, a0.h hVar2, a0.h hVar3, a0.h hVar4, a0.h hVar5, LongSparseIntArray longSparseIntArray3, int i10) {
        this.f22344a = i10;
        this.f22345b = messagesController;
        this.f22346c = longSparseIntArray;
        this.d = longSparseIntArray2;
        this.f22347e = sparseIntArray;
        this.f22348f = hVar;
        this.h = hVar2;
        this.f22349n = hVar3;
        this.f22350r = hVar4;
        this.f22351s = hVar5;
        this.v = longSparseIntArray3;
    }

    @Override
    public final void run() {
        switch (this.f22344a) {
            case 0:
                ((MessagesController) this.f22345b).lambda$processUpdateArray$416((LongSparseIntArray) this.f22346c, (LongSparseIntArray) this.d, (SparseIntArray) this.f22347e, (a0.h) this.f22348f, (a0.h) this.h, (a0.h) this.f22349n, (a0.h) this.f22350r, (a0.h) this.f22351s, (LongSparseIntArray) this.v);
                return;
            case 1:
                ((MessagesController) this.f22345b).lambda$processUpdateArray$417((LongSparseIntArray) this.f22346c, (LongSparseIntArray) this.d, (SparseIntArray) this.f22347e, (a0.h) this.f22348f, (a0.h) this.h, (a0.h) this.f22349n, (a0.h) this.f22350r, (a0.h) this.f22351s, (LongSparseIntArray) this.v);
                return;
            default:
                NotificationsSettingsActivity.U((NotificationsSettingsActivity) this.f22345b, (ArrayList) this.f22346c, (ArrayList) this.d, (ArrayList) this.v, (ArrayList) this.f22347e, (ArrayList) this.f22348f, (ArrayList) this.h, (ArrayList) this.f22349n, (ArrayList) this.f22350r, (Runnable) this.f22351s);
                return;
        }
    }

    public zb(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        this.f22344a = 2;
        this.f22345b = notificationsSettingsActivity;
        this.f22346c = arrayList;
        this.d = arrayList2;
        this.v = arrayList3;
        this.f22347e = arrayList4;
        this.f22348f = arrayList5;
        this.h = arrayList6;
        this.f22349n = arrayList7;
        this.f22350r = arrayList8;
        this.f22351s = runnable;
    }
}
