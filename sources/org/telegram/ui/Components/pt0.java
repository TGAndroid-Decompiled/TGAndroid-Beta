package org.telegram.ui.Components;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
public final class pt0 {
    public boolean f29536g;
    public boolean h;
    public int f29539k;
    public int f29541m;
    public int f29542n;
    public boolean f29543o;
    public int f29544p;
    public boolean f29546r;
    public int f29548t;
    public int f29549u;
    public boolean v;
    public boolean f29550w;
    public final ArrayList f29532a = new ArrayList();
    public final SparseArray[] f29533b = {new SparseArray(), new SparseArray()};
    public final ArrayList f29534c = new ArrayList();
    public final HashMap d = new HashMap();
    public final ArrayList e = new ArrayList();
    public final int[] f29535f = {0, 0};
    public final boolean[] f29537i = {false, true};
    public final int[] f29538j = {0, 0};
    public boolean f29540l = true;
    public int f29545q = 0;
    public final ArrayList f29547s = new ArrayList();
    public s4.u0 f29551x = new s4.u0();

    public final boolean a(org.telegram.messenger.kj kjVar, int i10, boolean z10, boolean z11) {
        SparseArray[] sparseArrayArr = this.f29533b;
        SparseArray sparseArray = sparseArrayArr[i10];
        int f12 = kjVar.f1();
        String str = kjVar.Y;
        if (sparseArray.indexOfKey(f12) >= 0) {
            return false;
        }
        HashMap hashMap = this.d;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(str, arrayList);
            ArrayList arrayList2 = this.f29534c;
            if (z10) {
                arrayList2.add(0, str);
            } else {
                arrayList2.add(str);
            }
        }
        ArrayList arrayList3 = this.f29532a;
        if (z10) {
            arrayList.add(0, kjVar);
            arrayList3.add(0, kjVar);
        } else {
            arrayList.add(kjVar);
            arrayList3.add(kjVar);
        }
        sparseArrayArr[i10].put(kjVar.f1(), kjVar);
        int[] iArr = this.f29538j;
        if (!z11) {
            if (kjVar.f1() > 0) {
                iArr[i10] = Math.min(kjVar.f1(), iArr[i10]);
                this.f29539k = Math.max(kjVar.f1(), this.f29539k);
            }
        } else {
            iArr[i10] = Math.max(kjVar.f1(), iArr[i10]);
            this.f29539k = Math.min(kjVar.f1(), this.f29539k);
        }
        if (!this.v && org.telegram.messenger.kj.L4(kjVar.f16690k)) {
            this.v = true;
        }
        if (!this.f29550w && org.telegram.messenger.kj.S3(kjVar.f16690k)) {
            this.f29550w = true;
        }
        return true;
    }

    public final org.telegram.messenger.kj b(int i10, int i11) {
        SparseArray[] sparseArrayArr = this.f29533b;
        org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) sparseArrayArr[i11].get(i10);
        if (kjVar == null) {
            return null;
        }
        String str = kjVar.Y;
        HashMap hashMap = this.d;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            return null;
        }
        arrayList.remove(kjVar);
        this.f29532a.remove(kjVar);
        sparseArrayArr[i11].remove(kjVar.f1());
        if (arrayList.isEmpty()) {
            hashMap.remove(str);
            this.f29534c.remove(str);
        }
        int[] iArr = this.f29535f;
        int i12 = iArr[i11] - 1;
        iArr[i11] = i12;
        if (i12 < 0) {
            iArr[i11] = 0;
        }
        return kjVar;
    }

    public final ArrayList c() {
        if (this.f29546r) {
            return this.f29547s;
        }
        return this.f29532a;
    }

    public final int d() {
        if (this.f29546r) {
            return this.f29548t;
        }
        return this.f29541m;
    }

    public final int e() {
        int[] iArr = this.f29535f;
        return iArr[0] + iArr[1];
    }

    public final void f(int i10, int i11, int i12) {
        SparseArray[] sparseArrayArr = this.f29533b;
        org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) sparseArrayArr[i10].get(i11);
        if (kjVar != null) {
            sparseArrayArr[i10].remove(i11);
            sparseArrayArr[i10].put(i12, kjVar);
            kjVar.f16690k.f19815id = i12;
            int[] iArr = this.f29538j;
            iArr[i10] = Math.min(i12, iArr[i10]);
        }
    }

    public final void g(boolean z10) {
        if (this.f29546r != z10) {
            this.f29546r = z10;
            if (z10) {
                this.f29548t = this.f29541m;
                this.f29549u = this.f29542n;
                ArrayList arrayList = this.f29547s;
                arrayList.clear();
                arrayList.addAll(this.f29532a);
            }
        }
    }
}
