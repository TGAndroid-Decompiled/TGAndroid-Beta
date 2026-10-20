package org.telegram.messenger;
public final class ze implements Runnable {
    public final int f20247a = 2;
    public final MessagesStorage f20248b;
    public final boolean f20249c;
    public final int d;
    public final long e;

    public ze(MessagesStorage messagesStorage, int i10, boolean z10, long j10) {
        this.f20248b = messagesStorage;
        this.d = i10;
        this.f20249c = z10;
        this.e = j10;
    }

    @Override
    public final void run() {
        switch (this.f20247a) {
            case 0:
                this.f20248b.lambda$markMessagesAsDeleted$231(this.e, this.d, this.f20249c);
                return;
            case 1:
                this.f20248b.lambda$removeFromDownloadQueue$182(this.f20249c, this.d, this.e);
                return;
            default:
                this.f20248b.lambda$loadPendingTasks$31(this.d, this.f20249c, this.e);
                return;
        }
    }

    public ze(MessagesStorage messagesStorage, long j10, int i10, boolean z10) {
        this.f20248b = messagesStorage;
        this.e = j10;
        this.d = i10;
        this.f20249c = z10;
    }

    public ze(MessagesStorage messagesStorage, boolean z10, int i10, long j10) {
        this.f20248b = messagesStorage;
        this.f20249c = z10;
        this.d = i10;
        this.e = j10;
    }
}
