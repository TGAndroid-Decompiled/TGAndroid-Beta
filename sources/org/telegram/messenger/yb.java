package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.NotificationsSettingsActivity;
public final class yb implements Runnable {
    public final int f19905a;
    public final NotificationCenter.NotificationCenterDelegate f19906b;
    public final Cloneable f19907c;
    public final Cloneable d;
    public final Cloneable f19908e;
    public final Cloneable f19909f;
    public final Cloneable h;
    public final Cloneable f19910n;
    public final Cloneable f19911r;
    public final Object f19912s;
    public final Cloneable v;

    public yb(MessagesController messagesController, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray, a0.i iVar, a0.i iVar2, a0.i iVar3, a0.i iVar4, a0.i iVar5, LongSparseIntArray longSparseIntArray3, int i10) {
        this.f19905a = i10;
        this.f19906b = messagesController;
        this.f19907c = longSparseIntArray;
        this.d = longSparseIntArray2;
        this.f19908e = sparseIntArray;
        this.f19909f = iVar;
        this.h = iVar2;
        this.f19910n = iVar3;
        this.f19911r = iVar4;
        this.f19912s = iVar5;
        this.v = longSparseIntArray3;
    }

    @Override
    public final void run() {
        switch (this.f19905a) {
            case 0:
                ((MessagesController) this.f19906b).lambda$processUpdateArray$416((LongSparseIntArray) this.f19907c, (LongSparseIntArray) this.d, (SparseIntArray) this.f19908e, (a0.i) this.f19909f, (a0.i) this.h, (a0.i) this.f19910n, (a0.i) this.f19911r, (a0.i) this.f19912s, (LongSparseIntArray) this.v);
                return;
            case 1:
                ((MessagesController) this.f19906b).lambda$processUpdateArray$417((LongSparseIntArray) this.f19907c, (LongSparseIntArray) this.d, (SparseIntArray) this.f19908e, (a0.i) this.f19909f, (a0.i) this.h, (a0.i) this.f19910n, (a0.i) this.f19911r, (a0.i) this.f19912s, (LongSparseIntArray) this.v);
                return;
            default:
                NotificationsSettingsActivity.S((NotificationsSettingsActivity) this.f19906b, (ArrayList) this.f19907c, (ArrayList) this.d, (ArrayList) this.v, (ArrayList) this.f19908e, (ArrayList) this.f19909f, (ArrayList) this.h, (ArrayList) this.f19910n, (ArrayList) this.f19911r, (Runnable) this.f19912s);
                return;
        }
    }

    public yb(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        this.f19905a = 2;
        this.f19906b = notificationsSettingsActivity;
        this.f19907c = arrayList;
        this.d = arrayList2;
        this.v = arrayList3;
        this.f19908e = arrayList4;
        this.f19909f = arrayList5;
        this.h = arrayList6;
        this.f19910n = arrayList7;
        this.f19911r = arrayList8;
        this.f19912s = runnable;
    }
}
