package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.NotificationsSettingsActivity;
public final class yb implements Runnable {
    public final int f19899a;
    public final NotificationCenter.NotificationCenterDelegate f19900b;
    public final Cloneable f19901c;
    public final Cloneable d;
    public final Cloneable f19902e;
    public final Cloneable f19903f;
    public final Cloneable h;
    public final Cloneable f19904n;
    public final Cloneable f19905r;
    public final Object f19906s;
    public final Cloneable v;

    public yb(MessagesController messagesController, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray, a0.i iVar, a0.i iVar2, a0.i iVar3, a0.i iVar4, a0.i iVar5, LongSparseIntArray longSparseIntArray3, int i10) {
        this.f19899a = i10;
        this.f19900b = messagesController;
        this.f19901c = longSparseIntArray;
        this.d = longSparseIntArray2;
        this.f19902e = sparseIntArray;
        this.f19903f = iVar;
        this.h = iVar2;
        this.f19904n = iVar3;
        this.f19905r = iVar4;
        this.f19906s = iVar5;
        this.v = longSparseIntArray3;
    }

    @Override
    public final void run() {
        switch (this.f19899a) {
            case 0:
                ((MessagesController) this.f19900b).lambda$processUpdateArray$416((LongSparseIntArray) this.f19901c, (LongSparseIntArray) this.d, (SparseIntArray) this.f19902e, (a0.i) this.f19903f, (a0.i) this.h, (a0.i) this.f19904n, (a0.i) this.f19905r, (a0.i) this.f19906s, (LongSparseIntArray) this.v);
                return;
            case 1:
                ((MessagesController) this.f19900b).lambda$processUpdateArray$417((LongSparseIntArray) this.f19901c, (LongSparseIntArray) this.d, (SparseIntArray) this.f19902e, (a0.i) this.f19903f, (a0.i) this.h, (a0.i) this.f19904n, (a0.i) this.f19905r, (a0.i) this.f19906s, (LongSparseIntArray) this.v);
                return;
            default:
                NotificationsSettingsActivity.S((NotificationsSettingsActivity) this.f19900b, (ArrayList) this.f19901c, (ArrayList) this.d, (ArrayList) this.v, (ArrayList) this.f19902e, (ArrayList) this.f19903f, (ArrayList) this.h, (ArrayList) this.f19904n, (ArrayList) this.f19905r, (Runnable) this.f19906s);
                return;
        }
    }

    public yb(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        this.f19899a = 2;
        this.f19900b = notificationsSettingsActivity;
        this.f19901c = arrayList;
        this.d = arrayList2;
        this.v = arrayList3;
        this.f19902e = arrayList4;
        this.f19903f = arrayList5;
        this.h = arrayList6;
        this.f19904n = arrayList7;
        this.f19905r = arrayList8;
        this.f19906s = runnable;
    }
}
