package org.telegram.messenger;
public final class ym implements Runnable {
    public final int f26694a;
    public final q0.a f26695b;
    public final int f26696c;

    public ym(q0.a aVar, int i7, int i10) {
        this.f26694a = i10;
        this.f26695b = aVar;
        this.f26696c = i7;
    }

    @Override
    public final void run() {
        switch (this.f26694a) {
            case 0:
                this.f26695b.accept(Integer.valueOf(this.f26696c));
                return;
            default:
                this.f26695b.accept(Integer.valueOf(this.f26696c));
                return;
        }
    }
}
