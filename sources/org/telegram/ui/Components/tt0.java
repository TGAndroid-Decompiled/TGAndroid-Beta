package org.telegram.ui.Components;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MessageObject;
public final class tt0 {
    public boolean f32793g;
    public boolean h;
    public int f32796k;
    public int f32798m;
    public int f32799n;
    public boolean f32800o;
    public int f32801p;
    public boolean f32803r;
    public int f32805t;
    public int f32806u;
    public boolean v;
    public boolean f32807w;
    public final ArrayList f32788a = new ArrayList();
    public final SparseArray[] f32789b = {new SparseArray(), new SparseArray()};
    public final ArrayList f32790c = new ArrayList();
    public final HashMap d = new HashMap();
    public final ArrayList f32791e = new ArrayList();
    public final int[] f32792f = {0, 0};
    public final boolean[] f32794i = {false, true};
    public final int[] f32795j = {0, 0};
    public boolean f32797l = true;
    public int f32802q = 0;
    public final ArrayList f32804s = new ArrayList();
    public f2.f1 f32808x = new f2.f1();

    public final boolean a(MessageObject messageObject, int i9, boolean z10, boolean z11) {
        SparseArray[] sparseArrayArr = this.f32789b;
        if (sparseArrayArr[i9].indexOfKey(messageObject.getId()) >= 0) {
            return false;
        }
        String str = messageObject.monthKey;
        HashMap hashMap = this.d;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(messageObject.monthKey, arrayList);
            ArrayList arrayList2 = this.f32790c;
            if (z10) {
                arrayList2.add(0, messageObject.monthKey);
            } else {
                arrayList2.add(messageObject.monthKey);
            }
        }
        ArrayList arrayList3 = this.f32788a;
        if (z10) {
            arrayList.add(0, messageObject);
            arrayList3.add(0, messageObject);
        } else {
            arrayList.add(messageObject);
            arrayList3.add(messageObject);
        }
        sparseArrayArr[i9].put(messageObject.getId(), messageObject);
        int[] iArr = this.f32795j;
        if (!z11) {
            if (messageObject.getId() > 0) {
                iArr[i9] = Math.min(messageObject.getId(), iArr[i9]);
                this.f32796k = Math.max(messageObject.getId(), this.f32796k);
            }
        } else {
            iArr[i9] = Math.max(messageObject.getId(), iArr[i9]);
            this.f32796k = Math.min(messageObject.getId(), this.f32796k);
        }
        if (!this.v && messageObject.isVideo()) {
            this.v = true;
        }
        if (!this.f32807w && messageObject.isPhoto()) {
            this.f32807w = true;
        }
        return true;
    }

    public final MessageObject b(int i9, int i10) {
        SparseArray[] sparseArrayArr = this.f32789b;
        MessageObject messageObject = (MessageObject) sparseArrayArr[i10].get(i9);
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
        this.f32788a.remove(messageObject);
        sparseArrayArr[i10].remove(messageObject.getId());
        if (arrayList.isEmpty()) {
            hashMap.remove(messageObject.monthKey);
            this.f32790c.remove(messageObject.monthKey);
        }
        int[] iArr = this.f32792f;
        int i11 = iArr[i10] - 1;
        iArr[i10] = i11;
        if (i11 < 0) {
            iArr[i10] = 0;
        }
        return messageObject;
    }

    public final ArrayList c() {
        if (this.f32803r) {
            return this.f32804s;
        }
        return this.f32788a;
    }

    public final int d() {
        if (this.f32803r) {
            return this.f32805t;
        }
        return this.f32798m;
    }

    public final int e() {
        int[] iArr = this.f32792f;
        return iArr[0] + iArr[1];
    }

    public final void f(int i9, int i10, int i11) {
        SparseArray[] sparseArrayArr = this.f32789b;
        MessageObject messageObject = (MessageObject) sparseArrayArr[i9].get(i10);
        if (messageObject != null) {
            sparseArrayArr[i9].remove(i10);
            sparseArrayArr[i9].put(i11, messageObject);
            messageObject.messageOwner.f22401id = i11;
            int[] iArr = this.f32795j;
            iArr[i9] = Math.min(i11, iArr[i9]);
        }
    }

    public final void g(boolean z10) {
        if (this.f32803r != z10) {
            this.f32803r = z10;
            if (z10) {
                this.f32805t = this.f32798m;
                this.f32806u = this.f32799n;
                ArrayList arrayList = this.f32804s;
                arrayList.clear();
                arrayList.addAll(this.f32788a);
            }
        }
    }
}
