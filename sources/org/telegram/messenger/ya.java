package org.telegram.messenger;

public final class ya implements Runnable {

    public final int f22220a;

    public final q0.a f22221b;

    public final int f22222c;

    public ya(q0.a aVar, int i10, int i11) {
        this.f22220a = i11;
        this.f22221b = aVar;
        this.f22222c = i10;
    }

    @Override
    public final void run() {
        switch (this.f22220a) {
            case 0:
                MessagesController.lambda$getNextReactionMentionInternal$1(this.f22221b, this.f22222c);
                break;
            default:
                MessagesController.lambda$getNextReactionMentionInternal$2(this.f22221b, this.f22222c);
                break;
        }
    }
}
