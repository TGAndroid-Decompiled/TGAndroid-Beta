package org.telegram.ui;
public final class np implements Runnable {
    public final int f49589a;
    public final qq f49590b;

    public np(qq qqVar, int i7) {
        this.f49589a = i7;
        this.f49590b = qqVar;
    }

    @Override
    public final void run() {
        switch (this.f49589a) {
            case 0:
                this.f49590b.w0();
                return;
            default:
                qq qqVar = this.f49590b;
                qqVar.getMessagesController().V2(0, qqVar.N, true);
                return;
        }
    }
}
