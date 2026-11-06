package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kr {
    public final int f35395a;
    public String f35396b;
    public final ArrayList f35397c;
    public final boolean[] d;
    public boolean[] f35398e;
    public boolean f35399f;
    public final int f35400g;
    public int h;
    public int f35401i;
    public final lr f35402j;

    public kr(lr lrVar, int i7, ArrayList arrayList) {
        this.f35402j = lrVar;
        this.f35395a = i7;
        int size = arrayList.size();
        this.f35400g = size;
        this.f35401i = 0;
        if (size > 0) {
            this.f35397c = arrayList;
            this.d = new boolean[size];
            this.f35399f = true;
            i();
        }
    }

    public final boolean a() {
        boolean[] zArr;
        for (int i7 = 0; i7 < this.f35400g; i7++) {
            if (!this.d[i7] || ((zArr = this.f35398e) != null && !zArr[i7])) {
                return false;
            }
        }
        return true;
    }

    public final void b(org.telegram.messenger.f20 f20Var) {
        for (int i7 = 0; i7 < this.f35400g; i7++) {
            boolean[] zArr = this.f35398e;
            if (zArr == null || zArr[i7]) {
                f20Var.a(i7, (TLObject) this.f35397c.get(i7));
            }
        }
    }

    public final void c(org.telegram.messenger.f20 f20Var) {
        boolean[] zArr;
        for (int i7 = 0; i7 < this.f35400g; i7++) {
            if (this.d[i7] && ((zArr = this.f35398e) == null || zArr[i7])) {
                f20Var.a(i7, (TLObject) this.f35397c.get(i7));
            }
        }
    }

    public final boolean d() {
        int i7;
        if (this.f35398e != null) {
            i7 = this.h;
        } else {
            i7 = this.f35400g;
        }
        if (i7 > 1) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        int i7;
        if (this.f35398e != null) {
            i7 = this.h;
        } else {
            i7 = this.f35400g;
        }
        if (i7 > 0) {
            return true;
        }
        return false;
    }

    public final void f() {
        boolean[] zArr;
        boolean[] zArr2;
        boolean z9 = false;
        int i7 = 0;
        while (true) {
            int i10 = this.f35400g;
            zArr = this.d;
            if (i7 >= i10) {
                break;
            } else if (!zArr[i7] || ((zArr2 = this.f35398e) != null && !zArr2[i7])) {
                i7++;
            }
        }
        z9 = true;
        Arrays.fill(zArr, !z9);
        h();
        this.f35402j.P1.O(true);
    }

    public final void g(int i7) {
        boolean[] zArr = this.f35398e;
        if (zArr != null && !zArr[i7]) {
            return;
        }
        boolean[] zArr2 = this.d;
        boolean z9 = zArr2[i7];
        zArr2[i7] = !z9;
        if (!z9) {
            this.f35401i++;
        } else {
            this.f35401i--;
        }
        this.f35402j.P1.O(true);
    }

    public final void h() {
        this.f35401i = 0;
        this.h = 0;
        for (int i7 = 0; i7 < this.f35400g; i7++) {
            boolean[] zArr = this.f35398e;
            boolean[] zArr2 = this.d;
            if (zArr == null) {
                if (zArr2[i7]) {
                    this.f35401i++;
                }
            } else if (zArr[i7]) {
                this.h++;
                if (zArr2[i7]) {
                    this.f35401i++;
                }
            }
        }
    }

    public final void i() {
        TLObject tLObject;
        String o4;
        String a02;
        String a03;
        String a04;
        String a05;
        int i7 = this.f35400g;
        if (i7 != 0) {
            for (int i10 = 0; i10 < i7; i10++) {
                boolean[] zArr = this.f35398e;
                if (zArr == null || zArr[i10]) {
                    tLObject = (TLObject) this.f35397c.get(i10);
                    break;
                }
            }
            tLObject = null;
            if (tLObject instanceof TLRPC.User) {
                o4 = org.telegram.messenger.t10.k((TLRPC.User) tLObject);
            } else {
                o4 = org.telegram.messenger.g5.o(tLObject);
            }
            int i11 = this.f35395a;
            if (i11 == 0) {
                this.f35396b = org.telegram.messenger.hd.M0(2131751503, null);
            } else if (i11 == 1) {
                if (d()) {
                    a05 = org.telegram.messenger.hd.M0(2131751583, null);
                } else {
                    a05 = org.telegram.messenger.hd.a0(null, null, 2131751588, o4);
                }
                this.f35396b = a05;
            } else if (i11 == 3) {
                if (d()) {
                    a04 = org.telegram.messenger.hd.M0(2131751578, null);
                } else {
                    a04 = org.telegram.messenger.hd.a0(null, null, 2131751579, o4);
                }
                this.f35396b = a04;
            } else if (i11 == 2) {
                if (this.f35402j.Y1) {
                    if (d()) {
                        a03 = org.telegram.messenger.hd.M0(2131751501, null);
                    } else {
                        a03 = org.telegram.messenger.hd.a0(null, null, 2131751502, o4);
                    }
                    this.f35396b = a03;
                    return;
                }
                if (d()) {
                    a02 = org.telegram.messenger.hd.M0(2131751568, null);
                } else {
                    a02 = org.telegram.messenger.hd.a0(null, null, 2131751569, o4);
                }
                this.f35396b = a02;
            }
        }
    }
}
