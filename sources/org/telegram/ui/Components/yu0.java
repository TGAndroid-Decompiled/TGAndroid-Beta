package org.telegram.ui.Components;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MessageObject;
public final class yu0 {
    public boolean f30686g;
    public boolean h;
    public int f30689k;
    public int f30691m;
    public int f30692n;
    public boolean f30693o;
    public int f30694p;
    public boolean f30696r;
    public int f30698t;
    public int f30699u;
    public boolean v;
    public boolean f30700w;
    public final ArrayList f30682a = new ArrayList();
    public final SparseArray[] f30683b = {new SparseArray(), new SparseArray()};
    public final ArrayList f30684c = new ArrayList();
    public final HashMap d = new HashMap();
    public final ArrayList e = new ArrayList();
    public final int[] f30685f = {0, 0};
    public final boolean[] f30687i = {false, true};
    public final int[] f30688j = {0, 0};
    public boolean f30690l = true;
    public int f30695q = 0;
    public final ArrayList f30697s = new ArrayList();
    public s4.u0 f30701x = new s4.u0();

    public final boolean a(MessageObject messageObject, int i10, boolean z10, boolean z11) {
        SparseArray[] sparseArrayArr = this.f30683b;
        if (sparseArrayArr[i10].indexOfKey(messageObject.getId()) >= 0) {
            return false;
        }
        String str = messageObject.monthKey;
        HashMap hashMap = this.d;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(messageObject.monthKey, arrayList);
            ArrayList arrayList2 = this.f30684c;
            if (z10) {
                arrayList2.add(0, messageObject.monthKey);
            } else {
                arrayList2.add(messageObject.monthKey);
            }
        }
        ArrayList arrayList3 = this.f30682a;
        if (z10) {
            arrayList.add(0, messageObject);
            arrayList3.add(0, messageObject);
        } else {
            arrayList.add(messageObject);
            arrayList3.add(messageObject);
        }
        sparseArrayArr[i10].put(messageObject.getId(), messageObject);
        int[] iArr = this.f30688j;
        if (!z11) {
            if (messageObject.getId() > 0) {
                iArr[i10] = Math.min(messageObject.getId(), iArr[i10]);
                this.f30689k = Math.max(messageObject.getId(), this.f30689k);
            }
        } else {
            iArr[i10] = Math.max(messageObject.getId(), iArr[i10]);
            this.f30689k = Math.min(messageObject.getId(), this.f30689k);
        }
        if (!this.v && messageObject.isVideo()) {
            this.v = true;
        }
        if (!this.f30700w && messageObject.isPhoto()) {
            this.f30700w = true;
        }
        return true;
    }

    public final MessageObject b(int i10, int i11) {
        SparseArray[] sparseArrayArr = this.f30683b;
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
        this.f30682a.remove(messageObject);
        sparseArrayArr[i11].remove(messageObject.getId());
        if (arrayList.isEmpty()) {
            hashMap.remove(messageObject.monthKey);
            this.f30684c.remove(messageObject.monthKey);
        }
        int[] iArr = this.f30685f;
        int i12 = iArr[i11] - 1;
        iArr[i11] = i12;
        if (i12 < 0) {
            iArr[i11] = 0;
        }
        return messageObject;
    }

    public final ArrayList c() {
        if (this.f30696r) {
            return this.f30697s;
        }
        return this.f30682a;
    }

    public final int d() {
        if (this.f30696r) {
            return this.f30698t;
        }
        return this.f30691m;
    }

    public final int e() {
        int[] iArr = this.f30685f;
        return iArr[0] + iArr[1];
    }

    public final void f(int i10, int i11, int i12) {
        SparseArray[] sparseArrayArr = this.f30683b;
        MessageObject messageObject = (MessageObject) sparseArrayArr[i10].get(i11);
        if (messageObject != null) {
            sparseArrayArr[i10].remove(i11);
            sparseArrayArr[i10].put(i12, messageObject);
            messageObject.messageOwner.f18342id = i12;
            int[] iArr = this.f30688j;
            iArr[i10] = Math.min(i12, iArr[i10]);
        }
    }

    public final void g(boolean z10) {
        if (this.f30696r != z10) {
            this.f30696r = z10;
            if (z10) {
                this.f30698t = this.f30691m;
                this.f30699u = this.f30692n;
                ArrayList arrayList = this.f30697s;
                arrayList.clear();
                arrayList.addAll(this.f30682a);
            }
        }
    }
}
