package org.telegram.messenger;
public final class ya implements Runnable {
    public final int f18210a;
    public final q0.a f18211b;
    public final int f18212c;

    public ya(q0.a aVar, int i10, int i11) {
        this.f18210a = i11;
        this.f18211b = aVar;
        this.f18212c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18210a) {
            case 0:
                MessagesController.lambda$getNextReactionMentionInternal$1(this.f18211b, this.f18212c);
                return;
            default:
                MessagesController.lambda$getNextReactionMentionInternal$2(this.f18211b, this.f18212c);
                return;
        }
    }
}
