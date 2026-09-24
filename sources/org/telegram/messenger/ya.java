package org.telegram.messenger;
public final class ya implements Runnable {
    public final int f18194a;
    public final q0.a f18195b;
    public final int f18196c;

    public ya(q0.a aVar, int i10, int i11) {
        this.f18194a = i11;
        this.f18195b = aVar;
        this.f18196c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18194a) {
            case 0:
                MessagesController.lambda$getNextReactionMentionInternal$1(this.f18195b, this.f18196c);
                return;
            default:
                MessagesController.lambda$getNextReactionMentionInternal$2(this.f18195b, this.f18196c);
                return;
        }
    }
}
