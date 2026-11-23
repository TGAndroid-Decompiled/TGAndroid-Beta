package org.telegram.ui;

import android.app.Activity;
public final class fy0 implements Runnable {
    public final int f47878a;
    public final bn f47879b;
    public final Activity f47880c;
    public final org.telegram.ui.ActionBar.h6 d;
    public final org.telegram.messenger.gj f47881e;

    public fy0(bn bnVar, Activity activity, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.messenger.gj gjVar, int i7) {
        this.f47878a = i7;
        this.f47879b = bnVar;
        this.f47880c = activity;
        this.d = h6Var;
        this.f47881e = gjVar;
    }

    @Override
    public final void run() {
        int i7 = this.f47878a;
        org.telegram.messenger.gj gjVar = this.f47881e;
        org.telegram.ui.ActionBar.h6 h6Var = this.d;
        final Activity activity = this.f47880c;
        bn bnVar = this.f47879b;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.lc.b0(bnVar).c(org.telegram.messenger.g0.R2(org.telegram.messenger.hd.N0(2131754484, null), -1, 2, new Runnable() {
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
                bnVar.ib(gjVar);
                bnVar.kb(gjVar);
                return;
            case 1:
                org.telegram.ui.Components.lc.b0(bnVar).c(org.telegram.messenger.g0.R2(org.telegram.messenger.hd.N0(2131754484, null), -1, 2, new Runnable() {
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
                bnVar.ib(gjVar);
                bnVar.kb(gjVar);
                return;
            default:
                org.telegram.ui.Components.lc.b0(bnVar).c(org.telegram.messenger.g0.R2(org.telegram.messenger.hd.N0(2131754484, null), -1, 2, new Runnable() {
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
                bnVar.ib(gjVar);
                bnVar.kb(gjVar);
                return;
        }
    }
}
