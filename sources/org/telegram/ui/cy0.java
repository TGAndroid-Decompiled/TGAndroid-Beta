package org.telegram.ui;

import android.app.Activity;
public final class cy0 implements Runnable {
    public final int f44914a;
    public final an f44915b;
    public final Activity f44916c;
    public final org.telegram.ui.ActionBar.f6 d;
    public final org.telegram.messenger.ij f44917e;

    public cy0(an anVar, Activity activity, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.messenger.ij ijVar, int i7) {
        this.f44914a = i7;
        this.f44915b = anVar;
        this.f44916c = activity;
        this.d = f6Var;
        this.f44917e = ijVar;
    }

    @Override
    public final void run() {
        int i7 = this.f44914a;
        org.telegram.messenger.ij ijVar = this.f44917e;
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        final Activity activity = this.f44916c;
        an anVar = this.f44915b;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.hc.a0(anVar).c(org.telegram.messenger.g0.S2(org.telegram.messenger.hd.M0(2131754487, null), -1, 2, new Runnable() {
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
                }, f6Var)).j();
                anVar.eb(ijVar);
                anVar.gb(ijVar);
                return;
            case 1:
                org.telegram.ui.Components.hc.a0(anVar).c(org.telegram.messenger.g0.S2(org.telegram.messenger.hd.M0(2131754487, null), -1, 2, new Runnable() {
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
                }, f6Var)).j();
                anVar.eb(ijVar);
                anVar.gb(ijVar);
                return;
            default:
                org.telegram.ui.Components.hc.a0(anVar).c(org.telegram.messenger.g0.S2(org.telegram.messenger.hd.M0(2131754487, null), -1, 2, new Runnable() {
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
                }, f6Var)).j();
                anVar.eb(ijVar);
                anVar.gb(ijVar);
                return;
        }
    }
}
