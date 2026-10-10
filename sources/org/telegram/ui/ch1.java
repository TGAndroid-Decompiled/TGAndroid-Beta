package org.telegram.ui;
public final class ch1 implements Runnable {
    public final int f36717a;
    public final ih1 f36718b;
    public final byte[] f36719c;

    public ch1(ih1 ih1Var, byte[] bArr, int i10) {
        this.f36717a = i10;
        this.f36718b = ih1Var;
        this.f36719c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f36717a) {
            case 0:
                ih1.Y(this.f36718b, this.f36719c);
                return;
            default:
                ih1 ih1Var = this.f36718b;
                ih1Var.w0();
                ih1Var.V = this.f36719c;
                ih1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                ih1 ih1Var2 = new ih1(9, ih1Var.U);
                ih1Var2.H = ih1Var.H;
                ih1Var2.G = ih1Var.G;
                ih1Var.presentFragment(ih1Var2, true);
                return;
        }
    }
}
