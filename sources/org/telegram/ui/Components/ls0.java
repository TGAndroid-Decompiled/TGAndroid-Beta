package org.telegram.ui.Components;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
public final class ls0 {
    public boolean f35859g;
    public boolean h;
    public int f35862k;
    public int f35864m;
    public int f35865n;
    public boolean f35866o;
    public int f35867p;
    public boolean f35869r;
    public int f35871t;
    public int f35872u;
    public boolean v;
    public boolean f35873w;
    public final ArrayList f35854a = new ArrayList();
    public final SparseArray[] f35855b = {new SparseArray(), new SparseArray()};
    public final ArrayList f35856c = new ArrayList();
    public final HashMap d = new HashMap();
    public final ArrayList f35857e = new ArrayList();
    public final int[] f35858f = {0, 0};
    public final boolean[] f35860i = {false, true};
    public final int[] f35861j = {0, 0};
    public boolean f35863l = true;
    public int f35868q = 0;
    public final ArrayList f35870s = new ArrayList();
    public u4.v0 f35874x = new u4.v0();

    public final boolean a(org.telegram.messenger.zi ziVar, int i3, boolean z10, boolean z11) {
        SparseArray[] sparseArrayArr = this.f35855b;
        SparseArray sparseArray = sparseArrayArr[i3];
        int f12 = ziVar.f1();
        String str = ziVar.Y;
        if (sparseArray.indexOfKey(f12) >= 0) {
            return false;
        }
        HashMap hashMap = this.d;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(str, arrayList);
            ArrayList arrayList2 = this.f35856c;
            if (z10) {
                arrayList2.add(0, str);
            } else {
                arrayList2.add(str);
            }
        }
        ArrayList arrayList3 = this.f35854a;
        if (z10) {
            arrayList.add(0, ziVar);
            arrayList3.add(0, ziVar);
        } else {
            arrayList.add(ziVar);
            arrayList3.add(ziVar);
        }
        sparseArrayArr[i3].put(ziVar.f1(), ziVar);
        int[] iArr = this.f35861j;
        if (!z11) {
            if (ziVar.f1() > 0) {
                iArr[i3] = Math.min(ziVar.f1(), iArr[i3]);
                this.f35862k = Math.max(ziVar.f1(), this.f35862k);
            }
        } else {
            iArr[i3] = Math.max(ziVar.f1(), iArr[i3]);
            this.f35862k = Math.min(ziVar.f1(), this.f35862k);
        }
        if (!this.v && org.telegram.messenger.zi.M4(ziVar.f26868k)) {
            this.v = true;
        }
        if (!this.f35873w && org.telegram.messenger.zi.T3(ziVar.f26868k)) {
            this.f35873w = true;
        }
        return true;
    }

    public final org.telegram.messenger.zi b(int i3, int i10) {
        SparseArray[] sparseArrayArr = this.f35855b;
        org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) sparseArrayArr[i10].get(i3);
        if (ziVar == null) {
            return null;
        }
        String str = ziVar.Y;
        HashMap hashMap = this.d;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            return null;
        }
        arrayList.remove(ziVar);
        this.f35854a.remove(ziVar);
        sparseArrayArr[i10].remove(ziVar.f1());
        if (arrayList.isEmpty()) {
            hashMap.remove(str);
            this.f35856c.remove(str);
        }
        int[] iArr = this.f35858f;
        int i11 = iArr[i10] - 1;
        iArr[i10] = i11;
        if (i11 < 0) {
            iArr[i10] = 0;
        }
        return ziVar;
    }

    public final ArrayList c() {
        if (this.f35869r) {
            return this.f35870s;
        }
        return this.f35854a;
    }

    public final int d() {
        if (this.f35869r) {
            return this.f35871t;
        }
        return this.f35864m;
    }

    public final int e() {
        int[] iArr = this.f35858f;
        return iArr[0] + iArr[1];
    }

    public final void f(int i3, int i10, int i11) {
        SparseArray[] sparseArrayArr = this.f35855b;
        org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) sparseArrayArr[i3].get(i10);
        if (ziVar != null) {
            sparseArrayArr[i3].remove(i10);
            sparseArrayArr[i3].put(i11, ziVar);
            ziVar.f26868k.f27022id = i11;
            int[] iArr = this.f35861j;
            iArr[i3] = Math.min(i11, iArr[i3]);
        }
    }

    public final void g(boolean z10) {
        if (this.f35869r != z10) {
            this.f35869r = z10;
            if (z10) {
                this.f35871t = this.f35864m;
                this.f35872u = this.f35865n;
                ArrayList arrayList = this.f35870s;
                arrayList.clear();
                arrayList.addAll(this.f35854a);
            }
        }
    }
}
