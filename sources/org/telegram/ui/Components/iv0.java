package org.telegram.ui.Components;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MessageObject;
public final class iv0 {
    public boolean f27365g;
    public boolean h;
    public int f27368k;
    public int f27370m;
    public int f27371n;
    public boolean f27372o;
    public int f27373p;
    public boolean f27375r;
    public int f27377t;
    public int f27378u;
    public boolean v;
    public boolean f27379w;
    public final ArrayList f27361a = new ArrayList();
    public final SparseArray[] f27362b = {new SparseArray(), new SparseArray()};
    public final ArrayList f27363c = new ArrayList();
    public final HashMap d = new HashMap();
    public final ArrayList e = new ArrayList();
    public final int[] f27364f = {0, 0};
    public final boolean[] f27366i = {false, true};
    public final int[] f27367j = {0, 0};
    public boolean f27369l = true;
    public int f27374q = 0;
    public final ArrayList f27376s = new ArrayList();
    public s4.t0 f27380x = new s4.t0();

    public final boolean a(MessageObject messageObject, int i10, boolean z10, boolean z11) {
        SparseArray[] sparseArrayArr = this.f27362b;
        if (sparseArrayArr[i10].indexOfKey(messageObject.getId()) >= 0) {
            return false;
        }
        String str = messageObject.monthKey;
        HashMap hashMap = this.d;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(messageObject.monthKey, arrayList);
            ArrayList arrayList2 = this.f27363c;
            if (z10) {
                arrayList2.add(0, messageObject.monthKey);
            } else {
                arrayList2.add(messageObject.monthKey);
            }
        }
        ArrayList arrayList3 = this.f27361a;
        if (z10) {
            arrayList.add(0, messageObject);
            arrayList3.add(0, messageObject);
        } else {
            arrayList.add(messageObject);
            arrayList3.add(messageObject);
        }
        sparseArrayArr[i10].put(messageObject.getId(), messageObject);
        int[] iArr = this.f27367j;
        if (!z11) {
            if (messageObject.getId() > 0) {
                iArr[i10] = Math.min(messageObject.getId(), iArr[i10]);
                this.f27368k = Math.max(messageObject.getId(), this.f27368k);
            }
        } else {
            iArr[i10] = Math.max(messageObject.getId(), iArr[i10]);
            this.f27368k = Math.min(messageObject.getId(), this.f27368k);
        }
        if (!this.v && messageObject.isVideo()) {
            this.v = true;
        }
        if (!this.f27379w && messageObject.isPhoto()) {
            this.f27379w = true;
        }
        return true;
    }

    public final MessageObject b(int i10, int i11) {
        SparseArray[] sparseArrayArr = this.f27362b;
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
        this.f27361a.remove(messageObject);
        sparseArrayArr[i11].remove(messageObject.getId());
        if (arrayList.isEmpty()) {
            hashMap.remove(messageObject.monthKey);
            this.f27363c.remove(messageObject.monthKey);
        }
        int[] iArr = this.f27364f;
        int i12 = iArr[i11] - 1;
        iArr[i11] = i12;
        if (i12 < 0) {
            iArr[i11] = 0;
        }
        return messageObject;
    }

    public final ArrayList c() {
        if (this.f27375r) {
            return this.f27376s;
        }
        return this.f27361a;
    }

    public final int d() {
        if (this.f27375r) {
            return this.f27377t;
        }
        return this.f27370m;
    }

    public final int e() {
        int[] iArr = this.f27364f;
        return iArr[0] + iArr[1];
    }

    public final void f(int i10, int i11, int i12) {
        SparseArray[] sparseArrayArr = this.f27362b;
        MessageObject messageObject = (MessageObject) sparseArrayArr[i10].get(i11);
        if (messageObject != null) {
            sparseArrayArr[i10].remove(i11);
            sparseArrayArr[i10].put(i12, messageObject);
            messageObject.messageOwner.f20294id = i12;
            int[] iArr = this.f27367j;
            iArr[i10] = Math.min(i12, iArr[i10]);
        }
    }

    public final void g(boolean z10) {
        if (this.f27375r != z10) {
            this.f27375r = z10;
            if (z10) {
                this.f27377t = this.f27370m;
                this.f27378u = this.f27371n;
                ArrayList arrayList = this.f27376s;
                arrayList.clear();
                arrayList.addAll(this.f27361a);
            }
        }
    }
}
