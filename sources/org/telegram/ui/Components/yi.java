package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class yi extends pk0 {
    public final int f32850r = org.telegram.messenger.e20.f15506s0;
    public final Context f32851s;
    public final ej f32852w;

    public yi(ej ejVar, Context context) {
        this.f32852w = ejVar;
        this.f32851s = context;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(uk0 uk0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        if (i10 == 0 || i10 == R() - 1) {
            return 1;
        }
        int i11 = i10 - 1;
        int i12 = this.f32850r;
        HashMap hashMap = org.telegram.messenger.i5.r(i12).f16214b0;
        ArrayList arrayList = org.telegram.messenger.i5.r(i12).f16216c0;
        if (i11 < arrayList.size()) {
            return ((ArrayList) hashMap.get(arrayList.get(i11))).size();
        }
        return 0;
    }

    @Override
    public final Object O(int i10, int i11) {
        if (i10 == 0) {
            return null;
        }
        int i12 = i10 - 1;
        int i13 = this.f32850r;
        HashMap hashMap = org.telegram.messenger.i5.r(i13).f16214b0;
        ArrayList arrayList = org.telegram.messenger.i5.r(i13).f16216c0;
        if (i12 < arrayList.size()) {
            ArrayList arrayList2 = (ArrayList) hashMap.get(arrayList.get(i12));
            if (i11 < arrayList2.size()) {
                return arrayList2.get(i11);
            }
        }
        return null;
    }

    @Override
    public final int P(int i10, int i11) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == R() - 1) {
            return 2;
        }
        return 0;
    }

    @Override
    public final int R() {
        return org.telegram.messenger.i5.r(this.f32850r).f16216c0.size() + 2;
    }

    @Override
    public final View T(int i10, View view) {
        return null;
    }

    @Override
    public final boolean V(int i10, int i11, s4.c1 c1Var) {
        if (i10 != 0 && i10 != R() - 1) {
            int i12 = this.f32850r;
            if (i11 < ((ArrayList) org.telegram.messenger.i5.r(i12).f16214b0.get(org.telegram.messenger.i5.r(i12).f16216c0.get(i10 - 1))).size()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void W(int i10, int i11, s4.c1 c1Var) {
        TLRPC.User user;
        if (c1Var.f47912f == 0) {
            dj djVar = (dj) c1Var.f47909a;
            Object O = O(i10, i11);
            boolean z10 = true;
            if (i10 == R() - 2 && i11 == M(i10) - 1) {
                z10 = false;
            }
            if (O instanceof org.telegram.messenger.f5) {
                org.telegram.messenger.f5 f5Var = (org.telegram.messenger.f5) O;
                user = f5Var.f15701m;
                if (user == null) {
                    djVar.setCurrentId(f5Var.f15692a);
                    djVar.a(null, org.telegram.messenger.i5.m(0, f5Var.f15697i, f5Var.f15698j), new wi(f5Var, 0), z10);
                    user = null;
                }
            } else {
                user = (TLRPC.User) O;
            }
            if (user != null) {
                djVar.a(user, null, new xi(0, user), z10);
            }
            boolean containsKey = this.f32852w.f25850x.containsKey(ui.a(O));
            ep epVar = djVar.d;
            if (epVar.getVisibility() != 0) {
                epVar.setVisibility(0);
            }
            epVar.a(containsKey, false);
        }
    }

    @Override
    public final void f() {
        X(false);
        this.f32852w.Q();
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View djVar;
        Context context = this.f32851s;
        if (i10 != 0) {
            if (i10 != 1) {
                djVar = new View(context);
                djVar.setTag(-33024);
            } else {
                djVar = new View(context);
                djVar.setLayoutParams(new s4.o0(-1, org.telegram.messenger.i0.L(56.0f)));
                djVar.setTag(-33024);
            }
        } else {
            djVar = new dj(context, this.f32852w.f30963a);
        }
        return new s4.c1(djVar);
    }
}
