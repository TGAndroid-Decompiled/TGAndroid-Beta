package org.telegram.messenger;
public final class ya implements Runnable {
    public final int f17953a;
    public final q0.a f17954b;
    public final int f17955c;

    public ya(q0.a aVar, int i10, int i11) {
        this.f17953a = i11;
        this.f17954b = aVar;
        this.f17955c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17953a) {
            case 0:
                MessagesController.lambda$getNextReactionMentionInternal$1(this.f17954b, this.f17955c);
                return;
            default:
                MessagesController.lambda$getNextReactionMentionInternal$2(this.f17954b, this.f17955c);
                return;
        }
    }
}
