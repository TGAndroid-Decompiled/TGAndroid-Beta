package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class aj extends sj0 {
    public final Context f31854c;
    public ArrayList d = new ArrayList();
    public ArrayList f31855e = new ArrayList();
    public zi f31856f;
    public int h;
    public final ej f31857n;

    public aj(ej ejVar, Context context) {
        this.f31857n = ejVar;
        this.f31854c = context;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        if (d1Var.f55544f == 0) {
            return true;
        }
        return false;
    }

    public final Object E(int i3) {
        int i10 = i3 - 1;
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
    public final int d(int i3) {
        if (i3 == 0) {
            return 1;
        }
        if (i3 == b() - 1) {
            return 2;
        }
        return 0;
    }

    @Override
    public final void f() {
        super.f();
        this.f31857n.R();
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        boolean z10;
        TLRPC.User user;
        if (d1Var.f55544f == 0) {
            dj djVar = (dj) d1Var.f55540a;
            if (i3 != b() - 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object E = E(i3);
            if (E instanceof org.telegram.messenger.d5) {
                org.telegram.messenger.d5 d5Var = (org.telegram.messenger.d5) E;
                user = d5Var.f22157m;
                if (user == null) {
                    djVar.setCurrentId(d5Var.f22147a);
                    djVar.a(null, (CharSequence) this.f31855e.get(i3 - 1), new wi(d5Var, 1), z10);
                    user = null;
                }
            } else {
                user = (TLRPC.User) E;
            }
            if (user != null) {
                djVar.a(user, (CharSequence) this.f31855e.get(i3 - 1), new xi(1, user), z10);
            }
            boolean containsKey = this.f31857n.f33408x.containsKey(ui.a(E));
            wo woVar = djVar.d;
            if (woVar.getVisibility() != 0) {
                woVar.setVisibility(0);
            }
            woVar.a(containsKey, false);
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        View djVar;
        Context context = this.f31854c;
        if (i3 != 0) {
            if (i3 != 1) {
                djVar = new View(context);
                djVar.setTag(-33024);
            } else {
                djVar = new View(context);
                djVar.setLayoutParams(new u4.p0(-1, org.telegram.messenger.g0.L(56.0f)));
                djVar.setTag(-33024);
            }
        } else {
            djVar = new dj(context, this.f31857n.f38415a);
        }
        return new u4.d1(djVar);
    }
}
