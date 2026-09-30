package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.NotificationsSettingsActivity;
public final class yb implements Runnable {
    public final int f18214a;
    public final NotificationCenter.NotificationCenterDelegate f18215b;
    public final Cloneable f18216c;
    public final Cloneable d;
    public final Cloneable e;
    public final Cloneable f18217f;
    public final Cloneable h;
    public final Cloneable f18218n;
    public final Cloneable f18219r;
    public final Object f18220s;
    public final Cloneable v;

    public yb(MessagesController messagesController, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray, a0.i iVar, a0.i iVar2, a0.i iVar3, a0.i iVar4, a0.i iVar5, LongSparseIntArray longSparseIntArray3, int i10) {
        this.f18214a = i10;
        this.f18215b = messagesController;
        this.f18216c = longSparseIntArray;
        this.d = longSparseIntArray2;
        this.e = sparseIntArray;
        this.f18217f = iVar;
        this.h = iVar2;
        this.f18218n = iVar3;
        this.f18219r = iVar4;
        this.f18220s = iVar5;
        this.v = longSparseIntArray3;
    }

    @Override
    public final void run() {
        switch (this.f18214a) {
            case 0:
                ((MessagesController) this.f18215b).lambda$processUpdateArray$416((LongSparseIntArray) this.f18216c, (LongSparseIntArray) this.d, (SparseIntArray) this.e, (a0.i) this.f18217f, (a0.i) this.h, (a0.i) this.f18218n, (a0.i) this.f18219r, (a0.i) this.f18220s, (LongSparseIntArray) this.v);
                return;
            case 1:
                ((MessagesController) this.f18215b).lambda$processUpdateArray$417((LongSparseIntArray) this.f18216c, (LongSparseIntArray) this.d, (SparseIntArray) this.e, (a0.i) this.f18217f, (a0.i) this.h, (a0.i) this.f18218n, (a0.i) this.f18219r, (a0.i) this.f18220s, (LongSparseIntArray) this.v);
                return;
            default:
                NotificationsSettingsActivity.U((NotificationsSettingsActivity) this.f18215b, (ArrayList) this.f18216c, (ArrayList) this.d, (ArrayList) this.v, (ArrayList) this.e, (ArrayList) this.f18217f, (ArrayList) this.h, (ArrayList) this.f18218n, (ArrayList) this.f18219r, (Runnable) this.f18220s);
                return;
        }
    }

    public yb(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        this.f18214a = 2;
        this.f18215b = notificationsSettingsActivity;
        this.f18216c = arrayList;
        this.d = arrayList2;
        this.v = arrayList3;
        this.e = arrayList4;
        this.f18217f = arrayList5;
        this.h = arrayList6;
        this.f18218n = arrayList7;
        this.f18219r = arrayList8;
        this.f18220s = runnable;
    }
}
