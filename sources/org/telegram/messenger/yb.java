package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.NotificationsSettingsActivity;
public final class yb implements Runnable {
    public final int f18211a;
    public final NotificationCenter.NotificationCenterDelegate f18212b;
    public final Cloneable f18213c;
    public final Cloneable d;
    public final Cloneable e;
    public final Cloneable f18214f;
    public final Cloneable h;
    public final Cloneable f18215n;
    public final Cloneable f18216r;
    public final Object f18217s;
    public final Cloneable v;

    public yb(MessagesController messagesController, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray, a0.i iVar, a0.i iVar2, a0.i iVar3, a0.i iVar4, a0.i iVar5, LongSparseIntArray longSparseIntArray3, int i10) {
        this.f18211a = i10;
        this.f18212b = messagesController;
        this.f18213c = longSparseIntArray;
        this.d = longSparseIntArray2;
        this.e = sparseIntArray;
        this.f18214f = iVar;
        this.h = iVar2;
        this.f18215n = iVar3;
        this.f18216r = iVar4;
        this.f18217s = iVar5;
        this.v = longSparseIntArray3;
    }

    @Override
    public final void run() {
        switch (this.f18211a) {
            case 0:
                ((MessagesController) this.f18212b).lambda$processUpdateArray$416((LongSparseIntArray) this.f18213c, (LongSparseIntArray) this.d, (SparseIntArray) this.e, (a0.i) this.f18214f, (a0.i) this.h, (a0.i) this.f18215n, (a0.i) this.f18216r, (a0.i) this.f18217s, (LongSparseIntArray) this.v);
                return;
            case 1:
                ((MessagesController) this.f18212b).lambda$processUpdateArray$417((LongSparseIntArray) this.f18213c, (LongSparseIntArray) this.d, (SparseIntArray) this.e, (a0.i) this.f18214f, (a0.i) this.h, (a0.i) this.f18215n, (a0.i) this.f18216r, (a0.i) this.f18217s, (LongSparseIntArray) this.v);
                return;
            default:
                NotificationsSettingsActivity.U((NotificationsSettingsActivity) this.f18212b, (ArrayList) this.f18213c, (ArrayList) this.d, (ArrayList) this.v, (ArrayList) this.e, (ArrayList) this.f18214f, (ArrayList) this.h, (ArrayList) this.f18215n, (ArrayList) this.f18216r, (Runnable) this.f18217s);
                return;
        }
    }

    public yb(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        this.f18211a = 2;
        this.f18212b = notificationsSettingsActivity;
        this.f18213c = arrayList;
        this.d = arrayList2;
        this.v = arrayList3;
        this.e = arrayList4;
        this.f18214f = arrayList5;
        this.h = arrayList6;
        this.f18215n = arrayList7;
        this.f18216r = arrayList8;
        this.f18217s = runnable;
    }
}
