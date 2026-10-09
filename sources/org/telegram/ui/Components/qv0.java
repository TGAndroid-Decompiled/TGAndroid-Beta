package org.telegram.ui.Components;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MessageObject;
public final class qv0 {
    public boolean f30279g;
    public boolean h;
    public int f30282k;
    public int f30284m;
    public int f30285n;
    public boolean f30286o;
    public int f30287p;
    public boolean f30289r;
    public int f30291t;
    public int f30292u;
    public boolean v;
    public boolean f30293w;
    public final ArrayList f30274a = new ArrayList();
    public final SparseArray[] f30275b = {new SparseArray(), new SparseArray()};
    public final ArrayList f30276c = new ArrayList();
    public final HashMap d = new HashMap();
    public final ArrayList f30277e = new ArrayList();
    public final int[] f30278f = {0, 0};
    public final boolean[] f30280i = {false, true};
    public final int[] f30281j = {0, 0};
    public boolean f30283l = true;
    public int f30288q = 0;
    public final ArrayList f30290s = new ArrayList();
    public s4.v0 f30294x = new s4.v0();

    public final boolean a(MessageObject messageObject, int i10, boolean z10, boolean z11) {
        SparseArray[] sparseArrayArr = this.f30275b;
        if (sparseArrayArr[i10].indexOfKey(messageObject.getId()) >= 0) {
            return false;
        }
        String str = messageObject.monthKey;
        HashMap hashMap = this.d;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(messageObject.monthKey, arrayList);
            ArrayList arrayList2 = this.f30276c;
            if (z10) {
                arrayList2.add(0, messageObject.monthKey);
            } else {
                arrayList2.add(messageObject.monthKey);
            }
        }
        ArrayList arrayList3 = this.f30274a;
        if (z10) {
            arrayList.add(0, messageObject);
            arrayList3.add(0, messageObject);
        } else {
            arrayList.add(messageObject);
            arrayList3.add(messageObject);
        }
        sparseArrayArr[i10].put(messageObject.getId(), messageObject);
        int[] iArr = this.f30281j;
        if (!z11) {
            if (messageObject.getId() > 0) {
                iArr[i10] = Math.min(messageObject.getId(), iArr[i10]);
                this.f30282k = Math.max(messageObject.getId(), this.f30282k);
            }
        } else {
            iArr[i10] = Math.max(messageObject.getId(), iArr[i10]);
            this.f30282k = Math.min(messageObject.getId(), this.f30282k);
        }
        if (!this.v && messageObject.isVideo()) {
            this.v = true;
        }
        if (!this.f30293w && messageObject.isPhoto()) {
            this.f30293w = true;
        }
        return true;
    }

    public final MessageObject b(int i10, int i11) {
        SparseArray[] sparseArrayArr = this.f30275b;
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
        this.f30274a.remove(messageObject);
        sparseArrayArr[i11].remove(messageObject.getId());
        if (arrayList.isEmpty()) {
            hashMap.remove(messageObject.monthKey);
            this.f30276c.remove(messageObject.monthKey);
        }
        int[] iArr = this.f30278f;
        int i12 = iArr[i11] - 1;
        iArr[i11] = i12;
        if (i12 < 0) {
            iArr[i11] = 0;
        }
        return messageObject;
    }

    public final ArrayList c() {
        if (this.f30289r) {
            return this.f30290s;
        }
        return this.f30274a;
    }

    public final int d() {
        if (this.f30289r) {
            return this.f30291t;
        }
        return this.f30284m;
    }

    public final int e() {
        int[] iArr = this.f30278f;
        return iArr[0] + iArr[1];
    }

    public final void f(int i10, int i11, int i12) {
        SparseArray[] sparseArrayArr = this.f30275b;
        MessageObject messageObject = (MessageObject) sparseArrayArr[i10].get(i11);
        if (messageObject != null) {
            sparseArrayArr[i10].remove(i11);
            sparseArrayArr[i10].put(i12, messageObject);
            messageObject.messageOwner.f20059id = i12;
            int[] iArr = this.f30281j;
            iArr[i10] = Math.min(i12, iArr[i10]);
        }
    }

    public final void g(boolean z10) {
        if (this.f30289r != z10) {
            this.f30289r = z10;
            if (z10) {
                this.f30291t = this.f30284m;
                this.f30292u = this.f30285n;
                ArrayList arrayList = this.f30290s;
                arrayList.clear();
                arrayList.addAll(this.f30274a);
            }
        }
    }
}
