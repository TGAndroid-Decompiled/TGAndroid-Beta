package org.telegram.messenger;
public final class ya implements Runnable {
    public final int f19728a;
    public final q0.a f19729b;
    public final int f19730c;

    public ya(q0.a aVar, int i10, int i11) {
        this.f19728a = i11;
        this.f19729b = aVar;
        this.f19730c = i10;
    }

    @Override
    public final void run() {
        switch (this.f19728a) {
            case 0:
                MessagesController.lambda$getNextReactionMentionInternal$1(this.f19729b, this.f19730c);
                return;
            default:
                MessagesController.lambda$getNextReactionMentionInternal$2(this.f19729b, this.f19730c);
                return;
        }
    }
}
