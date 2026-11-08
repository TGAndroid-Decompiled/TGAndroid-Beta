package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class zi extends kj0 {
    public final int f41025r = org.telegram.messenger.p10.f24470s0;
    public final Context f41026s;
    public final fj f41027w;

    public zi(fj fjVar, Context context) {
        this.f41027w = fjVar;
        this.f41026s = context;
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
        int i11 = this.f41025r;
        HashMap hashMap = org.telegram.messenger.g5.r(i11).f22603b0;
        ArrayList arrayList = org.telegram.messenger.g5.r(i11).f22605c0;
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
        int i12 = this.f41025r;
        HashMap hashMap = org.telegram.messenger.g5.r(i12).f22603b0;
        ArrayList arrayList = org.telegram.messenger.g5.r(i12).f22605c0;
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
        return org.telegram.messenger.g5.r(this.f41025r).f22605c0.size() + 2;
    }

    @Override
    public final View T(int i7, View view) {
        return null;
    }

    @Override
    public final boolean V(int i7, int i10, v4.d1 d1Var) {
        if (i7 != 0 && i7 != R() - 1) {
            int i11 = this.f41025r;
            if (i10 < ((ArrayList) org.telegram.messenger.g5.r(i11).f22603b0.get(org.telegram.messenger.g5.r(i11).f22605c0.get(i7 - 1))).size()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void W(int i7, int i10, v4.d1 d1Var) {
        TLRPC.User user;
        if (d1Var.f57048f == 0) {
            ej ejVar = (ej) d1Var.f57044a;
            Object O = O(i7, i10);
            boolean z9 = true;
            if (i7 == R() - 2 && i10 == M(i7) - 1) {
                z9 = false;
            }
            if (O instanceof org.telegram.messenger.d5) {
                org.telegram.messenger.d5 d5Var = (org.telegram.messenger.d5) O;
                user = d5Var.f21996m;
                if (user == null) {
                    ejVar.setCurrentId(d5Var.f21986a);
                    ejVar.a(null, org.telegram.messenger.g5.m(0, d5Var.f21992i, d5Var.f21993j), new xi(d5Var, 0), z9);
                    user = null;
                }
            } else {
                user = (TLRPC.User) O;
            }
            if (user != null) {
                ejVar.a(user, null, new yi(0, user), z9);
            }
            boolean containsKey = this.f41027w.f33563x.containsKey(vi.a(O));
            wo woVar = ejVar.d;
            if (woVar.getVisibility() != 0) {
                woVar.setVisibility(0);
            }
            woVar.a(containsKey, false);
        }
    }

    @Override
    public final void f() {
        X(false);
        this.f41027w.R();
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View ejVar;
        Context context = this.f41026s;
        if (i7 != 0) {
            if (i7 != 1) {
                ejVar = new View(context);
                ejVar.setTag(-33024);
            } else {
                ejVar = new View(context);
                ejVar.setLayoutParams(new v4.o0(-1, org.telegram.messenger.g0.L(56.0f)));
                ejVar.setTag(-33024);
            }
        } else {
            ejVar = new ej(context, this.f41027w.f39003a);
        }
        return new v4.d1(ejVar);
    }
}
