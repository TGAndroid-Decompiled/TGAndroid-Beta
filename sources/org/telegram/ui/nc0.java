package org.telegram.ui;
public final class nc0 implements Runnable {
    public final int f40166a;
    public final hd0 f40167b;
    public final boolean f40168c;

    public nc0(hd0 hd0Var, boolean z10, int i10) {
        this.f40166a = i10;
        this.f40167b = hd0Var;
        this.f40168c = z10;
    }

    @Override
    public final void run() {
        switch (this.f40166a) {
            case 0:
                boolean z10 = this.f40168c;
                hd0 hd0Var = this.f40167b;
                if (!z10) {
                    hd0Var.f38255b.setVisibility(8);
                    return;
                } else {
                    hd0Var.getClass();
                    return;
                }
            default:
                this.f40167b.r0(this.f40168c);
                return;
        }
    }
}
