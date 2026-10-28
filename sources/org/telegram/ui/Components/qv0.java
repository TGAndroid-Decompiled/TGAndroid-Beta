package org.telegram.ui.Components;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MessageObject;
public final class qv0 {
    public boolean f32037g;
    public boolean h;
    public int f32040k;
    public int f32042m;
    public int f32043n;
    public boolean f32044o;
    public int f32045p;
    public boolean f32047r;
    public int f32049t;
    public int f32050u;
    public boolean v;
    public boolean f32051w;
    public final ArrayList f32033a = new ArrayList();
    public final SparseArray[] f32034b = {new SparseArray(), new SparseArray()};
    public final ArrayList f32035c = new ArrayList();
    public final HashMap d = new HashMap();
    public final ArrayList e = new ArrayList();
    public final int[] f32036f = {0, 0};
    public final boolean[] f32038i = {false, true};
    public final int[] f32039j = {0, 0};
    public boolean f32041l = true;
    public int f32046q = 0;
    public final ArrayList f32048s = new ArrayList();
    public s4.w0 f32052x = new s4.w0();

    public final boolean a(MessageObject messageObject, int i10, boolean z10, boolean z11) {
        SparseArray[] sparseArrayArr = this.f32034b;
        if (sparseArrayArr[i10].indexOfKey(messageObject.getId()) >= 0) {
            return false;
        }
        String str = messageObject.monthKey;
        HashMap hashMap = this.d;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(messageObject.monthKey, arrayList);
            ArrayList arrayList2 = this.f32035c;
            if (z10) {
                arrayList2.add(0, messageObject.monthKey);
            } else {
                arrayList2.add(messageObject.monthKey);
            }
        }
        ArrayList arrayList3 = this.f32033a;
        if (z10) {
            arrayList.add(0, messageObject);
            arrayList3.add(0, messageObject);
        } else {
            arrayList.add(messageObject);
            arrayList3.add(messageObject);
        }
        sparseArrayArr[i10].put(messageObject.getId(), messageObject);
        int[] iArr = this.f32039j;
        if (!z11) {
            if (messageObject.getId() > 0) {
                iArr[i10] = Math.min(messageObject.getId(), iArr[i10]);
                this.f32040k = Math.max(messageObject.getId(), this.f32040k);
            }
        } else {
            iArr[i10] = Math.max(messageObject.getId(), iArr[i10]);
            this.f32040k = Math.min(messageObject.getId(), this.f32040k);
        }
        if (!this.v && messageObject.isVideo()) {
            this.v = true;
        }
        if (!this.f32051w && messageObject.isPhoto()) {
            this.f32051w = true;
        }
        return true;
    }

    public final MessageObject b(int i10, int i11) {
        SparseArray[] sparseArrayArr = this.f32034b;
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
        this.f32033a.remove(messageObject);
        sparseArrayArr[i11].remove(messageObject.getId());
        if (arrayList.isEmpty()) {
            hashMap.remove(messageObject.monthKey);
            this.f32035c.remove(messageObject.monthKey);
        }
        int[] iArr = this.f32036f;
        int i12 = iArr[i11] - 1;
        iArr[i11] = i12;
        if (i12 < 0) {
            iArr[i11] = 0;
        }
        return messageObject;
    }

    public final ArrayList c() {
        if (this.f32047r) {
            return this.f32048s;
        }
        return this.f32033a;
    }

    public final int d() {
        if (this.f32047r) {
            return this.f32049t;
        }
        return this.f32042m;
    }

    public final int e() {
        int[] iArr = this.f32036f;
        return iArr[0] + iArr[1];
    }

    public final void f(int i10, int i11, int i12) {
        SparseArray[] sparseArrayArr = this.f32034b;
        MessageObject messageObject = (MessageObject) sparseArrayArr[i10].get(i11);
        if (messageObject != null) {
            sparseArrayArr[i10].remove(i11);
            sparseArrayArr[i10].put(i12, messageObject);
            messageObject.messageOwner.f22049id = i12;
            int[] iArr = this.f32039j;
            iArr[i10] = Math.min(i12, iArr[i10]);
        }
    }

    public final void g(boolean z10) {
        if (this.f32047r != z10) {
            this.f32047r = z10;
            if (z10) {
                this.f32049t = this.f32042m;
                this.f32050u = this.f32043n;
                ArrayList arrayList = this.f32048s;
                arrayList.clear();
                arrayList.addAll(this.f32033a);
            }
        }
    }
}
