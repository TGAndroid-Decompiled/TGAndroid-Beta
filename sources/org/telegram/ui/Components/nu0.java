package org.telegram.ui.Components;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MessageObject;
public final class nu0 {
    public boolean f26516g;
    public boolean h;
    public int f26519k;
    public int f26521m;
    public int f26522n;
    public boolean f26523o;
    public int f26524p;
    public boolean f26526r;
    public int f26528t;
    public int f26529u;
    public boolean v;
    public boolean f26530w;
    public final ArrayList f26512a = new ArrayList();
    public final SparseArray[] f26513b = {new SparseArray(), new SparseArray()};
    public final ArrayList f26514c = new ArrayList();
    public final HashMap d = new HashMap();
    public final ArrayList e = new ArrayList();
    public final int[] f26515f = {0, 0};
    public final boolean[] f26517i = {false, true};
    public final int[] f26518j = {0, 0};
    public boolean f26520l = true;
    public int f26525q = 0;
    public final ArrayList f26527s = new ArrayList();
    public s4.u0 f26531x = new s4.u0();

    public final boolean a(MessageObject messageObject, int i10, boolean z10, boolean z11) {
        SparseArray[] sparseArrayArr = this.f26513b;
        if (sparseArrayArr[i10].indexOfKey(messageObject.getId()) >= 0) {
            return false;
        }
        String str = messageObject.monthKey;
        HashMap hashMap = this.d;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(messageObject.monthKey, arrayList);
            ArrayList arrayList2 = this.f26514c;
            if (z10) {
                arrayList2.add(0, messageObject.monthKey);
            } else {
                arrayList2.add(messageObject.monthKey);
            }
        }
        ArrayList arrayList3 = this.f26512a;
        if (z10) {
            arrayList.add(0, messageObject);
            arrayList3.add(0, messageObject);
        } else {
            arrayList.add(messageObject);
            arrayList3.add(messageObject);
        }
        sparseArrayArr[i10].put(messageObject.getId(), messageObject);
        int[] iArr = this.f26518j;
        if (!z11) {
            if (messageObject.getId() > 0) {
                iArr[i10] = Math.min(messageObject.getId(), iArr[i10]);
                this.f26519k = Math.max(messageObject.getId(), this.f26519k);
            }
        } else {
            iArr[i10] = Math.max(messageObject.getId(), iArr[i10]);
            this.f26519k = Math.min(messageObject.getId(), this.f26519k);
        }
        if (!this.v && messageObject.isVideo()) {
            this.v = true;
        }
        if (!this.f26530w && messageObject.isPhoto()) {
            this.f26530w = true;
        }
        return true;
    }

    public final MessageObject b(int i10, int i11) {
        SparseArray[] sparseArrayArr = this.f26513b;
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
        this.f26512a.remove(messageObject);
        sparseArrayArr[i11].remove(messageObject.getId());
        if (arrayList.isEmpty()) {
            hashMap.remove(messageObject.monthKey);
            this.f26514c.remove(messageObject.monthKey);
        }
        int[] iArr = this.f26515f;
        int i12 = iArr[i11] - 1;
        iArr[i11] = i12;
        if (i12 < 0) {
            iArr[i11] = 0;
        }
        return messageObject;
    }

    public final ArrayList c() {
        if (this.f26526r) {
            return this.f26527s;
        }
        return this.f26512a;
    }

    public final int d() {
        if (this.f26526r) {
            return this.f26528t;
        }
        return this.f26521m;
    }

    public final int e() {
        int[] iArr = this.f26515f;
        return iArr[0] + iArr[1];
    }

    public final void f(int i10, int i11, int i12) {
        SparseArray[] sparseArrayArr = this.f26513b;
        MessageObject messageObject = (MessageObject) sparseArrayArr[i10].get(i11);
        if (messageObject != null) {
            sparseArrayArr[i10].remove(i11);
            sparseArrayArr[i10].put(i12, messageObject);
            messageObject.messageOwner.f18104id = i12;
            int[] iArr = this.f26518j;
            iArr[i10] = Math.min(i12, iArr[i10]);
        }
    }

    public final void g(boolean z10) {
        if (this.f26526r != z10) {
            this.f26526r = z10;
            if (z10) {
                this.f26528t = this.f26521m;
                this.f26529u = this.f26522n;
                ArrayList arrayList = this.f26527s;
                arrayList.clear();
                arrayList.addAll(this.f26512a);
            }
        }
    }
}
