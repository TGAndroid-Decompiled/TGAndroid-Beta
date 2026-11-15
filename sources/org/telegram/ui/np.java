package org.telegram.ui;
public final class np implements Runnable {
    public final int f49599a;
    public final qq f49600b;

    public np(qq qqVar, int i7) {
        this.f49599a = i7;
        this.f49600b = qqVar;
    }

    @Override
    public final void run() {
        switch (this.f49599a) {
            case 0:
                this.f49600b.w0();
                return;
            default:
                qq qqVar = this.f49600b;
                qqVar.getMessagesController().V2(0, qqVar.N, true);
                return;
        }
    }
}
