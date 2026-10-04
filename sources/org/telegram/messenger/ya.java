package org.telegram.messenger;
public final class ya implements Runnable {
    public final int f19896a;
    public final q0.a f19897b;
    public final int f19898c;

    public ya(q0.a aVar, int i10, int i11) {
        this.f19896a = i11;
        this.f19897b = aVar;
        this.f19898c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19896a) {
            case 0:
                MessagesController.lambda$getNextReactionMentionInternal$1(this.f19897b, this.f19898c);
                return;
            default:
                MessagesController.lambda$getNextReactionMentionInternal$2(this.f19897b, this.f19898c);
                return;
        }
    }
}
