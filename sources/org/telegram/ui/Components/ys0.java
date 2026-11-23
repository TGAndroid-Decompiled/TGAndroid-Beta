package org.telegram.ui.Components;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
public final class ys0 {
    public boolean f42518g;
    public boolean h;
    public int f42521k;
    public int f42523m;
    public int f42524n;
    public boolean f42525o;
    public int f42526p;
    public boolean f42528r;
    public int f42530t;
    public int f42531u;
    public boolean v;
    public boolean f42532w;
    public final ArrayList f42513a = new ArrayList();
    public final SparseArray[] f42514b = {new SparseArray(), new SparseArray()};
    public final ArrayList f42515c = new ArrayList();
    public final HashMap d = new HashMap();
    public final ArrayList f42516e = new ArrayList();
    public final int[] f42517f = {0, 0};
    public final boolean[] f42519i = {false, true};
    public final int[] f42520j = {0, 0};
    public boolean f42522l = true;
    public int f42527q = 0;
    public final ArrayList f42529s = new ArrayList();
    public v4.w0 f42533x = new v4.w0();

    public final boolean a(org.telegram.messenger.gj gjVar, int i7, boolean z10, boolean z11) {
        SparseArray[] sparseArrayArr = this.f42514b;
        SparseArray sparseArray = sparseArrayArr[i7];
        int e12 = gjVar.e1();
        String str = gjVar.Y;
        if (sparseArray.indexOfKey(e12) >= 0) {
            return false;
        }
        HashMap hashMap = this.d;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(str, arrayList);
            ArrayList arrayList2 = this.f42515c;
            if (z10) {
                arrayList2.add(0, str);
            } else {
                arrayList2.add(str);
            }
        }
        ArrayList arrayList3 = this.f42513a;
        if (z10) {
            arrayList.add(0, gjVar);
            arrayList3.add(0, gjVar);
        } else {
            arrayList.add(gjVar);
            arrayList3.add(gjVar);
        }
        sparseArrayArr[i7].put(gjVar.e1(), gjVar);
        int[] iArr = this.f42520j;
        if (!z11) {
            if (gjVar.e1() > 0) {
                iArr[i7] = Math.min(gjVar.e1(), iArr[i7]);
                this.f42521k = Math.max(gjVar.e1(), this.f42521k);
            }
        } else {
            iArr[i7] = Math.max(gjVar.e1(), iArr[i7]);
            this.f42521k = Math.min(gjVar.e1(), this.f42521k);
        }
        if (!this.v && org.telegram.messenger.gj.L4(gjVar.f24213k)) {
            this.v = true;
        }
        if (!this.f42532w && org.telegram.messenger.gj.S3(gjVar.f24213k)) {
            this.f42532w = true;
        }
        return true;
    }

    public final org.telegram.messenger.gj b(int i7, int i10) {
        SparseArray[] sparseArrayArr = this.f42514b;
        org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) sparseArrayArr[i10].get(i7);
        if (gjVar == null) {
            return null;
        }
        String str = gjVar.Y;
        HashMap hashMap = this.d;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            return null;
        }
        arrayList.remove(gjVar);
        this.f42513a.remove(gjVar);
        sparseArrayArr[i10].remove(gjVar.e1());
        if (arrayList.isEmpty()) {
            hashMap.remove(str);
            this.f42515c.remove(str);
        }
        int[] iArr = this.f42517f;
        int i11 = iArr[i10] - 1;
        iArr[i10] = i11;
        if (i11 < 0) {
            iArr[i10] = 0;
        }
        return gjVar;
    }

    public final ArrayList c() {
        if (this.f42528r) {
            return this.f42529s;
        }
        return this.f42513a;
    }

    public final int d() {
        if (this.f42528r) {
            return this.f42530t;
        }
        return this.f42523m;
    }

    public final int e() {
        int[] iArr = this.f42517f;
        return iArr[0] + iArr[1];
    }

    public final void f(int i7, int i10, int i11) {
        SparseArray[] sparseArrayArr = this.f42514b;
        org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) sparseArrayArr[i7].get(i10);
        if (gjVar != null) {
            sparseArrayArr[i7].remove(i10);
            sparseArrayArr[i7].put(i11, gjVar);
            gjVar.f24213k.f28455id = i11;
            int[] iArr = this.f42520j;
            iArr[i7] = Math.min(i11, iArr[i7]);
        }
    }

    public final void g(boolean z10) {
        if (this.f42528r != z10) {
            this.f42528r = z10;
            if (z10) {
                this.f42530t = this.f42523m;
                this.f42531u = this.f42524n;
                ArrayList arrayList = this.f42529s;
                arrayList.clear();
                arrayList.addAll(this.f42513a);
            }
        }
    }
}
