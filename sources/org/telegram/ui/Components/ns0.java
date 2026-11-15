package org.telegram.ui.Components;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
public final class ns0 {
    public boolean f37697g;
    public boolean h;
    public int f37700k;
    public int f37702m;
    public int f37703n;
    public boolean f37704o;
    public int f37705p;
    public boolean f37707r;
    public int f37709t;
    public int f37710u;
    public boolean v;
    public boolean f37711w;
    public final ArrayList f37692a = new ArrayList();
    public final SparseArray[] f37693b = {new SparseArray(), new SparseArray()};
    public final ArrayList f37694c = new ArrayList();
    public final HashMap d = new HashMap();
    public final ArrayList f37695e = new ArrayList();
    public final int[] f37696f = {0, 0};
    public final boolean[] f37698i = {false, true};
    public final int[] f37699j = {0, 0};
    public boolean f37701l = true;
    public int f37706q = 0;
    public final ArrayList f37708s = new ArrayList();
    public v4.v0 f37712x = new v4.v0();

    public final boolean a(org.telegram.messenger.gj gjVar, int i7, boolean z10, boolean z11) {
        SparseArray[] sparseArrayArr = this.f37693b;
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
            ArrayList arrayList2 = this.f37694c;
            if (z10) {
                arrayList2.add(0, str);
            } else {
                arrayList2.add(str);
            }
        }
        ArrayList arrayList3 = this.f37692a;
        if (z10) {
            arrayList.add(0, gjVar);
            arrayList3.add(0, gjVar);
        } else {
            arrayList.add(gjVar);
            arrayList3.add(gjVar);
        }
        sparseArrayArr[i7].put(gjVar.e1(), gjVar);
        int[] iArr = this.f37699j;
        if (!z11) {
            if (gjVar.e1() > 0) {
                iArr[i7] = Math.min(gjVar.e1(), iArr[i7]);
                this.f37700k = Math.max(gjVar.e1(), this.f37700k);
            }
        } else {
            iArr[i7] = Math.max(gjVar.e1(), iArr[i7]);
            this.f37700k = Math.min(gjVar.e1(), this.f37700k);
        }
        if (!this.v && org.telegram.messenger.gj.L4(gjVar.f23817k)) {
            this.v = true;
        }
        if (!this.f37711w && org.telegram.messenger.gj.S3(gjVar.f23817k)) {
            this.f37711w = true;
        }
        return true;
    }

    public final org.telegram.messenger.gj b(int i7, int i10) {
        SparseArray[] sparseArrayArr = this.f37693b;
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
        this.f37692a.remove(gjVar);
        sparseArrayArr[i10].remove(gjVar.e1());
        if (arrayList.isEmpty()) {
            hashMap.remove(str);
            this.f37694c.remove(str);
        }
        int[] iArr = this.f37696f;
        int i11 = iArr[i10] - 1;
        iArr[i10] = i11;
        if (i11 < 0) {
            iArr[i10] = 0;
        }
        return gjVar;
    }

    public final ArrayList c() {
        if (this.f37707r) {
            return this.f37708s;
        }
        return this.f37692a;
    }

    public final int d() {
        if (this.f37707r) {
            return this.f37709t;
        }
        return this.f37702m;
    }

    public final int e() {
        int[] iArr = this.f37696f;
        return iArr[0] + iArr[1];
    }

    public final void f(int i7, int i10, int i11) {
        SparseArray[] sparseArrayArr = this.f37693b;
        org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) sparseArrayArr[i7].get(i10);
        if (gjVar != null) {
            sparseArrayArr[i7].remove(i10);
            sparseArrayArr[i7].put(i11, gjVar);
            gjVar.f23817k.f28072id = i11;
            int[] iArr = this.f37699j;
            iArr[i7] = Math.min(i11, iArr[i7]);
        }
    }

    public final void g(boolean z10) {
        if (this.f37707r != z10) {
            this.f37707r = z10;
            if (z10) {
                this.f37709t = this.f37702m;
                this.f37710u = this.f37703n;
                ArrayList arrayList = this.f37708s;
                arrayList.clear();
                arrayList.addAll(this.f37692a);
            }
        }
    }
}
