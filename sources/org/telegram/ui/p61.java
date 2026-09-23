package org.telegram.ui;
public final class p61 implements Runnable {
    public final int f36031a;
    public final q61 f36032b;

    public p61(q61 q61Var, int i10) {
        this.f36031a = i10;
        this.f36032b = q61Var;
    }

    @Override
    public final void run() {
        switch (this.f36031a) {
            case 0:
                q61.a(this.f36032b);
                return;
            default:
                this.f36032b.dismiss();
                return;
        }
    }
}
