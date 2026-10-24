package org.telegram.ui.Components;
public final class hd implements Runnable {
    public final int f27011a;
    public final id f27012b;
    public final boolean f27013c;

    public hd(id idVar, boolean z10, int i10) {
        this.f27011a = i10;
        this.f27012b = idVar;
        this.f27013c = z10;
    }

    @Override
    public final void run() {
        switch (this.f27011a) {
            case 0:
                boolean z10 = this.f27013c;
                id idVar = this.f27012b;
                if (!z10) {
                    idVar.Z0.setVisibility(8);
                    return;
                } else {
                    idVar.getClass();
                    return;
                }
            default:
                boolean z11 = this.f27013c;
                id idVar2 = this.f27012b;
                if (!z11) {
                    idVar2.V0.setVisibility(8);
                    return;
                } else {
                    idVar2.getClass();
                    return;
                }
        }
    }
}
