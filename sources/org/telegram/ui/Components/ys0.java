package org.telegram.ui.Components;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
public final class ys0 {
    public boolean f42519g;
    public boolean h;
    public int f42522k;
    public int f42524m;
    public int f42525n;
    public boolean f42526o;
    public int f42527p;
    public boolean f42529r;
    public int f42531t;
    public int f42532u;
    public boolean v;
    public boolean f42533w;
    public final ArrayList f42514a = new ArrayList();
    public final SparseArray[] f42515b = {new SparseArray(), new SparseArray()};
    public final ArrayList f42516c = new ArrayList();
    public final HashMap d = new HashMap();
    public final ArrayList f42517e = new ArrayList();
    public final int[] f42518f = {0, 0};
    public final boolean[] f42520i = {false, true};
    public final int[] f42521j = {0, 0};
    public boolean f42523l = true;
    public int f42528q = 0;
    public final ArrayList f42530s = new ArrayList();
    public v4.w0 f42534x = new v4.w0();

    public final boolean a(org.telegram.messenger.gj gjVar, int i7, boolean z10, boolean z11) {
        SparseArray[] sparseArrayArr = this.f42515b;
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
            ArrayList arrayList2 = this.f42516c;
            if (z10) {
                arrayList2.add(0, str);
            } else {
                arrayList2.add(str);
            }
        }
        ArrayList arrayList3 = this.f42514a;
        if (z10) {
            arrayList.add(0, gjVar);
            arrayList3.add(0, gjVar);
        } else {
            arrayList.add(gjVar);
            arrayList3.add(gjVar);
        }
        sparseArrayArr[i7].put(gjVar.e1(), gjVar);
        int[] iArr = this.f42521j;
        if (!z11) {
            if (gjVar.e1() > 0) {
                iArr[i7] = Math.min(gjVar.e1(), iArr[i7]);
                this.f42522k = Math.max(gjVar.e1(), this.f42522k);
            }
        } else {
            iArr[i7] = Math.max(gjVar.e1(), iArr[i7]);
            this.f42522k = Math.min(gjVar.e1(), this.f42522k);
        }
        if (!this.v && org.telegram.messenger.gj.L4(gjVar.f24213k)) {
            this.v = true;
        }
        if (!this.f42533w && org.telegram.messenger.gj.S3(gjVar.f24213k)) {
            this.f42533w = true;
        }
        return true;
    }

    public final org.telegram.messenger.gj b(int i7, int i10) {
        SparseArray[] sparseArrayArr = this.f42515b;
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
        this.f42514a.remove(gjVar);
        sparseArrayArr[i10].remove(gjVar.e1());
        if (arrayList.isEmpty()) {
            hashMap.remove(str);
            this.f42516c.remove(str);
        }
        int[] iArr = this.f42518f;
        int i11 = iArr[i10] - 1;
        iArr[i10] = i11;
        if (i11 < 0) {
            iArr[i10] = 0;
        }
        return gjVar;
    }

    public final ArrayList c() {
        if (this.f42529r) {
            return this.f42530s;
        }
        return this.f42514a;
    }

    public final int d() {
        if (this.f42529r) {
            return this.f42531t;
        }
        return this.f42524m;
    }

    public final int e() {
        int[] iArr = this.f42518f;
        return iArr[0] + iArr[1];
    }

    public final void f(int i7, int i10, int i11) {
        SparseArray[] sparseArrayArr = this.f42515b;
        org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) sparseArrayArr[i7].get(i10);
        if (gjVar != null) {
            sparseArrayArr[i7].remove(i10);
            sparseArrayArr[i7].put(i11, gjVar);
            gjVar.f24213k.f28455id = i11;
            int[] iArr = this.f42521j;
            iArr[i7] = Math.min(i11, iArr[i7]);
        }
    }

    public final void g(boolean z10) {
        if (this.f42529r != z10) {
            this.f42529r = z10;
            if (z10) {
                this.f42531t = this.f42524m;
                this.f42532u = this.f42525n;
                ArrayList arrayList = this.f42530s;
                arrayList.clear();
                arrayList.addAll(this.f42514a);
            }
        }
    }
}
