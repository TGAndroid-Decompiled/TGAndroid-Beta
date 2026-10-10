package org.telegram.ui;
public final class nc0 implements Runnable {
    public final int f40212a;
    public final hd0 f40213b;
    public final boolean f40214c;

    public nc0(hd0 hd0Var, boolean z10, int i10) {
        this.f40212a = i10;
        this.f40213b = hd0Var;
        this.f40214c = z10;
    }

    @Override
    public final void run() {
        switch (this.f40212a) {
            case 0:
                boolean z10 = this.f40214c;
                hd0 hd0Var = this.f40213b;
                if (!z10) {
                    hd0Var.f38301b.setVisibility(8);
                    return;
                } else {
                    hd0Var.getClass();
                    return;
                }
            default:
                this.f40213b.r0(this.f40214c);
                return;
        }
    }
}
