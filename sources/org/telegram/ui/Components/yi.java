package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class yi extends kj0 {
    public final int f40581r = org.telegram.messenger.p10.f24474s0;
    public final Context f40582s;
    public final ej f40583w;

    public yi(ej ejVar, Context context) {
        this.f40583w = ejVar;
        this.f40582s = context;
    }

    @Override
    public final String F(int i7) {
        return null;
    }

    @Override
    public final void G(pj0 pj0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i7) {
        if (i7 == 0 || i7 == R() - 1) {
            return 1;
        }
        int i10 = i7 - 1;
        int i11 = this.f40581r;
        HashMap hashMap = org.telegram.messenger.g5.r(i11).f22607b0;
        ArrayList arrayList = org.telegram.messenger.g5.r(i11).f22609c0;
        if (i10 < arrayList.size()) {
            return ((ArrayList) hashMap.get(arrayList.get(i10))).size();
        }
        return 0;
    }

    @Override
    public final Object O(int i7, int i10) {
        if (i7 == 0) {
            return null;
        }
        int i11 = i7 - 1;
        int i12 = this.f40581r;
        HashMap hashMap = org.telegram.messenger.g5.r(i12).f22607b0;
        ArrayList arrayList = org.telegram.messenger.g5.r(i12).f22609c0;
        if (i11 < arrayList.size()) {
            ArrayList arrayList2 = (ArrayList) hashMap.get(arrayList.get(i11));
            if (i10 < arrayList2.size()) {
                return arrayList2.get(i10);
            }
        }
        return null;
    }

    @Override
    public final int P(int i7, int i10) {
        if (i7 == 0) {
            return 1;
        }
        if (i7 == R() - 1) {
            return 2;
        }
        return 0;
    }

    @Override
    public final int R() {
        return org.telegram.messenger.g5.r(this.f40581r).f22609c0.size() + 2;
    }

    @Override
    public final View T(int i7, View view) {
        return null;
    }

    @Override
    public final boolean V(int i7, int i10, v4.d1 d1Var) {
        if (i7 != 0 && i7 != R() - 1) {
            int i11 = this.f40581r;
            if (i10 < ((ArrayList) org.telegram.messenger.g5.r(i11).f22607b0.get(org.telegram.messenger.g5.r(i11).f22609c0.get(i7 - 1))).size()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void W(int i7, int i10, v4.d1 d1Var) {
        TLRPC.User user;
        if (d1Var.f57056f == 0) {
            dj djVar = (dj) d1Var.f57052a;
            Object O = O(i7, i10);
            boolean z9 = true;
            if (i7 == R() - 2 && i10 == M(i7) - 1) {
                z9 = false;
            }
            if (O instanceof org.telegram.messenger.d5) {
                org.telegram.messenger.d5 d5Var = (org.telegram.messenger.d5) O;
                user = d5Var.f22000m;
                if (user == null) {
                    djVar.setCurrentId(d5Var.f21990a);
                    djVar.a(null, org.telegram.messenger.g5.m(0, d5Var.f21996i, d5Var.f21997j), new wi(d5Var, 0), z9);
                    user = null;
                }
            } else {
                user = (TLRPC.User) O;
            }
            if (user != null) {
                djVar.a(user, null, new xi(0, user), z9);
            }
            boolean containsKey = this.f40583w.f33272x.containsKey(ui.a(O));
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
        this.f40583w.R();
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View djVar;
        Context context = this.f40582s;
        if (i7 != 0) {
            if (i7 != 1) {
                djVar = new View(context);
                djVar.setTag(-33024);
            } else {
                djVar = new View(context);
                djVar.setLayoutParams(new v4.o0(-1, org.telegram.messenger.g0.L(56.0f)));
                djVar.setTag(-33024);
            }
        } else {
            djVar = new dj(context, this.f40583w.f38655a);
        }
        return new v4.d1(djVar);
    }
}
