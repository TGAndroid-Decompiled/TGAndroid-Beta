package org.telegram.ui;
public final class p81 implements Runnable {
    public final int f48705a;
    public final v81 f48706b;

    public p81(v81 v81Var, int i7) {
        this.f48705a = i7;
        this.f48706b = v81Var;
    }

    @Override
    public final void run() {
        switch (this.f48705a) {
            case 0:
                v81 v81Var = this.f48706b;
                v81Var.getClass();
                new ug.w0((org.telegram.ui.ActionBar.f2) v81Var, 11, false).show();
                return;
            default:
                v81 v81Var2 = this.f48706b;
                v81Var2.f50598e.requestFocus();
                org.telegram.messenger.g0.K3(v81Var2.f50598e);
                return;
        }
    }
}
