package org.telegram.ui;
public final class my implements Runnable {
    public final int f49338a;
    public final hz f49339b;

    public my(hz hzVar, int i7) {
        this.f49338a = i7;
        this.f49339b = hzVar;
    }

    @Override
    public final void run() {
        switch (this.f49338a) {
            case 0:
                hz.a0(this.f49339b);
                return;
            default:
                hz.b0(this.f49339b);
                return;
        }
    }
}
