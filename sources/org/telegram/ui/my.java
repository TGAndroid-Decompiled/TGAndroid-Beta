package org.telegram.ui;
public final class my implements Runnable {
    public final int f49337a;
    public final hz f49338b;

    public my(hz hzVar, int i7) {
        this.f49337a = i7;
        this.f49338b = hzVar;
    }

    @Override
    public final void run() {
        switch (this.f49337a) {
            case 0:
                hz.a0(this.f49338b);
                return;
            default:
                hz.b0(this.f49338b);
                return;
        }
    }
}
