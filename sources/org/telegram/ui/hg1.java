package org.telegram.ui;
public final class hg1 implements Runnable {
    public final int f34866a;
    public final og1 f34867b;
    public final byte[] f34868c;

    public hg1(og1 og1Var, byte[] bArr, int i10) {
        this.f34866a = i10;
        this.f34867b = og1Var;
        this.f34868c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f34866a) {
            case 0:
                og1.Y(this.f34867b, this.f34868c);
                return;
            default:
                og1 og1Var = this.f34867b;
                og1Var.w0();
                og1Var.S = this.f34868c;
                og1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                og1 og1Var2 = new og1(9, og1Var.R);
                og1Var2.E = og1Var.E;
                og1Var2.D = og1Var.D;
                og1Var.presentFragment(og1Var2, true);
                return;
        }
    }
}
