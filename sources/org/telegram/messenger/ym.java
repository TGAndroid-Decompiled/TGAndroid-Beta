package org.telegram.messenger;
public final class ym implements Runnable {
    public final int f26664a;
    public final q0.a f26665b;
    public final int f26666c;

    public ym(q0.a aVar, int i7, int i10) {
        this.f26664a = i10;
        this.f26665b = aVar;
        this.f26666c = i7;
    }

    @Override
    public final void run() {
        switch (this.f26664a) {
            case 0:
                this.f26665b.accept(Integer.valueOf(this.f26666c));
                return;
            default:
                this.f26665b.accept(Integer.valueOf(this.f26666c));
                return;
        }
    }
}
