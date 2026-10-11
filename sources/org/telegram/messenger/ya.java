package org.telegram.messenger;
public final class ya implements Runnable {
    public final int f19890a;
    public final MessagesController f19891b;
    public final a0.i f19892c;

    public ya(MessagesController messagesController, a0.i iVar, int i10) {
        this.f19890a = i10;
        this.f19891b = messagesController;
        this.f19892c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f19890a) {
            case 0:
                this.f19891b.lambda$processUpdateArray$409(this.f19892c);
                return;
            case 1:
                this.f19891b.lambda$processUpdateArray$410(this.f19892c);
                return;
            default:
                this.f19891b.lambda$getChannelDifference$339(this.f19892c);
                return;
        }
    }
}
