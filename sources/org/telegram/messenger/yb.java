package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.NotificationsSettingsActivity;
public final class yb implements Runnable {
    public final int f18229a;
    public final NotificationCenter.NotificationCenterDelegate f18230b;
    public final Cloneable f18231c;
    public final Cloneable d;
    public final Cloneable e;
    public final Cloneable f18232f;
    public final Cloneable h;
    public final Cloneable f18233n;
    public final Cloneable f18234r;
    public final Object f18235s;
    public final Cloneable v;

    public yb(MessagesController messagesController, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray, a0.i iVar, a0.i iVar2, a0.i iVar3, a0.i iVar4, a0.i iVar5, LongSparseIntArray longSparseIntArray3, int i10) {
        this.f18229a = i10;
        this.f18230b = messagesController;
        this.f18231c = longSparseIntArray;
        this.d = longSparseIntArray2;
        this.e = sparseIntArray;
        this.f18232f = iVar;
        this.h = iVar2;
        this.f18233n = iVar3;
        this.f18234r = iVar4;
        this.f18235s = iVar5;
        this.v = longSparseIntArray3;
    }

    @Override
    public final void run() {
        switch (this.f18229a) {
            case 0:
                ((MessagesController) this.f18230b).lambda$processUpdateArray$416((LongSparseIntArray) this.f18231c, (LongSparseIntArray) this.d, (SparseIntArray) this.e, (a0.i) this.f18232f, (a0.i) this.h, (a0.i) this.f18233n, (a0.i) this.f18234r, (a0.i) this.f18235s, (LongSparseIntArray) this.v);
                return;
            case 1:
                ((MessagesController) this.f18230b).lambda$processUpdateArray$417((LongSparseIntArray) this.f18231c, (LongSparseIntArray) this.d, (SparseIntArray) this.e, (a0.i) this.f18232f, (a0.i) this.h, (a0.i) this.f18233n, (a0.i) this.f18234r, (a0.i) this.f18235s, (LongSparseIntArray) this.v);
                return;
            default:
                NotificationsSettingsActivity.U((NotificationsSettingsActivity) this.f18230b, (ArrayList) this.f18231c, (ArrayList) this.d, (ArrayList) this.v, (ArrayList) this.e, (ArrayList) this.f18232f, (ArrayList) this.h, (ArrayList) this.f18233n, (ArrayList) this.f18234r, (Runnable) this.f18235s);
                return;
        }
    }

    public yb(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        this.f18229a = 2;
        this.f18230b = notificationsSettingsActivity;
        this.f18231c = arrayList;
        this.d = arrayList2;
        this.v = arrayList3;
        this.e = arrayList4;
        this.f18232f = arrayList5;
        this.h = arrayList6;
        this.f18233n = arrayList7;
        this.f18234r = arrayList8;
        this.f18235s = runnable;
    }
}
