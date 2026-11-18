package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class nj extends xj0 {
    public final int f37796r = org.telegram.messenger.j10.f24773t0;
    public final Context f37797s;
    public final tj f37798w;

    public nj(tj tjVar, Context context) {
        this.f37798w = tjVar;
        this.f37797s = context;
    }

    @Override
    public final String F(int i7) {
        return null;
    }

    @Override
    public final void G(ck0 ck0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i7) {
        if (i7 == 0 || i7 == R() - 1) {
            return 1;
        }
        int i10 = i7 - 1;
        int i11 = this.f37796r;
        HashMap hashMap = org.telegram.messenger.i5.r(i11).f24565c0;
        ArrayList arrayList = org.telegram.messenger.i5.r(i11).f24566d0;
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
        int i12 = this.f37796r;
        HashMap hashMap = org.telegram.messenger.i5.r(i12).f24565c0;
        ArrayList arrayList = org.telegram.messenger.i5.r(i12).f24566d0;
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
        return org.telegram.messenger.i5.r(this.f37796r).f24566d0.size() + 2;
    }

    @Override
    public final View T(int i7, View view) {
        return null;
    }

    @Override
    public final boolean V(int i7, int i10, v4.f1 f1Var) {
        if (i7 != 0 && i7 != R() - 1) {
            int i11 = this.f37796r;
            if (i10 < ((ArrayList) org.telegram.messenger.i5.r(i11).f24565c0.get(org.telegram.messenger.i5.r(i11).f24566d0.get(i7 - 1))).size()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void W(int i7, int i10, v4.f1 f1Var) {
        TLRPC.User user;
        if (f1Var.f59126f == 0) {
            sj sjVar = (sj) f1Var.f59122a;
            Object O = O(i7, i10);
            boolean z10 = true;
            if (i7 == R() - 2 && i10 == M(i7) - 1) {
                z10 = false;
            }
            if (O instanceof org.telegram.messenger.f5) {
                org.telegram.messenger.f5 f5Var = (org.telegram.messenger.f5) O;
                user = f5Var.f23850m;
                if (user == null) {
                    sjVar.setCurrentId(f5Var.f23840a);
                    sjVar.a(null, org.telegram.messenger.i5.m(0, f5Var.f23846i, f5Var.f23847j), new lj(f5Var, 0), z10);
                    user = null;
                }
            } else {
                user = (TLRPC.User) O;
            }
            if (user != null) {
                sjVar.a(user, null, new mj(0, user), z10);
            }
            boolean containsKey = this.f37798w.f40024x.containsKey(jj.a(O));
            mp mpVar = sjVar.d;
            if (mpVar.getVisibility() != 0) {
                mpVar.setVisibility(0);
            }
            mpVar.a(containsKey, false);
        }
    }

    @Override
    public final void f() {
        X(false);
        this.f37798w.S();
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View sjVar;
        Context context = this.f37797s;
        if (i7 != 0) {
            if (i7 != 1) {
                sjVar = new View(context);
                sjVar.setTag(-33024);
            } else {
                sjVar = new View(context);
                sjVar.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(56.0f)));
                sjVar.setTag(-33024);
            }
        } else {
            sjVar = new sj(context, this.f37798w.f36765a);
        }
        return new v4.f1(sjVar);
    }
}
