package org.telegram.messenger;
public final class ye implements Runnable {
    public final int f22264a;
    public final MessagesStorage f22265b;
    public final int f22266c;
    public final long d;
    public final long f22267e;

    public ye(int i10, long j10, long j11, MessagesStorage messagesStorage) {
        this.f22264a = 4;
        this.f22265b = messagesStorage;
        this.d = j10;
        this.f22266c = i10;
        this.f22267e = j11;
    }

    @Override
    public final void run() {
        switch (this.f22264a) {
            case 0:
                long j10 = this.d;
                long j11 = this.f22267e;
                this.f22265b.lambda$deleteAllReactionsFromChat$84(this.f22266c, j10, j11);
                return;
            case 1:
                long j12 = this.d;
                long j13 = this.f22267e;
                this.f22265b.lambda$updateMessageTopicId$214(this.f22266c, j12, j13);
                return;
            case 2:
                long j14 = this.f22267e;
                int i10 = this.f22266c;
                this.f22265b.lambda$markMessagePollVotesAsRead$263(this.d, j14, i10);
                return;
            case 3:
                long j15 = this.f22267e;
                int i11 = this.f22266c;
                this.f22265b.lambda$markMessageReactionsAsRead$262(this.d, j15, i11);
                return;
            case 4:
                int i12 = this.f22266c;
                long j16 = this.f22267e;
                this.f22265b.lambda$loadPendingTasks$13(this.d, i12, j16);
                return;
            case 5:
                long j17 = this.f22267e;
                int i13 = this.f22266c;
                this.f22265b.lambda$loadPendingTasks$32(this.d, j17, i13);
                return;
            case 6:
                long j18 = this.d;
                long j19 = this.f22267e;
                this.f22265b.lambda$markMentionMessageAsRead$112(this.f22266c, j18, j19);
                return;
            default:
                long j20 = this.f22267e;
                int i14 = this.f22266c;
                this.f22265b.lambda$resetMentionsCount$114(this.d, j20, i14);
                return;
        }
    }

    public ye(MessagesStorage messagesStorage, int i10, long j10, long j11, int i11) {
        this.f22264a = i11;
        this.f22265b = messagesStorage;
        this.f22266c = i10;
        this.d = j10;
        this.f22267e = j11;
    }

    public ye(MessagesStorage messagesStorage, long j10, long j11, int i10, int i11) {
        this.f22264a = i11;
        this.f22265b = messagesStorage;
        this.d = j10;
        this.f22267e = j11;
        this.f22266c = i10;
    }
}
