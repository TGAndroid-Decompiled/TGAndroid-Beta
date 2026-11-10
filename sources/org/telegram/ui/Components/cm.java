package org.telegram.ui.Components;
public final class cm implements Runnable {
    public final int f32707a;
    public final an f32708b;
    public final int f32709c;

    public cm(an anVar, int i7, int i10) {
        this.f32707a = i10;
        this.f32708b = anVar;
        this.f32709c = i7;
    }

    @Override
    public final void run() {
        switch (this.f32707a) {
            case 0:
                this.f32708b.j0(this.f32709c, null);
                return;
            case 1:
                this.f32708b.g0(this.f32709c);
                return;
            default:
                this.f32708b.j0(this.f32709c, null);
                return;
        }
    }
}
