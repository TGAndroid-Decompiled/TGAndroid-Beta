package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ij extends tj0 {
    public final Context f35623c;
    public ArrayList d = new ArrayList();
    public ArrayList f35624e = new ArrayList();
    public hj f35625f;
    public int h;
    public final mj f35626n;

    public ij(mj mjVar, Context context) {
        this.f35626n = mjVar;
        this.f35623c = context;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        if (e1Var.f58539f == 0) {
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
        this.f35626n.S();
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        boolean z10;
        TLRPC.User user;
        if (e1Var.f58539f == 0) {
            lj ljVar = (lj) e1Var.f58535a;
            if (i7 != b() - 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object E = E(i7);
            if (E instanceof org.telegram.messenger.d5) {
                org.telegram.messenger.d5 d5Var = (org.telegram.messenger.d5) E;
                user = d5Var.f23049m;
                if (user == null) {
                    ljVar.setCurrentId(d5Var.f23039a);
                    ljVar.a(null, (CharSequence) this.f35624e.get(i7 - 1), new ej(d5Var, 1), z10);
                    user = null;
                }
            } else {
                user = (TLRPC.User) E;
            }
            if (user != null) {
                ljVar.a(user, (CharSequence) this.f35624e.get(i7 - 1), new fj(1, user), z10);
            }
            boolean containsKey = this.f35626n.f37306x.containsKey(cj.a(E));
            fp fpVar = ljVar.d;
            if (fpVar.getVisibility() != 0) {
                fpVar.setVisibility(0);
            }
            fpVar.a(containsKey, false);
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View ljVar;
        Context context = this.f35623c;
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
            ljVar = new lj(context, this.f35626n.f33608a);
        }
        return new v4.e1(ljVar);
    }
}
