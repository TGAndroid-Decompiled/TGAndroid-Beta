package org.telegram.ui;
public final class id1 implements Runnable {
    public final int f35097a;
    public final rd1 f35098b;

    public id1(rd1 rd1Var, int i10) {
        this.f35097a = i10;
        this.f35098b = rd1Var;
    }

    @Override
    public final void run() {
        switch (this.f35097a) {
            case 0:
                this.f35098b.c(false);
                return;
            case 1:
                super/*android.app.Dialog*/.dismiss();
                return;
            default:
                this.f35098b.c(false);
                return;
        }
    }
}
