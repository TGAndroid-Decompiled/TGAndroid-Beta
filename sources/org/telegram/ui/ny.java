package org.telegram.ui;
public final class ny implements Runnable {
    public final int f48248a;
    public final iz f48249b;

    public ny(iz izVar, int i7) {
        this.f48248a = i7;
        this.f48249b = izVar;
    }

    @Override
    public final void run() {
        switch (this.f48248a) {
            case 0:
                iz.a0(this.f48249b);
                return;
            default:
                iz.b0(this.f48249b);
                return;
        }
    }
}
