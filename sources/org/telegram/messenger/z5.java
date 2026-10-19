package org.telegram.messenger;
public final class z5 implements Runnable {
    public final int f20207a;
    public final org.telegram.ui.ActionBar.b2 f20208b;
    public final boolean[] f20209c;

    public z5(org.telegram.ui.ActionBar.b2 b2Var, boolean[] zArr, int i10) {
        this.f20207a = i10;
        this.f20208b = b2Var;
        this.f20209c = zArr;
    }

    @Override
    public final void run() {
        switch (this.f20207a) {
            case 0:
                MediaController.lambda$saveFile$46(this.f20209c, this.f20208b);
                return;
            case 1:
                MediaController.lambda$saveFile$50(this.f20208b, this.f20209c);
                return;
            case 2:
                MediaController.lambda$saveFile$53(this.f20209c, this.f20208b);
                return;
            default:
                MediaController.lambda$saveFile$55(this.f20208b, this.f20209c);
                return;
        }
    }

    public z5(boolean[] zArr, org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f20207a = i10;
        this.f20209c = zArr;
        this.f20208b = b2Var;
    }
}
