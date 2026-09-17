package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.NotificationsSettingsActivity;
public final class yb implements Runnable {
    public final int f17974a;
    public final NotificationCenter.NotificationCenterDelegate f17975b;
    public final Cloneable f17976c;
    public final Cloneable d;
    public final Cloneable e;
    public final Cloneable f17977f;
    public final Cloneable h;
    public final Cloneable f17978n;
    public final Cloneable f17979r;
    public final Object f17980s;
    public final Cloneable v;

    public yb(MessagesController messagesController, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray, a0.i iVar, a0.i iVar2, a0.i iVar3, a0.i iVar4, a0.i iVar5, LongSparseIntArray longSparseIntArray3, int i10) {
        this.f17974a = i10;
        this.f17975b = messagesController;
        this.f17976c = longSparseIntArray;
        this.d = longSparseIntArray2;
        this.e = sparseIntArray;
        this.f17977f = iVar;
        this.h = iVar2;
        this.f17978n = iVar3;
        this.f17979r = iVar4;
        this.f17980s = iVar5;
        this.v = longSparseIntArray3;
    }

    @Override
    public final void run() {
        switch (this.f17974a) {
            case 0:
                ((MessagesController) this.f17975b).lambda$processUpdateArray$416((LongSparseIntArray) this.f17976c, (LongSparseIntArray) this.d, (SparseIntArray) this.e, (a0.i) this.f17977f, (a0.i) this.h, (a0.i) this.f17978n, (a0.i) this.f17979r, (a0.i) this.f17980s, (LongSparseIntArray) this.v);
                return;
            case 1:
                ((MessagesController) this.f17975b).lambda$processUpdateArray$417((LongSparseIntArray) this.f17976c, (LongSparseIntArray) this.d, (SparseIntArray) this.e, (a0.i) this.f17977f, (a0.i) this.h, (a0.i) this.f17978n, (a0.i) this.f17979r, (a0.i) this.f17980s, (LongSparseIntArray) this.v);
                return;
            default:
                NotificationsSettingsActivity.U((NotificationsSettingsActivity) this.f17975b, (ArrayList) this.f17976c, (ArrayList) this.d, (ArrayList) this.v, (ArrayList) this.e, (ArrayList) this.f17977f, (ArrayList) this.h, (ArrayList) this.f17978n, (ArrayList) this.f17979r, (Runnable) this.f17980s);
                return;
        }
    }

    public yb(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        this.f17974a = 2;
        this.f17975b = notificationsSettingsActivity;
        this.f17976c = arrayList;
        this.d = arrayList2;
        this.v = arrayList3;
        this.e = arrayList4;
        this.f17977f = arrayList5;
        this.h = arrayList6;
        this.f17978n = arrayList7;
        this.f17979r = arrayList8;
        this.f17980s = runnable;
    }
}
