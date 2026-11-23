package org.telegram.ui.Components;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
public final class ys0 {
    public boolean f42479g;
    public boolean h;
    public int f42482k;
    public int f42484m;
    public int f42485n;
    public boolean f42486o;
    public int f42487p;
    public boolean f42489r;
    public int f42491t;
    public int f42492u;
    public boolean v;
    public boolean f42493w;
    public final ArrayList f42474a = new ArrayList();
    public final SparseArray[] f42475b = {new SparseArray(), new SparseArray()};
    public final ArrayList f42476c = new ArrayList();
    public final HashMap d = new HashMap();
    public final ArrayList f42477e = new ArrayList();
    public final int[] f42478f = {0, 0};
    public final boolean[] f42480i = {false, true};
    public final int[] f42481j = {0, 0};
    public boolean f42483l = true;
    public int f42488q = 0;
    public final ArrayList f42490s = new ArrayList();
    public v4.v0 f42494x = new v4.v0();

    public final boolean a(org.telegram.messenger.gj gjVar, int i7, boolean z10, boolean z11) {
        SparseArray[] sparseArrayArr = this.f42475b;
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
            ArrayList arrayList2 = this.f42476c;
            if (z10) {
                arrayList2.add(0, str);
            } else {
                arrayList2.add(str);
            }
        }
        ArrayList arrayList3 = this.f42474a;
        if (z10) {
            arrayList.add(0, gjVar);
            arrayList3.add(0, gjVar);
        } else {
            arrayList.add(gjVar);
            arrayList3.add(gjVar);
        }
        sparseArrayArr[i7].put(gjVar.e1(), gjVar);
        int[] iArr = this.f42481j;
        if (!z11) {
            if (gjVar.e1() > 0) {
                iArr[i7] = Math.min(gjVar.e1(), iArr[i7]);
                this.f42482k = Math.max(gjVar.e1(), this.f42482k);
            }
        } else {
            iArr[i7] = Math.max(gjVar.e1(), iArr[i7]);
            this.f42482k = Math.min(gjVar.e1(), this.f42482k);
        }
        if (!this.v && org.telegram.messenger.gj.L4(gjVar.f24177k)) {
            this.v = true;
        }
        if (!this.f42493w && org.telegram.messenger.gj.S3(gjVar.f24177k)) {
            this.f42493w = true;
        }
        return true;
    }

    public final org.telegram.messenger.gj b(int i7, int i10) {
        SparseArray[] sparseArrayArr = this.f42475b;
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
        this.f42474a.remove(gjVar);
        sparseArrayArr[i10].remove(gjVar.e1());
        if (arrayList.isEmpty()) {
            hashMap.remove(str);
            this.f42476c.remove(str);
        }
        int[] iArr = this.f42478f;
        int i11 = iArr[i10] - 1;
        iArr[i10] = i11;
        if (i11 < 0) {
            iArr[i10] = 0;
        }
        return gjVar;
    }

    public final ArrayList c() {
        if (this.f42489r) {
            return this.f42490s;
        }
        return this.f42474a;
    }

    public final int d() {
        if (this.f42489r) {
            return this.f42491t;
        }
        return this.f42484m;
    }

    public final int e() {
        int[] iArr = this.f42478f;
        return iArr[0] + iArr[1];
    }

    public final void f(int i7, int i10, int i11) {
        SparseArray[] sparseArrayArr = this.f42475b;
        org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) sparseArrayArr[i7].get(i10);
        if (gjVar != null) {
            sparseArrayArr[i7].remove(i10);
            sparseArrayArr[i7].put(i11, gjVar);
            gjVar.f24177k.f28419id = i11;
            int[] iArr = this.f42481j;
            iArr[i7] = Math.min(i11, iArr[i7]);
        }
    }

    public final void g(boolean z10) {
        if (this.f42489r != z10) {
            this.f42489r = z10;
            if (z10) {
                this.f42491t = this.f42484m;
                this.f42492u = this.f42485n;
                ArrayList arrayList = this.f42490s;
                arrayList.clear();
                arrayList.addAll(this.f42474a);
            }
        }
    }
}
