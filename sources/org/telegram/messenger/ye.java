package org.telegram.messenger;
public final class ye implements Runnable {
    public final int f20157a = 2;
    public final MessagesStorage f20158b;
    public final boolean f20159c;
    public final int d;
    public final long e;

    public ye(MessagesStorage messagesStorage, int i10, boolean z10, long j10) {
        this.f20158b = messagesStorage;
        this.d = i10;
        this.f20159c = z10;
        this.e = j10;
    }

    @Override
    public final void run() {
        switch (this.f20157a) {
            case 0:
                this.f20158b.lambda$markMessagesAsDeleted$231(this.e, this.d, this.f20159c);
                return;
            case 1:
                this.f20158b.lambda$removeFromDownloadQueue$182(this.f20159c, this.d, this.e);
                return;
            default:
                this.f20158b.lambda$loadPendingTasks$31(this.d, this.f20159c, this.e);
                return;
        }
    }

    public ye(MessagesStorage messagesStorage, long j10, int i10, boolean z10) {
        this.f20158b = messagesStorage;
        this.e = j10;
        this.d = i10;
        this.f20159c = z10;
    }

    public ye(MessagesStorage messagesStorage, boolean z10, int i10, long j10) {
        this.f20158b = messagesStorage;
        this.f20159c = z10;
        this.d = i10;
        this.e = j10;
    }
}
