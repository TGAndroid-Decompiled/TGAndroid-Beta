package org.telegram.ui.Components;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
public final class vs0 {
    public boolean f41417g;
    public boolean h;
    public int f41420k;
    public int f41422m;
    public int f41423n;
    public boolean f41424o;
    public int f41425p;
    public boolean f41427r;
    public int f41429t;
    public int f41430u;
    public boolean v;
    public boolean f41431w;
    public final ArrayList f41412a = new ArrayList();
    public final SparseArray[] f41413b = {new SparseArray(), new SparseArray()};
    public final ArrayList f41414c = new ArrayList();
    public final HashMap d = new HashMap();
    public final ArrayList f41415e = new ArrayList();
    public final int[] f41416f = {0, 0};
    public final boolean[] f41418i = {false, true};
    public final int[] f41419j = {0, 0};
    public boolean f41421l = true;
    public int f41426q = 0;
    public final ArrayList f41428s = new ArrayList();
    public v4.w0 f41432x = new v4.w0();

    public final boolean a(org.telegram.messenger.fj fjVar, int i7, boolean z10, boolean z11) {
        SparseArray[] sparseArrayArr = this.f41413b;
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
            ArrayList arrayList2 = this.f41414c;
            if (z10) {
                arrayList2.add(0, str);
            } else {
                arrayList2.add(str);
            }
        }
        ArrayList arrayList3 = this.f41412a;
        if (z10) {
            arrayList.add(0, fjVar);
            arrayList3.add(0, fjVar);
        } else {
            arrayList.add(fjVar);
            arrayList3.add(fjVar);
        }
        sparseArrayArr[i7].put(fjVar.e1(), fjVar);
        int[] iArr = this.f41419j;
        if (!z11) {
            if (fjVar.e1() > 0) {
                iArr[i7] = Math.min(fjVar.e1(), iArr[i7]);
                this.f41420k = Math.max(fjVar.e1(), this.f41420k);
            }
        } else {
            iArr[i7] = Math.max(fjVar.e1(), iArr[i7]);
            this.f41420k = Math.min(fjVar.e1(), this.f41420k);
        }
        if (!this.v && org.telegram.messenger.fj.L4(fjVar.f23965k)) {
            this.v = true;
        }
        if (!this.f41431w && org.telegram.messenger.fj.S3(fjVar.f23965k)) {
            this.f41431w = true;
        }
        return true;
    }

    public final org.telegram.messenger.fj b(int i7, int i10) {
        SparseArray[] sparseArrayArr = this.f41413b;
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
        this.f41412a.remove(fjVar);
        sparseArrayArr[i10].remove(fjVar.e1());
        if (arrayList.isEmpty()) {
            hashMap.remove(str);
            this.f41414c.remove(str);
        }
        int[] iArr = this.f41416f;
        int i11 = iArr[i10] - 1;
        iArr[i10] = i11;
        if (i11 < 0) {
            iArr[i10] = 0;
        }
        return fjVar;
    }

    public final ArrayList c() {
        if (this.f41427r) {
            return this.f41428s;
        }
        return this.f41412a;
    }

    public final int d() {
        if (this.f41427r) {
            return this.f41429t;
        }
        return this.f41422m;
    }

    public final int e() {
        int[] iArr = this.f41416f;
        return iArr[0] + iArr[1];
    }

    public final void f(int i7, int i10, int i11) {
        SparseArray[] sparseArrayArr = this.f41413b;
        org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) sparseArrayArr[i7].get(i10);
        if (fjVar != null) {
            sparseArrayArr[i7].remove(i10);
            sparseArrayArr[i7].put(i11, fjVar);
            fjVar.f23965k.f28424id = i11;
            int[] iArr = this.f41419j;
            iArr[i7] = Math.min(i11, iArr[i7]);
        }
    }

    public final void g(boolean z10) {
        if (this.f41427r != z10) {
            this.f41427r = z10;
            if (z10) {
                this.f41429t = this.f41422m;
                this.f41430u = this.f41423n;
                ArrayList arrayList = this.f41428s;
                arrayList.clear();
                arrayList.addAll(this.f41412a);
            }
        }
    }
}
