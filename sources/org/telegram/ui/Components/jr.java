package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jr {
    public final int f35047a;
    public String f35048b;
    public final ArrayList f35049c;
    public final boolean[] d;
    public boolean[] f35050e;
    public boolean f35051f;
    public final int f35052g;
    public int h;
    public int f35053i;
    public final kr f35054j;

    public jr(kr krVar, int i7, ArrayList arrayList) {
        this.f35054j = krVar;
        this.f35047a = i7;
        int size = arrayList.size();
        this.f35052g = size;
        this.f35053i = 0;
        if (size > 0) {
            this.f35049c = arrayList;
            this.d = new boolean[size];
            this.f35051f = true;
            i();
        }
    }

    public final boolean a() {
        boolean[] zArr;
        for (int i7 = 0; i7 < this.f35052g; i7++) {
            if (!this.d[i7] || ((zArr = this.f35050e) != null && !zArr[i7])) {
                return false;
            }
        }
        return true;
    }

    public final void b(org.telegram.messenger.f20 f20Var) {
        for (int i7 = 0; i7 < this.f35052g; i7++) {
            boolean[] zArr = this.f35050e;
            if (zArr == null || zArr[i7]) {
                f20Var.a(i7, (TLObject) this.f35049c.get(i7));
            }
        }
    }

    public final void c(org.telegram.messenger.f20 f20Var) {
        boolean[] zArr;
        for (int i7 = 0; i7 < this.f35052g; i7++) {
            if (this.d[i7] && ((zArr = this.f35050e) == null || zArr[i7])) {
                f20Var.a(i7, (TLObject) this.f35049c.get(i7));
            }
        }
    }

    public final boolean d() {
        int i7;
        if (this.f35050e != null) {
            i7 = this.h;
        } else {
            i7 = this.f35052g;
        }
        if (i7 > 1) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        int i7;
        if (this.f35050e != null) {
            i7 = this.h;
        } else {
            i7 = this.f35052g;
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
            int i10 = this.f35052g;
            zArr = this.d;
            if (i7 >= i10) {
                break;
            } else if (!zArr[i7] || ((zArr2 = this.f35050e) != null && !zArr2[i7])) {
                i7++;
            }
        }
        z9 = true;
        Arrays.fill(zArr, !z9);
        h();
        this.f35054j.S1.O(true);
    }

    public final void g(int i7) {
        boolean[] zArr = this.f35050e;
        if (zArr != null && !zArr[i7]) {
            return;
        }
        boolean[] zArr2 = this.d;
        boolean z9 = zArr2[i7];
        zArr2[i7] = !z9;
        if (!z9) {
            this.f35053i++;
        } else {
            this.f35053i--;
        }
        this.f35054j.S1.O(true);
    }

    public final void h() {
        this.f35053i = 0;
        this.h = 0;
        for (int i7 = 0; i7 < this.f35052g; i7++) {
            boolean[] zArr = this.f35050e;
            boolean[] zArr2 = this.d;
            if (zArr == null) {
                if (zArr2[i7]) {
                    this.f35053i++;
                }
            } else if (zArr[i7]) {
                this.h++;
                if (zArr2[i7]) {
                    this.f35053i++;
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
        int i7 = this.f35052g;
        if (i7 != 0) {
            for (int i10 = 0; i10 < i7; i10++) {
                boolean[] zArr = this.f35050e;
                if (zArr == null || zArr[i10]) {
                    tLObject = (TLObject) this.f35049c.get(i10);
                    break;
                }
            }
            tLObject = null;
            if (tLObject instanceof TLRPC.User) {
                o4 = org.telegram.messenger.t10.k((TLRPC.User) tLObject);
            } else {
                o4 = org.telegram.messenger.g5.o(tLObject);
            }
            int i11 = this.f35047a;
            if (i11 == 0) {
                this.f35048b = org.telegram.messenger.id.M0(2131751502, null);
            } else if (i11 == 1) {
                if (d()) {
                    a05 = org.telegram.messenger.id.M0(2131751582, null);
                } else {
                    a05 = org.telegram.messenger.id.a0(null, null, 2131751587, o4);
                }
                this.f35048b = a05;
            } else if (i11 == 3) {
                if (d()) {
                    a04 = org.telegram.messenger.id.M0(2131751577, null);
                } else {
                    a04 = org.telegram.messenger.id.a0(null, null, 2131751578, o4);
                }
                this.f35048b = a04;
            } else if (i11 == 2) {
                if (this.f35054j.f35395b2) {
                    if (d()) {
                        a03 = org.telegram.messenger.id.M0(2131751500, null);
                    } else {
                        a03 = org.telegram.messenger.id.a0(null, null, 2131751501, o4);
                    }
                    this.f35048b = a03;
                    return;
                }
                if (d()) {
                    a02 = org.telegram.messenger.id.M0(2131751567, null);
                } else {
                    a02 = org.telegram.messenger.id.a0(null, null, 2131751568, o4);
                }
                this.f35048b = a02;
            }
        }
    }
}
