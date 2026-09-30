package org.telegram.ui.Components;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MessageObject;
public final class bv0 {
    public boolean f23019g;
    public boolean h;
    public int f23022k;
    public int f23024m;
    public int f23025n;
    public boolean f23026o;
    public int f23027p;
    public boolean f23029r;
    public int f23031t;
    public int f23032u;
    public boolean v;
    public boolean f23033w;
    public final ArrayList f23015a = new ArrayList();
    public final SparseArray[] f23016b = {new SparseArray(), new SparseArray()};
    public final ArrayList f23017c = new ArrayList();
    public final HashMap d = new HashMap();
    public final ArrayList e = new ArrayList();
    public final int[] f23018f = {0, 0};
    public final boolean[] f23020i = {false, true};
    public final int[] f23021j = {0, 0};
    public boolean f23023l = true;
    public int f23028q = 0;
    public final ArrayList f23030s = new ArrayList();
    public s4.u0 f23034x = new s4.u0();

    public final boolean a(MessageObject messageObject, int i10, boolean z10, boolean z11) {
        SparseArray[] sparseArrayArr = this.f23016b;
        if (sparseArrayArr[i10].indexOfKey(messageObject.getId()) >= 0) {
            return false;
        }
        String str = messageObject.monthKey;
        HashMap hashMap = this.d;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(messageObject.monthKey, arrayList);
            ArrayList arrayList2 = this.f23017c;
            if (z10) {
                arrayList2.add(0, messageObject.monthKey);
            } else {
                arrayList2.add(messageObject.monthKey);
            }
        }
        ArrayList arrayList3 = this.f23015a;
        if (z10) {
            arrayList.add(0, messageObject);
            arrayList3.add(0, messageObject);
        } else {
            arrayList.add(messageObject);
            arrayList3.add(messageObject);
        }
        sparseArrayArr[i10].put(messageObject.getId(), messageObject);
        int[] iArr = this.f23021j;
        if (!z11) {
            if (messageObject.getId() > 0) {
                iArr[i10] = Math.min(messageObject.getId(), iArr[i10]);
                this.f23022k = Math.max(messageObject.getId(), this.f23022k);
            }
        } else {
            iArr[i10] = Math.max(messageObject.getId(), iArr[i10]);
            this.f23022k = Math.min(messageObject.getId(), this.f23022k);
        }
        if (!this.v && messageObject.isVideo()) {
            this.v = true;
        }
        if (!this.f23033w && messageObject.isPhoto()) {
            this.f23033w = true;
        }
        return true;
    }

    public final MessageObject b(int i10, int i11) {
        SparseArray[] sparseArrayArr = this.f23016b;
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
        this.f23015a.remove(messageObject);
        sparseArrayArr[i11].remove(messageObject.getId());
        if (arrayList.isEmpty()) {
            hashMap.remove(messageObject.monthKey);
            this.f23017c.remove(messageObject.monthKey);
        }
        int[] iArr = this.f23018f;
        int i12 = iArr[i11] - 1;
        iArr[i11] = i12;
        if (i12 < 0) {
            iArr[i11] = 0;
        }
        return messageObject;
    }

    public final ArrayList c() {
        if (this.f23029r) {
            return this.f23030s;
        }
        return this.f23015a;
    }

    public final int d() {
        if (this.f23029r) {
            return this.f23031t;
        }
        return this.f23024m;
    }

    public final int e() {
        int[] iArr = this.f23018f;
        return iArr[0] + iArr[1];
    }

    public final void f(int i10, int i11, int i12) {
        SparseArray[] sparseArrayArr = this.f23016b;
        MessageObject messageObject = (MessageObject) sparseArrayArr[i10].get(i11);
        if (messageObject != null) {
            sparseArrayArr[i10].remove(i11);
            sparseArrayArr[i10].put(i12, messageObject);
            messageObject.messageOwner.f18373id = i12;
            int[] iArr = this.f23021j;
            iArr[i10] = Math.min(i12, iArr[i10]);
        }
    }

    public final void g(boolean z10) {
        if (this.f23029r != z10) {
            this.f23029r = z10;
            if (z10) {
                this.f23031t = this.f23024m;
                this.f23032u = this.f23025n;
                ArrayList arrayList = this.f23030s;
                arrayList.clear();
                arrayList.addAll(this.f23015a);
            }
        }
    }
}
