package org.telegram.messenger;
public final class ye implements Runnable {
    public final int f20160a = 2;
    public final MessagesStorage f20161b;
    public final boolean f20162c;
    public final int d;
    public final long e;

    public ye(MessagesStorage messagesStorage, int i10, boolean z10, long j10) {
        this.f20161b = messagesStorage;
        this.d = i10;
        this.f20162c = z10;
        this.e = j10;
    }

    @Override
    public final void run() {
        switch (this.f20160a) {
            case 0:
                this.f20161b.lambda$markMessagesAsDeleted$231(this.e, this.d, this.f20162c);
                return;
            case 1:
                this.f20161b.lambda$removeFromDownloadQueue$182(this.f20162c, this.d, this.e);
                return;
            default:
                this.f20161b.lambda$loadPendingTasks$31(this.d, this.f20162c, this.e);
                return;
        }
    }

    public ye(MessagesStorage messagesStorage, long j10, int i10, boolean z10) {
        this.f20161b = messagesStorage;
        this.e = j10;
        this.d = i10;
        this.f20162c = z10;
    }

    public ye(MessagesStorage messagesStorage, boolean z10, int i10, long j10) {
        this.f20161b = messagesStorage;
        this.f20162c = z10;
        this.d = i10;
        this.e = j10;
    }
}
