package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.NotificationsSettingsActivity;
public final class yb implements Runnable {
    public final int f18197a;
    public final NotificationCenter.NotificationCenterDelegate f18198b;
    public final Cloneable f18199c;
    public final Cloneable d;
    public final Cloneable e;
    public final Cloneable f18200f;
    public final Cloneable h;
    public final Cloneable f18201n;
    public final Cloneable f18202r;
    public final Object f18203s;
    public final Cloneable v;

    public yb(MessagesController messagesController, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray, a0.i iVar, a0.i iVar2, a0.i iVar3, a0.i iVar4, a0.i iVar5, LongSparseIntArray longSparseIntArray3, int i10) {
        this.f18197a = i10;
        this.f18198b = messagesController;
        this.f18199c = longSparseIntArray;
        this.d = longSparseIntArray2;
        this.e = sparseIntArray;
        this.f18200f = iVar;
        this.h = iVar2;
        this.f18201n = iVar3;
        this.f18202r = iVar4;
        this.f18203s = iVar5;
        this.v = longSparseIntArray3;
    }

    @Override
    public final void run() {
        switch (this.f18197a) {
            case 0:
                ((MessagesController) this.f18198b).lambda$processUpdateArray$416((LongSparseIntArray) this.f18199c, (LongSparseIntArray) this.d, (SparseIntArray) this.e, (a0.i) this.f18200f, (a0.i) this.h, (a0.i) this.f18201n, (a0.i) this.f18202r, (a0.i) this.f18203s, (LongSparseIntArray) this.v);
                return;
            case 1:
                ((MessagesController) this.f18198b).lambda$processUpdateArray$417((LongSparseIntArray) this.f18199c, (LongSparseIntArray) this.d, (SparseIntArray) this.e, (a0.i) this.f18200f, (a0.i) this.h, (a0.i) this.f18201n, (a0.i) this.f18202r, (a0.i) this.f18203s, (LongSparseIntArray) this.v);
                return;
            default:
                NotificationsSettingsActivity.U((NotificationsSettingsActivity) this.f18198b, (ArrayList) this.f18199c, (ArrayList) this.d, (ArrayList) this.v, (ArrayList) this.e, (ArrayList) this.f18200f, (ArrayList) this.h, (ArrayList) this.f18201n, (ArrayList) this.f18202r, (Runnable) this.f18203s);
                return;
        }
    }

    public yb(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        this.f18197a = 2;
        this.f18198b = notificationsSettingsActivity;
        this.f18199c = arrayList;
        this.d = arrayList2;
        this.v = arrayList3;
        this.e = arrayList4;
        this.f18200f = arrayList5;
        this.h = arrayList6;
        this.f18201n = arrayList7;
        this.f18202r = arrayList8;
        this.f18203s = runnable;
    }
}
