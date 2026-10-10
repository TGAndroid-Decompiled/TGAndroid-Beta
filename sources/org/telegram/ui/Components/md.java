package org.telegram.ui.Components;
public final class md implements Runnable {
    public final int f28768a;
    public final od f28769b;
    public final boolean f28770c;

    public md(od odVar, boolean z10, int i10) {
        this.f28768a = i10;
        this.f28769b = odVar;
        this.f28770c = z10;
    }

    @Override
    public final void run() {
        switch (this.f28768a) {
            case 0:
                boolean z10 = this.f28770c;
                od odVar = this.f28769b;
                if (!z10) {
                    odVar.Z0.setVisibility(8);
                    return;
                } else {
                    odVar.getClass();
                    return;
                }
            default:
                boolean z11 = this.f28770c;
                od odVar2 = this.f28769b;
                if (!z11) {
                    odVar2.V0.setVisibility(8);
                    return;
                } else {
                    odVar2.getClass();
                    return;
                }
        }
    }
}
