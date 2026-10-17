package org.telegram.messenger;

import zf.r;
public final class za implements Runnable {
    public final int f20221a;
    public final MessagesController f20222b;
    public final r f20223c;

    public za(MessagesController messagesController, r rVar, int i10) {
        this.f20221a = i10;
        this.f20222b = messagesController;
        this.f20223c = rVar;
    }

    @Override
    public final void run() {
        switch (this.f20221a) {
            case 0:
                this.f20222b.lambda$processUpdateArray$402(this.f20223c);
                return;
            case 1:
                this.f20222b.lambda$processUpdateArray$405(this.f20223c);
                return;
            default:
                this.f20222b.lambda$processUpdateArray$407(this.f20223c);
                return;
        }
    }
}
