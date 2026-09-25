package org.telegram.ui.Components;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MessageObject;
public final class yu0 {
    public boolean f30697g;
    public boolean h;
    public int f30700k;
    public int f30702m;
    public int f30703n;
    public boolean f30704o;
    public int f30705p;
    public boolean f30707r;
    public int f30709t;
    public int f30710u;
    public boolean v;
    public boolean f30711w;
    public final ArrayList f30693a = new ArrayList();
    public final SparseArray[] f30694b = {new SparseArray(), new SparseArray()};
    public final ArrayList f30695c = new ArrayList();
    public final HashMap d = new HashMap();
    public final ArrayList e = new ArrayList();
    public final int[] f30696f = {0, 0};
    public final boolean[] f30698i = {false, true};
    public final int[] f30699j = {0, 0};
    public boolean f30701l = true;
    public int f30706q = 0;
    public final ArrayList f30708s = new ArrayList();
    public s4.u0 f30712x = new s4.u0();

    public final boolean a(MessageObject messageObject, int i10, boolean z10, boolean z11) {
        SparseArray[] sparseArrayArr = this.f30694b;
        if (sparseArrayArr[i10].indexOfKey(messageObject.getId()) >= 0) {
            return false;
        }
        String str = messageObject.monthKey;
        HashMap hashMap = this.d;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(messageObject.monthKey, arrayList);
            ArrayList arrayList2 = this.f30695c;
            if (z10) {
                arrayList2.add(0, messageObject.monthKey);
            } else {
                arrayList2.add(messageObject.monthKey);
            }
        }
        ArrayList arrayList3 = this.f30693a;
        if (z10) {
            arrayList.add(0, messageObject);
            arrayList3.add(0, messageObject);
        } else {
            arrayList.add(messageObject);
            arrayList3.add(messageObject);
        }
        sparseArrayArr[i10].put(messageObject.getId(), messageObject);
        int[] iArr = this.f30699j;
        if (!z11) {
            if (messageObject.getId() > 0) {
                iArr[i10] = Math.min(messageObject.getId(), iArr[i10]);
                this.f30700k = Math.max(messageObject.getId(), this.f30700k);
            }
        } else {
            iArr[i10] = Math.max(messageObject.getId(), iArr[i10]);
            this.f30700k = Math.min(messageObject.getId(), this.f30700k);
        }
        if (!this.v && messageObject.isVideo()) {
            this.v = true;
        }
        if (!this.f30711w && messageObject.isPhoto()) {
            this.f30711w = true;
        }
        return true;
    }

    public final MessageObject b(int i10, int i11) {
        SparseArray[] sparseArrayArr = this.f30694b;
        MessageObject messageObject = (MessageObject) sparseArrayArr[i11].get(i10);
        if (messageObject == null) {
            return null;
        }
        String str = messageObject.monthKey;
        HashMap hashMap = this.d;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            return null;
        }
        arrayList.remove(messageObject);
        this.f30693a.remove(messageObject);
        sparseArrayArr[i11].remove(messageObject.getId());
        if (arrayList.isEmpty()) {
            hashMap.remove(messageObject.monthKey);
            this.f30695c.remove(messageObject.monthKey);
        }
        int[] iArr = this.f30696f;
        int i12 = iArr[i11] - 1;
        iArr[i11] = i12;
        if (i12 < 0) {
            iArr[i11] = 0;
        }
        return messageObject;
    }

    public final ArrayList c() {
        if (this.f30707r) {
            return this.f30708s;
        }
        return this.f30693a;
    }

    public final int d() {
        if (this.f30707r) {
            return this.f30709t;
        }
        return this.f30702m;
    }

    public final int e() {
        int[] iArr = this.f30696f;
        return iArr[0] + iArr[1];
    }

    public final void f(int i10, int i11, int i12) {
        SparseArray[] sparseArrayArr = this.f30694b;
        MessageObject messageObject = (MessageObject) sparseArrayArr[i10].get(i11);
        if (messageObject != null) {
            sparseArrayArr[i10].remove(i11);
            sparseArrayArr[i10].put(i12, messageObject);
            messageObject.messageOwner.f18357id = i12;
            int[] iArr = this.f30699j;
            iArr[i10] = Math.min(i12, iArr[i10]);
        }
    }

    public final void g(boolean z10) {
        if (this.f30707r != z10) {
            this.f30707r = z10;
            if (z10) {
                this.f30709t = this.f30702m;
                this.f30710u = this.f30703n;
                ArrayList arrayList = this.f30708s;
                arrayList.clear();
                arrayList.addAll(this.f30693a);
            }
        }
    }
}
