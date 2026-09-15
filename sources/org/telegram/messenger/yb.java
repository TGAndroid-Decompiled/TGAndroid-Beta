package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.NotificationsSettingsActivity;
public final class yb implements Runnable {
    public final int f17965a;
    public final NotificationCenter.NotificationCenterDelegate f17966b;
    public final Cloneable f17967c;
    public final Cloneable d;
    public final Cloneable e;
    public final Cloneable f17968f;
    public final Cloneable h;
    public final Cloneable f17969n;
    public final Cloneable f17970r;
    public final Object f17971s;
    public final Cloneable v;

    public yb(MessagesController messagesController, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray, a0.i iVar, a0.i iVar2, a0.i iVar3, a0.i iVar4, a0.i iVar5, LongSparseIntArray longSparseIntArray3, int i10) {
        this.f17965a = i10;
        this.f17966b = messagesController;
        this.f17967c = longSparseIntArray;
        this.d = longSparseIntArray2;
        this.e = sparseIntArray;
        this.f17968f = iVar;
        this.h = iVar2;
        this.f17969n = iVar3;
        this.f17970r = iVar4;
        this.f17971s = iVar5;
        this.v = longSparseIntArray3;
    }

    @Override
    public final void run() {
        switch (this.f17965a) {
            case 0:
                ((MessagesController) this.f17966b).lambda$processUpdateArray$416((LongSparseIntArray) this.f17967c, (LongSparseIntArray) this.d, (SparseIntArray) this.e, (a0.i) this.f17968f, (a0.i) this.h, (a0.i) this.f17969n, (a0.i) this.f17970r, (a0.i) this.f17971s, (LongSparseIntArray) this.v);
                return;
            case 1:
                ((MessagesController) this.f17966b).lambda$processUpdateArray$417((LongSparseIntArray) this.f17967c, (LongSparseIntArray) this.d, (SparseIntArray) this.e, (a0.i) this.f17968f, (a0.i) this.h, (a0.i) this.f17969n, (a0.i) this.f17970r, (a0.i) this.f17971s, (LongSparseIntArray) this.v);
                return;
            default:
                NotificationsSettingsActivity.X((NotificationsSettingsActivity) this.f17966b, (ArrayList) this.f17967c, (ArrayList) this.d, (ArrayList) this.v, (ArrayList) this.e, (ArrayList) this.f17968f, (ArrayList) this.h, (ArrayList) this.f17969n, (ArrayList) this.f17970r, (Runnable) this.f17971s);
                return;
        }
    }

    public yb(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        this.f17965a = 2;
        this.f17966b = notificationsSettingsActivity;
        this.f17967c = arrayList;
        this.d = arrayList2;
        this.v = arrayList3;
        this.e = arrayList4;
        this.f17968f = arrayList5;
        this.h = arrayList6;
        this.f17969n = arrayList7;
        this.f17970r = arrayList8;
        this.f17971s = runnable;
    }
}
