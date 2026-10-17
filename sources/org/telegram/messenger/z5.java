package org.telegram.messenger;
public final class z5 implements Runnable {
    public final int f20206a;
    public final org.telegram.ui.ActionBar.b2 f20207b;
    public final boolean[] f20208c;

    public z5(org.telegram.ui.ActionBar.b2 b2Var, boolean[] zArr, int i10) {
        this.f20206a = i10;
        this.f20207b = b2Var;
        this.f20208c = zArr;
    }

    @Override
    public final void run() {
        switch (this.f20206a) {
            case 0:
                MediaController.lambda$saveFile$46(this.f20208c, this.f20207b);
                return;
            case 1:
                MediaController.lambda$saveFile$50(this.f20207b, this.f20208c);
                return;
            case 2:
                MediaController.lambda$saveFile$53(this.f20208c, this.f20207b);
                return;
            default:
                MediaController.lambda$saveFile$55(this.f20207b, this.f20208c);
                return;
        }
    }

    public z5(boolean[] zArr, org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f20206a = i10;
        this.f20208c = zArr;
        this.f20207b = b2Var;
    }
}
