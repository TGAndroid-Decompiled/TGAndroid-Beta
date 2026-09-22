package org.telegram.messenger;
public final class ya implements Runnable {
    public final int f17958a;
    public final q0.a f17959b;
    public final int f17960c;

    public ya(q0.a aVar, int i10, int i11) {
        this.f17958a = i11;
        this.f17959b = aVar;
        this.f17960c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17958a) {
            case 0:
                MessagesController.lambda$getNextReactionMentionInternal$1(this.f17959b, this.f17960c);
                return;
            default:
                MessagesController.lambda$getNextReactionMentionInternal$2(this.f17959b, this.f17960c);
                return;
        }
    }
}
