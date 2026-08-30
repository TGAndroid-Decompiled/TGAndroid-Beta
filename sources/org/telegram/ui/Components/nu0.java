package org.telegram.ui.Components;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MessageObject;
public final class nu0 {
    public boolean f27368g;
    public boolean h;
    public int f27371k;
    public int f27373m;
    public int f27374n;
    public boolean f27375o;
    public int f27376p;
    public boolean f27378r;
    public int f27380t;
    public int f27381u;
    public boolean v;
    public boolean f27382w;
    public final ArrayList f27364a = new ArrayList();
    public final SparseArray[] f27365b = {new SparseArray(), new SparseArray()};
    public final ArrayList f27366c = new ArrayList();
    public final HashMap d = new HashMap();
    public final ArrayList e = new ArrayList();
    public final int[] f27367f = {0, 0};
    public final boolean[] f27369i = {false, true};
    public final int[] f27370j = {0, 0};
    public boolean f27372l = true;
    public int f27377q = 0;
    public final ArrayList f27379s = new ArrayList();
    public f2.b1 f27383x = new f2.b1();

    public final boolean a(MessageObject messageObject, int i10, boolean z4, boolean z10) {
        SparseArray[] sparseArrayArr = this.f27365b;
        if (sparseArrayArr[i10].indexOfKey(messageObject.getId()) >= 0) {
            return false;
        }
        String str = messageObject.monthKey;
        HashMap hashMap = this.d;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(messageObject.monthKey, arrayList);
            ArrayList arrayList2 = this.f27366c;
            if (z4) {
                arrayList2.add(0, messageObject.monthKey);
            } else {
                arrayList2.add(messageObject.monthKey);
            }
        }
        ArrayList arrayList3 = this.f27364a;
        if (z4) {
            arrayList.add(0, messageObject);
            arrayList3.add(0, messageObject);
        } else {
            arrayList.add(messageObject);
            arrayList3.add(messageObject);
        }
        sparseArrayArr[i10].put(messageObject.getId(), messageObject);
        int[] iArr = this.f27370j;
        if (!z10) {
            if (messageObject.getId() > 0) {
                iArr[i10] = Math.min(messageObject.getId(), iArr[i10]);
                this.f27371k = Math.max(messageObject.getId(), this.f27371k);
            }
        } else {
            iArr[i10] = Math.max(messageObject.getId(), iArr[i10]);
            this.f27371k = Math.min(messageObject.getId(), this.f27371k);
        }
        if (!this.v && messageObject.isVideo()) {
            this.v = true;
        }
        if (!this.f27382w && messageObject.isPhoto()) {
            this.f27382w = true;
        }
        return true;
    }

    public final MessageObject b(int i10, int i11) {
        SparseArray[] sparseArrayArr = this.f27365b;
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
        this.f27364a.remove(messageObject);
        sparseArrayArr[i11].remove(messageObject.getId());
        if (arrayList.isEmpty()) {
            hashMap.remove(messageObject.monthKey);
            this.f27366c.remove(messageObject.monthKey);
        }
        int[] iArr = this.f27367f;
        int i12 = iArr[i11] - 1;
        iArr[i11] = i12;
        if (i12 < 0) {
            iArr[i11] = 0;
        }
        return messageObject;
    }

    public final ArrayList c() {
        if (this.f27378r) {
            return this.f27379s;
        }
        return this.f27364a;
    }

    public final int d() {
        if (this.f27378r) {
            return this.f27380t;
        }
        return this.f27373m;
    }

    public final int e() {
        int[] iArr = this.f27367f;
        return iArr[0] + iArr[1];
    }

    public final void f(int i10, int i11, int i12) {
        SparseArray[] sparseArrayArr = this.f27365b;
        MessageObject messageObject = (MessageObject) sparseArrayArr[i10].get(i11);
        if (messageObject != null) {
            sparseArrayArr[i10].remove(i11);
            sparseArrayArr[i10].put(i12, messageObject);
            messageObject.messageOwner.f19205id = i12;
            int[] iArr = this.f27370j;
            iArr[i10] = Math.min(i12, iArr[i10]);
        }
    }

    public final void g(boolean z4) {
        if (this.f27378r != z4) {
            this.f27378r = z4;
            if (z4) {
                this.f27380t = this.f27373m;
                this.f27381u = this.f27374n;
                ArrayList arrayList = this.f27379s;
                arrayList.clear();
                arrayList.addAll(this.f27364a);
            }
        }
    }
}
