package org.telegram.ui;
public final class ch1 implements Runnable {
    public final int f32807a;
    public final ih1 f32808b;
    public final byte[] f32809c;

    public ch1(ih1 ih1Var, byte[] bArr, int i10) {
        this.f32807a = i10;
        this.f32808b = ih1Var;
        this.f32809c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f32807a) {
            case 0:
                ih1.Y(this.f32808b, this.f32809c);
                return;
            default:
                ih1 ih1Var = this.f32808b;
                ih1Var.w0();
                ih1Var.V = this.f32809c;
                ih1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                ih1 ih1Var2 = new ih1(9, ih1Var.U);
                ih1Var2.H = ih1Var.H;
                ih1Var2.G = ih1Var.G;
                ih1Var.presentFragment(ih1Var2, true);
                return;
        }
    }
}
