package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.NotificationsSettingsActivity;
public final class yb implements Runnable {
    public final int f19898a;
    public final NotificationCenter.NotificationCenterDelegate f19899b;
    public final Cloneable f19900c;
    public final Cloneable d;
    public final Cloneable f19901e;
    public final Cloneable f19902f;
    public final Cloneable h;
    public final Cloneable f19903n;
    public final Cloneable f19904r;
    public final Object f19905s;
    public final Cloneable v;

    public yb(MessagesController messagesController, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray, a0.i iVar, a0.i iVar2, a0.i iVar3, a0.i iVar4, a0.i iVar5, LongSparseIntArray longSparseIntArray3, int i10) {
        this.f19898a = i10;
        this.f19899b = messagesController;
        this.f19900c = longSparseIntArray;
        this.d = longSparseIntArray2;
        this.f19901e = sparseIntArray;
        this.f19902f = iVar;
        this.h = iVar2;
        this.f19903n = iVar3;
        this.f19904r = iVar4;
        this.f19905s = iVar5;
        this.v = longSparseIntArray3;
    }

    @Override
    public final void run() {
        switch (this.f19898a) {
            case 0:
                ((MessagesController) this.f19899b).lambda$processUpdateArray$416((LongSparseIntArray) this.f19900c, (LongSparseIntArray) this.d, (SparseIntArray) this.f19901e, (a0.i) this.f19902f, (a0.i) this.h, (a0.i) this.f19903n, (a0.i) this.f19904r, (a0.i) this.f19905s, (LongSparseIntArray) this.v);
                return;
            case 1:
                ((MessagesController) this.f19899b).lambda$processUpdateArray$417((LongSparseIntArray) this.f19900c, (LongSparseIntArray) this.d, (SparseIntArray) this.f19901e, (a0.i) this.f19902f, (a0.i) this.h, (a0.i) this.f19903n, (a0.i) this.f19904r, (a0.i) this.f19905s, (LongSparseIntArray) this.v);
                return;
            default:
                NotificationsSettingsActivity.S((NotificationsSettingsActivity) this.f19899b, (ArrayList) this.f19900c, (ArrayList) this.d, (ArrayList) this.v, (ArrayList) this.f19901e, (ArrayList) this.f19902f, (ArrayList) this.h, (ArrayList) this.f19903n, (ArrayList) this.f19904r, (Runnable) this.f19905s);
                return;
        }
    }

    public yb(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        this.f19898a = 2;
        this.f19899b = notificationsSettingsActivity;
        this.f19900c = arrayList;
        this.d = arrayList2;
        this.v = arrayList3;
        this.f19901e = arrayList4;
        this.f19902f = arrayList5;
        this.h = arrayList6;
        this.f19903n = arrayList7;
        this.f19904r = arrayList8;
        this.f19905s = runnable;
    }
}
