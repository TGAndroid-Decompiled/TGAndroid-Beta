package org.telegram.ui.Cells;

public final class g7 implements Runnable {

    public final int f24400a;

    public final i7 f24401b;

    public g7(i7 i7Var, int i10) {
        this.f24400a = i10;
        this.f24401b = i7Var;
    }

    @Override
    public final void run() {
        switch (this.f24400a) {
            case 0:
                i7 i7Var = this.f24401b;
                i7Var.post(new g7(i7Var, 1));
                break;
            default:
                i7 i7Var2 = this.f24401b;
                i7Var2.U.isSpoilersRevealed = true;
                i7Var2.D.clear();
                i7Var2.E.clear();
                i7Var2.F.clear();
                i7Var2.invalidate();
                break;
        }
    }
}
