package org.telegram.messenger;
public final class ya implements Runnable {
    public final int f18187a;
    public final q0.a f18188b;
    public final int f18189c;

    public ya(q0.a aVar, int i10, int i11) {
        this.f18187a = i11;
        this.f18188b = aVar;
        this.f18189c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18187a) {
            case 0:
                MessagesController.lambda$getNextReactionMentionInternal$1(this.f18188b, this.f18189c);
                return;
            default:
                MessagesController.lambda$getNextReactionMentionInternal$2(this.f18188b, this.f18189c);
                return;
        }
    }
}
