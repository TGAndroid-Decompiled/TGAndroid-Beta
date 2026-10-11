package org.telegram.ui.Components;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MessageObject;
public final class rv0 {
    public boolean f30642g;
    public boolean h;
    public int f30645k;
    public int f30647m;
    public int f30648n;
    public boolean f30649o;
    public int f30650p;
    public boolean f30652r;
    public int f30654t;
    public int f30655u;
    public boolean v;
    public boolean f30656w;
    public final ArrayList f30637a = new ArrayList();
    public final SparseArray[] f30638b = {new SparseArray(), new SparseArray()};
    public final ArrayList f30639c = new ArrayList();
    public final HashMap d = new HashMap();
    public final ArrayList f30640e = new ArrayList();
    public final int[] f30641f = {0, 0};
    public final boolean[] f30643i = {false, true};
    public final int[] f30644j = {0, 0};
    public boolean f30646l = true;
    public int f30651q = 0;
    public final ArrayList f30653s = new ArrayList();
    public s4.v0 f30657x = new s4.v0();

    public final boolean a(MessageObject messageObject, int i10, boolean z10, boolean z11) {
        SparseArray[] sparseArrayArr = this.f30638b;
        if (sparseArrayArr[i10].indexOfKey(messageObject.getId()) >= 0) {
            return false;
        }
        String str = messageObject.monthKey;
        HashMap hashMap = this.d;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(messageObject.monthKey, arrayList);
            ArrayList arrayList2 = this.f30639c;
            if (z10) {
                arrayList2.add(0, messageObject.monthKey);
            } else {
                arrayList2.add(messageObject.monthKey);
            }
        }
        ArrayList arrayList3 = this.f30637a;
        if (z10) {
            arrayList.add(0, messageObject);
            arrayList3.add(0, messageObject);
        } else {
            arrayList.add(messageObject);
            arrayList3.add(messageObject);
        }
        sparseArrayArr[i10].put(messageObject.getId(), messageObject);
        int[] iArr = this.f30644j;
        if (!z11) {
            if (messageObject.getId() > 0) {
                iArr[i10] = Math.min(messageObject.getId(), iArr[i10]);
                this.f30645k = Math.max(messageObject.getId(), this.f30645k);
            }
        } else {
            iArr[i10] = Math.max(messageObject.getId(), iArr[i10]);
            this.f30645k = Math.min(messageObject.getId(), this.f30645k);
        }
        if (!this.v && messageObject.isVideo()) {
            this.v = true;
        }
        if (!this.f30656w && messageObject.isPhoto()) {
            this.f30656w = true;
        }
        return true;
    }

    public final MessageObject b(int i10, int i11) {
        SparseArray[] sparseArrayArr = this.f30638b;
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
        this.f30637a.remove(messageObject);
        sparseArrayArr[i11].remove(messageObject.getId());
        if (arrayList.isEmpty()) {
            hashMap.remove(messageObject.monthKey);
            this.f30639c.remove(messageObject.monthKey);
        }
        int[] iArr = this.f30641f;
        int i12 = iArr[i11] - 1;
        iArr[i11] = i12;
        if (i12 < 0) {
            iArr[i11] = 0;
        }
        return messageObject;
    }

    public final ArrayList c() {
        if (this.f30652r) {
            return this.f30653s;
        }
        return this.f30637a;
    }

    public final int d() {
        if (this.f30652r) {
            return this.f30654t;
        }
        return this.f30647m;
    }

    public final int e() {
        int[] iArr = this.f30641f;
        return iArr[0] + iArr[1];
    }

    public final void f(int i10, int i11, int i12) {
        SparseArray[] sparseArrayArr = this.f30638b;
        MessageObject messageObject = (MessageObject) sparseArrayArr[i10].get(i11);
        if (messageObject != null) {
            sparseArrayArr[i10].remove(i11);
            sparseArrayArr[i10].put(i12, messageObject);
            messageObject.messageOwner.f20089id = i12;
            int[] iArr = this.f30644j;
            iArr[i10] = Math.min(i12, iArr[i10]);
        }
    }

    public final void g(boolean z10) {
        if (this.f30652r != z10) {
            this.f30652r = z10;
            if (z10) {
                this.f30654t = this.f30647m;
                this.f30655u = this.f30648n;
                ArrayList arrayList = this.f30653s;
                arrayList.clear();
                arrayList.addAll(this.f30637a);
            }
        }
    }
}
