package org.telegram.ui.Components;
public final class gg implements Runnable {
    public final int f28766a;
    public final ig f28767b;
    public final kh.x3 f28768c;

    public gg(ig igVar, kh.x3 x3Var, int i9) {
        this.f28766a = i9;
        this.f28767b = igVar;
        this.f28768c = x3Var;
    }

    @Override
    public final void run() {
        switch (this.f28766a) {
            case 0:
                ig igVar = this.f28767b;
                kh.x3 x3Var = this.f28768c;
                igVar.removeView(x3Var);
                if (igVar.f29425b == x3Var) {
                    igVar.f29425b = null;
                    return;
                }
                return;
            case 1:
                this.f28767b.removeView(this.f28768c);
                return;
            case 2:
                this.f28767b.removeView(this.f28768c);
                return;
            default:
                ig igVar2 = this.f28767b;
                kh.x3 x3Var2 = this.f28768c;
                igVar2.removeView(x3Var2);
                if (igVar2.f29424a == x3Var2) {
                    igVar2.f29424a = null;
                    return;
                }
                return;
        }
    }
}
