package org.telegram.ui.Components;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
public final class xs0 {
    public boolean f42170g;
    public boolean h;
    public int f42173k;
    public int f42175m;
    public int f42176n;
    public boolean f42177o;
    public int f42178p;
    public boolean f42180r;
    public int f42182t;
    public int f42183u;
    public boolean v;
    public boolean f42184w;
    public final ArrayList f42165a = new ArrayList();
    public final SparseArray[] f42166b = {new SparseArray(), new SparseArray()};
    public final ArrayList f42167c = new ArrayList();
    public final HashMap d = new HashMap();
    public final ArrayList f42168e = new ArrayList();
    public final int[] f42169f = {0, 0};
    public final boolean[] f42171i = {false, true};
    public final int[] f42172j = {0, 0};
    public boolean f42174l = true;
    public int f42179q = 0;
    public final ArrayList f42181s = new ArrayList();
    public v4.w0 f42185x = new v4.w0();

    public final boolean a(org.telegram.messenger.fj fjVar, int i7, boolean z10, boolean z11) {
        SparseArray[] sparseArrayArr = this.f42166b;
        SparseArray sparseArray = sparseArrayArr[i7];
        int e12 = fjVar.e1();
        String str = fjVar.Y;
        if (sparseArray.indexOfKey(e12) >= 0) {
            return false;
        }
        HashMap hashMap = this.d;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(str, arrayList);
            ArrayList arrayList2 = this.f42167c;
            if (z10) {
                arrayList2.add(0, str);
            } else {
                arrayList2.add(str);
            }
        }
        ArrayList arrayList3 = this.f42165a;
        if (z10) {
            arrayList.add(0, fjVar);
            arrayList3.add(0, fjVar);
        } else {
            arrayList.add(fjVar);
            arrayList3.add(fjVar);
        }
        sparseArrayArr[i7].put(fjVar.e1(), fjVar);
        int[] iArr = this.f42172j;
        if (!z11) {
            if (fjVar.e1() > 0) {
                iArr[i7] = Math.min(fjVar.e1(), iArr[i7]);
                this.f42173k = Math.max(fjVar.e1(), this.f42173k);
            }
        } else {
            iArr[i7] = Math.max(fjVar.e1(), iArr[i7]);
            this.f42173k = Math.min(fjVar.e1(), this.f42173k);
        }
        if (!this.v && org.telegram.messenger.fj.L4(fjVar.f24073k)) {
            this.v = true;
        }
        if (!this.f42184w && org.telegram.messenger.fj.S3(fjVar.f24073k)) {
            this.f42184w = true;
        }
        return true;
    }

    public final org.telegram.messenger.fj b(int i7, int i10) {
        SparseArray[] sparseArrayArr = this.f42166b;
        org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) sparseArrayArr[i10].get(i7);
        if (fjVar == null) {
            return null;
        }
        String str = fjVar.Y;
        HashMap hashMap = this.d;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            return null;
        }
        arrayList.remove(fjVar);
        this.f42165a.remove(fjVar);
        sparseArrayArr[i10].remove(fjVar.e1());
        if (arrayList.isEmpty()) {
            hashMap.remove(str);
            this.f42167c.remove(str);
        }
        int[] iArr = this.f42169f;
        int i11 = iArr[i10] - 1;
        iArr[i10] = i11;
        if (i11 < 0) {
            iArr[i10] = 0;
        }
        return fjVar;
    }

    public final ArrayList c() {
        if (this.f42180r) {
            return this.f42181s;
        }
        return this.f42165a;
    }

    public final int d() {
        if (this.f42180r) {
            return this.f42182t;
        }
        return this.f42175m;
    }

    public final int e() {
        int[] iArr = this.f42169f;
        return iArr[0] + iArr[1];
    }

    public final void f(int i7, int i10, int i11) {
        SparseArray[] sparseArrayArr = this.f42166b;
        org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) sparseArrayArr[i7].get(i10);
        if (fjVar != null) {
            sparseArrayArr[i7].remove(i10);
            sparseArrayArr[i7].put(i11, fjVar);
            fjVar.f24073k.f28513id = i11;
            int[] iArr = this.f42172j;
            iArr[i7] = Math.min(i11, iArr[i7]);
        }
    }

    public final void g(boolean z10) {
        if (this.f42180r != z10) {
            this.f42180r = z10;
            if (z10) {
                this.f42182t = this.f42175m;
                this.f42183u = this.f42176n;
                ArrayList arrayList = this.f42181s;
                arrayList.clear();
                arrayList.addAll(this.f42165a);
            }
        }
    }
}
