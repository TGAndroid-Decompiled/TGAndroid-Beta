package org.telegram.ui;
public final class jg1 implements Runnable {
    public final int f38150a;
    public final qg1 f38151b;
    public final byte[] f38152c;

    public jg1(qg1 qg1Var, byte[] bArr, int i10) {
        this.f38150a = i10;
        this.f38151b = qg1Var;
        this.f38152c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f38150a) {
            case 0:
                qg1.Y(this.f38151b, this.f38152c);
                return;
            default:
                qg1 qg1Var = this.f38151b;
                qg1Var.w0();
                qg1Var.S = this.f38152c;
                qg1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                qg1 qg1Var2 = new qg1(9, qg1Var.R);
                qg1Var2.E = qg1Var.E;
                qg1Var2.D = qg1Var.D;
                qg1Var.presentFragment(qg1Var2, true);
                return;
        }
    }
}
