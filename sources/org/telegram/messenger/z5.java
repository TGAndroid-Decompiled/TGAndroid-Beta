package org.telegram.messenger;
public final class z5 implements Runnable {
    public final int f19083a;
    public final org.telegram.ui.ActionBar.d2 f19084b;
    public final boolean[] f19085c;

    public z5(org.telegram.ui.ActionBar.d2 d2Var, boolean[] zArr, int i10) {
        this.f19083a = i10;
        this.f19084b = d2Var;
        this.f19085c = zArr;
    }

    @Override
    public final void run() {
        switch (this.f19083a) {
            case 0:
                MediaController.lambda$saveFile$45(this.f19085c, this.f19084b);
                return;
            case 1:
                MediaController.lambda$saveFile$49(this.f19084b, this.f19085c);
                return;
            case 2:
                MediaController.lambda$saveFile$52(this.f19085c, this.f19084b);
                return;
            default:
                MediaController.lambda$saveFile$54(this.f19084b, this.f19085c);
                return;
        }
    }

    public z5(boolean[] zArr, org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        this.f19083a = i10;
        this.f19085c = zArr;
        this.f19084b = d2Var;
    }
}
