package org.telegram.ui;

import android.app.Activity;
public final class gy0 implements Runnable {
    public final int f46178a;
    public final cn f46179b;
    public final Activity f46180c;
    public final org.telegram.ui.ActionBar.h6 d;
    public final org.telegram.messenger.ij f46181e;

    public gy0(cn cnVar, Activity activity, org.telegram.ui.ActionBar.h6 h6Var, org.telegram.messenger.ij ijVar, int i7) {
        this.f46178a = i7;
        this.f46179b = cnVar;
        this.f46180c = activity;
        this.d = h6Var;
        this.f46181e = ijVar;
    }

    @Override
    public final void run() {
        int i7 = this.f46178a;
        org.telegram.messenger.ij ijVar = this.f46181e;
        org.telegram.ui.ActionBar.h6 h6Var = this.d;
        final Activity activity = this.f46180c;
        cn cnVar = this.f46179b;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.gc.a0(cnVar).c(org.telegram.messenger.g0.S2(org.telegram.messenger.id.M0(2131754487, null), -1, 2, new Runnable() {
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
                cnVar.hb(ijVar);
                cnVar.jb(ijVar);
                return;
            case 1:
                org.telegram.ui.Components.gc.a0(cnVar).c(org.telegram.messenger.g0.S2(org.telegram.messenger.id.M0(2131754487, null), -1, 2, new Runnable() {
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
                cnVar.hb(ijVar);
                cnVar.jb(ijVar);
                return;
            default:
                org.telegram.ui.Components.gc.a0(cnVar).c(org.telegram.messenger.g0.S2(org.telegram.messenger.id.M0(2131754487, null), -1, 2, new Runnable() {
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
                cnVar.hb(ijVar);
                cnVar.jb(ijVar);
                return;
        }
    }
}
