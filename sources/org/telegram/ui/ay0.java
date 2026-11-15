package org.telegram.ui;

import android.app.Activity;
public final class ay0 implements Runnable {
    public final int f45541a;
    public final an f45542b;
    public final Activity f45543c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final org.telegram.messenger.gj f45544e;

    public ay0(an anVar, Activity activity, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.messenger.gj gjVar, int i7) {
        this.f45541a = i7;
        this.f45542b = anVar;
        this.f45543c = activity;
        this.d = e6Var;
        this.f45544e = gjVar;
    }

    @Override
    public final void run() {
        int i7 = this.f45541a;
        org.telegram.messenger.gj gjVar = this.f45544e;
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        final Activity activity = this.f45543c;
        an anVar = this.f45542b;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.cc.a0(anVar).c(org.telegram.messenger.g0.S2(org.telegram.messenger.hd.M0(2131754487, null), -1, 2, new Runnable() {
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
                }, e6Var)).j();
                anVar.ib(gjVar);
                anVar.kb(gjVar);
                return;
            case 1:
                org.telegram.ui.Components.cc.a0(anVar).c(org.telegram.messenger.g0.S2(org.telegram.messenger.hd.M0(2131754487, null), -1, 2, new Runnable() {
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
                }, e6Var)).j();
                anVar.ib(gjVar);
                anVar.kb(gjVar);
                return;
            default:
                org.telegram.ui.Components.cc.a0(anVar).c(org.telegram.messenger.g0.S2(org.telegram.messenger.hd.M0(2131754487, null), -1, 2, new Runnable() {
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
                }, e6Var)).j();
                anVar.ib(gjVar);
                anVar.kb(gjVar);
                return;
        }
    }
}
