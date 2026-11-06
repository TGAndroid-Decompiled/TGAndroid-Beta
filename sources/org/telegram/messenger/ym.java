package org.telegram.messenger;
public final class ym implements Runnable {
    public final int f26672a;
    public final q0.a f26673b;
    public final int f26674c;

    public ym(q0.a aVar, int i7, int i10) {
        this.f26672a = i10;
        this.f26673b = aVar;
        this.f26674c = i7;
    }

    @Override
    public final void run() {
        switch (this.f26672a) {
            case 0:
                this.f26673b.accept(Integer.valueOf(this.f26674c));
                return;
            default:
                this.f26673b.accept(Integer.valueOf(this.f26674c));
                return;
        }
    }
}
