package org.telegram.ui.Components;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MessageObject;
public final class nu0 {
    public boolean f26580g;
    public boolean h;
    public int f26583k;
    public int f26585m;
    public int f26586n;
    public boolean f26587o;
    public int f26588p;
    public boolean f26590r;
    public int f26592t;
    public int f26593u;
    public boolean v;
    public boolean f26594w;
    public final ArrayList f26576a = new ArrayList();
    public final SparseArray[] f26577b = {new SparseArray(), new SparseArray()};
    public final ArrayList f26578c = new ArrayList();
    public final HashMap d = new HashMap();
    public final ArrayList e = new ArrayList();
    public final int[] f26579f = {0, 0};
    public final boolean[] f26581i = {false, true};
    public final int[] f26582j = {0, 0};
    public boolean f26584l = true;
    public int f26589q = 0;
    public final ArrayList f26591s = new ArrayList();
    public s4.u0 f26595x = new s4.u0();

    public final boolean a(MessageObject messageObject, int i10, boolean z10, boolean z11) {
        SparseArray[] sparseArrayArr = this.f26577b;
        if (sparseArrayArr[i10].indexOfKey(messageObject.getId()) >= 0) {
            return false;
        }
        String str = messageObject.monthKey;
        HashMap hashMap = this.d;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(messageObject.monthKey, arrayList);
            ArrayList arrayList2 = this.f26578c;
            if (z10) {
                arrayList2.add(0, messageObject.monthKey);
            } else {
                arrayList2.add(messageObject.monthKey);
            }
        }
        ArrayList arrayList3 = this.f26576a;
        if (z10) {
            arrayList.add(0, messageObject);
            arrayList3.add(0, messageObject);
        } else {
            arrayList.add(messageObject);
            arrayList3.add(messageObject);
        }
        sparseArrayArr[i10].put(messageObject.getId(), messageObject);
        int[] iArr = this.f26582j;
        if (!z11) {
            if (messageObject.getId() > 0) {
                iArr[i10] = Math.min(messageObject.getId(), iArr[i10]);
                this.f26583k = Math.max(messageObject.getId(), this.f26583k);
            }
        } else {
            iArr[i10] = Math.max(messageObject.getId(), iArr[i10]);
            this.f26583k = Math.min(messageObject.getId(), this.f26583k);
        }
        if (!this.v && messageObject.isVideo()) {
            this.v = true;
        }
        if (!this.f26594w && messageObject.isPhoto()) {
            this.f26594w = true;
        }
        return true;
    }

    public final MessageObject b(int i10, int i11) {
        SparseArray[] sparseArrayArr = this.f26577b;
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
        this.f26576a.remove(messageObject);
        sparseArrayArr[i11].remove(messageObject.getId());
        if (arrayList.isEmpty()) {
            hashMap.remove(messageObject.monthKey);
            this.f26578c.remove(messageObject.monthKey);
        }
        int[] iArr = this.f26579f;
        int i12 = iArr[i11] - 1;
        iArr[i11] = i12;
        if (i12 < 0) {
            iArr[i11] = 0;
        }
        return messageObject;
    }

    public final ArrayList c() {
        if (this.f26590r) {
            return this.f26591s;
        }
        return this.f26576a;
    }

    public final int d() {
        if (this.f26590r) {
            return this.f26592t;
        }
        return this.f26585m;
    }

    public final int e() {
        int[] iArr = this.f26579f;
        return iArr[0] + iArr[1];
    }

    public final void f(int i10, int i11, int i12) {
        SparseArray[] sparseArrayArr = this.f26577b;
        MessageObject messageObject = (MessageObject) sparseArrayArr[i10].get(i11);
        if (messageObject != null) {
            sparseArrayArr[i10].remove(i11);
            sparseArrayArr[i10].put(i12, messageObject);
            messageObject.messageOwner.f18133id = i12;
            int[] iArr = this.f26582j;
            iArr[i10] = Math.min(i12, iArr[i10]);
        }
    }

    public final void g(boolean z10) {
        if (this.f26590r != z10) {
            this.f26590r = z10;
            if (z10) {
                this.f26592t = this.f26585m;
                this.f26593u = this.f26586n;
                ArrayList arrayList = this.f26591s;
                arrayList.clear();
                arrayList.addAll(this.f26576a);
            }
        }
    }
}
