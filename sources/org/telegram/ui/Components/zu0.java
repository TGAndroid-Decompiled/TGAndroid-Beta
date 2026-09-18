package org.telegram.ui.Components;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MessageObject;
public final class zu0 {
    public boolean f30881g;
    public boolean h;
    public int f30884k;
    public int f30886m;
    public int f30887n;
    public boolean f30888o;
    public int f30889p;
    public boolean f30891r;
    public int f30893t;
    public int f30894u;
    public boolean v;
    public boolean f30895w;
    public final ArrayList f30877a = new ArrayList();
    public final SparseArray[] f30878b = {new SparseArray(), new SparseArray()};
    public final ArrayList f30879c = new ArrayList();
    public final HashMap d = new HashMap();
    public final ArrayList e = new ArrayList();
    public final int[] f30880f = {0, 0};
    public final boolean[] f30882i = {false, true};
    public final int[] f30883j = {0, 0};
    public boolean f30885l = true;
    public int f30890q = 0;
    public final ArrayList f30892s = new ArrayList();
    public s4.u0 f30896x = new s4.u0();

    public final boolean a(MessageObject messageObject, int i10, boolean z10, boolean z11) {
        SparseArray[] sparseArrayArr = this.f30878b;
        if (sparseArrayArr[i10].indexOfKey(messageObject.getId()) >= 0) {
            return false;
        }
        String str = messageObject.monthKey;
        HashMap hashMap = this.d;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(messageObject.monthKey, arrayList);
            ArrayList arrayList2 = this.f30879c;
            if (z10) {
                arrayList2.add(0, messageObject.monthKey);
            } else {
                arrayList2.add(messageObject.monthKey);
            }
        }
        ArrayList arrayList3 = this.f30877a;
        if (z10) {
            arrayList.add(0, messageObject);
            arrayList3.add(0, messageObject);
        } else {
            arrayList.add(messageObject);
            arrayList3.add(messageObject);
        }
        sparseArrayArr[i10].put(messageObject.getId(), messageObject);
        int[] iArr = this.f30883j;
        if (!z11) {
            if (messageObject.getId() > 0) {
                iArr[i10] = Math.min(messageObject.getId(), iArr[i10]);
                this.f30884k = Math.max(messageObject.getId(), this.f30884k);
            }
        } else {
            iArr[i10] = Math.max(messageObject.getId(), iArr[i10]);
            this.f30884k = Math.min(messageObject.getId(), this.f30884k);
        }
        if (!this.v && messageObject.isVideo()) {
            this.v = true;
        }
        if (!this.f30895w && messageObject.isPhoto()) {
            this.f30895w = true;
        }
        return true;
    }

    public final MessageObject b(int i10, int i11) {
        SparseArray[] sparseArrayArr = this.f30878b;
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
        this.f30877a.remove(messageObject);
        sparseArrayArr[i11].remove(messageObject.getId());
        if (arrayList.isEmpty()) {
            hashMap.remove(messageObject.monthKey);
            this.f30879c.remove(messageObject.monthKey);
        }
        int[] iArr = this.f30880f;
        int i12 = iArr[i11] - 1;
        iArr[i11] = i12;
        if (i12 < 0) {
            iArr[i11] = 0;
        }
        return messageObject;
    }

    public final ArrayList c() {
        if (this.f30891r) {
            return this.f30892s;
        }
        return this.f30877a;
    }

    public final int d() {
        if (this.f30891r) {
            return this.f30893t;
        }
        return this.f30886m;
    }

    public final int e() {
        int[] iArr = this.f30880f;
        return iArr[0] + iArr[1];
    }

    public final void f(int i10, int i11, int i12) {
        SparseArray[] sparseArrayArr = this.f30878b;
        MessageObject messageObject = (MessageObject) sparseArrayArr[i10].get(i11);
        if (messageObject != null) {
            sparseArrayArr[i10].remove(i11);
            sparseArrayArr[i10].put(i12, messageObject);
            messageObject.messageOwner.f18317id = i12;
            int[] iArr = this.f30883j;
            iArr[i10] = Math.min(i12, iArr[i10]);
        }
    }

    public final void g(boolean z10) {
        if (this.f30891r != z10) {
            this.f30891r = z10;
            if (z10) {
                this.f30893t = this.f30886m;
                this.f30894u = this.f30887n;
                ArrayList arrayList = this.f30892s;
                arrayList.clear();
                arrayList.addAll(this.f30877a);
            }
        }
    }
}
