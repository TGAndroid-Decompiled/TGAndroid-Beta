package org.telegram.ui.Components;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MessageObject;
public final class lv0 {
    public boolean f28443g;
    public boolean h;
    public int f28446k;
    public int f28448m;
    public int f28449n;
    public boolean f28450o;
    public int f28451p;
    public boolean f28453r;
    public int f28455t;
    public int f28456u;
    public boolean v;
    public boolean f28457w;
    public final ArrayList f28439a = new ArrayList();
    public final SparseArray[] f28440b = {new SparseArray(), new SparseArray()};
    public final ArrayList f28441c = new ArrayList();
    public final HashMap d = new HashMap();
    public final ArrayList e = new ArrayList();
    public final int[] f28442f = {0, 0};
    public final boolean[] f28444i = {false, true};
    public final int[] f28445j = {0, 0};
    public boolean f28447l = true;
    public int f28452q = 0;
    public final ArrayList f28454s = new ArrayList();
    public s4.t0 f28458x = new s4.t0();

    public final boolean a(MessageObject messageObject, int i10, boolean z10, boolean z11) {
        SparseArray[] sparseArrayArr = this.f28440b;
        if (sparseArrayArr[i10].indexOfKey(messageObject.getId()) >= 0) {
            return false;
        }
        String str = messageObject.monthKey;
        HashMap hashMap = this.d;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(messageObject.monthKey, arrayList);
            ArrayList arrayList2 = this.f28441c;
            if (z10) {
                arrayList2.add(0, messageObject.monthKey);
            } else {
                arrayList2.add(messageObject.monthKey);
            }
        }
        ArrayList arrayList3 = this.f28439a;
        if (z10) {
            arrayList.add(0, messageObject);
            arrayList3.add(0, messageObject);
        } else {
            arrayList.add(messageObject);
            arrayList3.add(messageObject);
        }
        sparseArrayArr[i10].put(messageObject.getId(), messageObject);
        int[] iArr = this.f28445j;
        if (!z11) {
            if (messageObject.getId() > 0) {
                iArr[i10] = Math.min(messageObject.getId(), iArr[i10]);
                this.f28446k = Math.max(messageObject.getId(), this.f28446k);
            }
        } else {
            iArr[i10] = Math.max(messageObject.getId(), iArr[i10]);
            this.f28446k = Math.min(messageObject.getId(), this.f28446k);
        }
        if (!this.v && messageObject.isVideo()) {
            this.v = true;
        }
        if (!this.f28457w && messageObject.isPhoto()) {
            this.f28457w = true;
        }
        return true;
    }

    public final MessageObject b(int i10, int i11) {
        SparseArray[] sparseArrayArr = this.f28440b;
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
        this.f28439a.remove(messageObject);
        sparseArrayArr[i11].remove(messageObject.getId());
        if (arrayList.isEmpty()) {
            hashMap.remove(messageObject.monthKey);
            this.f28441c.remove(messageObject.monthKey);
        }
        int[] iArr = this.f28442f;
        int i12 = iArr[i11] - 1;
        iArr[i11] = i12;
        if (i12 < 0) {
            iArr[i11] = 0;
        }
        return messageObject;
    }

    public final ArrayList c() {
        if (this.f28453r) {
            return this.f28454s;
        }
        return this.f28439a;
    }

    public final int d() {
        if (this.f28453r) {
            return this.f28455t;
        }
        return this.f28448m;
    }

    public final int e() {
        int[] iArr = this.f28442f;
        return iArr[0] + iArr[1];
    }

    public final void f(int i10, int i11, int i12) {
        SparseArray[] sparseArrayArr = this.f28440b;
        MessageObject messageObject = (MessageObject) sparseArrayArr[i10].get(i11);
        if (messageObject != null) {
            sparseArrayArr[i10].remove(i11);
            sparseArrayArr[i10].put(i12, messageObject);
            messageObject.messageOwner.f20365id = i12;
            int[] iArr = this.f28445j;
            iArr[i10] = Math.min(i12, iArr[i10]);
        }
    }

    public final void g(boolean z10) {
        if (this.f28453r != z10) {
            this.f28453r = z10;
            if (z10) {
                this.f28455t = this.f28448m;
                this.f28456u = this.f28449n;
                ArrayList arrayList = this.f28454s;
                arrayList.clear();
                arrayList.addAll(this.f28439a);
            }
        }
    }
}
