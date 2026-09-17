package org.telegram.ui.Components;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MessageObject;
public final class ou0 {
    public boolean f26853g;
    public boolean h;
    public int f26856k;
    public int f26858m;
    public int f26859n;
    public boolean f26860o;
    public int f26861p;
    public boolean f26863r;
    public int f26865t;
    public int f26866u;
    public boolean v;
    public boolean f26867w;
    public final ArrayList f26849a = new ArrayList();
    public final SparseArray[] f26850b = {new SparseArray(), new SparseArray()};
    public final ArrayList f26851c = new ArrayList();
    public final HashMap d = new HashMap();
    public final ArrayList e = new ArrayList();
    public final int[] f26852f = {0, 0};
    public final boolean[] f26854i = {false, true};
    public final int[] f26855j = {0, 0};
    public boolean f26857l = true;
    public int f26862q = 0;
    public final ArrayList f26864s = new ArrayList();
    public s4.u0 f26868x = new s4.u0();

    public final boolean a(MessageObject messageObject, int i10, boolean z10, boolean z11) {
        SparseArray[] sparseArrayArr = this.f26850b;
        if (sparseArrayArr[i10].indexOfKey(messageObject.getId()) >= 0) {
            return false;
        }
        String str = messageObject.monthKey;
        HashMap hashMap = this.d;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(messageObject.monthKey, arrayList);
            ArrayList arrayList2 = this.f26851c;
            if (z10) {
                arrayList2.add(0, messageObject.monthKey);
            } else {
                arrayList2.add(messageObject.monthKey);
            }
        }
        ArrayList arrayList3 = this.f26849a;
        if (z10) {
            arrayList.add(0, messageObject);
            arrayList3.add(0, messageObject);
        } else {
            arrayList.add(messageObject);
            arrayList3.add(messageObject);
        }
        sparseArrayArr[i10].put(messageObject.getId(), messageObject);
        int[] iArr = this.f26855j;
        if (!z11) {
            if (messageObject.getId() > 0) {
                iArr[i10] = Math.min(messageObject.getId(), iArr[i10]);
                this.f26856k = Math.max(messageObject.getId(), this.f26856k);
            }
        } else {
            iArr[i10] = Math.max(messageObject.getId(), iArr[i10]);
            this.f26856k = Math.min(messageObject.getId(), this.f26856k);
        }
        if (!this.v && messageObject.isVideo()) {
            this.v = true;
        }
        if (!this.f26867w && messageObject.isPhoto()) {
            this.f26867w = true;
        }
        return true;
    }

    public final MessageObject b(int i10, int i11) {
        SparseArray[] sparseArrayArr = this.f26850b;
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
        this.f26849a.remove(messageObject);
        sparseArrayArr[i11].remove(messageObject.getId());
        if (arrayList.isEmpty()) {
            hashMap.remove(messageObject.monthKey);
            this.f26851c.remove(messageObject.monthKey);
        }
        int[] iArr = this.f26852f;
        int i12 = iArr[i11] - 1;
        iArr[i11] = i12;
        if (i12 < 0) {
            iArr[i11] = 0;
        }
        return messageObject;
    }

    public final ArrayList c() {
        if (this.f26863r) {
            return this.f26864s;
        }
        return this.f26849a;
    }

    public final int d() {
        if (this.f26863r) {
            return this.f26865t;
        }
        return this.f26858m;
    }

    public final int e() {
        int[] iArr = this.f26852f;
        return iArr[0] + iArr[1];
    }

    public final void f(int i10, int i11, int i12) {
        SparseArray[] sparseArrayArr = this.f26850b;
        MessageObject messageObject = (MessageObject) sparseArrayArr[i10].get(i11);
        if (messageObject != null) {
            sparseArrayArr[i10].remove(i11);
            sparseArrayArr[i10].put(i12, messageObject);
            messageObject.messageOwner.f18142id = i12;
            int[] iArr = this.f26855j;
            iArr[i10] = Math.min(i12, iArr[i10]);
        }
    }

    public final void g(boolean z10) {
        if (this.f26863r != z10) {
            this.f26863r = z10;
            if (z10) {
                this.f26865t = this.f26858m;
                this.f26866u = this.f26859n;
                ArrayList arrayList = this.f26864s;
                arrayList.clear();
                arrayList.addAll(this.f26849a);
            }
        }
    }
}
