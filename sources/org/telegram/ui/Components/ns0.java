package org.telegram.ui.Components;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
public final class ns0 {
    public boolean f36374g;
    public boolean h;
    public int f36377k;
    public int f36379m;
    public int f36380n;
    public boolean f36381o;
    public int f36382p;
    public boolean f36384r;
    public int f36386t;
    public int f36387u;
    public boolean v;
    public boolean f36388w;
    public final ArrayList f36369a = new ArrayList();
    public final SparseArray[] f36370b = {new SparseArray(), new SparseArray()};
    public final ArrayList f36371c = new ArrayList();
    public final HashMap d = new HashMap();
    public final ArrayList f36372e = new ArrayList();
    public final int[] f36373f = {0, 0};
    public final boolean[] f36375i = {false, true};
    public final int[] f36376j = {0, 0};
    public boolean f36378l = true;
    public int f36383q = 0;
    public final ArrayList f36385s = new ArrayList();
    public v4.u0 f36389x = new v4.u0();

    public final boolean a(org.telegram.messenger.ij ijVar, int i7, boolean z9, boolean z10) {
        SparseArray[] sparseArrayArr = this.f36370b;
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
            ArrayList arrayList2 = this.f36371c;
            if (z9) {
                arrayList2.add(0, str);
            } else {
                arrayList2.add(str);
            }
        }
        ArrayList arrayList3 = this.f36369a;
        if (z9) {
            arrayList.add(0, ijVar);
            arrayList3.add(0, ijVar);
        } else {
            arrayList.add(ijVar);
            arrayList3.add(ijVar);
        }
        sparseArrayArr[i7].put(ijVar.e1(), ijVar);
        int[] iArr = this.f36376j;
        if (!z10) {
            if (ijVar.e1() > 0) {
                iArr[i7] = Math.min(ijVar.e1(), iArr[i7]);
                this.f36377k = Math.max(ijVar.e1(), this.f36377k);
            }
        } else {
            iArr[i7] = Math.max(ijVar.e1(), iArr[i7]);
            this.f36377k = Math.min(ijVar.e1(), this.f36377k);
        }
        if (!this.v && org.telegram.messenger.ij.L4(ijVar.f23266k)) {
            this.v = true;
        }
        if (!this.f36388w && org.telegram.messenger.ij.S3(ijVar.f23266k)) {
            this.f36388w = true;
        }
        return true;
    }

    public final org.telegram.messenger.ij b(int i7, int i10) {
        SparseArray[] sparseArrayArr = this.f36370b;
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
        this.f36369a.remove(ijVar);
        sparseArrayArr[i10].remove(ijVar.e1());
        if (arrayList.isEmpty()) {
            hashMap.remove(str);
            this.f36371c.remove(str);
        }
        int[] iArr = this.f36373f;
        int i11 = iArr[i10] - 1;
        iArr[i10] = i11;
        if (i11 < 0) {
            iArr[i10] = 0;
        }
        return ijVar;
    }

    public final ArrayList c() {
        if (this.f36384r) {
            return this.f36385s;
        }
        return this.f36369a;
    }

    public final int d() {
        if (this.f36384r) {
            return this.f36386t;
        }
        return this.f36379m;
    }

    public final int e() {
        int[] iArr = this.f36373f;
        return iArr[0] + iArr[1];
    }

    public final void f(int i7, int i10, int i11) {
        SparseArray[] sparseArrayArr = this.f36370b;
        org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) sparseArrayArr[i7].get(i10);
        if (ijVar != null) {
            sparseArrayArr[i7].remove(i10);
            sparseArrayArr[i7].put(i11, ijVar);
            ijVar.f23266k.f26981id = i11;
            int[] iArr = this.f36376j;
            iArr[i7] = Math.min(i11, iArr[i7]);
        }
    }

    public final void g(boolean z9) {
        if (this.f36384r != z9) {
            this.f36384r = z9;
            if (z9) {
                this.f36386t = this.f36379m;
                this.f36387u = this.f36380n;
                ArrayList arrayList = this.f36385s;
                arrayList.clear();
                arrayList.addAll(this.f36369a);
            }
        }
    }
}
