package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class oj extends zj0 {
    public final int f38162r = org.telegram.messenger.i10.f24637t0;
    public final Context f38163s;
    public final uj f38164w;

    public oj(uj ujVar, Context context) {
        this.f38164w = ujVar;
        this.f38163s = context;
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
        int i11 = this.f38162r;
        HashMap hashMap = org.telegram.messenger.i5.r(i11).f24688c0;
        ArrayList arrayList = org.telegram.messenger.i5.r(i11).f24689d0;
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
        int i12 = this.f38162r;
        HashMap hashMap = org.telegram.messenger.i5.r(i12).f24688c0;
        ArrayList arrayList = org.telegram.messenger.i5.r(i12).f24689d0;
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
        return org.telegram.messenger.i5.r(this.f38162r).f24689d0.size() + 2;
    }

    @Override
    public final View T(int i7, View view) {
        return null;
    }

    @Override
    public final boolean V(int i7, int i10, v4.f1 f1Var) {
        if (i7 != 0 && i7 != R() - 1) {
            int i11 = this.f38162r;
            if (i10 < ((ArrayList) org.telegram.messenger.i5.r(i11).f24688c0.get(org.telegram.messenger.i5.r(i11).f24689d0.get(i7 - 1))).size()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void W(int i7, int i10, v4.f1 f1Var) {
        TLRPC.User user;
        if (f1Var.f59249f == 0) {
            tj tjVar = (tj) f1Var.f59245a;
            Object O = O(i7, i10);
            boolean z10 = true;
            if (i7 == R() - 2 && i10 == M(i7) - 1) {
                z10 = false;
            }
            if (O instanceof org.telegram.messenger.f5) {
                org.telegram.messenger.f5 f5Var = (org.telegram.messenger.f5) O;
                user = f5Var.f23958m;
                if (user == null) {
                    tjVar.setCurrentId(f5Var.f23948a);
                    tjVar.a(null, org.telegram.messenger.i5.m(0, f5Var.f23954i, f5Var.f23955j), new mj(f5Var, 0), z10);
                    user = null;
                }
            } else {
                user = (TLRPC.User) O;
            }
            if (user != null) {
                tjVar.a(user, null, new nj(0, user), z10);
            }
            boolean containsKey = this.f38164w.f40392x.containsKey(kj.a(O));
            lp lpVar = tjVar.d;
            if (lpVar.getVisibility() != 0) {
                lpVar.setVisibility(0);
            }
            lpVar.a(containsKey, false);
        }
    }

    @Override
    public final void f() {
        X(false);
        this.f38164w.S();
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View tjVar;
        Context context = this.f38163s;
        if (i7 != 0) {
            if (i7 != 1) {
                tjVar = new View(context);
                tjVar.setTag(-33024);
            } else {
                tjVar = new View(context);
                tjVar.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(56.0f)));
                tjVar.setTag(-33024);
            }
        } else {
            tjVar = new tj(context, this.f38164w.f37134a);
        }
        return new v4.f1(tjVar);
    }
}
