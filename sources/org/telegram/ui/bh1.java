package org.telegram.ui;
public final class bh1 implements Runnable {
    public final int f32160a;
    public final hh1 f32161b;
    public final byte[] f32162c;

    public bh1(hh1 hh1Var, byte[] bArr, int i10) {
        this.f32160a = i10;
        this.f32161b = hh1Var;
        this.f32162c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f32160a) {
            case 0:
                hh1.Y(this.f32161b, this.f32162c);
                return;
            default:
                hh1 hh1Var = this.f32161b;
                hh1Var.w0();
                hh1Var.V = this.f32162c;
                hh1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                hh1 hh1Var2 = new hh1(9, hh1Var.U);
                hh1Var2.H = hh1Var.H;
                hh1Var2.G = hh1Var.G;
                hh1Var.presentFragment(hh1Var2, true);
                return;
        }
    }
}
