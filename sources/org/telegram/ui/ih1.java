package org.telegram.ui;
public final class ih1 implements Runnable {
    public final int f37136a;
    public final oh1 f37137b;
    public final byte[] f37138c;

    public ih1(oh1 oh1Var, byte[] bArr, int i10) {
        this.f37136a = i10;
        this.f37137b = oh1Var;
        this.f37138c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f37136a) {
            case 0:
                oh1.Y(this.f37137b, this.f37138c);
                return;
            default:
                oh1 oh1Var = this.f37137b;
                oh1Var.w0();
                oh1Var.V = this.f37138c;
                oh1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                oh1 oh1Var2 = new oh1(9, oh1Var.U);
                oh1Var2.H = oh1Var.H;
                oh1Var2.G = oh1Var.G;
                oh1Var.presentFragment(oh1Var2, true);
                return;
        }
    }
}
