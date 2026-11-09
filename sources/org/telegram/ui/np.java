package org.telegram.ui;
public final class np implements Runnable {
    public final int f48217a;
    public final qq f48218b;

    public np(qq qqVar, int i7) {
        this.f48217a = i7;
        this.f48218b = qqVar;
    }

    @Override
    public final void run() {
        switch (this.f48217a) {
            case 0:
                this.f48218b.w0();
                return;
            default:
                qq qqVar = this.f48218b;
                qqVar.getMessagesController().V2(0, qqVar.M, true);
                return;
        }
    }
}
