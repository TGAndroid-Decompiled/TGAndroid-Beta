package org.telegram.ui;
public final class gh1 implements Runnable {
    public final int f33103a;
    public final mh1 f33104b;
    public final byte[] f33105c;

    public gh1(mh1 mh1Var, byte[] bArr, int i10) {
        this.f33103a = i10;
        this.f33104b = mh1Var;
        this.f33105c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f33103a) {
            case 0:
                mh1.Y(this.f33104b, this.f33105c);
                return;
            default:
                mh1 mh1Var = this.f33104b;
                mh1Var.w0();
                mh1Var.V = this.f33105c;
                mh1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                mh1 mh1Var2 = new mh1(9, mh1Var.U);
                mh1Var2.H = mh1Var.H;
                mh1Var2.G = mh1Var.G;
                mh1Var.presentFragment(mh1Var2, true);
                return;
        }
    }
}
