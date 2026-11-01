package org.telegram.ui.Components.voip;
public final class n2 implements Runnable {
    public final int f31627a;
    public final s2 f31628b;
    public final int f31629c;

    public n2(s2 s2Var, int i10, int i11) {
        this.f31627a = i11;
        this.f31628b = s2Var;
        this.f31629c = i10;
    }

    @Override
    public final void run() {
        switch (this.f31627a) {
            case 0:
                org.telegram.messenger.i0.g3(new n2(this.f31628b, this.f31629c, 2));
                return;
            case 1:
                org.telegram.messenger.i0.g3(new n2(this.f31628b, this.f31629c, 3));
                return;
            case 2:
                this.f31628b.c(this.f31629c);
                return;
            default:
                this.f31628b.a(this.f31629c);
                return;
        }
    }
}
