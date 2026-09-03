package org.telegram.ui;
public final class pg1 implements Runnable {
    public final int f37151a;
    public final wg1 f37152b;
    public final byte[] f37153c;

    public pg1(wg1 wg1Var, byte[] bArr, int i10) {
        this.f37151a = i10;
        this.f37152b = wg1Var;
        this.f37153c = bArr;
    }

    @Override
    public final void run() {
        switch (this.f37151a) {
            case 0:
                wg1.Y(this.f37152b, this.f37153c);
                return;
            default:
                wg1 wg1Var = this.f37152b;
                wg1Var.w0();
                wg1Var.S = this.f37153c;
                wg1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                wg1 wg1Var2 = new wg1(9, wg1Var.R);
                wg1Var2.E = wg1Var.E;
                wg1Var2.D = wg1Var.D;
                wg1Var.presentFragment(wg1Var2, true);
                return;
        }
    }
}
