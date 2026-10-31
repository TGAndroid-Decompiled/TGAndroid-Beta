package org.telegram.ui.Components;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
public final class ot0 {
    public boolean f29181g;
    public boolean h;
    public int f29184k;
    public int f29186m;
    public int f29187n;
    public boolean f29188o;
    public int f29189p;
    public boolean f29191r;
    public int f29193t;
    public int f29194u;
    public boolean v;
    public boolean f29195w;
    public final ArrayList f29177a = new ArrayList();
    public final SparseArray[] f29178b = {new SparseArray(), new SparseArray()};
    public final ArrayList f29179c = new ArrayList();
    public final HashMap d = new HashMap();
    public final ArrayList e = new ArrayList();
    public final int[] f29180f = {0, 0};
    public final boolean[] f29182i = {false, true};
    public final int[] f29183j = {0, 0};
    public boolean f29185l = true;
    public int f29190q = 0;
    public final ArrayList f29192s = new ArrayList();
    public s4.u0 f29196x = new s4.u0();

    public final boolean a(org.telegram.messenger.jj jjVar, int i10, boolean z10, boolean z11) {
        SparseArray[] sparseArrayArr = this.f29178b;
        SparseArray sparseArray = sparseArrayArr[i10];
        int f12 = jjVar.f1();
        String str = jjVar.Y;
        if (sparseArray.indexOfKey(f12) >= 0) {
            return false;
        }
        HashMap hashMap = this.d;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            hashMap.put(str, arrayList);
            ArrayList arrayList2 = this.f29179c;
            if (z10) {
                arrayList2.add(0, str);
            } else {
                arrayList2.add(str);
            }
        }
        ArrayList arrayList3 = this.f29177a;
        if (z10) {
            arrayList.add(0, jjVar);
            arrayList3.add(0, jjVar);
        } else {
            arrayList.add(jjVar);
            arrayList3.add(jjVar);
        }
        sparseArrayArr[i10].put(jjVar.f1(), jjVar);
        int[] iArr = this.f29183j;
        if (!z11) {
            if (jjVar.f1() > 0) {
                iArr[i10] = Math.min(jjVar.f1(), iArr[i10]);
                this.f29184k = Math.max(jjVar.f1(), this.f29184k);
            }
        } else {
            iArr[i10] = Math.max(jjVar.f1(), iArr[i10]);
            this.f29184k = Math.min(jjVar.f1(), this.f29184k);
        }
        if (!this.v && org.telegram.messenger.jj.L4(jjVar.f16337k)) {
            this.v = true;
        }
        if (!this.f29195w && org.telegram.messenger.jj.S3(jjVar.f16337k)) {
            this.f29195w = true;
        }
        return true;
    }

    public final org.telegram.messenger.jj b(int i10, int i11) {
        SparseArray[] sparseArrayArr = this.f29178b;
        org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) sparseArrayArr[i11].get(i10);
        if (jjVar == null) {
            return null;
        }
        String str = jjVar.Y;
        HashMap hashMap = this.d;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            return null;
        }
        arrayList.remove(jjVar);
        this.f29177a.remove(jjVar);
        sparseArrayArr[i11].remove(jjVar.f1());
        if (arrayList.isEmpty()) {
            hashMap.remove(str);
            this.f29179c.remove(str);
        }
        int[] iArr = this.f29180f;
        int i12 = iArr[i11] - 1;
        iArr[i11] = i12;
        if (i12 < 0) {
            iArr[i11] = 0;
        }
        return jjVar;
    }

    public final ArrayList c() {
        if (this.f29191r) {
            return this.f29192s;
        }
        return this.f29177a;
    }

    public final int d() {
        if (this.f29191r) {
            return this.f29193t;
        }
        return this.f29186m;
    }

    public final int e() {
        int[] iArr = this.f29180f;
        return iArr[0] + iArr[1];
    }

    public final void f(int i10, int i11, int i12) {
        SparseArray[] sparseArrayArr = this.f29178b;
        org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) sparseArrayArr[i10].get(i11);
        if (jjVar != null) {
            sparseArrayArr[i10].remove(i11);
            sparseArrayArr[i10].put(i12, jjVar);
            jjVar.f16337k.f19814id = i12;
            int[] iArr = this.f29183j;
            iArr[i10] = Math.min(i12, iArr[i10]);
        }
    }

    public final void g(boolean z10) {
        if (this.f29191r != z10) {
            this.f29191r = z10;
            if (z10) {
                this.f29193t = this.f29186m;
                this.f29194u = this.f29187n;
                ArrayList arrayList = this.f29192s;
                arrayList.clear();
                arrayList.addAll(this.f29177a);
            }
        }
    }
}
