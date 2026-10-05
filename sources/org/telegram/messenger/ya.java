package org.telegram.messenger;
public final class ya implements Runnable {
    public final int f19902a;
    public final q0.a f19903b;
    public final int f19904c;

    public ya(q0.a aVar, int i10, int i11) {
        this.f19902a = i11;
        this.f19903b = aVar;
        this.f19904c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19902a) {
            case 0:
                MessagesController.lambda$getNextReactionMentionInternal$1(this.f19903b, this.f19904c);
                return;
            default:
                MessagesController.lambda$getNextReactionMentionInternal$2(this.f19903b, this.f19904c);
                return;
        }
    }
}
