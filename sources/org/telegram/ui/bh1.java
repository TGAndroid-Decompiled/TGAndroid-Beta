package org.telegram.ui;
public final class bh1 implements Runnable {
    public final int f34833a;
    public final hh1 f34834b;
    public final byte[] f34835c;

    public bh1(hh1 hh1Var, byte[] bArr, int i10) {
        this.f34833a = i10;
        this.f34834b = hh1Var;
        this.f34835c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f34833a) {
            case 0:
                hh1.Y(this.f34834b, this.f34835c);
                return;
            default:
                hh1 hh1Var = this.f34834b;
                hh1Var.w0();
                hh1Var.V = this.f34835c;
                hh1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                hh1 hh1Var2 = new hh1(9, hh1Var.U);
                hh1Var2.H = hh1Var.H;
                hh1Var2.G = hh1Var.G;
                hh1Var.presentFragment(hh1Var2, true);
                return;
        }
    }
}
