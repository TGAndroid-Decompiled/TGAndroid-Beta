package org.telegram.ui.Components;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MessageObject;
public final class ou0 {
    public boolean f29856g;
    public boolean h;
    public int f29859k;
    public int f29861m;
    public int f29862n;
    public boolean f29863o;
    public int f29864p;
    public boolean f29866r;
    public int f29868t;
    public int f29869u;
    public boolean v;
    public boolean f29870w;
    public final ArrayList f29851a = new ArrayList();
    public final SparseArray[] f29852b = {new SparseArray(), new SparseArray()};
    public final ArrayList f29853c = new ArrayList();
    public final HashMap d = new HashMap();
    public final ArrayList f29854e = new ArrayList();
    public final int[] f29855f = {0, 0};
    public final boolean[] f29857i = {false, true};
    public final int[] f29858j = {0, 0};
    public boolean f29860l = true;
    public int f29865q = 0;
    public final ArrayList f29867s = new ArrayList();
    public f2.c1 f29871x = new f2.c1();

    public final boolean a(MessageObject messageObject, int i10, boolean z4, boolean z10) {
        SparseArray[] sparseArrayArr = this.f29852b;
        if (sparseArrayArr[i10].indexOfKey(messageObject.getId()) >= 0) {
            return false;
        }
        String str = messageObject.monthKey;
        HashMap hashMap = this.d;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(messageObject.monthKey, arrayList);
            ArrayList arrayList2 = this.f29853c;
            if (z4) {
                arrayList2.add(0, messageObject.monthKey);
            } else {
                arrayList2.add(messageObject.monthKey);
            }
        }
        ArrayList arrayList3 = this.f29851a;
        if (z4) {
            arrayList.add(0, messageObject);
            arrayList3.add(0, messageObject);
        } else {
            arrayList.add(messageObject);
            arrayList3.add(messageObject);
        }
        sparseArrayArr[i10].put(messageObject.getId(), messageObject);
        int[] iArr = this.f29858j;
        if (!z10) {
            if (messageObject.getId() > 0) {
                iArr[i10] = Math.min(messageObject.getId(), iArr[i10]);
                this.f29859k = Math.max(messageObject.getId(), this.f29859k);
            }
        } else {
            iArr[i10] = Math.max(messageObject.getId(), iArr[i10]);
            this.f29859k = Math.min(messageObject.getId(), this.f29859k);
        }
        if (!this.v && messageObject.isVideo()) {
            this.v = true;
        }
        if (!this.f29870w && messageObject.isPhoto()) {
            this.f29870w = true;
        }
        return true;
    }

    public final MessageObject b(int i10, int i11) {
        SparseArray[] sparseArrayArr = this.f29852b;
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
        this.f29851a.remove(messageObject);
        sparseArrayArr[i11].remove(messageObject.getId());
        if (arrayList.isEmpty()) {
            hashMap.remove(messageObject.monthKey);
            this.f29853c.remove(messageObject.monthKey);
        }
        int[] iArr = this.f29855f;
        int i12 = iArr[i11] - 1;
        iArr[i11] = i12;
        if (i12 < 0) {
            iArr[i11] = 0;
        }
        return messageObject;
    }

    public final ArrayList c() {
        if (this.f29866r) {
            return this.f29867s;
        }
        return this.f29851a;
    }

    public final int d() {
        if (this.f29866r) {
            return this.f29868t;
        }
        return this.f29861m;
    }

    public final int e() {
        int[] iArr = this.f29855f;
        return iArr[0] + iArr[1];
    }

    public final void f(int i10, int i11, int i12) {
        SparseArray[] sparseArrayArr = this.f29852b;
        MessageObject messageObject = (MessageObject) sparseArrayArr[i10].get(i11);
        if (messageObject != null) {
            sparseArrayArr[i10].remove(i11);
            sparseArrayArr[i10].put(i12, messageObject);
            messageObject.messageOwner.f20864id = i12;
            int[] iArr = this.f29858j;
            iArr[i10] = Math.min(i12, iArr[i10]);
        }
    }

    public final void g(boolean z4) {
        if (this.f29866r != z4) {
            this.f29866r = z4;
            if (z4) {
                this.f29868t = this.f29861m;
                this.f29869u = this.f29862n;
                ArrayList arrayList = this.f29867s;
                arrayList.clear();
                arrayList.addAll(this.f29851a);
            }
        }
    }
}
