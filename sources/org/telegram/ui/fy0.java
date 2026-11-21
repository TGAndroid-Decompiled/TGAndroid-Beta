package org.telegram.ui;

import android.app.Activity;
public final class fy0 implements Runnable {
    public final int f47874a;
    public final bn f47875b;
    public final Activity f47876c;
    public final org.telegram.ui.ActionBar.h6 d;
    public final org.telegram.messenger.fj f47877e;

    public fy0(bn bnVar, Activity activity, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.messenger.fj fjVar, int i7) {
        this.f47874a = i7;
        this.f47875b = bnVar;
        this.f47876c = activity;
        this.d = h6Var;
        this.f47877e = fjVar;
    }

    @Override
    public final void run() {
        int i7 = this.f47874a;
        org.telegram.messenger.fj fjVar = this.f47877e;
        org.telegram.ui.ActionBar.h6 h6Var = this.d;
        final Activity activity = this.f47876c;
        bn bnVar = this.f47875b;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.lc.b0(bnVar).c(org.telegram.messenger.g0.R2(org.telegram.messenger.gd.N0(2131754484, null), -1, 2, new Runnable() {
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
                }, h6Var)).j();
                bnVar.ib(fjVar);
                bnVar.kb(fjVar);
                return;
            case 1:
                org.telegram.ui.Components.lc.b0(bnVar).c(org.telegram.messenger.g0.R2(org.telegram.messenger.gd.N0(2131754484, null), -1, 2, new Runnable() {
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
                }, h6Var)).j();
                bnVar.ib(fjVar);
                bnVar.kb(fjVar);
                return;
            default:
                org.telegram.ui.Components.lc.b0(bnVar).c(org.telegram.messenger.g0.R2(org.telegram.messenger.gd.N0(2131754484, null), -1, 2, new Runnable() {
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
                }, h6Var)).j();
                bnVar.ib(fjVar);
                bnVar.kb(fjVar);
                return;
        }
    }
}
