package org.telegram.messenger;
public final class ya implements Runnable {
    public final int f19895a;
    public final MessagesController f19896b;
    public final a0.i f19897c;

    public ya(MessagesController messagesController, a0.i iVar, int i10) {
        this.f19895a = i10;
        this.f19896b = messagesController;
        this.f19897c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f19895a) {
            case 0:
                this.f19896b.lambda$processUpdateArray$409(this.f19897c);
                return;
            case 1:
                this.f19896b.lambda$processUpdateArray$410(this.f19897c);
                return;
            default:
                this.f19896b.lambda$getChannelDifference$339(this.f19897c);
                return;
        }
    }
}
