package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class pj extends zj0 {
    public final int f38561r = org.telegram.messenger.k10.f24932t0;
    public final Context f38562s;
    public final vj f38563w;

    public pj(vj vjVar, Context context) {
        this.f38563w = vjVar;
        this.f38562s = context;
    }

    @Override
    public final String F(int i7) {
        return null;
    }

    @Override
    public final void G(ek0 ek0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i7) {
        if (i7 == 0 || i7 == R() - 1) {
            return 1;
        }
        int i10 = i7 - 1;
        int i11 = this.f38561r;
        HashMap hashMap = org.telegram.messenger.i5.r(i11).f24564c0;
        ArrayList arrayList = org.telegram.messenger.i5.r(i11).f24565d0;
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
        int i12 = this.f38561r;
        HashMap hashMap = org.telegram.messenger.i5.r(i12).f24564c0;
        ArrayList arrayList = org.telegram.messenger.i5.r(i12).f24565d0;
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
        return org.telegram.messenger.i5.r(this.f38561r).f24565d0.size() + 2;
    }

    @Override
    public final View T(int i7, View view) {
        return null;
    }

    @Override
    public final boolean V(int i7, int i10, v4.e1 e1Var) {
        if (i7 != 0 && i7 != R() - 1) {
            int i11 = this.f38561r;
            if (i10 < ((ArrayList) org.telegram.messenger.i5.r(i11).f24564c0.get(org.telegram.messenger.i5.r(i11).f24565d0.get(i7 - 1))).size()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void W(int i7, int i10, v4.e1 e1Var) {
        TLRPC.User user;
        if (e1Var.f59115f == 0) {
            uj ujVar = (uj) e1Var.f59111a;
            Object O = O(i7, i10);
            boolean z10 = true;
            if (i7 == R() - 2 && i10 == M(i7) - 1) {
                z10 = false;
            }
            if (O instanceof org.telegram.messenger.f5) {
                org.telegram.messenger.f5 f5Var = (org.telegram.messenger.f5) O;
                user = f5Var.f23834m;
                if (user == null) {
                    ujVar.setCurrentId(f5Var.f23824a);
                    ujVar.a(null, org.telegram.messenger.i5.m(0, f5Var.f23830i, f5Var.f23831j), new nj(f5Var, 0), z10);
                    user = null;
                }
            } else {
                user = (TLRPC.User) O;
            }
            if (user != null) {
                ujVar.a(user, null, new oj(0, user), z10);
            }
            boolean containsKey = this.f38563w.f40802x.containsKey(lj.a(O));
            op opVar = ujVar.d;
            if (opVar.getVisibility() != 0) {
                opVar.setVisibility(0);
            }
            opVar.a(containsKey, false);
        }
    }

    @Override
    public final void f() {
        X(false);
        this.f38563w.S();
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View ujVar;
        Context context = this.f38562s;
        if (i7 != 0) {
            if (i7 != 1) {
                ujVar = new View(context);
                ujVar.setTag(-33024);
            } else {
                ujVar = new View(context);
                ujVar.setLayoutParams(new v4.p0(-1, org.telegram.messenger.g0.L(56.0f)));
                ujVar.setTag(-33024);
            }
        } else {
            ujVar = new uj(context, this.f38563w.f37476a);
        }
        return new v4.e1(ujVar);
    }
}
