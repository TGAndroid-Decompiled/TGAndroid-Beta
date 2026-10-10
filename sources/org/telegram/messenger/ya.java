package org.telegram.messenger;
public final class ya implements Runnable {
    public final int f19899a;
    public final MessagesController f19900b;
    public final a0.i f19901c;

    public ya(MessagesController messagesController, a0.i iVar, int i10) {
        this.f19899a = i10;
        this.f19900b = messagesController;
        this.f19901c = iVar;
    }

    @Override
    public final void run() {
        switch (this.f19899a) {
            case 0:
                this.f19900b.lambda$processUpdateArray$409(this.f19901c);
                return;
            case 1:
                this.f19900b.lambda$processUpdateArray$410(this.f19901c);
                return;
            default:
                this.f19900b.lambda$getChannelDifference$339(this.f19901c);
                return;
        }
    }
}
