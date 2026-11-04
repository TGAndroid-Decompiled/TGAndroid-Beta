package org.telegram.ui;
public final class eg0 implements Runnable {
    public final int f44981a;
    public final kg0 f44982b;

    public eg0(kg0 kg0Var, int i3) {
        this.f44981a = i3;
        this.f44982b = kg0Var;
    }

    @Override
    public final void run() {
        switch (this.f44981a) {
            case 0:
                this.f44982b.dismiss();
                return;
            case 1:
                this.f44982b.g1(true, false);
                return;
            default:
                this.f44982b.g1(true, false);
                return;
        }
    }
}
