package org.telegram.ui.Components;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MessageObject;
public final class wv0 {
    public boolean f32557g;
    public boolean h;
    public int f32560k;
    public int f32562m;
    public int f32563n;
    public boolean f32564o;
    public int f32565p;
    public boolean f32567r;
    public int f32569t;
    public int f32570u;
    public boolean v;
    public boolean f32571w;
    public final ArrayList f32552a = new ArrayList();
    public final SparseArray[] f32553b = {new SparseArray(), new SparseArray()};
    public final ArrayList f32554c = new ArrayList();
    public final HashMap d = new HashMap();
    public final ArrayList f32555e = new ArrayList();
    public final int[] f32556f = {0, 0};
    public final boolean[] f32558i = {false, true};
    public final int[] f32559j = {0, 0};
    public boolean f32561l = true;
    public int f32566q = 0;
    public final ArrayList f32568s = new ArrayList();
    public s4.v0 f32572x = new s4.v0();

    public final boolean a(MessageObject messageObject, int i10, boolean z10, boolean z11) {
        SparseArray[] sparseArrayArr = this.f32553b;
        if (sparseArrayArr[i10].indexOfKey(messageObject.getId()) >= 0) {
            return false;
        }
        String str = messageObject.monthKey;
        HashMap hashMap = this.d;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(messageObject.monthKey, arrayList);
            ArrayList arrayList2 = this.f32554c;
            if (z10) {
                arrayList2.add(0, messageObject.monthKey);
            } else {
                arrayList2.add(messageObject.monthKey);
            }
        }
        ArrayList arrayList3 = this.f32552a;
        if (z10) {
            arrayList.add(0, messageObject);
            arrayList3.add(0, messageObject);
        } else {
            arrayList.add(messageObject);
            arrayList3.add(messageObject);
        }
        sparseArrayArr[i10].put(messageObject.getId(), messageObject);
        int[] iArr = this.f32559j;
        if (!z11) {
            if (messageObject.getId() > 0) {
                iArr[i10] = Math.min(messageObject.getId(), iArr[i10]);
                this.f32560k = Math.max(messageObject.getId(), this.f32560k);
            }
        } else {
            iArr[i10] = Math.max(messageObject.getId(), iArr[i10]);
            this.f32560k = Math.min(messageObject.getId(), this.f32560k);
        }
        if (!this.v && messageObject.isVideo()) {
            this.v = true;
        }
        if (!this.f32571w && messageObject.isPhoto()) {
            this.f32571w = true;
        }
        return true;
    }

    public final MessageObject b(int i10, int i11) {
        SparseArray[] sparseArrayArr = this.f32553b;
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
        this.f32552a.remove(messageObject);
        sparseArrayArr[i11].remove(messageObject.getId());
        if (arrayList.isEmpty()) {
            hashMap.remove(messageObject.monthKey);
            this.f32554c.remove(messageObject.monthKey);
        }
        int[] iArr = this.f32556f;
        int i12 = iArr[i11] - 1;
        iArr[i11] = i12;
        if (i12 < 0) {
            iArr[i11] = 0;
        }
        return messageObject;
    }

    public final ArrayList c() {
        if (this.f32567r) {
            return this.f32568s;
        }
        return this.f32552a;
    }

    public final int d() {
        if (this.f32567r) {
            return this.f32569t;
        }
        return this.f32562m;
    }

    public final int e() {
        int[] iArr = this.f32556f;
        return iArr[0] + iArr[1];
    }

    public final void f(int i10, int i11, int i12) {
        SparseArray[] sparseArrayArr = this.f32553b;
        MessageObject messageObject = (MessageObject) sparseArrayArr[i10].get(i11);
        if (messageObject != null) {
            sparseArrayArr[i10].remove(i11);
            sparseArrayArr[i10].put(i12, messageObject);
            messageObject.messageOwner.f19824id = i12;
            int[] iArr = this.f32559j;
            iArr[i10] = Math.min(i12, iArr[i10]);
        }
    }

    public final void g(boolean z10) {
        if (this.f32567r != z10) {
            this.f32567r = z10;
            if (z10) {
                this.f32569t = this.f32562m;
                this.f32570u = this.f32563n;
                ArrayList arrayList = this.f32568s;
                arrayList.clear();
                arrayList.addAll(this.f32552a);
            }
        }
    }
}
