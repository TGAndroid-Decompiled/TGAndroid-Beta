package org.telegram.messenger;
public final class z5 implements Runnable {
    public final int f20213a;
    public final org.telegram.ui.ActionBar.b2 f20214b;
    public final boolean[] f20215c;

    public z5(org.telegram.ui.ActionBar.b2 b2Var, boolean[] zArr, int i10) {
        this.f20213a = i10;
        this.f20214b = b2Var;
        this.f20215c = zArr;
    }

    @Override
    public final void run() {
        switch (this.f20213a) {
            case 0:
                MediaController.lambda$saveFile$46(this.f20215c, this.f20214b);
                return;
            case 1:
                MediaController.lambda$saveFile$50(this.f20214b, this.f20215c);
                return;
            case 2:
                MediaController.lambda$saveFile$53(this.f20215c, this.f20214b);
                return;
            default:
                MediaController.lambda$saveFile$55(this.f20214b, this.f20215c);
                return;
        }
    }

    public z5(boolean[] zArr, org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        this.f20213a = i10;
        this.f20215c = zArr;
        this.f20214b = b2Var;
    }
}
