package org.telegram.ui.Components;
public final class sc implements Runnable {
    public final int f37920a;
    public final tc f37921b;
    public final boolean f37922c;

    public sc(tc tcVar, boolean z9, int i7) {
        this.f37920a = i7;
        this.f37921b = tcVar;
        this.f37922c = z9;
    }

    @Override
    public final void run() {
        switch (this.f37920a) {
            case 0:
                boolean z9 = this.f37922c;
                tc tcVar = this.f37921b;
                if (!z9) {
                    tcVar.Y0.setVisibility(8);
                    return;
                } else {
                    tcVar.getClass();
                    return;
                }
            default:
                boolean z10 = this.f37922c;
                tc tcVar2 = this.f37921b;
                if (!z10) {
                    tcVar2.U0.setVisibility(8);
                    return;
                } else {
                    tcVar2.getClass();
                    return;
                }
        }
    }
}
