package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class pj extends bk0 {
    public final Context f38456c;
    public ArrayList d = new ArrayList();
    public ArrayList f38457e = new ArrayList();
    public oj f38458f;
    public int h;
    public final tj f38459n;

    public pj(tj tjVar, Context context) {
        this.f38459n = tjVar;
        this.f38456c = context;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        if (f1Var.f59127f == 0) {
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
        this.f38459n.S();
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        boolean z10;
        TLRPC.User user;
        if (f1Var.f59127f == 0) {
            sj sjVar = (sj) f1Var.f59123a;
            if (i7 != b() - 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object E = E(i7);
            if (E instanceof org.telegram.messenger.f5) {
                org.telegram.messenger.f5 f5Var = (org.telegram.messenger.f5) E;
                user = f5Var.f23847m;
                if (user == null) {
                    sjVar.setCurrentId(f5Var.f23837a);
                    sjVar.a(null, (CharSequence) this.f38457e.get(i7 - 1), new lj(f5Var, 1), z10);
                    user = null;
                }
            } else {
                user = (TLRPC.User) E;
            }
            if (user != null) {
                sjVar.a(user, (CharSequence) this.f38457e.get(i7 - 1), new mj(1, user), z10);
            }
            boolean containsKey = this.f38459n.f40024x.containsKey(jj.a(E));
            mp mpVar = sjVar.d;
            if (mpVar.getVisibility() != 0) {
                mpVar.setVisibility(0);
            }
            mpVar.a(containsKey, false);
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View sjVar;
        Context context = this.f38456c;
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
            sjVar = new sj(context, this.f38459n.f36765a);
        }
        return new v4.f1(sjVar);
    }
}
