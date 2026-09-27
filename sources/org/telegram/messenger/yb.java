package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.NotificationsSettingsActivity;
public final class yb implements Runnable {
    public final int f18205a;
    public final NotificationCenter.NotificationCenterDelegate f18206b;
    public final Cloneable f18207c;
    public final Cloneable d;
    public final Cloneable e;
    public final Cloneable f18208f;
    public final Cloneable h;
    public final Cloneable f18209n;
    public final Cloneable f18210r;
    public final Object f18211s;
    public final Cloneable v;

    public yb(MessagesController messagesController, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray, a0.i iVar, a0.i iVar2, a0.i iVar3, a0.i iVar4, a0.i iVar5, LongSparseIntArray longSparseIntArray3, int i10) {
        this.f18205a = i10;
        this.f18206b = messagesController;
        this.f18207c = longSparseIntArray;
        this.d = longSparseIntArray2;
        this.e = sparseIntArray;
        this.f18208f = iVar;
        this.h = iVar2;
        this.f18209n = iVar3;
        this.f18210r = iVar4;
        this.f18211s = iVar5;
        this.v = longSparseIntArray3;
    }

    @Override
    public final void run() {
        switch (this.f18205a) {
            case 0:
                ((MessagesController) this.f18206b).lambda$processUpdateArray$416((LongSparseIntArray) this.f18207c, (LongSparseIntArray) this.d, (SparseIntArray) this.e, (a0.i) this.f18208f, (a0.i) this.h, (a0.i) this.f18209n, (a0.i) this.f18210r, (a0.i) this.f18211s, (LongSparseIntArray) this.v);
                return;
            case 1:
                ((MessagesController) this.f18206b).lambda$processUpdateArray$417((LongSparseIntArray) this.f18207c, (LongSparseIntArray) this.d, (SparseIntArray) this.e, (a0.i) this.f18208f, (a0.i) this.h, (a0.i) this.f18209n, (a0.i) this.f18210r, (a0.i) this.f18211s, (LongSparseIntArray) this.v);
                return;
            default:
                NotificationsSettingsActivity.U((NotificationsSettingsActivity) this.f18206b, (ArrayList) this.f18207c, (ArrayList) this.d, (ArrayList) this.v, (ArrayList) this.e, (ArrayList) this.f18208f, (ArrayList) this.h, (ArrayList) this.f18209n, (ArrayList) this.f18210r, (Runnable) this.f18211s);
                return;
        }
    }

    public yb(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        this.f18205a = 2;
        this.f18206b = notificationsSettingsActivity;
        this.f18207c = arrayList;
        this.d = arrayList2;
        this.v = arrayList3;
        this.e = arrayList4;
        this.f18208f = arrayList5;
        this.h = arrayList6;
        this.f18209n = arrayList7;
        this.f18210r = arrayList8;
        this.f18211s = runnable;
    }
}
