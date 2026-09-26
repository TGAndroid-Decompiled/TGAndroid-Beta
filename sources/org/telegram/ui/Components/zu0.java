package org.telegram.ui.Components;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MessageObject;
public final class zu0 {
    public boolean f30973g;
    public boolean h;
    public int f30976k;
    public int f30978m;
    public int f30979n;
    public boolean f30980o;
    public int f30981p;
    public boolean f30983r;
    public int f30985t;
    public int f30986u;
    public boolean v;
    public boolean f30987w;
    public final ArrayList f30969a = new ArrayList();
    public final SparseArray[] f30970b = {new SparseArray(), new SparseArray()};
    public final ArrayList f30971c = new ArrayList();
    public final HashMap d = new HashMap();
    public final ArrayList e = new ArrayList();
    public final int[] f30972f = {0, 0};
    public final boolean[] f30974i = {false, true};
    public final int[] f30975j = {0, 0};
    public boolean f30977l = true;
    public int f30982q = 0;
    public final ArrayList f30984s = new ArrayList();
    public s4.u0 f30988x = new s4.u0();

    public final boolean a(MessageObject messageObject, int i10, boolean z10, boolean z11) {
        SparseArray[] sparseArrayArr = this.f30970b;
        if (sparseArrayArr[i10].indexOfKey(messageObject.getId()) >= 0) {
            return false;
        }
        String str = messageObject.monthKey;
        HashMap hashMap = this.d;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(messageObject.monthKey, arrayList);
            ArrayList arrayList2 = this.f30971c;
            if (z10) {
                arrayList2.add(0, messageObject.monthKey);
            } else {
                arrayList2.add(messageObject.monthKey);
            }
        }
        ArrayList arrayList3 = this.f30969a;
        if (z10) {
            arrayList.add(0, messageObject);
            arrayList3.add(0, messageObject);
        } else {
            arrayList.add(messageObject);
            arrayList3.add(messageObject);
        }
        sparseArrayArr[i10].put(messageObject.getId(), messageObject);
        int[] iArr = this.f30975j;
        if (!z11) {
            if (messageObject.getId() > 0) {
                iArr[i10] = Math.min(messageObject.getId(), iArr[i10]);
                this.f30976k = Math.max(messageObject.getId(), this.f30976k);
            }
        } else {
            iArr[i10] = Math.max(messageObject.getId(), iArr[i10]);
            this.f30976k = Math.min(messageObject.getId(), this.f30976k);
        }
        if (!this.v && messageObject.isVideo()) {
            this.v = true;
        }
        if (!this.f30987w && messageObject.isPhoto()) {
            this.f30987w = true;
        }
        return true;
    }

    public final MessageObject b(int i10, int i11) {
        SparseArray[] sparseArrayArr = this.f30970b;
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
        this.f30969a.remove(messageObject);
        sparseArrayArr[i11].remove(messageObject.getId());
        if (arrayList.isEmpty()) {
            hashMap.remove(messageObject.monthKey);
            this.f30971c.remove(messageObject.monthKey);
        }
        int[] iArr = this.f30972f;
        int i12 = iArr[i11] - 1;
        iArr[i11] = i12;
        if (i12 < 0) {
            iArr[i11] = 0;
        }
        return messageObject;
    }

    public final ArrayList c() {
        if (this.f30983r) {
            return this.f30984s;
        }
        return this.f30969a;
    }

    public final int d() {
        if (this.f30983r) {
            return this.f30985t;
        }
        return this.f30978m;
    }

    public final int e() {
        int[] iArr = this.f30972f;
        return iArr[0] + iArr[1];
    }

    public final void f(int i10, int i11, int i12) {
        SparseArray[] sparseArrayArr = this.f30970b;
        MessageObject messageObject = (MessageObject) sparseArrayArr[i10].get(i11);
        if (messageObject != null) {
            sparseArrayArr[i10].remove(i11);
            sparseArrayArr[i10].put(i12, messageObject);
            messageObject.messageOwner.f18356id = i12;
            int[] iArr = this.f30975j;
            iArr[i10] = Math.min(i12, iArr[i10]);
        }
    }

    public final void g(boolean z10) {
        if (this.f30983r != z10) {
            this.f30983r = z10;
            if (z10) {
                this.f30985t = this.f30978m;
                this.f30986u = this.f30979n;
                ArrayList arrayList = this.f30984s;
                arrayList.clear();
                arrayList.addAll(this.f30969a);
            }
        }
    }
}
