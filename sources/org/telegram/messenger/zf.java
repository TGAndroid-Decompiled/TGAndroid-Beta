package org.telegram.messenger;
public final class zf implements Runnable {
    public final int f21998a;
    public final MessagesStorage f21999b;
    public final long f22000c;
    public final long d;
    public final int e;

    public zf(int i10, long j10, long j11, MessagesStorage messagesStorage) {
        this.f21998a = 2;
        this.f21999b = messagesStorage;
        this.f22000c = j10;
        this.e = i10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f21998a) {
            case 0:
                long j10 = this.f22000c;
                long j11 = this.d;
                this.f21999b.lambda$updateMessageTopicId$217(this.e, j10, j11);
                return;
            case 1:
                long j12 = this.d;
                int i10 = this.e;
                this.f21999b.lambda$markMessagePollVotesAsRead$266(this.f22000c, j12, i10);
                return;
            case 2:
                int i11 = this.e;
                long j13 = this.d;
                this.f21999b.lambda$loadPendingTasks$13(this.f22000c, i11, j13);
                return;
            case 3:
                long j14 = this.d;
                int i12 = this.e;
                this.f21999b.lambda$loadPendingTasks$32(this.f22000c, j14, i12);
                return;
            case 4:
                long j15 = this.d;
                int i13 = this.e;
                this.f21999b.lambda$markMessageReactionsAsRead$265(this.f22000c, j15, i13);
                return;
            case 5:
                long j16 = this.f22000c;
                long j17 = this.d;
                this.f21999b.lambda$markMentionMessageAsRead$115(this.e, j16, j17);
                return;
            case 6:
                long j18 = this.d;
                int i14 = this.e;
                this.f21999b.lambda$resetMentionsCount$117(this.f22000c, j18, i14);
                return;
            default:
                long j19 = this.f22000c;
                long j20 = this.d;
                this.f21999b.lambda$deleteAllReactionsFromChat$87(this.e, j19, j20);
                return;
        }
    }

    public zf(MessagesStorage messagesStorage, int i10, long j10, long j11, int i11) {
        this.f21998a = i11;
        this.f21999b = messagesStorage;
        this.e = i10;
        this.f22000c = j10;
        this.d = j11;
    }

    public zf(MessagesStorage messagesStorage, long j10, long j11, int i10, int i11) {
        this.f21998a = i11;
        this.f21999b = messagesStorage;
        this.f22000c = j10;
        this.d = j11;
        this.e = i10;
    }
}
