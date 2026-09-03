package org.telegram.messenger;
public final class z5 implements Runnable {
    public final int f20763a;
    public final org.telegram.ui.ActionBar.d2 f20764b;
    public final boolean[] f20765c;

    public z5(org.telegram.ui.ActionBar.d2 d2Var, boolean[] zArr, int i10) {
        this.f20763a = i10;
        this.f20764b = d2Var;
        this.f20765c = zArr;
    }

    @Override
    public final void run() {
        switch (this.f20763a) {
            case 0:
                MediaController.lambda$saveFile$45(this.f20765c, this.f20764b);
                return;
            case 1:
                MediaController.lambda$saveFile$49(this.f20764b, this.f20765c);
                return;
            case 2:
                MediaController.lambda$saveFile$52(this.f20765c, this.f20764b);
                return;
            default:
                MediaController.lambda$saveFile$54(this.f20764b, this.f20765c);
                return;
        }
    }

    public z5(boolean[] zArr, org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        this.f20763a = i10;
        this.f20765c = zArr;
        this.f20764b = d2Var;
    }
}
