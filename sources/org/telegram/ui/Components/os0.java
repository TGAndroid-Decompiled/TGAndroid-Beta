package org.telegram.ui.Components;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
public final class os0 {
    public boolean f36783g;
    public boolean h;
    public int f36786k;
    public int f36788m;
    public int f36789n;
    public boolean f36790o;
    public int f36791p;
    public boolean f36793r;
    public int f36795t;
    public int f36796u;
    public boolean v;
    public boolean f36797w;
    public final ArrayList f36778a = new ArrayList();
    public final SparseArray[] f36779b = {new SparseArray(), new SparseArray()};
    public final ArrayList f36780c = new ArrayList();
    public final HashMap d = new HashMap();
    public final ArrayList f36781e = new ArrayList();
    public final int[] f36782f = {0, 0};
    public final boolean[] f36784i = {false, true};
    public final int[] f36785j = {0, 0};
    public boolean f36787l = true;
    public int f36792q = 0;
    public final ArrayList f36794s = new ArrayList();
    public v4.u0 f36798x = new v4.u0();

    public final boolean a(org.telegram.messenger.ij ijVar, int i7, boolean z9, boolean z10) {
        SparseArray[] sparseArrayArr = this.f36779b;
        SparseArray sparseArray = sparseArrayArr[i7];
        int e12 = ijVar.e1();
        String str = ijVar.Y;
        if (sparseArray.indexOfKey(e12) >= 0) {
            return false;
        }
        HashMap hashMap = this.d;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(str, arrayList);
            ArrayList arrayList2 = this.f36780c;
            if (z9) {
                arrayList2.add(0, str);
            } else {
                arrayList2.add(str);
            }
        }
        ArrayList arrayList3 = this.f36778a;
        if (z9) {
            arrayList.add(0, ijVar);
            arrayList3.add(0, ijVar);
        } else {
            arrayList.add(ijVar);
            arrayList3.add(ijVar);
        }
        sparseArrayArr[i7].put(ijVar.e1(), ijVar);
        int[] iArr = this.f36785j;
        if (!z10) {
            if (ijVar.e1() > 0) {
                iArr[i7] = Math.min(ijVar.e1(), iArr[i7]);
                this.f36786k = Math.max(ijVar.e1(), this.f36786k);
            }
        } else {
            iArr[i7] = Math.max(ijVar.e1(), iArr[i7]);
            this.f36786k = Math.min(ijVar.e1(), this.f36786k);
        }
        if (!this.v && org.telegram.messenger.ij.L4(ijVar.f23262k)) {
            this.v = true;
        }
        if (!this.f36797w && org.telegram.messenger.ij.S3(ijVar.f23262k)) {
            this.f36797w = true;
        }
        return true;
    }

    public final org.telegram.messenger.ij b(int i7, int i10) {
        SparseArray[] sparseArrayArr = this.f36779b;
        org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) sparseArrayArr[i10].get(i7);
        if (ijVar == null) {
            return null;
        }
        String str = ijVar.Y;
        HashMap hashMap = this.d;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            return null;
        }
        arrayList.remove(ijVar);
        this.f36778a.remove(ijVar);
        sparseArrayArr[i10].remove(ijVar.e1());
        if (arrayList.isEmpty()) {
            hashMap.remove(str);
            this.f36780c.remove(str);
        }
        int[] iArr = this.f36782f;
        int i11 = iArr[i10] - 1;
        iArr[i10] = i11;
        if (i11 < 0) {
            iArr[i10] = 0;
        }
        return ijVar;
    }

    public final ArrayList c() {
        if (this.f36793r) {
            return this.f36794s;
        }
        return this.f36778a;
    }

    public final int d() {
        if (this.f36793r) {
            return this.f36795t;
        }
        return this.f36788m;
    }

    public final int e() {
        int[] iArr = this.f36782f;
        return iArr[0] + iArr[1];
    }

    public final void f(int i7, int i10, int i11) {
        SparseArray[] sparseArrayArr = this.f36779b;
        org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) sparseArrayArr[i7].get(i10);
        if (ijVar != null) {
            sparseArrayArr[i7].remove(i10);
            sparseArrayArr[i7].put(i11, ijVar);
            ijVar.f23262k.f26977id = i11;
            int[] iArr = this.f36785j;
            iArr[i7] = Math.min(i11, iArr[i7]);
        }
    }

    public final void g(boolean z9) {
        if (this.f36793r != z9) {
            this.f36793r = z9;
            if (z9) {
                this.f36795t = this.f36788m;
                this.f36796u = this.f36789n;
                ArrayList arrayList = this.f36794s;
                arrayList.clear();
                arrayList.addAll(this.f36778a);
            }
        }
    }
}
