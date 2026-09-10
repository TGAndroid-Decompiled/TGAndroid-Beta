package org.telegram.ui.Components;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MessageObject;
public final class xu0 {
    public boolean f29160g;
    public boolean h;
    public int f29163k;
    public int f29165m;
    public int f29166n;
    public boolean f29167o;
    public int f29168p;
    public boolean f29170r;
    public int f29172t;
    public int f29173u;
    public boolean v;
    public boolean f29174w;
    public final ArrayList f29156a = new ArrayList();
    public final SparseArray[] f29157b = {new SparseArray(), new SparseArray()};
    public final ArrayList f29158c = new ArrayList();
    public final HashMap d = new HashMap();
    public final ArrayList e = new ArrayList();
    public final int[] f29159f = {0, 0};
    public final boolean[] f29161i = {false, true};
    public final int[] f29162j = {0, 0};
    public boolean f29164l = true;
    public int f29169q = 0;
    public final ArrayList f29171s = new ArrayList();
    public s4.u0 f29175x = new s4.u0();

    public final boolean a(MessageObject messageObject, int i10, boolean z10, boolean z11) {
        SparseArray[] sparseArrayArr = this.f29157b;
        if (sparseArrayArr[i10].indexOfKey(messageObject.getId()) >= 0) {
            return false;
        }
        String str = messageObject.monthKey;
        HashMap hashMap = this.d;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(messageObject.monthKey, arrayList);
            ArrayList arrayList2 = this.f29158c;
            if (z10) {
                arrayList2.add(0, messageObject.monthKey);
            } else {
                arrayList2.add(messageObject.monthKey);
            }
        }
        ArrayList arrayList3 = this.f29156a;
        if (z10) {
            arrayList.add(0, messageObject);
            arrayList3.add(0, messageObject);
        } else {
            arrayList.add(messageObject);
            arrayList3.add(messageObject);
        }
        sparseArrayArr[i10].put(messageObject.getId(), messageObject);
        int[] iArr = this.f29162j;
        if (!z11) {
            if (messageObject.getId() > 0) {
                iArr[i10] = Math.min(messageObject.getId(), iArr[i10]);
                this.f29163k = Math.max(messageObject.getId(), this.f29163k);
            }
        } else {
            iArr[i10] = Math.max(messageObject.getId(), iArr[i10]);
            this.f29163k = Math.min(messageObject.getId(), this.f29163k);
        }
        if (!this.v && messageObject.isVideo()) {
            this.v = true;
        }
        if (!this.f29174w && messageObject.isPhoto()) {
            this.f29174w = true;
        }
        return true;
    }

    public final MessageObject b(int i10, int i11) {
        SparseArray[] sparseArrayArr = this.f29157b;
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
        this.f29156a.remove(messageObject);
        sparseArrayArr[i11].remove(messageObject.getId());
        if (arrayList.isEmpty()) {
            hashMap.remove(messageObject.monthKey);
            this.f29158c.remove(messageObject.monthKey);
        }
        int[] iArr = this.f29159f;
        int i12 = iArr[i11] - 1;
        iArr[i11] = i12;
        if (i12 < 0) {
            iArr[i11] = 0;
        }
        return messageObject;
    }

    public final ArrayList c() {
        if (this.f29170r) {
            return this.f29171s;
        }
        return this.f29156a;
    }

    public final int d() {
        if (this.f29170r) {
            return this.f29172t;
        }
        return this.f29165m;
    }

    public final int e() {
        int[] iArr = this.f29159f;
        return iArr[0] + iArr[1];
    }

    public final void f(int i10, int i11, int i12) {
        SparseArray[] sparseArrayArr = this.f29157b;
        MessageObject messageObject = (MessageObject) sparseArrayArr[i10].get(i11);
        if (messageObject != null) {
            sparseArrayArr[i10].remove(i11);
            sparseArrayArr[i10].put(i12, messageObject);
            messageObject.messageOwner.f17216id = i12;
            int[] iArr = this.f29162j;
            iArr[i10] = Math.min(i12, iArr[i10]);
        }
    }

    public final void g(boolean z10) {
        if (this.f29170r != z10) {
            this.f29170r = z10;
            if (z10) {
                this.f29172t = this.f29165m;
                this.f29173u = this.f29166n;
                ArrayList arrayList = this.f29171s;
                arrayList.clear();
                arrayList.addAll(this.f29156a);
            }
        }
    }
}
