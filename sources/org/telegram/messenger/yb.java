package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.NotificationsSettingsActivity;
public final class yb implements Runnable {
    public final int f19900a;
    public final NotificationCenter.NotificationCenterDelegate f19901b;
    public final Cloneable f19902c;
    public final Cloneable d;
    public final Cloneable f19903e;
    public final Cloneable f19904f;
    public final Cloneable h;
    public final Cloneable f19905n;
    public final Cloneable f19906r;
    public final Object f19907s;
    public final Cloneable v;

    public yb(MessagesController messagesController, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray, a0.i iVar, a0.i iVar2, a0.i iVar3, a0.i iVar4, a0.i iVar5, LongSparseIntArray longSparseIntArray3, int i10) {
        this.f19900a = i10;
        this.f19901b = messagesController;
        this.f19902c = longSparseIntArray;
        this.d = longSparseIntArray2;
        this.f19903e = sparseIntArray;
        this.f19904f = iVar;
        this.h = iVar2;
        this.f19905n = iVar3;
        this.f19906r = iVar4;
        this.f19907s = iVar5;
        this.v = longSparseIntArray3;
    }

    @Override
    public final void run() {
        switch (this.f19900a) {
            case 0:
                ((MessagesController) this.f19901b).lambda$processUpdateArray$416((LongSparseIntArray) this.f19902c, (LongSparseIntArray) this.d, (SparseIntArray) this.f19903e, (a0.i) this.f19904f, (a0.i) this.h, (a0.i) this.f19905n, (a0.i) this.f19906r, (a0.i) this.f19907s, (LongSparseIntArray) this.v);
                return;
            case 1:
                ((MessagesController) this.f19901b).lambda$processUpdateArray$417((LongSparseIntArray) this.f19902c, (LongSparseIntArray) this.d, (SparseIntArray) this.f19903e, (a0.i) this.f19904f, (a0.i) this.h, (a0.i) this.f19905n, (a0.i) this.f19906r, (a0.i) this.f19907s, (LongSparseIntArray) this.v);
                return;
            default:
                NotificationsSettingsActivity.S((NotificationsSettingsActivity) this.f19901b, (ArrayList) this.f19902c, (ArrayList) this.d, (ArrayList) this.v, (ArrayList) this.f19903e, (ArrayList) this.f19904f, (ArrayList) this.h, (ArrayList) this.f19905n, (ArrayList) this.f19906r, (Runnable) this.f19907s);
                return;
        }
    }

    public yb(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        this.f19900a = 2;
        this.f19901b = notificationsSettingsActivity;
        this.f19902c = arrayList;
        this.d = arrayList2;
        this.v = arrayList3;
        this.f19903e = arrayList4;
        this.f19904f = arrayList5;
        this.h = arrayList6;
        this.f19905n = arrayList7;
        this.f19906r = arrayList8;
        this.f19907s = runnable;
    }
}
