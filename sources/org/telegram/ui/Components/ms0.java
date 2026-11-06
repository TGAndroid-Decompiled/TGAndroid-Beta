package org.telegram.ui.Components;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
public final class ms0 {
    public boolean f36114g;
    public boolean h;
    public int f36117k;
    public int f36119m;
    public int f36120n;
    public boolean f36121o;
    public int f36122p;
    public boolean f36124r;
    public int f36126t;
    public int f36127u;
    public boolean v;
    public boolean f36128w;
    public final ArrayList f36109a = new ArrayList();
    public final SparseArray[] f36110b = {new SparseArray(), new SparseArray()};
    public final ArrayList f36111c = new ArrayList();
    public final HashMap d = new HashMap();
    public final ArrayList f36112e = new ArrayList();
    public final int[] f36113f = {0, 0};
    public final boolean[] f36115i = {false, true};
    public final int[] f36116j = {0, 0};
    public boolean f36118l = true;
    public int f36123q = 0;
    public final ArrayList f36125s = new ArrayList();
    public v4.u0 f36129x = new v4.u0();

    public final boolean a(org.telegram.messenger.ij ijVar, int i7, boolean z9, boolean z10) {
        SparseArray[] sparseArrayArr = this.f36110b;
        SparseArray sparseArray = sparseArrayArr[i7];
        int f12 = ijVar.f1();
        String str = ijVar.Y;
        if (sparseArray.indexOfKey(f12) >= 0) {
            return false;
        }
        HashMap hashMap = this.d;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(str, arrayList);
            ArrayList arrayList2 = this.f36111c;
            if (z9) {
                arrayList2.add(0, str);
            } else {
                arrayList2.add(str);
            }
        }
        ArrayList arrayList3 = this.f36109a;
        if (z9) {
            arrayList.add(0, ijVar);
            arrayList3.add(0, ijVar);
        } else {
            arrayList.add(ijVar);
            arrayList3.add(ijVar);
        }
        sparseArrayArr[i7].put(ijVar.f1(), ijVar);
        int[] iArr = this.f36116j;
        if (!z10) {
            if (ijVar.f1() > 0) {
                iArr[i7] = Math.min(ijVar.f1(), iArr[i7]);
                this.f36117k = Math.max(ijVar.f1(), this.f36117k);
            }
        } else {
            iArr[i7] = Math.max(ijVar.f1(), iArr[i7]);
            this.f36117k = Math.min(ijVar.f1(), this.f36117k);
        }
        if (!this.v && org.telegram.messenger.ij.M4(ijVar.f23237k)) {
            this.v = true;
        }
        if (!this.f36128w && org.telegram.messenger.ij.T3(ijVar.f23237k)) {
            this.f36128w = true;
        }
        return true;
    }

    public final org.telegram.messenger.ij b(int i7, int i10) {
        SparseArray[] sparseArrayArr = this.f36110b;
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
        this.f36109a.remove(ijVar);
        sparseArrayArr[i10].remove(ijVar.f1());
        if (arrayList.isEmpty()) {
            hashMap.remove(str);
            this.f36111c.remove(str);
        }
        int[] iArr = this.f36113f;
        int i11 = iArr[i10] - 1;
        iArr[i10] = i11;
        if (i11 < 0) {
            iArr[i10] = 0;
        }
        return ijVar;
    }

    public final ArrayList c() {
        if (this.f36124r) {
            return this.f36125s;
        }
        return this.f36109a;
    }

    public final int d() {
        if (this.f36124r) {
            return this.f36126t;
        }
        return this.f36119m;
    }

    public final int e() {
        int[] iArr = this.f36113f;
        return iArr[0] + iArr[1];
    }

    public final void f(int i7, int i10, int i11) {
        SparseArray[] sparseArrayArr = this.f36110b;
        org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) sparseArrayArr[i7].get(i10);
        if (ijVar != null) {
            sparseArrayArr[i7].remove(i10);
            sparseArrayArr[i7].put(i11, ijVar);
            ijVar.f23237k.f26973id = i11;
            int[] iArr = this.f36116j;
            iArr[i7] = Math.min(i11, iArr[i7]);
        }
    }

    public final void g(boolean z9) {
        if (this.f36124r != z9) {
            this.f36124r = z9;
            if (z9) {
                this.f36126t = this.f36119m;
                this.f36127u = this.f36120n;
                ArrayList arrayList = this.f36125s;
                arrayList.clear();
                arrayList.addAll(this.f36109a);
            }
        }
    }
}
