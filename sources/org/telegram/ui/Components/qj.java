package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class qj extends dk0 {
    public final Context f38895c;
    public ArrayList d = new ArrayList();
    public ArrayList f38896e = new ArrayList();
    public pj f38897f;
    public int h;
    public final uj f38898n;

    public qj(uj ujVar, Context context) {
        this.f38898n = ujVar;
        this.f38895c = context;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        if (f1Var.f59249f == 0) {
            return true;
        }
        return false;
    }

    public final Object E(int i7) {
        int i10 = i7 - 1;
        if (i10 >= 0 && i10 < this.d.size()) {
            return this.d.get(i10);
        }
        return null;
    }

    @Override
    public final int b() {
        return this.d.size() + 2;
    }

    @Override
    public final int d(int i7) {
        if (i7 == 0) {
            return 1;
        }
        if (i7 == b() - 1) {
            return 2;
        }
        return 0;
    }

    @Override
    public final void f() {
        super.f();
        this.f38898n.S();
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        boolean z10;
        TLRPC.User user;
        if (f1Var.f59249f == 0) {
            tj tjVar = (tj) f1Var.f59245a;
            if (i7 != b() - 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object E = E(i7);
            if (E instanceof org.telegram.messenger.f5) {
                org.telegram.messenger.f5 f5Var = (org.telegram.messenger.f5) E;
                user = f5Var.f23958m;
                if (user == null) {
                    tjVar.setCurrentId(f5Var.f23948a);
                    tjVar.a(null, (CharSequence) this.f38896e.get(i7 - 1), new mj(f5Var, 1), z10);
                    user = null;
                }
            } else {
                user = (TLRPC.User) E;
            }
            if (user != null) {
                tjVar.a(user, (CharSequence) this.f38896e.get(i7 - 1), new nj(1, user), z10);
            }
            boolean containsKey = this.f38898n.f40392x.containsKey(kj.a(E));
            lp lpVar = tjVar.d;
            if (lpVar.getVisibility() != 0) {
                lpVar.setVisibility(0);
            }
            lpVar.a(containsKey, false);
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View tjVar;
        Context context = this.f38895c;
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
            tjVar = new tj(context, this.f38898n.f37134a);
        }
        return new v4.f1(tjVar);
    }
}
