package org.telegram.messenger;
public final class ya implements Runnable {
    public final int f18139a;
    public final q0.a f18140b;
    public final int f18141c;

    public ya(q0.a aVar, int i10, int i11) {
        this.f18139a = i11;
        this.f18140b = aVar;
        this.f18141c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18139a) {
            case 0:
                MessagesController.lambda$getNextReactionMentionInternal$1(this.f18140b, this.f18141c);
                return;
            default:
                MessagesController.lambda$getNextReactionMentionInternal$2(this.f18140b, this.f18141c);
                return;
        }
    }
}
