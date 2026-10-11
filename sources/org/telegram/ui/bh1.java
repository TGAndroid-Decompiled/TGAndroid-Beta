package org.telegram.ui;
public final class bh1 implements Runnable {
    public final int f36389a;
    public final hh1 f36390b;
    public final byte[] f36391c;

    public bh1(hh1 hh1Var, byte[] bArr, int i10) {
        this.f36389a = i10;
        this.f36390b = hh1Var;
        this.f36391c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f36389a) {
            case 0:
                hh1.Y(this.f36390b, this.f36391c);
                return;
            default:
                hh1 hh1Var = this.f36390b;
                hh1Var.w0();
                hh1Var.V = this.f36391c;
                hh1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                hh1 hh1Var2 = new hh1(9, hh1Var.U);
                hh1Var2.H = hh1Var.H;
                hh1Var2.G = hh1Var.G;
                hh1Var.presentFragment(hh1Var2, true);
                return;
        }
    }
}
