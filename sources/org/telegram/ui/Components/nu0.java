package org.telegram.ui.Components;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MessageObject;
public final class nu0 {
    public boolean f27372g;
    public boolean h;
    public int f27375k;
    public int f27377m;
    public int f27378n;
    public boolean f27379o;
    public int f27380p;
    public boolean f27382r;
    public int f27384t;
    public int f27385u;
    public boolean v;
    public boolean f27386w;
    public final ArrayList f27368a = new ArrayList();
    public final SparseArray[] f27369b = {new SparseArray(), new SparseArray()};
    public final ArrayList f27370c = new ArrayList();
    public final HashMap d = new HashMap();
    public final ArrayList e = new ArrayList();
    public final int[] f27371f = {0, 0};
    public final boolean[] f27373i = {false, true};
    public final int[] f27374j = {0, 0};
    public boolean f27376l = true;
    public int f27381q = 0;
    public final ArrayList f27383s = new ArrayList();
    public f2.b1 f27387x = new f2.b1();

    public final boolean a(MessageObject messageObject, int i10, boolean z4, boolean z10) {
        SparseArray[] sparseArrayArr = this.f27369b;
        if (sparseArrayArr[i10].indexOfKey(messageObject.getId()) >= 0) {
            return false;
        }
        String str = messageObject.monthKey;
        HashMap hashMap = this.d;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(messageObject.monthKey, arrayList);
            ArrayList arrayList2 = this.f27370c;
            if (z4) {
                arrayList2.add(0, messageObject.monthKey);
            } else {
                arrayList2.add(messageObject.monthKey);
            }
        }
        ArrayList arrayList3 = this.f27368a;
        if (z4) {
            arrayList.add(0, messageObject);
            arrayList3.add(0, messageObject);
        } else {
            arrayList.add(messageObject);
            arrayList3.add(messageObject);
        }
        sparseArrayArr[i10].put(messageObject.getId(), messageObject);
        int[] iArr = this.f27374j;
        if (!z10) {
            if (messageObject.getId() > 0) {
                iArr[i10] = Math.min(messageObject.getId(), iArr[i10]);
                this.f27375k = Math.max(messageObject.getId(), this.f27375k);
            }
        } else {
            iArr[i10] = Math.max(messageObject.getId(), iArr[i10]);
            this.f27375k = Math.min(messageObject.getId(), this.f27375k);
        }
        if (!this.v && messageObject.isVideo()) {
            this.v = true;
        }
        if (!this.f27386w && messageObject.isPhoto()) {
            this.f27386w = true;
        }
        return true;
    }

    public final MessageObject b(int i10, int i11) {
        SparseArray[] sparseArrayArr = this.f27369b;
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
        this.f27368a.remove(messageObject);
        sparseArrayArr[i11].remove(messageObject.getId());
        if (arrayList.isEmpty()) {
            hashMap.remove(messageObject.monthKey);
            this.f27370c.remove(messageObject.monthKey);
        }
        int[] iArr = this.f27371f;
        int i12 = iArr[i11] - 1;
        iArr[i11] = i12;
        if (i12 < 0) {
            iArr[i11] = 0;
        }
        return messageObject;
    }

    public final ArrayList c() {
        if (this.f27382r) {
            return this.f27383s;
        }
        return this.f27368a;
    }

    public final int d() {
        if (this.f27382r) {
            return this.f27384t;
        }
        return this.f27377m;
    }

    public final int e() {
        int[] iArr = this.f27371f;
        return iArr[0] + iArr[1];
    }

    public final void f(int i10, int i11, int i12) {
        SparseArray[] sparseArrayArr = this.f27369b;
        MessageObject messageObject = (MessageObject) sparseArrayArr[i10].get(i11);
        if (messageObject != null) {
            sparseArrayArr[i10].remove(i11);
            sparseArrayArr[i10].put(i12, messageObject);
            messageObject.messageOwner.f19180id = i12;
            int[] iArr = this.f27374j;
            iArr[i10] = Math.min(i12, iArr[i10]);
        }
    }

    public final void g(boolean z4) {
        if (this.f27382r != z4) {
            this.f27382r = z4;
            if (z4) {
                this.f27384t = this.f27377m;
                this.f27385u = this.f27378n;
                ArrayList arrayList = this.f27383s;
                arrayList.clear();
                arrayList.addAll(this.f27368a);
            }
        }
    }
}
