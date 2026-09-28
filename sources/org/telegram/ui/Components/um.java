package org.telegram.ui.Components;
public final class um implements Runnable {
    public final int f28833a;
    public final wn f28834b;
    public final int f28835c;

    public um(wn wnVar, int i10, int i11) {
        this.f28833a = i11;
        this.f28834b = wnVar;
        this.f28835c = i10;
    }

    @Override
    public final void run() {
        switch (this.f28833a) {
            case 0:
                this.f28834b.e0(this.f28835c, null);
                return;
            case 1:
                this.f28834b.b0(this.f28835c);
                return;
            default:
                this.f28834b.e0(this.f28835c, null);
                return;
        }
    }
}
