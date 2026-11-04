package org.telegram.ui.Components;
public final class cm implements Runnable {
    public final int f32769a;
    public final an f32770b;
    public final int f32771c;

    public cm(an anVar, int i3, int i10) {
        this.f32769a = i10;
        this.f32770b = anVar;
        this.f32771c = i3;
    }

    @Override
    public final void run() {
        switch (this.f32769a) {
            case 0:
                this.f32770b.j0(this.f32771c, null);
                return;
            case 1:
                this.f32770b.g0(this.f32771c);
                return;
            default:
                this.f32770b.j0(this.f32771c, null);
                return;
        }
    }
}
