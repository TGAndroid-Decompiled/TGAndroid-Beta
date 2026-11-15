package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class gj extends pj0 {
    public final int f34995r = org.telegram.messenger.m10.f24940t0;
    public final Context f34996s;
    public final mj f34997w;

    public gj(mj mjVar, Context context) {
        this.f34997w = mjVar;
        this.f34996s = context;
    }

    @Override
    public final String F(int i7) {
        return null;
    }

    @Override
    public final void G(uj0 uj0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i7) {
        if (i7 == 0 || i7 == R() - 1) {
            return 1;
        }
        int i10 = i7 - 1;
        int i11 = this.f34995r;
        HashMap hashMap = org.telegram.messenger.g5.r(i11).f23676c0;
        ArrayList arrayList = org.telegram.messenger.g5.r(i11).f23677d0;
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
        int i12 = this.f34995r;
        HashMap hashMap = org.telegram.messenger.g5.r(i12).f23676c0;
        ArrayList arrayList = org.telegram.messenger.g5.r(i12).f23677d0;
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
        return org.telegram.messenger.g5.r(this.f34995r).f23677d0.size() + 2;
    }

    @Override
    public final View T(int i7, View view) {
        return null;
    }

    @Override
    public final boolean V(int i7, int i10, v4.e1 e1Var) {
        if (i7 != 0 && i7 != R() - 1) {
            int i11 = this.f34995r;
            if (i10 < ((ArrayList) org.telegram.messenger.g5.r(i11).f23676c0.get(org.telegram.messenger.g5.r(i11).f23677d0.get(i7 - 1))).size()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void W(int i7, int i10, v4.e1 e1Var) {
        TLRPC.User user;
        if (e1Var.f58539f == 0) {
            lj ljVar = (lj) e1Var.f58535a;
            Object O = O(i7, i10);
            boolean z10 = true;
            if (i7 == R() - 2 && i10 == M(i7) - 1) {
                z10 = false;
            }
            if (O instanceof org.telegram.messenger.d5) {
                org.telegram.messenger.d5 d5Var = (org.telegram.messenger.d5) O;
                user = d5Var.f23049m;
                if (user == null) {
                    ljVar.setCurrentId(d5Var.f23039a);
                    ljVar.a(null, org.telegram.messenger.g5.m(0, d5Var.f23045i, d5Var.f23046j), new ej(d5Var, 0), z10);
                    user = null;
                }
            } else {
                user = (TLRPC.User) O;
            }
            if (user != null) {
                ljVar.a(user, null, new fj(0, user), z10);
            }
            boolean containsKey = this.f34997w.f37306x.containsKey(cj.a(O));
            fp fpVar = ljVar.d;
            if (fpVar.getVisibility() != 0) {
                fpVar.setVisibility(0);
            }
            fpVar.a(containsKey, false);
        }
    }

    @Override
    public final void f() {
        X(false);
        this.f34997w.S();
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View ljVar;
        Context context = this.f34996s;
        if (i7 != 0) {
            if (i7 != 1) {
                ljVar = new View(context);
                ljVar.setTag(-33024);
            } else {
                ljVar = new View(context);
                ljVar.setLayoutParams(new v4.p0(-1, org.telegram.messenger.g0.L(56.0f)));
                ljVar.setTag(-33024);
            }
        } else {
            ljVar = new lj(context, this.f34997w.f33608a);
        }
        return new v4.e1(ljVar);
    }
}
