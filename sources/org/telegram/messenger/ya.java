package org.telegram.messenger;
public final class ya implements Runnable {
    public final int f19895a;
    public final q0.a f19896b;
    public final int f19897c;

    public ya(q0.a aVar, int i10, int i11) {
        this.f19895a = i11;
        this.f19896b = aVar;
        this.f19897c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19895a) {
            case 0:
                MessagesController.lambda$getNextReactionMentionInternal$1(this.f19896b, this.f19897c);
                return;
            default:
                MessagesController.lambda$getNextReactionMentionInternal$2(this.f19896b, this.f19897c);
                return;
        }
    }
}
