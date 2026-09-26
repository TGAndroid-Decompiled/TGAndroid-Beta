package org.telegram.messenger;
public final class ya implements Runnable {
    public final int f18208a;
    public final q0.a f18209b;
    public final int f18210c;

    public ya(q0.a aVar, int i10, int i11) {
        this.f18208a = i11;
        this.f18209b = aVar;
        this.f18210c = i10;
    }

    @Override
    public final void run() {
        switch (this.f18208a) {
            case 0:
                MessagesController.lambda$getNextReactionMentionInternal$1(this.f18209b, this.f18210c);
                return;
            default:
                MessagesController.lambda$getNextReactionMentionInternal$2(this.f18209b, this.f18210c);
                return;
        }
    }
}
