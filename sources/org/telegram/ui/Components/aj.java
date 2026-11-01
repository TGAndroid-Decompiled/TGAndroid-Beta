package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class aj extends tk0 {
    public final Context f24404c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public zi f24405f;
    public int h;
    public final ej f24406n;

    public aj(ej ejVar, Context context) {
        this.f24406n = ejVar;
        this.f24404c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f47912f == 0) {
            return true;
        }
        return false;
    }

    public final Object E(int i10) {
        int i11 = i10 - 1;
        if (i11 >= 0 && i11 < this.d.size()) {
            return this.d.get(i11);
        }
        return null;
    }

    @Override
    public final int b() {
        return this.d.size() + 2;
    }

    @Override
    public final int d(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == b() - 1) {
            return 2;
        }
        return 0;
    }

    @Override
    public final void f() {
        super.f();
        this.f24406n.Q();
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        boolean z10;
        TLRPC.User user;
        if (c1Var.f47912f == 0) {
            dj djVar = (dj) c1Var.f47909a;
            if (i10 != b() - 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object E = E(i10);
            if (E instanceof org.telegram.messenger.f5) {
                org.telegram.messenger.f5 f5Var = (org.telegram.messenger.f5) E;
                user = f5Var.f15701m;
                if (user == null) {
                    djVar.setCurrentId(f5Var.f15692a);
                    djVar.a(null, (CharSequence) this.e.get(i10 - 1), new wi(f5Var, 1), z10);
                    user = null;
                }
            } else {
                user = (TLRPC.User) E;
            }
            if (user != null) {
                djVar.a(user, (CharSequence) this.e.get(i10 - 1), new xi(1, user), z10);
            }
            boolean containsKey = this.f24406n.f25850x.containsKey(ui.a(E));
            ep epVar = djVar.d;
            if (epVar.getVisibility() != 0) {
                epVar.setVisibility(0);
            }
            epVar.a(containsKey, false);
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View djVar;
        Context context = this.f24404c;
        if (i10 != 0) {
            if (i10 != 1) {
                djVar = new View(context);
                djVar.setTag(-33024);
            } else {
                djVar = new View(context);
                djVar.setLayoutParams(new s4.o0(-1, org.telegram.messenger.i0.L(56.0f)));
                djVar.setTag(-33024);
            }
        } else {
            djVar = new dj(context, this.f24406n.f30963a);
        }
        return new s4.c1(djVar);
    }
}
