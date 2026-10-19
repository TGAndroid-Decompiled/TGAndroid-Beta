package org.telegram.messenger;
public final class ya implements Runnable {
    public final int f20146a;
    public final MessagesController f20147b;
    public final a0.h f20148c;

    public ya(MessagesController messagesController, a0.h hVar, int i10) {
        this.f20146a = i10;
        this.f20147b = messagesController;
        this.f20148c = hVar;
    }

    @Override
    public final void run() {
        switch (this.f20146a) {
            case 0:
                this.f20147b.lambda$processUpdateArray$409(this.f20148c);
                return;
            case 1:
                this.f20147b.lambda$processUpdateArray$410(this.f20148c);
                return;
            default:
                this.f20147b.lambda$getChannelDifference$339(this.f20148c);
                return;
        }
    }
}
