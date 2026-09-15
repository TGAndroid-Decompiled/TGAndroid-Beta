package org.telegram.messenger;
public final class ya implements Runnable {
    public final int f17962a;
    public final q0.a f17963b;
    public final int f17964c;

    public ya(q0.a aVar, int i10, int i11) {
        this.f17962a = i11;
        this.f17963b = aVar;
        this.f17964c = i10;
    }

    @Override
    public final void run() {
        switch (this.f17962a) {
            case 0:
                MessagesController.lambda$getNextReactionMentionInternal$1(this.f17963b, this.f17964c);
                return;
            default:
                MessagesController.lambda$getNextReactionMentionInternal$2(this.f17963b, this.f17964c);
                return;
        }
    }
}
