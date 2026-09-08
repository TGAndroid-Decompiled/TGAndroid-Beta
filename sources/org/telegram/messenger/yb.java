package org.telegram.messenger;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.NotificationsSettingsActivity;
public final class yb implements Runnable {
    public final int f19731a;
    public final NotificationCenter.NotificationCenterDelegate f19732b;
    public final Cloneable f19733c;
    public final Cloneable d;
    public final Cloneable f19734e;
    public final Cloneable f19735f;
    public final Cloneable h;
    public final Cloneable f19736n;
    public final Cloneable f19737r;
    public final Object f19738s;
    public final Cloneable v;

    public yb(MessagesController messagesController, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray, a0.i iVar, a0.i iVar2, a0.i iVar3, a0.i iVar4, a0.i iVar5, LongSparseIntArray longSparseIntArray3, int i10) {
        this.f19731a = i10;
        this.f19732b = messagesController;
        this.f19733c = longSparseIntArray;
        this.d = longSparseIntArray2;
        this.f19734e = sparseIntArray;
        this.f19735f = iVar;
        this.h = iVar2;
        this.f19736n = iVar3;
        this.f19737r = iVar4;
        this.f19738s = iVar5;
        this.v = longSparseIntArray3;
    }

    @Override
    public final void run() {
        switch (this.f19731a) {
            case 0:
                ((MessagesController) this.f19732b).lambda$processUpdateArray$416((LongSparseIntArray) this.f19733c, (LongSparseIntArray) this.d, (SparseIntArray) this.f19734e, (a0.i) this.f19735f, (a0.i) this.h, (a0.i) this.f19736n, (a0.i) this.f19737r, (a0.i) this.f19738s, (LongSparseIntArray) this.v);
                return;
            case 1:
                ((MessagesController) this.f19732b).lambda$processUpdateArray$417((LongSparseIntArray) this.f19733c, (LongSparseIntArray) this.d, (SparseIntArray) this.f19734e, (a0.i) this.f19735f, (a0.i) this.h, (a0.i) this.f19736n, (a0.i) this.f19737r, (a0.i) this.f19738s, (LongSparseIntArray) this.v);
                return;
            default:
                NotificationsSettingsActivity.U((NotificationsSettingsActivity) this.f19732b, (ArrayList) this.f19733c, (ArrayList) this.d, (ArrayList) this.v, (ArrayList) this.f19734e, (ArrayList) this.f19735f, (ArrayList) this.h, (ArrayList) this.f19736n, (ArrayList) this.f19737r, (Runnable) this.f19738s);
                return;
        }
    }

    public yb(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        this.f19731a = 2;
        this.f19732b = notificationsSettingsActivity;
        this.f19733c = arrayList;
        this.d = arrayList2;
        this.v = arrayList3;
        this.f19734e = arrayList4;
        this.f19735f = arrayList5;
        this.h = arrayList6;
        this.f19736n = arrayList7;
        this.f19737r = arrayList8;
        this.f19738s = runnable;
    }
}
