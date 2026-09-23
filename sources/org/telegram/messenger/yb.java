package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.NotificationsSettingsActivity;
public final class yb implements Runnable {
    public final int f17956a;
    public final NotificationCenter.NotificationCenterDelegate f17957b;
    public final Cloneable f17958c;
    public final Cloneable d;
    public final Cloneable e;
    public final Cloneable f17959f;
    public final Cloneable h;
    public final Cloneable f17960n;
    public final Cloneable f17961r;
    public final Object f17962s;
    public final Cloneable v;

    public yb(MessagesController messagesController, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray, a0.i iVar, a0.i iVar2, a0.i iVar3, a0.i iVar4, a0.i iVar5, LongSparseIntArray longSparseIntArray3, int i10) {
        this.f17956a = i10;
        this.f17957b = messagesController;
        this.f17958c = longSparseIntArray;
        this.d = longSparseIntArray2;
        this.e = sparseIntArray;
        this.f17959f = iVar;
        this.h = iVar2;
        this.f17960n = iVar3;
        this.f17961r = iVar4;
        this.f17962s = iVar5;
        this.v = longSparseIntArray3;
    }

    @Override
    public final void run() {
        switch (this.f17956a) {
            case 0:
                ((MessagesController) this.f17957b).lambda$processUpdateArray$416((LongSparseIntArray) this.f17958c, (LongSparseIntArray) this.d, (SparseIntArray) this.e, (a0.i) this.f17959f, (a0.i) this.h, (a0.i) this.f17960n, (a0.i) this.f17961r, (a0.i) this.f17962s, (LongSparseIntArray) this.v);
                return;
            case 1:
                ((MessagesController) this.f17957b).lambda$processUpdateArray$417((LongSparseIntArray) this.f17958c, (LongSparseIntArray) this.d, (SparseIntArray) this.e, (a0.i) this.f17959f, (a0.i) this.h, (a0.i) this.f17960n, (a0.i) this.f17961r, (a0.i) this.f17962s, (LongSparseIntArray) this.v);
                return;
            default:
                NotificationsSettingsActivity.U((NotificationsSettingsActivity) this.f17957b, (ArrayList) this.f17958c, (ArrayList) this.d, (ArrayList) this.v, (ArrayList) this.e, (ArrayList) this.f17959f, (ArrayList) this.h, (ArrayList) this.f17960n, (ArrayList) this.f17961r, (Runnable) this.f17962s);
                return;
        }
    }

    public yb(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        this.f17956a = 2;
        this.f17957b = notificationsSettingsActivity;
        this.f17958c = arrayList;
        this.d = arrayList2;
        this.v = arrayList3;
        this.e = arrayList4;
        this.f17959f = arrayList5;
        this.h = arrayList6;
        this.f17960n = arrayList7;
        this.f17961r = arrayList8;
        this.f17962s = runnable;
    }
}
