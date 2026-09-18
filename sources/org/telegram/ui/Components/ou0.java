package org.telegram.ui.Components;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MessageObject;
public final class ou0 {
    public boolean f26856g;
    public boolean h;
    public int f26859k;
    public int f26861m;
    public int f26862n;
    public boolean f26863o;
    public int f26864p;
    public boolean f26866r;
    public int f26868t;
    public int f26869u;
    public boolean v;
    public boolean f26870w;
    public final ArrayList f26852a = new ArrayList();
    public final SparseArray[] f26853b = {new SparseArray(), new SparseArray()};
    public final ArrayList f26854c = new ArrayList();
    public final HashMap d = new HashMap();
    public final ArrayList e = new ArrayList();
    public final int[] f26855f = {0, 0};
    public final boolean[] f26857i = {false, true};
    public final int[] f26858j = {0, 0};
    public boolean f26860l = true;
    public int f26865q = 0;
    public final ArrayList f26867s = new ArrayList();
    public s4.u0 f26871x = new s4.u0();

    public final boolean a(MessageObject messageObject, int i10, boolean z10, boolean z11) {
        SparseArray[] sparseArrayArr = this.f26853b;
        if (sparseArrayArr[i10].indexOfKey(messageObject.getId()) >= 0) {
            return false;
        }
        String str = messageObject.monthKey;
        HashMap hashMap = this.d;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(messageObject.monthKey, arrayList);
            ArrayList arrayList2 = this.f26854c;
            if (z10) {
                arrayList2.add(0, messageObject.monthKey);
            } else {
                arrayList2.add(messageObject.monthKey);
            }
        }
        ArrayList arrayList3 = this.f26852a;
        if (z10) {
            arrayList.add(0, messageObject);
            arrayList3.add(0, messageObject);
        } else {
            arrayList.add(messageObject);
            arrayList3.add(messageObject);
        }
        sparseArrayArr[i10].put(messageObject.getId(), messageObject);
        int[] iArr = this.f26858j;
        if (!z11) {
            if (messageObject.getId() > 0) {
                iArr[i10] = Math.min(messageObject.getId(), iArr[i10]);
                this.f26859k = Math.max(messageObject.getId(), this.f26859k);
            }
        } else {
            iArr[i10] = Math.max(messageObject.getId(), iArr[i10]);
            this.f26859k = Math.min(messageObject.getId(), this.f26859k);
        }
        if (!this.v && messageObject.isVideo()) {
            this.v = true;
        }
        if (!this.f26870w && messageObject.isPhoto()) {
            this.f26870w = true;
        }
        return true;
    }

    public final MessageObject b(int i10, int i11) {
        SparseArray[] sparseArrayArr = this.f26853b;
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
        this.f26852a.remove(messageObject);
        sparseArrayArr[i11].remove(messageObject.getId());
        if (arrayList.isEmpty()) {
            hashMap.remove(messageObject.monthKey);
            this.f26854c.remove(messageObject.monthKey);
        }
        int[] iArr = this.f26855f;
        int i12 = iArr[i11] - 1;
        iArr[i11] = i12;
        if (i12 < 0) {
            iArr[i11] = 0;
        }
        return messageObject;
    }

    public final ArrayList c() {
        if (this.f26866r) {
            return this.f26867s;
        }
        return this.f26852a;
    }

    public final int d() {
        if (this.f26866r) {
            return this.f26868t;
        }
        return this.f26861m;
    }

    public final int e() {
        int[] iArr = this.f26855f;
        return iArr[0] + iArr[1];
    }

    public final void f(int i10, int i11, int i12) {
        SparseArray[] sparseArrayArr = this.f26853b;
        MessageObject messageObject = (MessageObject) sparseArrayArr[i10].get(i11);
        if (messageObject != null) {
            sparseArrayArr[i10].remove(i11);
            sparseArrayArr[i10].put(i12, messageObject);
            messageObject.messageOwner.f18142id = i12;
            int[] iArr = this.f26858j;
            iArr[i10] = Math.min(i12, iArr[i10]);
        }
    }

    public final void g(boolean z10) {
        if (this.f26866r != z10) {
            this.f26866r = z10;
            if (z10) {
                this.f26868t = this.f26861m;
                this.f26869u = this.f26862n;
                ArrayList arrayList = this.f26867s;
                arrayList.clear();
                arrayList.addAll(this.f26852a);
            }
        }
    }
}
