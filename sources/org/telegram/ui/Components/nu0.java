package org.telegram.ui.Components;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MessageObject;
public final class nu0 {
    public boolean f29585g;
    public boolean h;
    public int f29588k;
    public int f29590m;
    public int f29591n;
    public boolean f29592o;
    public int f29593p;
    public boolean f29595r;
    public int f29597t;
    public int f29598u;
    public boolean v;
    public boolean f29599w;
    public final ArrayList f29580a = new ArrayList();
    public final SparseArray[] f29581b = {new SparseArray(), new SparseArray()};
    public final ArrayList f29582c = new ArrayList();
    public final HashMap d = new HashMap();
    public final ArrayList f29583e = new ArrayList();
    public final int[] f29584f = {0, 0};
    public final boolean[] f29586i = {false, true};
    public final int[] f29587j = {0, 0};
    public boolean f29589l = true;
    public int f29594q = 0;
    public final ArrayList f29596s = new ArrayList();
    public f2.c1 f29600x = new f2.c1();

    public final boolean a(MessageObject messageObject, int i10, boolean z4, boolean z10) {
        SparseArray[] sparseArrayArr = this.f29581b;
        if (sparseArrayArr[i10].indexOfKey(messageObject.getId()) >= 0) {
            return false;
        }
        String str = messageObject.monthKey;
        HashMap hashMap = this.d;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(messageObject.monthKey, arrayList);
            ArrayList arrayList2 = this.f29582c;
            if (z4) {
                arrayList2.add(0, messageObject.monthKey);
            } else {
                arrayList2.add(messageObject.monthKey);
            }
        }
        ArrayList arrayList3 = this.f29580a;
        if (z4) {
            arrayList.add(0, messageObject);
            arrayList3.add(0, messageObject);
        } else {
            arrayList.add(messageObject);
            arrayList3.add(messageObject);
        }
        sparseArrayArr[i10].put(messageObject.getId(), messageObject);
        int[] iArr = this.f29587j;
        if (!z10) {
            if (messageObject.getId() > 0) {
                iArr[i10] = Math.min(messageObject.getId(), iArr[i10]);
                this.f29588k = Math.max(messageObject.getId(), this.f29588k);
            }
        } else {
            iArr[i10] = Math.max(messageObject.getId(), iArr[i10]);
            this.f29588k = Math.min(messageObject.getId(), this.f29588k);
        }
        if (!this.v && messageObject.isVideo()) {
            this.v = true;
        }
        if (!this.f29599w && messageObject.isPhoto()) {
            this.f29599w = true;
        }
        return true;
    }

    public final MessageObject b(int i10, int i11) {
        SparseArray[] sparseArrayArr = this.f29581b;
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
        this.f29580a.remove(messageObject);
        sparseArrayArr[i11].remove(messageObject.getId());
        if (arrayList.isEmpty()) {
            hashMap.remove(messageObject.monthKey);
            this.f29582c.remove(messageObject.monthKey);
        }
        int[] iArr = this.f29584f;
        int i12 = iArr[i11] - 1;
        iArr[i11] = i12;
        if (i12 < 0) {
            iArr[i11] = 0;
        }
        return messageObject;
    }

    public final ArrayList c() {
        if (this.f29595r) {
            return this.f29596s;
        }
        return this.f29580a;
    }

    public final int d() {
        if (this.f29595r) {
            return this.f29597t;
        }
        return this.f29590m;
    }

    public final int e() {
        int[] iArr = this.f29584f;
        return iArr[0] + iArr[1];
    }

    public final void f(int i10, int i11, int i12) {
        SparseArray[] sparseArrayArr = this.f29581b;
        MessageObject messageObject = (MessageObject) sparseArrayArr[i10].get(i11);
        if (messageObject != null) {
            sparseArrayArr[i10].remove(i11);
            sparseArrayArr[i10].put(i12, messageObject);
            messageObject.messageOwner.f20866id = i12;
            int[] iArr = this.f29587j;
            iArr[i10] = Math.min(i12, iArr[i10]);
        }
    }

    public final void g(boolean z4) {
        if (this.f29595r != z4) {
            this.f29595r = z4;
            if (z4) {
                this.f29597t = this.f29590m;
                this.f29598u = this.f29591n;
                ArrayList arrayList = this.f29596s;
                arrayList.clear();
                arrayList.addAll(this.f29580a);
            }
        }
    }
}
