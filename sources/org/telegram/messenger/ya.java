package org.telegram.messenger;
public final class ya implements Runnable {
    public final int f19926a;
    public final MessagesController f19927b;
    public final a0.i f19928c;

    public ya(MessagesController messagesController, a0.i iVar, int i10) {
        this.f19926a = i10;
        this.f19927b = messagesController;
        this.f19928c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f19926a) {
            case 0:
                this.f19927b.lambda$processUpdateArray$409(this.f19928c);
                return;
            case 1:
                this.f19927b.lambda$processUpdateArray$410(this.f19928c);
                return;
            default:
                this.f19927b.lambda$getChannelDifference$339(this.f19928c);
                return;
        }
    }
}
