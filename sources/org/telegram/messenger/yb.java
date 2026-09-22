package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.NotificationsSettingsActivity;
public final class yb implements Runnable {
    public final int f17961a;
    public final NotificationCenter.NotificationCenterDelegate f17962b;
    public final Cloneable f17963c;
    public final Cloneable d;
    public final Cloneable e;
    public final Cloneable f17964f;
    public final Cloneable h;
    public final Cloneable f17965n;
    public final Cloneable f17966r;
    public final Object f17967s;
    public final Cloneable v;

    public yb(MessagesController messagesController, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray, a0.i iVar, a0.i iVar2, a0.i iVar3, a0.i iVar4, a0.i iVar5, LongSparseIntArray longSparseIntArray3, int i10) {
        this.f17961a = i10;
        this.f17962b = messagesController;
        this.f17963c = longSparseIntArray;
        this.d = longSparseIntArray2;
        this.e = sparseIntArray;
        this.f17964f = iVar;
        this.h = iVar2;
        this.f17965n = iVar3;
        this.f17966r = iVar4;
        this.f17967s = iVar5;
        this.v = longSparseIntArray3;
    }

    @Override
    public final void run() {
        switch (this.f17961a) {
            case 0:
                ((MessagesController) this.f17962b).lambda$processUpdateArray$416((LongSparseIntArray) this.f17963c, (LongSparseIntArray) this.d, (SparseIntArray) this.e, (a0.i) this.f17964f, (a0.i) this.h, (a0.i) this.f17965n, (a0.i) this.f17966r, (a0.i) this.f17967s, (LongSparseIntArray) this.v);
                return;
            case 1:
                ((MessagesController) this.f17962b).lambda$processUpdateArray$417((LongSparseIntArray) this.f17963c, (LongSparseIntArray) this.d, (SparseIntArray) this.e, (a0.i) this.f17964f, (a0.i) this.h, (a0.i) this.f17965n, (a0.i) this.f17966r, (a0.i) this.f17967s, (LongSparseIntArray) this.v);
                return;
            default:
                NotificationsSettingsActivity.U((NotificationsSettingsActivity) this.f17962b, (ArrayList) this.f17963c, (ArrayList) this.d, (ArrayList) this.v, (ArrayList) this.e, (ArrayList) this.f17964f, (ArrayList) this.h, (ArrayList) this.f17965n, (ArrayList) this.f17966r, (Runnable) this.f17967s);
                return;
        }
    }

    public yb(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        this.f17961a = 2;
        this.f17962b = notificationsSettingsActivity;
        this.f17963c = arrayList;
        this.d = arrayList2;
        this.v = arrayList3;
        this.e = arrayList4;
        this.f17964f = arrayList5;
        this.h = arrayList6;
        this.f17965n = arrayList7;
        this.f17966r = arrayList8;
        this.f17967s = runnable;
    }
}
