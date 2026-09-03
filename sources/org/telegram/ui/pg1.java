package org.telegram.ui;
public final class pg1 implements Runnable {
    public final int f40012a;
    public final vg1 f40013b;
    public final byte[] f40014c;

    public pg1(vg1 vg1Var, byte[] bArr, int i10) {
        this.f40012a = i10;
        this.f40013b = vg1Var;
        this.f40014c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f40012a) {
            case 0:
                vg1.Y(this.f40013b, this.f40014c);
                return;
            default:
                vg1 vg1Var = this.f40013b;
                vg1Var.w0();
                vg1Var.S = this.f40014c;
                vg1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                vg1 vg1Var2 = new vg1(9, vg1Var.R);
                vg1Var2.E = vg1Var.E;
                vg1Var2.D = vg1Var.D;
                vg1Var.presentFragment(vg1Var2, true);
                return;
        }
    }
}
