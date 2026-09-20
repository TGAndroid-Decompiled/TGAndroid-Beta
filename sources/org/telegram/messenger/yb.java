package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.NotificationsSettingsActivity;
public final class yb implements Runnable {
    public final int f18190a;
    public final NotificationCenter.NotificationCenterDelegate f18191b;
    public final Cloneable f18192c;
    public final Cloneable d;
    public final Cloneable e;
    public final Cloneable f18193f;
    public final Cloneable h;
    public final Cloneable f18194n;
    public final Cloneable f18195r;
    public final Object f18196s;
    public final Cloneable v;

    public yb(MessagesController messagesController, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray, a0.i iVar, a0.i iVar2, a0.i iVar3, a0.i iVar4, a0.i iVar5, LongSparseIntArray longSparseIntArray3, int i10) {
        this.f18190a = i10;
        this.f18191b = messagesController;
        this.f18192c = longSparseIntArray;
        this.d = longSparseIntArray2;
        this.e = sparseIntArray;
        this.f18193f = iVar;
        this.h = iVar2;
        this.f18194n = iVar3;
        this.f18195r = iVar4;
        this.f18196s = iVar5;
        this.v = longSparseIntArray3;
    }

    @Override
    public final void run() {
        switch (this.f18190a) {
            case 0:
                ((MessagesController) this.f18191b).lambda$processUpdateArray$416((LongSparseIntArray) this.f18192c, (LongSparseIntArray) this.d, (SparseIntArray) this.e, (a0.i) this.f18193f, (a0.i) this.h, (a0.i) this.f18194n, (a0.i) this.f18195r, (a0.i) this.f18196s, (LongSparseIntArray) this.v);
                return;
            case 1:
                ((MessagesController) this.f18191b).lambda$processUpdateArray$417((LongSparseIntArray) this.f18192c, (LongSparseIntArray) this.d, (SparseIntArray) this.e, (a0.i) this.f18193f, (a0.i) this.h, (a0.i) this.f18194n, (a0.i) this.f18195r, (a0.i) this.f18196s, (LongSparseIntArray) this.v);
                return;
            default:
                NotificationsSettingsActivity.U((NotificationsSettingsActivity) this.f18191b, (ArrayList) this.f18192c, (ArrayList) this.d, (ArrayList) this.v, (ArrayList) this.e, (ArrayList) this.f18193f, (ArrayList) this.h, (ArrayList) this.f18194n, (ArrayList) this.f18195r, (Runnable) this.f18196s);
                return;
        }
    }

    public yb(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        this.f18190a = 2;
        this.f18191b = notificationsSettingsActivity;
        this.f18192c = arrayList;
        this.d = arrayList2;
        this.v = arrayList3;
        this.e = arrayList4;
        this.f18193f = arrayList5;
        this.h = arrayList6;
        this.f18194n = arrayList7;
        this.f18195r = arrayList8;
        this.f18196s = runnable;
    }
}
