package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class rj extends dk0 {
    public final Context f39240c;
    public ArrayList d = new ArrayList();
    public ArrayList f39241e = new ArrayList();
    public qj f39242f;
    public int h;
    public final vj f39243n;

    public rj(vj vjVar, Context context) {
        this.f39243n = vjVar;
        this.f39240c = context;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        if (f1Var.f59165f == 0) {
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
        this.f39243n.S();
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        boolean z10;
        TLRPC.User user;
        if (f1Var.f59165f == 0) {
            uj ujVar = (uj) f1Var.f59161a;
            if (i7 != b() - 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object E = E(i7);
            if (E instanceof org.telegram.messenger.f5) {
                org.telegram.messenger.f5 f5Var = (org.telegram.messenger.f5) E;
                user = f5Var.f23875m;
                if (user == null) {
                    ujVar.setCurrentId(f5Var.f23865a);
                    ujVar.a(null, (CharSequence) this.f39241e.get(i7 - 1), new nj(f5Var, 1), z10);
                    user = null;
                }
            } else {
                user = (TLRPC.User) E;
            }
            if (user != null) {
                ujVar.a(user, (CharSequence) this.f39241e.get(i7 - 1), new oj(1, user), z10);
            }
            boolean containsKey = this.f39243n.f40850x.containsKey(lj.a(E));
            op opVar = ujVar.d;
            if (opVar.getVisibility() != 0) {
                opVar.setVisibility(0);
            }
            opVar.a(containsKey, false);
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View ujVar;
        Context context = this.f39240c;
        if (i7 != 0) {
            if (i7 != 1) {
                ujVar = new View(context);
                ujVar.setTag(-33024);
            } else {
                ujVar = new View(context);
                ujVar.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(56.0f)));
                ujVar.setTag(-33024);
            }
        } else {
            ujVar = new uj(context, this.f39243n.f37520a);
        }
        return new v4.f1(ujVar);
    }
}
