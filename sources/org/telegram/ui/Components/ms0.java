package org.telegram.ui.Components;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
public final class ms0 {
    public boolean f36096g;
    public boolean h;
    public int f36099k;
    public int f36101m;
    public int f36102n;
    public boolean f36103o;
    public int f36104p;
    public boolean f36106r;
    public int f36108t;
    public int f36109u;
    public boolean v;
    public boolean f36110w;
    public final ArrayList f36091a = new ArrayList();
    public final SparseArray[] f36092b = {new SparseArray(), new SparseArray()};
    public final ArrayList f36093c = new ArrayList();
    public final HashMap d = new HashMap();
    public final ArrayList f36094e = new ArrayList();
    public final int[] f36095f = {0, 0};
    public final boolean[] f36097i = {false, true};
    public final int[] f36098j = {0, 0};
    public boolean f36100l = true;
    public int f36105q = 0;
    public final ArrayList f36107s = new ArrayList();
    public v4.u0 f36111x = new v4.u0();

    public final boolean a(org.telegram.messenger.ij ijVar, int i7, boolean z9, boolean z10) {
        SparseArray[] sparseArrayArr = this.f36092b;
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
            ArrayList arrayList2 = this.f36093c;
            if (z9) {
                arrayList2.add(0, str);
            } else {
                arrayList2.add(str);
            }
        }
        ArrayList arrayList3 = this.f36091a;
        if (z9) {
            arrayList.add(0, ijVar);
            arrayList3.add(0, ijVar);
        } else {
            arrayList.add(ijVar);
            arrayList3.add(ijVar);
        }
        sparseArrayArr[i7].put(ijVar.f1(), ijVar);
        int[] iArr = this.f36098j;
        if (!z10) {
            if (ijVar.f1() > 0) {
                iArr[i7] = Math.min(ijVar.f1(), iArr[i7]);
                this.f36099k = Math.max(ijVar.f1(), this.f36099k);
            }
        } else {
            iArr[i7] = Math.max(ijVar.f1(), iArr[i7]);
            this.f36099k = Math.min(ijVar.f1(), this.f36099k);
        }
        if (!this.v && org.telegram.messenger.ij.M4(ijVar.f23262k)) {
            this.v = true;
        }
        if (!this.f36110w && org.telegram.messenger.ij.T3(ijVar.f23262k)) {
            this.f36110w = true;
        }
        return true;
    }

    public final org.telegram.messenger.ij b(int i7, int i10) {
        SparseArray[] sparseArrayArr = this.f36092b;
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
        this.f36091a.remove(ijVar);
        sparseArrayArr[i10].remove(ijVar.f1());
        if (arrayList.isEmpty()) {
            hashMap.remove(str);
            this.f36093c.remove(str);
        }
        int[] iArr = this.f36095f;
        int i11 = iArr[i10] - 1;
        iArr[i10] = i11;
        if (i11 < 0) {
            iArr[i10] = 0;
        }
        return ijVar;
    }

    public final ArrayList c() {
        if (this.f36106r) {
            return this.f36107s;
        }
        return this.f36091a;
    }

    public final int d() {
        if (this.f36106r) {
            return this.f36108t;
        }
        return this.f36101m;
    }

    public final int e() {
        int[] iArr = this.f36095f;
        return iArr[0] + iArr[1];
    }

    public final void f(int i7, int i10, int i11) {
        SparseArray[] sparseArrayArr = this.f36092b;
        org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) sparseArrayArr[i7].get(i10);
        if (ijVar != null) {
            sparseArrayArr[i7].remove(i10);
            sparseArrayArr[i7].put(i11, ijVar);
            ijVar.f23262k.f26977id = i11;
            int[] iArr = this.f36098j;
            iArr[i7] = Math.min(i11, iArr[i7]);
        }
    }

    public final void g(boolean z9) {
        if (this.f36106r != z9) {
            this.f36106r = z9;
            if (z9) {
                this.f36108t = this.f36101m;
                this.f36109u = this.f36102n;
                ArrayList arrayList = this.f36107s;
                arrayList.clear();
                arrayList.addAll(this.f36091a);
            }
        }
    }
}
