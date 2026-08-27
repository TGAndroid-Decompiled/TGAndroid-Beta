package org.telegram.ui.Components;

public final class cg implements Runnable {

    public final int f27414a;

    public final eg f27415b;

    public final lh.w3 f27416c;

    public cg(eg egVar, lh.w3 w3Var, int i10) {
        this.f27414a = i10;
        this.f27415b = egVar;
        this.f27416c = w3Var;
    }

    @Override
    public final void run() {
        switch (this.f27414a) {
            case 0:
                eg egVar = this.f27415b;
                lh.w3 w3Var = this.f27416c;
                egVar.removeView(w3Var);
                if (egVar.f28042b == w3Var) {
                    egVar.f28042b = null;
                }
                break;
            case 1:
                this.f27415b.removeView(this.f27416c);
                break;
            case 2:
                this.f27415b.removeView(this.f27416c);
                break;
            default:
                eg egVar2 = this.f27415b;
                lh.w3 w3Var2 = this.f27416c;
                egVar2.removeView(w3Var2);
                if (egVar2.f28041a == w3Var2) {
                    egVar2.f28041a = null;
                }
                break;
        }
    }
}
