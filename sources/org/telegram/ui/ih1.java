package org.telegram.ui;
public final class ih1 implements Runnable {
    public final int f36813a;
    public final oh1 f36814b;
    public final byte[] f36815c;

    public ih1(oh1 oh1Var, byte[] bArr, int i10) {
        this.f36813a = i10;
        this.f36814b = oh1Var;
        this.f36815c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f36813a) {
            case 0:
                oh1.Y(this.f36814b, this.f36815c);
                return;
            default:
                oh1 oh1Var = this.f36814b;
                oh1Var.w0();
                oh1Var.V = this.f36815c;
                oh1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                oh1 oh1Var2 = new oh1(9, oh1Var.U);
                oh1Var2.H = oh1Var.H;
                oh1Var2.G = oh1Var.G;
                oh1Var.presentFragment(oh1Var2, true);
                return;
        }
    }
}
