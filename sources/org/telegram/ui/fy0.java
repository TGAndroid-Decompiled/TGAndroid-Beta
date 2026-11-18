package org.telegram.ui;

import android.app.Activity;
public final class fy0 implements Runnable {
    public final int f47843a;
    public final bn f47844b;
    public final Activity f47845c;
    public final org.telegram.ui.ActionBar.i6 d;
    public final org.telegram.messenger.fj f47846e;

    public fy0(bn bnVar, Activity activity, org.telegram.ui.ActionBar.i6 i6Var, org.telegram.messenger.fj fjVar, int i7) {
        this.f47843a = i7;
        this.f47844b = bnVar;
        this.f47845c = activity;
        this.d = i6Var;
        this.f47846e = fjVar;
    }

    @Override
    public final void run() {
        int i7 = this.f47843a;
        org.telegram.messenger.fj fjVar = this.f47846e;
        org.telegram.ui.ActionBar.i6 i6Var = this.d;
        final Activity activity = this.f47845c;
        bn bnVar = this.f47844b;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.lc.b0(bnVar).c(org.telegram.messenger.g0.R2(org.telegram.messenger.gd.M0(2131754485, null), -1, 2, new Runnable() {
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
                }, i6Var)).j();
                bnVar.ib(fjVar);
                bnVar.kb(fjVar);
                return;
            case 1:
                org.telegram.ui.Components.lc.b0(bnVar).c(org.telegram.messenger.g0.R2(org.telegram.messenger.gd.M0(2131754485, null), -1, 2, new Runnable() {
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
                }, i6Var)).j();
                bnVar.ib(fjVar);
                bnVar.kb(fjVar);
                return;
            default:
                org.telegram.ui.Components.lc.b0(bnVar).c(org.telegram.messenger.g0.R2(org.telegram.messenger.gd.M0(2131754485, null), -1, 2, new Runnable() {
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
                }, i6Var)).j();
                bnVar.ib(fjVar);
                bnVar.kb(fjVar);
                return;
        }
    }
}
