package org.telegram.messenger;
public final class ya implements Runnable {
    public final int f18209a;
    public final q0.a f18210b;
    public final int f18211c;

    public ya(q0.a aVar, int i10, int i11) {
        this.f18209a = i11;
        this.f18210b = aVar;
        this.f18211c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18209a) {
            case 0:
                MessagesController.lambda$getNextReactionMentionInternal$1(this.f18210b, this.f18211c);
                return;
            default:
                MessagesController.lambda$getNextReactionMentionInternal$2(this.f18210b, this.f18211c);
                return;
        }
    }
}
