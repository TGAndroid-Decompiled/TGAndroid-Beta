package org.telegram.ui;
public final class pc0 implements Runnable {
    public final int f36447a;
    public final jd0 f36448b;
    public final boolean f36449c;

    public pc0(jd0 jd0Var, boolean z10, int i10) {
        this.f36447a = i10;
        this.f36448b = jd0Var;
        this.f36449c = z10;
    }

    @Override
    public final void run() {
        switch (this.f36447a) {
            case 0:
                boolean z10 = this.f36449c;
                jd0 jd0Var = this.f36448b;
                if (!z10) {
                    jd0Var.f34813b.setVisibility(8);
                    return;
                } else {
                    jd0Var.getClass();
                    return;
                }
            default:
                this.f36448b.s0(this.f36449c);
                return;
        }
    }
}
