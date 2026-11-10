package org.telegram.messenger;
public final class ym implements Runnable {
    public final int f26698a;
    public final q0.a f26699b;
    public final int f26700c;

    public ym(q0.a aVar, int i7, int i10) {
        this.f26698a = i10;
        this.f26699b = aVar;
        this.f26700c = i7;
    }

    @Override
    public final void run() {
        switch (this.f26698a) {
            case 0:
                this.f26699b.accept(Integer.valueOf(this.f26700c));
                return;
            default:
                this.f26699b.accept(Integer.valueOf(this.f26700c));
                return;
        }
    }
}
