package org.telegram.messenger;
public final class ya implements Runnable {
    public final int f18202a;
    public final q0.a f18203b;
    public final int f18204c;

    public ya(q0.a aVar, int i10, int i11) {
        this.f18202a = i11;
        this.f18203b = aVar;
        this.f18204c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18202a) {
            case 0:
                MessagesController.lambda$getNextReactionMentionInternal$1(this.f18203b, this.f18204c);
                return;
            default:
                MessagesController.lambda$getNextReactionMentionInternal$2(this.f18203b, this.f18204c);
                return;
        }
    }
}
