package org.telegram.ui.Components;
public final class rc implements Runnable {
    public final int f37703a;
    public final sc f37704b;
    public final boolean f37705c;

    public rc(sc scVar, boolean z10, int i3) {
        this.f37703a = i3;
        this.f37704b = scVar;
        this.f37705c = z10;
    }

    @Override
    public final void run() {
        switch (this.f37703a) {
            case 0:
                boolean z10 = this.f37705c;
                sc scVar = this.f37704b;
                if (!z10) {
                    scVar.Z0.setVisibility(8);
                    return;
                } else {
                    scVar.getClass();
                    return;
                }
            default:
                boolean z11 = this.f37705c;
                sc scVar2 = this.f37704b;
                if (!z11) {
                    scVar2.V0.setVisibility(8);
                    return;
                } else {
                    scVar2.getClass();
                    return;
                }
        }
    }
}
