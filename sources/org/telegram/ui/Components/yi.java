package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class yi extends oj0 {
    public final int f40725r = org.telegram.messenger.h10.f22829t0;
    public final Context f40726s;
    public final ej f40727w;

    public yi(ej ejVar, Context context) {
        this.f40727w = ejVar;
        this.f40726s = context;
    }

    @Override
    public final String F(int i3) {
        return null;
    }

    @Override
    public final void G(tj0 tj0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i3) {
        if (i3 == 0 || i3 == R() - 1) {
            return 1;
        }
        int i10 = i3 - 1;
        int i11 = this.f40725r;
        HashMap hashMap = org.telegram.messenger.g5.r(i11).f22648c0;
        ArrayList arrayList = org.telegram.messenger.g5.r(i11).f22649d0;
        if (i10 < arrayList.size()) {
            return ((ArrayList) hashMap.get(arrayList.get(i10))).size();
        }
        return 0;
    }

    @Override
    public final Object O(int i3, int i10) {
        if (i3 == 0) {
            return null;
        }
        int i11 = i3 - 1;
        int i12 = this.f40725r;
        HashMap hashMap = org.telegram.messenger.g5.r(i12).f22648c0;
        ArrayList arrayList = org.telegram.messenger.g5.r(i12).f22649d0;
        if (i11 < arrayList.size()) {
            ArrayList arrayList2 = (ArrayList) hashMap.get(arrayList.get(i11));
            if (i10 < arrayList2.size()) {
                return arrayList2.get(i10);
            }
        }
        return null;
    }

    @Override
    public final int P(int i3, int i10) {
        if (i3 == 0) {
            return 1;
        }
        if (i3 == R() - 1) {
            return 2;
        }
        return 0;
    }

    @Override
    public final int R() {
        return org.telegram.messenger.g5.r(this.f40725r).f22649d0.size() + 2;
    }

    @Override
    public final View T(int i3, View view) {
        return null;
    }

    @Override
    public final boolean V(int i3, int i10, u4.d1 d1Var) {
        if (i3 != 0 && i3 != R() - 1) {
            int i11 = this.f40725r;
            if (i10 < ((ArrayList) org.telegram.messenger.g5.r(i11).f22648c0.get(org.telegram.messenger.g5.r(i11).f22649d0.get(i3 - 1))).size()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void W(int i3, int i10, u4.d1 d1Var) {
        TLRPC.User user;
        if (d1Var.f55544f == 0) {
            dj djVar = (dj) d1Var.f55540a;
            Object O = O(i3, i10);
            boolean z10 = true;
            if (i3 == R() - 2 && i10 == M(i3) - 1) {
                z10 = false;
            }
            if (O instanceof org.telegram.messenger.d5) {
                org.telegram.messenger.d5 d5Var = (org.telegram.messenger.d5) O;
                user = d5Var.f22157m;
                if (user == null) {
                    djVar.setCurrentId(d5Var.f22147a);
                    djVar.a(null, org.telegram.messenger.g5.m(0, d5Var.f22153i, d5Var.f22154j), new wi(d5Var, 0), z10);
                    user = null;
                }
            } else {
                user = (TLRPC.User) O;
            }
            if (user != null) {
                djVar.a(user, null, new xi(0, user), z10);
            }
            boolean containsKey = this.f40727w.f33408x.containsKey(ui.a(O));
            wo woVar = djVar.d;
            if (woVar.getVisibility() != 0) {
                woVar.setVisibility(0);
            }
            woVar.a(containsKey, false);
        }
    }

    @Override
    public final void f() {
        X(false);
        this.f40727w.R();
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View djVar;
        Context context = this.f40726s;
        if (i3 != 0) {
            if (i3 != 1) {
                djVar = new View(context);
                djVar.setTag(-33024);
            } else {
                djVar = new View(context);
                djVar.setLayoutParams(new u4.p0(-1, org.telegram.messenger.g0.L(56.0f)));
                djVar.setTag(-33024);
            }
        } else {
            djVar = new dj(context, this.f40727w.f38415a);
        }
        return new u4.d1(djVar);
    }
}
