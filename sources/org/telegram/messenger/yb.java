package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.NotificationsSettingsActivity;
public final class yb implements Runnable {
    public final int f19704a;
    public final NotificationCenter.NotificationCenterDelegate f19705b;
    public final Cloneable f19706c;
    public final Cloneable d;
    public final Cloneable f19707e;
    public final Cloneable f19708f;
    public final Cloneable h;
    public final Cloneable f19709n;
    public final Cloneable f19710r;
    public final Object f19711s;
    public final Cloneable v;

    public yb(MessagesController messagesController, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray, a0.i iVar, a0.i iVar2, a0.i iVar3, a0.i iVar4, a0.i iVar5, LongSparseIntArray longSparseIntArray3, int i10) {
        this.f19704a = i10;
        this.f19705b = messagesController;
        this.f19706c = longSparseIntArray;
        this.d = longSparseIntArray2;
        this.f19707e = sparseIntArray;
        this.f19708f = iVar;
        this.h = iVar2;
        this.f19709n = iVar3;
        this.f19710r = iVar4;
        this.f19711s = iVar5;
        this.v = longSparseIntArray3;
    }

    @Override
    public final void run() {
        switch (this.f19704a) {
            case 0:
                ((MessagesController) this.f19705b).lambda$processUpdateArray$416((LongSparseIntArray) this.f19706c, (LongSparseIntArray) this.d, (SparseIntArray) this.f19707e, (a0.i) this.f19708f, (a0.i) this.h, (a0.i) this.f19709n, (a0.i) this.f19710r, (a0.i) this.f19711s, (LongSparseIntArray) this.v);
                return;
            case 1:
                ((MessagesController) this.f19705b).lambda$processUpdateArray$417((LongSparseIntArray) this.f19706c, (LongSparseIntArray) this.d, (SparseIntArray) this.f19707e, (a0.i) this.f19708f, (a0.i) this.h, (a0.i) this.f19709n, (a0.i) this.f19710r, (a0.i) this.f19711s, (LongSparseIntArray) this.v);
                return;
            default:
                NotificationsSettingsActivity.U((NotificationsSettingsActivity) this.f19705b, (ArrayList) this.f19706c, (ArrayList) this.d, (ArrayList) this.v, (ArrayList) this.f19707e, (ArrayList) this.f19708f, (ArrayList) this.h, (ArrayList) this.f19709n, (ArrayList) this.f19710r, (Runnable) this.f19711s);
                return;
        }
    }

    public yb(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        this.f19704a = 2;
        this.f19705b = notificationsSettingsActivity;
        this.f19706c = arrayList;
        this.d = arrayList2;
        this.v = arrayList3;
        this.f19707e = arrayList4;
        this.f19708f = arrayList5;
        this.h = arrayList6;
        this.f19709n = arrayList7;
        this.f19710r = arrayList8;
        this.f19711s = runnable;
    }
}
