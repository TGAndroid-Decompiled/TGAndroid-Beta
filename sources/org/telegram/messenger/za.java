package org.telegram.messenger;

import zf.r;
public final class za implements Runnable {
    public final int f20222a;
    public final MessagesController f20223b;
    public final r f20224c;

    public za(MessagesController messagesController, r rVar, int i10) {
        this.f20222a = i10;
        this.f20223b = messagesController;
        this.f20224c = rVar;
    }

    @Override
    public final void run() {
        switch (this.f20222a) {
            case 0:
                this.f20223b.lambda$processUpdateArray$402(this.f20224c);
                return;
            case 1:
                this.f20223b.lambda$processUpdateArray$405(this.f20224c);
                return;
            default:
                this.f20223b.lambda$processUpdateArray$407(this.f20224c);
                return;
        }
    }
}
