package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class bj extends oj0 {
    public final Context f32187c;
    public ArrayList d = new ArrayList();
    public ArrayList f32188e = new ArrayList();
    public aj f32189f;
    public int h;
    public final fj f32190n;

    public bj(fj fjVar, Context context) {
        this.f32190n = fjVar;
        this.f32187c = context;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        if (d1Var.f56955f == 0) {
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
        this.f32190n.R();
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        boolean z9;
        TLRPC.User user;
        if (d1Var.f56955f == 0) {
            ej ejVar = (ej) d1Var.f56951a;
            if (i7 != b() - 2) {
                z9 = true;
            } else {
                z9 = false;
            }
            Object E = E(i7);
            if (E instanceof org.telegram.messenger.d5) {
                org.telegram.messenger.d5 d5Var = (org.telegram.messenger.d5) E;
                user = d5Var.f21973m;
                if (user == null) {
                    ejVar.setCurrentId(d5Var.f21963a);
                    ejVar.a(null, (CharSequence) this.f32188e.get(i7 - 1), new xi(d5Var, 1), z9);
                    user = null;
                }
            } else {
                user = (TLRPC.User) E;
            }
            if (user != null) {
                ejVar.a(user, (CharSequence) this.f32188e.get(i7 - 1), new yi(1, user), z9);
            }
            boolean containsKey = this.f32190n.f33556x.containsKey(vi.a(E));
            wo woVar = ejVar.d;
            if (woVar.getVisibility() != 0) {
                woVar.setVisibility(0);
            }
            woVar.a(containsKey, false);
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View ejVar;
        Context context = this.f32187c;
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
            ejVar = new ej(context, this.f32190n.f38968a);
        }
        return new v4.d1(ejVar);
    }
}
