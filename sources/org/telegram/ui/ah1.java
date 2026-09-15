package org.telegram.ui;
public final class ah1 implements Runnable {
    public final int f31836a;
    public final gh1 f31837b;
    public final byte[] f31838c;

    public ah1(gh1 gh1Var, byte[] bArr, int i10) {
        this.f31836a = i10;
        this.f31837b = gh1Var;
        this.f31838c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f31836a) {
            case 0:
                gh1.Y(this.f31837b, this.f31838c);
                return;
            default:
                gh1 gh1Var = this.f31837b;
                gh1Var.w0();
                gh1Var.V = this.f31838c;
                gh1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                gh1 gh1Var2 = new gh1(9, gh1Var.U);
                gh1Var2.H = gh1Var.H;
                gh1Var2.G = gh1Var.G;
                gh1Var.presentFragment(gh1Var2, true);
                return;
        }
    }
}
