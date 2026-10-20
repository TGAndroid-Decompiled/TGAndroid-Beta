package org.telegram.ui.Components;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MessageObject;
public final class jv0 {
    public boolean f27645g;
    public boolean h;
    public int f27648k;
    public int f27650m;
    public int f27651n;
    public boolean f27652o;
    public int f27653p;
    public boolean f27655r;
    public int f27657t;
    public int f27658u;
    public boolean v;
    public boolean f27659w;
    public final ArrayList f27641a = new ArrayList();
    public final SparseArray[] f27642b = {new SparseArray(), new SparseArray()};
    public final ArrayList f27643c = new ArrayList();
    public final HashMap d = new HashMap();
    public final ArrayList e = new ArrayList();
    public final int[] f27644f = {0, 0};
    public final boolean[] f27646i = {false, true};
    public final int[] f27647j = {0, 0};
    public boolean f27649l = true;
    public int f27654q = 0;
    public final ArrayList f27656s = new ArrayList();
    public s4.t0 f27660x = new s4.t0();

    public final boolean a(MessageObject messageObject, int i10, boolean z10, boolean z11) {
        SparseArray[] sparseArrayArr = this.f27642b;
        if (sparseArrayArr[i10].indexOfKey(messageObject.getId()) >= 0) {
            return false;
        }
        String str = messageObject.monthKey;
        HashMap hashMap = this.d;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(messageObject.monthKey, arrayList);
            ArrayList arrayList2 = this.f27643c;
            if (z10) {
                arrayList2.add(0, messageObject.monthKey);
            } else {
                arrayList2.add(messageObject.monthKey);
            }
        }
        ArrayList arrayList3 = this.f27641a;
        if (z10) {
            arrayList.add(0, messageObject);
            arrayList3.add(0, messageObject);
        } else {
            arrayList.add(messageObject);
            arrayList3.add(messageObject);
        }
        sparseArrayArr[i10].put(messageObject.getId(), messageObject);
        int[] iArr = this.f27647j;
        if (!z11) {
            if (messageObject.getId() > 0) {
                iArr[i10] = Math.min(messageObject.getId(), iArr[i10]);
                this.f27648k = Math.max(messageObject.getId(), this.f27648k);
            }
        } else {
            iArr[i10] = Math.max(messageObject.getId(), iArr[i10]);
            this.f27648k = Math.min(messageObject.getId(), this.f27648k);
        }
        if (!this.v && messageObject.isVideo()) {
            this.v = true;
        }
        if (!this.f27659w && messageObject.isPhoto()) {
            this.f27659w = true;
        }
        return true;
    }

    public final MessageObject b(int i10, int i11) {
        SparseArray[] sparseArrayArr = this.f27642b;
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
        this.f27641a.remove(messageObject);
        sparseArrayArr[i11].remove(messageObject.getId());
        if (arrayList.isEmpty()) {
            hashMap.remove(messageObject.monthKey);
            this.f27643c.remove(messageObject.monthKey);
        }
        int[] iArr = this.f27644f;
        int i12 = iArr[i11] - 1;
        iArr[i11] = i12;
        if (i12 < 0) {
            iArr[i11] = 0;
        }
        return messageObject;
    }

    public final ArrayList c() {
        if (this.f27655r) {
            return this.f27656s;
        }
        return this.f27641a;
    }

    public final int d() {
        if (this.f27655r) {
            return this.f27657t;
        }
        return this.f27650m;
    }

    public final int e() {
        int[] iArr = this.f27644f;
        return iArr[0] + iArr[1];
    }

    public final void f(int i10, int i11, int i12) {
        SparseArray[] sparseArrayArr = this.f27642b;
        MessageObject messageObject = (MessageObject) sparseArrayArr[i10].get(i11);
        if (messageObject != null) {
            sparseArrayArr[i10].remove(i11);
            sparseArrayArr[i10].put(i12, messageObject);
            messageObject.messageOwner.f20297id = i12;
            int[] iArr = this.f27647j;
            iArr[i10] = Math.min(i12, iArr[i10]);
        }
    }

    public final void g(boolean z10) {
        if (this.f27655r != z10) {
            this.f27655r = z10;
            if (z10) {
                this.f27657t = this.f27650m;
                this.f27658u = this.f27651n;
                ArrayList arrayList = this.f27656s;
                arrayList.clear();
                arrayList.addAll(this.f27641a);
            }
        }
    }
}
