package org.telegram.ui.Components;
public final class zv implements Runnable {
    public final int f42951a;
    public final fy f42952b;

    public zv(fy fyVar, int i7) {
        this.f42951a = i7;
        this.f42952b = fyVar;
    }

    @Override
    public final void run() {
        switch (this.f42951a) {
            case 0:
            default:
                this.f42952b.e();
                return;
        }
    }
}
