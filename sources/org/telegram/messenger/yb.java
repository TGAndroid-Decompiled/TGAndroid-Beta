package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.NotificationsSettingsActivity;
public final class yb implements Runnable {
    public final int f18213a;
    public final NotificationCenter.NotificationCenterDelegate f18214b;
    public final Cloneable f18215c;
    public final Cloneable d;
    public final Cloneable e;
    public final Cloneable f18216f;
    public final Cloneable h;
    public final Cloneable f18217n;
    public final Cloneable f18218r;
    public final Object f18219s;
    public final Cloneable v;

    public yb(MessagesController messagesController, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray, a0.i iVar, a0.i iVar2, a0.i iVar3, a0.i iVar4, a0.i iVar5, LongSparseIntArray longSparseIntArray3, int i10) {
        this.f18213a = i10;
        this.f18214b = messagesController;
        this.f18215c = longSparseIntArray;
        this.d = longSparseIntArray2;
        this.e = sparseIntArray;
        this.f18216f = iVar;
        this.h = iVar2;
        this.f18217n = iVar3;
        this.f18218r = iVar4;
        this.f18219s = iVar5;
        this.v = longSparseIntArray3;
    }

    @Override
    public final void run() {
        switch (this.f18213a) {
            case 0:
                ((MessagesController) this.f18214b).lambda$processUpdateArray$416((LongSparseIntArray) this.f18215c, (LongSparseIntArray) this.d, (SparseIntArray) this.e, (a0.i) this.f18216f, (a0.i) this.h, (a0.i) this.f18217n, (a0.i) this.f18218r, (a0.i) this.f18219s, (LongSparseIntArray) this.v);
                return;
            case 1:
                ((MessagesController) this.f18214b).lambda$processUpdateArray$417((LongSparseIntArray) this.f18215c, (LongSparseIntArray) this.d, (SparseIntArray) this.e, (a0.i) this.f18216f, (a0.i) this.h, (a0.i) this.f18217n, (a0.i) this.f18218r, (a0.i) this.f18219s, (LongSparseIntArray) this.v);
                return;
            default:
                NotificationsSettingsActivity.U((NotificationsSettingsActivity) this.f18214b, (ArrayList) this.f18215c, (ArrayList) this.d, (ArrayList) this.v, (ArrayList) this.e, (ArrayList) this.f18216f, (ArrayList) this.h, (ArrayList) this.f18217n, (ArrayList) this.f18218r, (Runnable) this.f18219s);
                return;
        }
    }

    public yb(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        this.f18213a = 2;
        this.f18214b = notificationsSettingsActivity;
        this.f18215c = arrayList;
        this.d = arrayList2;
        this.v = arrayList3;
        this.e = arrayList4;
        this.f18216f = arrayList5;
        this.h = arrayList6;
        this.f18217n = arrayList7;
        this.f18218r = arrayList8;
        this.f18219s = runnable;
    }
}
