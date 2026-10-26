package org.telegram.ui.Components;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MessageObject;
public final class pv0 {
    public boolean f31710g;
    public boolean h;
    public int f31713k;
    public int f31715m;
    public int f31716n;
    public boolean f31717o;
    public int f31718p;
    public boolean f31720r;
    public int f31722t;
    public int f31723u;
    public boolean v;
    public boolean f31724w;
    public final ArrayList f31706a = new ArrayList();
    public final SparseArray[] f31707b = {new SparseArray(), new SparseArray()};
    public final ArrayList f31708c = new ArrayList();
    public final HashMap d = new HashMap();
    public final ArrayList e = new ArrayList();
    public final int[] f31709f = {0, 0};
    public final boolean[] f31711i = {false, true};
    public final int[] f31712j = {0, 0};
    public boolean f31714l = true;
    public int f31719q = 0;
    public final ArrayList f31721s = new ArrayList();
    public s4.w0 f31725x = new s4.w0();

    public final boolean a(MessageObject messageObject, int i10, boolean z10, boolean z11) {
        SparseArray[] sparseArrayArr = this.f31707b;
        if (sparseArrayArr[i10].indexOfKey(messageObject.getId()) >= 0) {
            return false;
        }
        String str = messageObject.monthKey;
        HashMap hashMap = this.d;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(messageObject.monthKey, arrayList);
            ArrayList arrayList2 = this.f31708c;
            if (z10) {
                arrayList2.add(0, messageObject.monthKey);
            } else {
                arrayList2.add(messageObject.monthKey);
            }
        }
        ArrayList arrayList3 = this.f31706a;
        if (z10) {
            arrayList.add(0, messageObject);
            arrayList3.add(0, messageObject);
        } else {
            arrayList.add(messageObject);
            arrayList3.add(messageObject);
        }
        sparseArrayArr[i10].put(messageObject.getId(), messageObject);
        int[] iArr = this.f31712j;
        if (!z11) {
            if (messageObject.getId() > 0) {
                iArr[i10] = Math.min(messageObject.getId(), iArr[i10]);
                this.f31713k = Math.max(messageObject.getId(), this.f31713k);
            }
        } else {
            iArr[i10] = Math.max(messageObject.getId(), iArr[i10]);
            this.f31713k = Math.min(messageObject.getId(), this.f31713k);
        }
        if (!this.v && messageObject.isVideo()) {
            this.v = true;
        }
        if (!this.f31724w && messageObject.isPhoto()) {
            this.f31724w = true;
        }
        return true;
    }

    public final MessageObject b(int i10, int i11) {
        SparseArray[] sparseArrayArr = this.f31707b;
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
        this.f31706a.remove(messageObject);
        sparseArrayArr[i11].remove(messageObject.getId());
        if (arrayList.isEmpty()) {
            hashMap.remove(messageObject.monthKey);
            this.f31708c.remove(messageObject.monthKey);
        }
        int[] iArr = this.f31709f;
        int i12 = iArr[i11] - 1;
        iArr[i11] = i12;
        if (i12 < 0) {
            iArr[i11] = 0;
        }
        return messageObject;
    }

    public final ArrayList c() {
        if (this.f31720r) {
            return this.f31721s;
        }
        return this.f31706a;
    }

    public final int d() {
        if (this.f31720r) {
            return this.f31722t;
        }
        return this.f31715m;
    }

    public final int e() {
        int[] iArr = this.f31709f;
        return iArr[0] + iArr[1];
    }

    public final void f(int i10, int i11, int i12) {
        SparseArray[] sparseArrayArr = this.f31707b;
        MessageObject messageObject = (MessageObject) sparseArrayArr[i10].get(i11);
        if (messageObject != null) {
            sparseArrayArr[i10].remove(i11);
            sparseArrayArr[i10].put(i12, messageObject);
            messageObject.messageOwner.f22048id = i12;
            int[] iArr = this.f31712j;
            iArr[i10] = Math.min(i12, iArr[i10]);
        }
    }

    public final void g(boolean z10) {
        if (this.f31720r != z10) {
            this.f31720r = z10;
            if (z10) {
                this.f31722t = this.f31715m;
                this.f31723u = this.f31716n;
                ArrayList arrayList = this.f31721s;
                arrayList.clear();
                arrayList.addAll(this.f31706a);
            }
        }
    }
}
