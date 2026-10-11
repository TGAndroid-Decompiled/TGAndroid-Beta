package org.telegram.ui;
public final class bh1 implements Runnable {
    public final int f36423a;
    public final hh1 f36424b;
    public final byte[] f36425c;

    public bh1(hh1 hh1Var, byte[] bArr, int i10) {
        this.f36423a = i10;
        this.f36424b = hh1Var;
        this.f36425c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f36423a) {
            case 0:
                hh1.Y(this.f36424b, this.f36425c);
                return;
            default:
                hh1 hh1Var = this.f36424b;
                hh1Var.w0();
                hh1Var.V = this.f36425c;
                hh1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                hh1 hh1Var2 = new hh1(9, hh1Var.U);
                hh1Var2.H = hh1Var.H;
                hh1Var2.G = hh1Var.G;
                hh1Var.presentFragment(hh1Var2, true);
                return;
        }
    }
}
