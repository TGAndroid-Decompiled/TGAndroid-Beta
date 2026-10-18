package org.telegram.messenger;
public final class ya implements Runnable {
    public final int f20143a;
    public final MessagesController f20144b;
    public final a0.h f20145c;

    public ya(MessagesController messagesController, a0.h hVar, int i10) {
        this.f20143a = i10;
        this.f20144b = messagesController;
        this.f20145c = hVar;
    }

    @Override
    public final void run() {
        switch (this.f20143a) {
            case 0:
                this.f20144b.lambda$processUpdateArray$409(this.f20145c);
                return;
            case 1:
                this.f20144b.lambda$processUpdateArray$410(this.f20145c);
                return;
            default:
                this.f20144b.lambda$getChannelDifference$339(this.f20145c);
                return;
        }
    }
}
