package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class aj extends oj0 {
    public final Context f31867c;
    public ArrayList d = new ArrayList();
    public ArrayList f31868e = new ArrayList();
    public zi f31869f;
    public int h;
    public final ej f31870n;

    public aj(ej ejVar, Context context) {
        this.f31870n = ejVar;
        this.f31867c = context;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        if (d1Var.f57056f == 0) {
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
        this.f31870n.R();
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        boolean z9;
        TLRPC.User user;
        if (d1Var.f57056f == 0) {
            dj djVar = (dj) d1Var.f57052a;
            if (i7 != b() - 2) {
                z9 = true;
            } else {
                z9 = false;
            }
            Object E = E(i7);
            if (E instanceof org.telegram.messenger.d5) {
                org.telegram.messenger.d5 d5Var = (org.telegram.messenger.d5) E;
                user = d5Var.f22000m;
                if (user == null) {
                    djVar.setCurrentId(d5Var.f21990a);
                    djVar.a(null, (CharSequence) this.f31868e.get(i7 - 1), new wi(d5Var, 1), z9);
                    user = null;
                }
            } else {
                user = (TLRPC.User) E;
            }
            if (user != null) {
                djVar.a(user, (CharSequence) this.f31868e.get(i7 - 1), new xi(1, user), z9);
            }
            boolean containsKey = this.f31870n.f33272x.containsKey(ui.a(E));
            wo woVar = djVar.d;
            if (woVar.getVisibility() != 0) {
                woVar.setVisibility(0);
            }
            woVar.a(containsKey, false);
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View djVar;
        Context context = this.f31867c;
        if (i7 != 0) {
            if (i7 != 1) {
                djVar = new View(context);
                djVar.setTag(-33024);
            } else {
                djVar = new View(context);
                djVar.setLayoutParams(new v4.o0(-1, org.telegram.messenger.g0.L(56.0f)));
                djVar.setTag(-33024);
            }
        } else {
            djVar = new dj(context, this.f31870n.f38655a);
        }
        return new v4.d1(djVar);
    }
}
