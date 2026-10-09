package org.telegram.ui;
public final class ch1 implements Runnable {
    public final int f36671a;
    public final ih1 f36672b;
    public final byte[] f36673c;

    public ch1(ih1 ih1Var, byte[] bArr, int i10) {
        this.f36671a = i10;
        this.f36672b = ih1Var;
        this.f36673c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f36671a) {
            case 0:
                ih1.Y(this.f36672b, this.f36673c);
                return;
            default:
                ih1 ih1Var = this.f36672b;
                ih1Var.w0();
                ih1Var.V = this.f36673c;
                ih1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                ih1 ih1Var2 = new ih1(9, ih1Var.U);
                ih1Var2.H = ih1Var.H;
                ih1Var2.G = ih1Var.G;
                ih1Var.presentFragment(ih1Var2, true);
                return;
        }
    }
}
