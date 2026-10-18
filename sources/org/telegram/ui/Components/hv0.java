package org.telegram.ui.Components;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MessageObject;
public final class hv0 {
    public boolean f26953g;
    public boolean h;
    public int f26956k;
    public int f26958m;
    public int f26959n;
    public boolean f26960o;
    public int f26961p;
    public boolean f26963r;
    public int f26965t;
    public int f26966u;
    public boolean v;
    public boolean f26967w;
    public final ArrayList f26949a = new ArrayList();
    public final SparseArray[] f26950b = {new SparseArray(), new SparseArray()};
    public final ArrayList f26951c = new ArrayList();
    public final HashMap d = new HashMap();
    public final ArrayList e = new ArrayList();
    public final int[] f26952f = {0, 0};
    public final boolean[] f26954i = {false, true};
    public final int[] f26955j = {0, 0};
    public boolean f26957l = true;
    public int f26962q = 0;
    public final ArrayList f26964s = new ArrayList();
    public s4.t0 f26968x = new s4.t0();

    public final boolean a(MessageObject messageObject, int i10, boolean z10, boolean z11) {
        SparseArray[] sparseArrayArr = this.f26950b;
        if (sparseArrayArr[i10].indexOfKey(messageObject.getId()) >= 0) {
            return false;
        }
        String str = messageObject.monthKey;
        HashMap hashMap = this.d;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(messageObject.monthKey, arrayList);
            ArrayList arrayList2 = this.f26951c;
            if (z10) {
                arrayList2.add(0, messageObject.monthKey);
            } else {
                arrayList2.add(messageObject.monthKey);
            }
        }
        ArrayList arrayList3 = this.f26949a;
        if (z10) {
            arrayList.add(0, messageObject);
            arrayList3.add(0, messageObject);
        } else {
            arrayList.add(messageObject);
            arrayList3.add(messageObject);
        }
        sparseArrayArr[i10].put(messageObject.getId(), messageObject);
        int[] iArr = this.f26955j;
        if (!z11) {
            if (messageObject.getId() > 0) {
                iArr[i10] = Math.min(messageObject.getId(), iArr[i10]);
                this.f26956k = Math.max(messageObject.getId(), this.f26956k);
            }
        } else {
            iArr[i10] = Math.max(messageObject.getId(), iArr[i10]);
            this.f26956k = Math.min(messageObject.getId(), this.f26956k);
        }
        if (!this.v && messageObject.isVideo()) {
            this.v = true;
        }
        if (!this.f26967w && messageObject.isPhoto()) {
            this.f26967w = true;
        }
        return true;
    }

    public final MessageObject b(int i10, int i11) {
        SparseArray[] sparseArrayArr = this.f26950b;
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
        this.f26949a.remove(messageObject);
        sparseArrayArr[i11].remove(messageObject.getId());
        if (arrayList.isEmpty()) {
            hashMap.remove(messageObject.monthKey);
            this.f26951c.remove(messageObject.monthKey);
        }
        int[] iArr = this.f26952f;
        int i12 = iArr[i11] - 1;
        iArr[i11] = i12;
        if (i12 < 0) {
            iArr[i11] = 0;
        }
        return messageObject;
    }

    public final ArrayList c() {
        if (this.f26963r) {
            return this.f26964s;
        }
        return this.f26949a;
    }

    public final int d() {
        if (this.f26963r) {
            return this.f26965t;
        }
        return this.f26958m;
    }

    public final int e() {
        int[] iArr = this.f26952f;
        return iArr[0] + iArr[1];
    }

    public final void f(int i10, int i11, int i12) {
        SparseArray[] sparseArrayArr = this.f26950b;
        MessageObject messageObject = (MessageObject) sparseArrayArr[i10].get(i11);
        if (messageObject != null) {
            sparseArrayArr[i10].remove(i11);
            sparseArrayArr[i10].put(i12, messageObject);
            messageObject.messageOwner.f20300id = i12;
            int[] iArr = this.f26955j;
            iArr[i10] = Math.min(i12, iArr[i10]);
        }
    }

    public final void g(boolean z10) {
        if (this.f26963r != z10) {
            this.f26963r = z10;
            if (z10) {
                this.f26965t = this.f26958m;
                this.f26966u = this.f26959n;
                ArrayList arrayList = this.f26964s;
                arrayList.clear();
                arrayList.addAll(this.f26949a);
            }
        }
    }
}
