package org.telegram.messenger;
public final class z5 implements Runnable {
    public final int f19108a;
    public final org.telegram.ui.ActionBar.d2 f19109b;
    public final boolean[] f19110c;

    public z5(org.telegram.ui.ActionBar.d2 d2Var, boolean[] zArr, int i10) {
        this.f19108a = i10;
        this.f19109b = d2Var;
        this.f19110c = zArr;
    }

    @Override
    public final void run() {
        switch (this.f19108a) {
            case 0:
                MediaController.lambda$saveFile$45(this.f19110c, this.f19109b);
                return;
            case 1:
                MediaController.lambda$saveFile$49(this.f19109b, this.f19110c);
                return;
            case 2:
                MediaController.lambda$saveFile$52(this.f19110c, this.f19109b);
                return;
            default:
                MediaController.lambda$saveFile$54(this.f19109b, this.f19110c);
                return;
        }
    }

    public z5(boolean[] zArr, org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        this.f19108a = i10;
        this.f19110c = zArr;
        this.f19109b = d2Var;
    }
}
