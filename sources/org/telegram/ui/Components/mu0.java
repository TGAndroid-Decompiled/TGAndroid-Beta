package org.telegram.ui.Components;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MessageObject;
public final class mu0 {
    public boolean f28522g;
    public boolean h;
    public int f28525k;
    public int f28527m;
    public int f28528n;
    public boolean f28529o;
    public int f28530p;
    public boolean f28532r;
    public int f28534t;
    public int f28535u;
    public boolean v;
    public boolean f28536w;
    public final ArrayList f28517a = new ArrayList();
    public final SparseArray[] f28518b = {new SparseArray(), new SparseArray()};
    public final ArrayList f28519c = new ArrayList();
    public final HashMap d = new HashMap();
    public final ArrayList f28520e = new ArrayList();
    public final int[] f28521f = {0, 0};
    public final boolean[] f28523i = {false, true};
    public final int[] f28524j = {0, 0};
    public boolean f28526l = true;
    public int f28531q = 0;
    public final ArrayList f28533s = new ArrayList();
    public s4.u0 f28537x = new s4.u0();

    public final boolean a(MessageObject messageObject, int i10, boolean z10, boolean z11) {
        SparseArray[] sparseArrayArr = this.f28518b;
        if (sparseArrayArr[i10].indexOfKey(messageObject.getId()) >= 0) {
            return false;
        }
        String str = messageObject.monthKey;
        HashMap hashMap = this.d;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(messageObject.monthKey, arrayList);
            ArrayList arrayList2 = this.f28519c;
            if (z10) {
                arrayList2.add(0, messageObject.monthKey);
            } else {
                arrayList2.add(messageObject.monthKey);
            }
        }
        ArrayList arrayList3 = this.f28517a;
        if (z10) {
            arrayList.add(0, messageObject);
            arrayList3.add(0, messageObject);
        } else {
            arrayList.add(messageObject);
            arrayList3.add(messageObject);
        }
        sparseArrayArr[i10].put(messageObject.getId(), messageObject);
        int[] iArr = this.f28524j;
        if (!z11) {
            if (messageObject.getId() > 0) {
                iArr[i10] = Math.min(messageObject.getId(), iArr[i10]);
                this.f28525k = Math.max(messageObject.getId(), this.f28525k);
            }
        } else {
            iArr[i10] = Math.max(messageObject.getId(), iArr[i10]);
            this.f28525k = Math.min(messageObject.getId(), this.f28525k);
        }
        if (!this.v && messageObject.isVideo()) {
            this.v = true;
        }
        if (!this.f28536w && messageObject.isPhoto()) {
            this.f28536w = true;
        }
        return true;
    }

    public final MessageObject b(int i10, int i11) {
        SparseArray[] sparseArrayArr = this.f28518b;
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
        this.f28517a.remove(messageObject);
        sparseArrayArr[i11].remove(messageObject.getId());
        if (arrayList.isEmpty()) {
            hashMap.remove(messageObject.monthKey);
            this.f28519c.remove(messageObject.monthKey);
        }
        int[] iArr = this.f28521f;
        int i12 = iArr[i11] - 1;
        iArr[i11] = i12;
        if (i12 < 0) {
            iArr[i11] = 0;
        }
        return messageObject;
    }

    public final ArrayList c() {
        if (this.f28532r) {
            return this.f28533s;
        }
        return this.f28517a;
    }

    public final int d() {
        if (this.f28532r) {
            return this.f28534t;
        }
        return this.f28527m;
    }

    public final int e() {
        int[] iArr = this.f28521f;
        return iArr[0] + iArr[1];
    }

    public final void f(int i10, int i11, int i12) {
        SparseArray[] sparseArrayArr = this.f28518b;
        MessageObject messageObject = (MessageObject) sparseArrayArr[i10].get(i11);
        if (messageObject != null) {
            sparseArrayArr[i10].remove(i11);
            sparseArrayArr[i10].put(i12, messageObject);
            messageObject.messageOwner.f19890id = i12;
            int[] iArr = this.f28524j;
            iArr[i10] = Math.min(i12, iArr[i10]);
        }
    }

    public final void g(boolean z10) {
        if (this.f28532r != z10) {
            this.f28532r = z10;
            if (z10) {
                this.f28534t = this.f28527m;
                this.f28535u = this.f28528n;
                ArrayList arrayList = this.f28533s;
                arrayList.clear();
                arrayList.addAll(this.f28517a);
            }
        }
    }
}
