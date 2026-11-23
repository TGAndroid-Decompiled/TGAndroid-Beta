package org.telegram.ui;

import android.app.Activity;
public final class fy0 implements Runnable {
    public final int f47828a;
    public final bn f47829b;
    public final Activity f47830c;
    public final org.telegram.ui.ActionBar.h6 d;
    public final org.telegram.messenger.gj f47831e;

    public fy0(bn bnVar, Activity activity, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.messenger.gj gjVar, int i7) {
        this.f47828a = i7;
        this.f47829b = bnVar;
        this.f47830c = activity;
        this.d = h6Var;
        this.f47831e = gjVar;
    }

    @Override
    public final void run() {
        int i7 = this.f47828a;
        org.telegram.messenger.gj gjVar = this.f47831e;
        org.telegram.ui.ActionBar.h6 h6Var = this.d;
        final Activity activity = this.f47830c;
        bn bnVar = this.f47829b;
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
