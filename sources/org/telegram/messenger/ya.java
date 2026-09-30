package org.telegram.messenger;
public final class ya implements Runnable {
    public final int f18226a;
    public final q0.a f18227b;
    public final int f18228c;

    public ya(q0.a aVar, int i10, int i11) {
        this.f18226a = i11;
        this.f18227b = aVar;
        this.f18228c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18226a) {
            case 0:
                MessagesController.lambda$getNextReactionMentionInternal$1(this.f18227b, this.f18228c);
                return;
            default:
                MessagesController.lambda$getNextReactionMentionInternal$2(this.f18227b, this.f18228c);
                return;
        }
    }
}
