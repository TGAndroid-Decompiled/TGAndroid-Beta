package org.telegram.ui.Components;
public final class qh implements Runnable {
    public final int f28283a;
    public final vi f28284b;
    public final boolean f28285c;

    public qh(vi viVar, boolean z10, int i10) {
        this.f28283a = i10;
        this.f28284b = viVar;
        this.f28285c = z10;
    }

    @Override
    public final void run() {
        switch (this.f28283a) {
            case 0:
                boolean z10 = this.f28285c;
                vi viVar = this.f28284b;
                if (!z10) {
                    viVar.f29673f1.setVisibility(8);
                    return;
                } else {
                    viVar.getClass();
                    return;
                }
            case 1:
                boolean z11 = this.f28285c;
                vi viVar2 = this.f28284b;
                if (!z11) {
                    viVar2.f29724w.setVisibility(8);
                    return;
                } else {
                    viVar2.getClass();
                    return;
                }
            case 2:
                boolean z12 = this.f28285c;
                vi viVar3 = this.f28284b;
                if (!z12) {
                    viVar3.f29732y.setVisibility(8);
                    return;
                } else {
                    viVar3.getClass();
                    return;
                }
            default:
                boolean z13 = this.f28285c;
                vi viVar4 = this.f28284b;
                if (z13) {
                    viVar4.A1.setVisibility(4);
                    return;
                } else {
                    viVar4.getClass();
                    return;
                }
        }
    }
}
