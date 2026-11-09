package org.telegram.ui;

import android.app.Activity;
public final class fy0 implements Runnable {
    public final int f45811a;
    public final cn f45812b;
    public final Activity f45813c;
    public final org.telegram.ui.ActionBar.g6 d;
    public final org.telegram.messenger.ij f45814e;

    public fy0(cn cnVar, Activity activity, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.messenger.ij ijVar, int i7) {
        this.f45811a = i7;
        this.f45812b = cnVar;
        this.f45813c = activity;
        this.d = g6Var;
        this.f45814e = ijVar;
    }

    @Override
    public final void run() {
        int i7 = this.f45811a;
        org.telegram.messenger.ij ijVar = this.f45814e;
        org.telegram.ui.ActionBar.g6 g6Var = this.d;
        final Activity activity = this.f45813c;
        cn cnVar = this.f45812b;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.hc.a0(cnVar).c(org.telegram.messenger.g0.S2(org.telegram.messenger.id.M0(2131754487, null), -1, 2, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                vf.c.t(activity, "https://promote.telegram.org/guidelines");
                                return;
                            case 1:
                                vf.c.t(activity, "https://promote.telegram.org/guidelines");
                                return;
                            default:
                                vf.c.t(activity, "https://promote.telegram.org/guidelines");
                                return;
                        }
                    }
                }, g6Var)).j();
                cnVar.hb(ijVar);
                cnVar.jb(ijVar);
                return;
            case 1:
                org.telegram.ui.Components.hc.a0(cnVar).c(org.telegram.messenger.g0.S2(org.telegram.messenger.id.M0(2131754487, null), -1, 2, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                vf.c.t(activity, "https://promote.telegram.org/guidelines");
                                return;
                            case 1:
                                vf.c.t(activity, "https://promote.telegram.org/guidelines");
                                return;
                            default:
                                vf.c.t(activity, "https://promote.telegram.org/guidelines");
                                return;
                        }
                    }
                }, g6Var)).j();
                cnVar.hb(ijVar);
                cnVar.jb(ijVar);
                return;
            default:
                org.telegram.ui.Components.hc.a0(cnVar).c(org.telegram.messenger.g0.S2(org.telegram.messenger.id.M0(2131754487, null), -1, 2, new Runnable() {
                    @Override
                    public final void run() {
                        switch (r2) {
                            case 0:
                                vf.c.t(activity, "https://promote.telegram.org/guidelines");
                                return;
                            case 1:
                                vf.c.t(activity, "https://promote.telegram.org/guidelines");
                                return;
                            default:
                                vf.c.t(activity, "https://promote.telegram.org/guidelines");
                                return;
                        }
                    }
                }, g6Var)).j();
                cnVar.hb(ijVar);
                cnVar.jb(ijVar);
                return;
        }
    }
}
