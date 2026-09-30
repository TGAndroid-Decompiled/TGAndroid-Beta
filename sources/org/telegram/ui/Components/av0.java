package org.telegram.ui.Components;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MessageObject;
public final class av0 {
    public boolean f22732g;
    public boolean h;
    public int f22735k;
    public int f22737m;
    public int f22738n;
    public boolean f22739o;
    public int f22740p;
    public boolean f22742r;
    public int f22744t;
    public int f22745u;
    public boolean v;
    public boolean f22746w;
    public final ArrayList f22728a = new ArrayList();
    public final SparseArray[] f22729b = {new SparseArray(), new SparseArray()};
    public final ArrayList f22730c = new ArrayList();
    public final HashMap d = new HashMap();
    public final ArrayList e = new ArrayList();
    public final int[] f22731f = {0, 0};
    public final boolean[] f22733i = {false, true};
    public final int[] f22734j = {0, 0};
    public boolean f22736l = true;
    public int f22741q = 0;
    public final ArrayList f22743s = new ArrayList();
    public s4.u0 f22747x = new s4.u0();

    public final boolean a(MessageObject messageObject, int i10, boolean z10, boolean z11) {
        SparseArray[] sparseArrayArr = this.f22729b;
        if (sparseArrayArr[i10].indexOfKey(messageObject.getId()) >= 0) {
            return false;
        }
        String str = messageObject.monthKey;
        HashMap hashMap = this.d;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(messageObject.monthKey, arrayList);
            ArrayList arrayList2 = this.f22730c;
            if (z10) {
                arrayList2.add(0, messageObject.monthKey);
            } else {
                arrayList2.add(messageObject.monthKey);
            }
        }
        ArrayList arrayList3 = this.f22728a;
        if (z10) {
            arrayList.add(0, messageObject);
            arrayList3.add(0, messageObject);
        } else {
            arrayList.add(messageObject);
            arrayList3.add(messageObject);
        }
        sparseArrayArr[i10].put(messageObject.getId(), messageObject);
        int[] iArr = this.f22734j;
        if (!z11) {
            if (messageObject.getId() > 0) {
                iArr[i10] = Math.min(messageObject.getId(), iArr[i10]);
                this.f22735k = Math.max(messageObject.getId(), this.f22735k);
            }
        } else {
            iArr[i10] = Math.max(messageObject.getId(), iArr[i10]);
            this.f22735k = Math.min(messageObject.getId(), this.f22735k);
        }
        if (!this.v && messageObject.isVideo()) {
            this.v = true;
        }
        if (!this.f22746w && messageObject.isPhoto()) {
            this.f22746w = true;
        }
        return true;
    }

    public final MessageObject b(int i10, int i11) {
        SparseArray[] sparseArrayArr = this.f22729b;
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
        this.f22728a.remove(messageObject);
        sparseArrayArr[i11].remove(messageObject.getId());
        if (arrayList.isEmpty()) {
            hashMap.remove(messageObject.monthKey);
            this.f22730c.remove(messageObject.monthKey);
        }
        int[] iArr = this.f22731f;
        int i12 = iArr[i11] - 1;
        iArr[i11] = i12;
        if (i12 < 0) {
            iArr[i11] = 0;
        }
        return messageObject;
    }

    public final ArrayList c() {
        if (this.f22742r) {
            return this.f22743s;
        }
        return this.f22728a;
    }

    public final int d() {
        if (this.f22742r) {
            return this.f22744t;
        }
        return this.f22737m;
    }

    public final int e() {
        int[] iArr = this.f22731f;
        return iArr[0] + iArr[1];
    }

    public final void f(int i10, int i11, int i12) {
        SparseArray[] sparseArrayArr = this.f22729b;
        MessageObject messageObject = (MessageObject) sparseArrayArr[i10].get(i11);
        if (messageObject != null) {
            sparseArrayArr[i10].remove(i11);
            sparseArrayArr[i10].put(i12, messageObject);
            messageObject.messageOwner.f18358id = i12;
            int[] iArr = this.f22734j;
            iArr[i10] = Math.min(i12, iArr[i10]);
        }
    }

    public final void g(boolean z10) {
        if (this.f22742r != z10) {
            this.f22742r = z10;
            if (z10) {
                this.f22744t = this.f22737m;
                this.f22745u = this.f22738n;
                ArrayList arrayList = this.f22743s;
                arrayList.clear();
                arrayList.addAll(this.f22728a);
            }
        }
    }
}
