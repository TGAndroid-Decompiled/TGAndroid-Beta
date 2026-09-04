package org.telegram.messenger;
public final class ya implements Runnable {
    public final int f19701a;
    public final q0.a f19702b;
    public final int f19703c;

    public ya(q0.a aVar, int i10, int i11) {
        this.f19701a = i11;
        this.f19702b = aVar;
        this.f19703c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19701a) {
            case 0:
                MessagesController.lambda$getNextReactionMentionInternal$1(this.f19702b, this.f19703c);
                return;
            default:
                MessagesController.lambda$getNextReactionMentionInternal$2(this.f19702b, this.f19703c);
                return;
        }
    }
}
