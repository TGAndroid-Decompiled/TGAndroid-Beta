package org.telegram.messenger;
public final class ze implements Runnable {
    public final int f20007a = 2;
    public final MessagesStorage f20008b;
    public final boolean f20009c;
    public final int d;
    public final long f20010e;

    public ze(MessagesStorage messagesStorage, int i10, boolean z10, long j3) {
        this.f20008b = messagesStorage;
        this.d = i10;
        this.f20009c = z10;
        this.f20010e = j3;
    }

    @Override
    public final void run() {
        switch (this.f20007a) {
            case 0:
                this.f20008b.lambda$markMessagesAsDeleted$231(this.f20010e, this.d, this.f20009c);
                return;
            case 1:
                this.f20008b.lambda$removeFromDownloadQueue$182(this.f20009c, this.d, this.f20010e);
                return;
            default:
                this.f20008b.lambda$loadPendingTasks$31(this.d, this.f20009c, this.f20010e);
                return;
        }
    }

    public ze(MessagesStorage messagesStorage, long j3, int i10, boolean z10) {
        this.f20008b = messagesStorage;
        this.f20010e = j3;
        this.d = i10;
        this.f20009c = z10;
    }

    public ze(MessagesStorage messagesStorage, boolean z10, int i10, long j3) {
        this.f20008b = messagesStorage;
        this.f20009c = z10;
        this.d = i10;
        this.f20010e = j3;
    }
}
