package org.telegram.ui.Components;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MessageObject;
public final class mu0 {
    public boolean f28521g;
    public boolean h;
    public int f28524k;
    public int f28526m;
    public int f28527n;
    public boolean f28528o;
    public int f28529p;
    public boolean f28531r;
    public int f28533t;
    public int f28534u;
    public boolean v;
    public boolean f28535w;
    public final ArrayList f28516a = new ArrayList();
    public final SparseArray[] f28517b = {new SparseArray(), new SparseArray()};
    public final ArrayList f28518c = new ArrayList();
    public final HashMap d = new HashMap();
    public final ArrayList f28519e = new ArrayList();
    public final int[] f28520f = {0, 0};
    public final boolean[] f28522i = {false, true};
    public final int[] f28523j = {0, 0};
    public boolean f28525l = true;
    public int f28530q = 0;
    public final ArrayList f28532s = new ArrayList();
    public s4.u0 f28536x = new s4.u0();

    public final boolean a(MessageObject messageObject, int i10, boolean z10, boolean z11) {
        SparseArray[] sparseArrayArr = this.f28517b;
        if (sparseArrayArr[i10].indexOfKey(messageObject.getId()) >= 0) {
            return false;
        }
        String str = messageObject.monthKey;
        HashMap hashMap = this.d;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(messageObject.monthKey, arrayList);
            ArrayList arrayList2 = this.f28518c;
            if (z10) {
                arrayList2.add(0, messageObject.monthKey);
            } else {
                arrayList2.add(messageObject.monthKey);
            }
        }
        ArrayList arrayList3 = this.f28516a;
        if (z10) {
            arrayList.add(0, messageObject);
            arrayList3.add(0, messageObject);
        } else {
            arrayList.add(messageObject);
            arrayList3.add(messageObject);
        }
        sparseArrayArr[i10].put(messageObject.getId(), messageObject);
        int[] iArr = this.f28523j;
        if (!z11) {
            if (messageObject.getId() > 0) {
                iArr[i10] = Math.min(messageObject.getId(), iArr[i10]);
                this.f28524k = Math.max(messageObject.getId(), this.f28524k);
            }
        } else {
            iArr[i10] = Math.max(messageObject.getId(), iArr[i10]);
            this.f28524k = Math.min(messageObject.getId(), this.f28524k);
        }
        if (!this.v && messageObject.isVideo()) {
            this.v = true;
        }
        if (!this.f28535w && messageObject.isPhoto()) {
            this.f28535w = true;
        }
        return true;
    }

    public final MessageObject b(int i10, int i11) {
        SparseArray[] sparseArrayArr = this.f28517b;
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
        this.f28516a.remove(messageObject);
        sparseArrayArr[i11].remove(messageObject.getId());
        if (arrayList.isEmpty()) {
            hashMap.remove(messageObject.monthKey);
            this.f28518c.remove(messageObject.monthKey);
        }
        int[] iArr = this.f28520f;
        int i12 = iArr[i11] - 1;
        iArr[i11] = i12;
        if (i12 < 0) {
            iArr[i11] = 0;
        }
        return messageObject;
    }

    public final ArrayList c() {
        if (this.f28531r) {
            return this.f28532s;
        }
        return this.f28516a;
    }

    public final int d() {
        if (this.f28531r) {
            return this.f28533t;
        }
        return this.f28526m;
    }

    public final int e() {
        int[] iArr = this.f28520f;
        return iArr[0] + iArr[1];
    }

    public final void f(int i10, int i11, int i12) {
        SparseArray[] sparseArrayArr = this.f28517b;
        MessageObject messageObject = (MessageObject) sparseArrayArr[i10].get(i11);
        if (messageObject != null) {
            sparseArrayArr[i10].remove(i11);
            sparseArrayArr[i10].put(i12, messageObject);
            messageObject.messageOwner.f19890id = i12;
            int[] iArr = this.f28523j;
            iArr[i10] = Math.min(i12, iArr[i10]);
        }
    }

    public final void g(boolean z10) {
        if (this.f28531r != z10) {
            this.f28531r = z10;
            if (z10) {
                this.f28533t = this.f28526m;
                this.f28534u = this.f28527n;
                ArrayList arrayList = this.f28532s;
                arrayList.clear();
                arrayList.addAll(this.f28516a);
            }
        }
    }
}
