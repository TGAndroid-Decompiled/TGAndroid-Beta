package org.telegram.messenger;
public final class ya implements Runnable {
    public final int f18211a;
    public final q0.a f18212b;
    public final int f18213c;

    public ya(q0.a aVar, int i10, int i11) {
        this.f18211a = i11;
        this.f18212b = aVar;
        this.f18213c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18211a) {
            case 0:
                MessagesController.lambda$getNextReactionMentionInternal$1(this.f18212b, this.f18213c);
                return;
            default:
                MessagesController.lambda$getNextReactionMentionInternal$2(this.f18212b, this.f18213c);
                return;
        }
    }
}
