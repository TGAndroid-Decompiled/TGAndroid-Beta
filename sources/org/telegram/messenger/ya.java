package org.telegram.messenger;
public final class ya implements Runnable {
    public final int f19897a;
    public final q0.a f19898b;
    public final int f19899c;

    public ya(q0.a aVar, int i10, int i11) {
        this.f19897a = i11;
        this.f19898b = aVar;
        this.f19899c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19897a) {
            case 0:
                MessagesController.lambda$getNextReactionMentionInternal$1(this.f19898b, this.f19899c);
                return;
            default:
                MessagesController.lambda$getNextReactionMentionInternal$2(this.f19898b, this.f19899c);
                return;
        }
    }
}
