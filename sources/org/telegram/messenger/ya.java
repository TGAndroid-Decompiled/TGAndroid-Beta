package org.telegram.messenger;
public final class ya implements Runnable {
    public final int f17971a;
    public final q0.a f17972b;
    public final int f17973c;

    public ya(q0.a aVar, int i10, int i11) {
        this.f17971a = i11;
        this.f17972b = aVar;
        this.f17973c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17971a) {
            case 0:
                MessagesController.lambda$getNextReactionMentionInternal$1(this.f17972b, this.f17973c);
                return;
            default:
                MessagesController.lambda$getNextReactionMentionInternal$2(this.f17972b, this.f17973c);
                return;
        }
    }
}
