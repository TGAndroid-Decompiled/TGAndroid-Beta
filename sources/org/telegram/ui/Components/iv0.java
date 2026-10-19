package org.telegram.ui.Components;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MessageObject;
public final class iv0 {
    public boolean f27367g;
    public boolean h;
    public int f27370k;
    public int f27372m;
    public int f27373n;
    public boolean f27374o;
    public int f27375p;
    public boolean f27377r;
    public int f27379t;
    public int f27380u;
    public boolean v;
    public boolean f27381w;
    public final ArrayList f27363a = new ArrayList();
    public final SparseArray[] f27364b = {new SparseArray(), new SparseArray()};
    public final ArrayList f27365c = new ArrayList();
    public final HashMap d = new HashMap();
    public final ArrayList e = new ArrayList();
    public final int[] f27366f = {0, 0};
    public final boolean[] f27368i = {false, true};
    public final int[] f27369j = {0, 0};
    public boolean f27371l = true;
    public int f27376q = 0;
    public final ArrayList f27378s = new ArrayList();
    public s4.t0 f27382x = new s4.t0();

    public final boolean a(MessageObject messageObject, int i10, boolean z10, boolean z11) {
        SparseArray[] sparseArrayArr = this.f27364b;
        if (sparseArrayArr[i10].indexOfKey(messageObject.getId()) >= 0) {
            return false;
        }
        String str = messageObject.monthKey;
        HashMap hashMap = this.d;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(messageObject.monthKey, arrayList);
            ArrayList arrayList2 = this.f27365c;
            if (z10) {
                arrayList2.add(0, messageObject.monthKey);
            } else {
                arrayList2.add(messageObject.monthKey);
            }
        }
        ArrayList arrayList3 = this.f27363a;
        if (z10) {
            arrayList.add(0, messageObject);
            arrayList3.add(0, messageObject);
        } else {
            arrayList.add(messageObject);
            arrayList3.add(messageObject);
        }
        sparseArrayArr[i10].put(messageObject.getId(), messageObject);
        int[] iArr = this.f27369j;
        if (!z11) {
            if (messageObject.getId() > 0) {
                iArr[i10] = Math.min(messageObject.getId(), iArr[i10]);
                this.f27370k = Math.max(messageObject.getId(), this.f27370k);
            }
        } else {
            iArr[i10] = Math.max(messageObject.getId(), iArr[i10]);
            this.f27370k = Math.min(messageObject.getId(), this.f27370k);
        }
        if (!this.v && messageObject.isVideo()) {
            this.v = true;
        }
        if (!this.f27381w && messageObject.isPhoto()) {
            this.f27381w = true;
        }
        return true;
    }

    public final MessageObject b(int i10, int i11) {
        SparseArray[] sparseArrayArr = this.f27364b;
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
        this.f27363a.remove(messageObject);
        sparseArrayArr[i11].remove(messageObject.getId());
        if (arrayList.isEmpty()) {
            hashMap.remove(messageObject.monthKey);
            this.f27365c.remove(messageObject.monthKey);
        }
        int[] iArr = this.f27366f;
        int i12 = iArr[i11] - 1;
        iArr[i11] = i12;
        if (i12 < 0) {
            iArr[i11] = 0;
        }
        return messageObject;
    }

    public final ArrayList c() {
        if (this.f27377r) {
            return this.f27378s;
        }
        return this.f27363a;
    }

    public final int d() {
        if (this.f27377r) {
            return this.f27379t;
        }
        return this.f27372m;
    }

    public final int e() {
        int[] iArr = this.f27366f;
        return iArr[0] + iArr[1];
    }

    public final void f(int i10, int i11, int i12) {
        SparseArray[] sparseArrayArr = this.f27364b;
        MessageObject messageObject = (MessageObject) sparseArrayArr[i10].get(i11);
        if (messageObject != null) {
            sparseArrayArr[i10].remove(i11);
            sparseArrayArr[i10].put(i12, messageObject);
            messageObject.messageOwner.f20296id = i12;
            int[] iArr = this.f27369j;
            iArr[i10] = Math.min(i12, iArr[i10]);
        }
    }

    public final void g(boolean z10) {
        if (this.f27377r != z10) {
            this.f27377r = z10;
            if (z10) {
                this.f27379t = this.f27372m;
                this.f27380u = this.f27373n;
                ArrayList arrayList = this.f27378s;
                arrayList.clear();
                arrayList.addAll(this.f27363a);
            }
        }
    }
}
