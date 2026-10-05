package org.telegram.ui.Components;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MessageObject;
public final class fv0 {
    public boolean f26596g;
    public boolean h;
    public int f26599k;
    public int f26601m;
    public int f26602n;
    public boolean f26603o;
    public int f26604p;
    public boolean f26606r;
    public int f26608t;
    public int f26609u;
    public boolean v;
    public boolean f26610w;
    public final ArrayList f26591a = new ArrayList();
    public final SparseArray[] f26592b = {new SparseArray(), new SparseArray()};
    public final ArrayList f26593c = new ArrayList();
    public final HashMap d = new HashMap();
    public final ArrayList f26594e = new ArrayList();
    public final int[] f26595f = {0, 0};
    public final boolean[] f26597i = {false, true};
    public final int[] f26598j = {0, 0};
    public boolean f26600l = true;
    public int f26605q = 0;
    public final ArrayList f26607s = new ArrayList();
    public s4.u0 f26611x = new s4.u0();

    public final boolean a(MessageObject messageObject, int i10, boolean z10, boolean z11) {
        SparseArray[] sparseArrayArr = this.f26592b;
        if (sparseArrayArr[i10].indexOfKey(messageObject.getId()) >= 0) {
            return false;
        }
        String str = messageObject.monthKey;
        HashMap hashMap = this.d;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(messageObject.monthKey, arrayList);
            ArrayList arrayList2 = this.f26593c;
            if (z10) {
                arrayList2.add(0, messageObject.monthKey);
            } else {
                arrayList2.add(messageObject.monthKey);
            }
        }
        ArrayList arrayList3 = this.f26591a;
        if (z10) {
            arrayList.add(0, messageObject);
            arrayList3.add(0, messageObject);
        } else {
            arrayList.add(messageObject);
            arrayList3.add(messageObject);
        }
        sparseArrayArr[i10].put(messageObject.getId(), messageObject);
        int[] iArr = this.f26598j;
        if (!z11) {
            if (messageObject.getId() > 0) {
                iArr[i10] = Math.min(messageObject.getId(), iArr[i10]);
                this.f26599k = Math.max(messageObject.getId(), this.f26599k);
            }
        } else {
            iArr[i10] = Math.max(messageObject.getId(), iArr[i10]);
            this.f26599k = Math.min(messageObject.getId(), this.f26599k);
        }
        if (!this.v && messageObject.isVideo()) {
            this.v = true;
        }
        if (!this.f26610w && messageObject.isPhoto()) {
            this.f26610w = true;
        }
        return true;
    }

    public final MessageObject b(int i10, int i11) {
        SparseArray[] sparseArrayArr = this.f26592b;
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
        this.f26591a.remove(messageObject);
        sparseArrayArr[i11].remove(messageObject.getId());
        if (arrayList.isEmpty()) {
            hashMap.remove(messageObject.monthKey);
            this.f26593c.remove(messageObject.monthKey);
        }
        int[] iArr = this.f26595f;
        int i12 = iArr[i11] - 1;
        iArr[i11] = i12;
        if (i12 < 0) {
            iArr[i11] = 0;
        }
        return messageObject;
    }

    public final ArrayList c() {
        if (this.f26606r) {
            return this.f26607s;
        }
        return this.f26591a;
    }

    public final int d() {
        if (this.f26606r) {
            return this.f26608t;
        }
        return this.f26601m;
    }

    public final int e() {
        int[] iArr = this.f26595f;
        return iArr[0] + iArr[1];
    }

    public final void f(int i10, int i11, int i12) {
        SparseArray[] sparseArrayArr = this.f26592b;
        MessageObject messageObject = (MessageObject) sparseArrayArr[i10].get(i11);
        if (messageObject != null) {
            sparseArrayArr[i10].remove(i11);
            sparseArrayArr[i10].put(i12, messageObject);
            messageObject.messageOwner.f20068id = i12;
            int[] iArr = this.f26598j;
            iArr[i10] = Math.min(i12, iArr[i10]);
        }
    }

    public final void g(boolean z10) {
        if (this.f26606r != z10) {
            this.f26606r = z10;
            if (z10) {
                this.f26608t = this.f26601m;
                this.f26609u = this.f26602n;
                ArrayList arrayList = this.f26607s;
                arrayList.clear();
                arrayList.addAll(this.f26591a);
            }
        }
    }
}
