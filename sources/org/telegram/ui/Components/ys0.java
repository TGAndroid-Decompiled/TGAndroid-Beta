package org.telegram.ui.Components;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
public final class ys0 {
    public boolean f42526g;
    public boolean h;
    public int f42529k;
    public int f42531m;
    public int f42532n;
    public boolean f42533o;
    public int f42534p;
    public boolean f42536r;
    public int f42538t;
    public int f42539u;
    public boolean v;
    public boolean f42540w;
    public final ArrayList f42521a = new ArrayList();
    public final SparseArray[] f42522b = {new SparseArray(), new SparseArray()};
    public final ArrayList f42523c = new ArrayList();
    public final HashMap d = new HashMap();
    public final ArrayList f42524e = new ArrayList();
    public final int[] f42525f = {0, 0};
    public final boolean[] f42527i = {false, true};
    public final int[] f42528j = {0, 0};
    public boolean f42530l = true;
    public int f42535q = 0;
    public final ArrayList f42537s = new ArrayList();
    public v4.w0 f42541x = new v4.w0();

    public final boolean a(org.telegram.messenger.fj fjVar, int i7, boolean z10, boolean z11) {
        SparseArray[] sparseArrayArr = this.f42522b;
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
            ArrayList arrayList2 = this.f42523c;
            if (z10) {
                arrayList2.add(0, str);
            } else {
                arrayList2.add(str);
            }
        }
        ArrayList arrayList3 = this.f42521a;
        if (z10) {
            arrayList.add(0, fjVar);
            arrayList3.add(0, fjVar);
        } else {
            arrayList.add(fjVar);
            arrayList3.add(fjVar);
        }
        sparseArrayArr[i7].put(fjVar.e1(), fjVar);
        int[] iArr = this.f42528j;
        if (!z11) {
            if (fjVar.e1() > 0) {
                iArr[i7] = Math.min(fjVar.e1(), iArr[i7]);
                this.f42529k = Math.max(fjVar.e1(), this.f42529k);
            }
        } else {
            iArr[i7] = Math.max(fjVar.e1(), iArr[i7]);
            this.f42529k = Math.min(fjVar.e1(), this.f42529k);
        }
        if (!this.v && org.telegram.messenger.fj.L4(fjVar.f23993k)) {
            this.v = true;
        }
        if (!this.f42540w && org.telegram.messenger.fj.S3(fjVar.f23993k)) {
            this.f42540w = true;
        }
        return true;
    }

    public final org.telegram.messenger.fj b(int i7, int i10) {
        SparseArray[] sparseArrayArr = this.f42522b;
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
        this.f42521a.remove(fjVar);
        sparseArrayArr[i10].remove(fjVar.e1());
        if (arrayList.isEmpty()) {
            hashMap.remove(str);
            this.f42523c.remove(str);
        }
        int[] iArr = this.f42525f;
        int i11 = iArr[i10] - 1;
        iArr[i10] = i11;
        if (i11 < 0) {
            iArr[i10] = 0;
        }
        return fjVar;
    }

    public final ArrayList c() {
        if (this.f42536r) {
            return this.f42537s;
        }
        return this.f42521a;
    }

    public final int d() {
        if (this.f42536r) {
            return this.f42538t;
        }
        return this.f42531m;
    }

    public final int e() {
        int[] iArr = this.f42525f;
        return iArr[0] + iArr[1];
    }

    public final void f(int i7, int i10, int i11) {
        SparseArray[] sparseArrayArr = this.f42522b;
        org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) sparseArrayArr[i7].get(i10);
        if (fjVar != null) {
            sparseArrayArr[i7].remove(i10);
            sparseArrayArr[i7].put(i11, fjVar);
            fjVar.f23993k.f28452id = i11;
            int[] iArr = this.f42528j;
            iArr[i7] = Math.min(i11, iArr[i7]);
        }
    }

    public final void g(boolean z10) {
        if (this.f42536r != z10) {
            this.f42536r = z10;
            if (z10) {
                this.f42538t = this.f42531m;
                this.f42539u = this.f42532n;
                ArrayList arrayList = this.f42537s;
                arrayList.clear();
                arrayList.addAll(this.f42521a);
            }
        }
    }
}
