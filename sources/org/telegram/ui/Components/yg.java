package org.telegram.ui.Components;
public final class yg implements Runnable {
    public final int f40575a;
    public final ci f40576b;
    public final boolean f40577c;

    public yg(ci ciVar, boolean z9, int i7) {
        this.f40575a = i7;
        this.f40576b = ciVar;
        this.f40577c = z9;
    }

    @Override
    public final void run() {
        switch (this.f40575a) {
            case 0:
                boolean z9 = this.f40577c;
                ci ciVar = this.f40576b;
                if (!z9) {
                    ciVar.Z2.setVisibility(8);
                    return;
                } else {
                    ciVar.getClass();
                    return;
                }
            case 1:
                boolean z10 = this.f40577c;
                ci ciVar2 = this.f40576b;
                if (!z10) {
                    ciVar2.f32659v1.setVisibility(8);
                    return;
                } else {
                    ciVar2.getClass();
                    return;
                }
            case 2:
                boolean z11 = this.f40577c;
                ci ciVar3 = this.f40576b;
                if (!z11) {
                    ciVar3.f32667x1.setVisibility(8);
                    return;
                } else {
                    ciVar3.getClass();
                    return;
                }
            default:
                boolean z12 = this.f40577c;
                ci ciVar4 = this.f40576b;
                if (z12) {
                    ciVar4.f32657u3.setVisibility(4);
                    return;
                } else {
                    ciVar4.getClass();
                    return;
                }
        }
    }
}
