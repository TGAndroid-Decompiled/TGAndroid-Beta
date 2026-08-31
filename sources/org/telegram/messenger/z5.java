package org.telegram.messenger;
public final class z5 implements Runnable {
    public final int f20761a;
    public final org.telegram.ui.ActionBar.d2 f20762b;
    public final boolean[] f20763c;

    public z5(org.telegram.ui.ActionBar.d2 d2Var, boolean[] zArr, int i10) {
        this.f20761a = i10;
        this.f20762b = d2Var;
        this.f20763c = zArr;
    }

    @Override
    public final void run() {
        switch (this.f20761a) {
            case 0:
                MediaController.lambda$saveFile$45(this.f20763c, this.f20762b);
                return;
            case 1:
                MediaController.lambda$saveFile$49(this.f20762b, this.f20763c);
                return;
            case 2:
                MediaController.lambda$saveFile$52(this.f20763c, this.f20762b);
                return;
            default:
                MediaController.lambda$saveFile$54(this.f20762b, this.f20763c);
                return;
        }
    }

    public z5(boolean[] zArr, org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        this.f20761a = i10;
        this.f20763c = zArr;
        this.f20762b = d2Var;
    }
}
