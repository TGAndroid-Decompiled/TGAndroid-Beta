package org.telegram.messenger;

import zf.r;
public final class za implements Runnable {
    public final int f20228a;
    public final MessagesController f20229b;
    public final r f20230c;

    public za(MessagesController messagesController, r rVar, int i10) {
        this.f20228a = i10;
        this.f20229b = messagesController;
        this.f20230c = rVar;
    }

    @Override
    public final void run() {
        switch (this.f20228a) {
            case 0:
                this.f20229b.lambda$processUpdateArray$402(this.f20230c);
                return;
            case 1:
                this.f20229b.lambda$processUpdateArray$405(this.f20230c);
                return;
            default:
                this.f20229b.lambda$processUpdateArray$407(this.f20230c);
                return;
        }
    }
}
