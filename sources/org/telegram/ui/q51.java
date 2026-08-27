package org.telegram.ui;

public final class q51 implements Runnable {

    public final int f41525a;

    public final r51 f41526b;

    public q51(r51 r51Var, int i10) {
        this.f41525a = i10;
        this.f41526b = r51Var;
    }

    @Override
    public final void run() {
        switch (this.f41525a) {
            case 0:
                super/*android.widget.PopupWindow*/.dismiss();
                break;
            default:
                this.f41526b.dismiss();
                break;
        }
    }
}
