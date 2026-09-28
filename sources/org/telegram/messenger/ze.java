package org.telegram.messenger;
public final class ze implements Runnable {
    public final int f18309a = 2;
    public final MessagesStorage f18310b;
    public final boolean f18311c;
    public final int d;
    public final long e;

    public ze(MessagesStorage messagesStorage, int i10, boolean z10, long j3) {
        this.f18310b = messagesStorage;
        this.d = i10;
        this.f18311c = z10;
        this.e = j3;
    }

    @Override
    public final void run() {
        switch (this.f18309a) {
            case 0:
                this.f18310b.lambda$markMessagesAsDeleted$231(this.e, this.d, this.f18311c);
                return;
            case 1:
                this.f18310b.lambda$removeFromDownloadQueue$182(this.f18311c, this.d, this.e);
                return;
            default:
                this.f18310b.lambda$loadPendingTasks$31(this.d, this.f18311c, this.e);
                return;
        }
    }

    public ze(MessagesStorage messagesStorage, long j3, int i10, boolean z10) {
        this.f18310b = messagesStorage;
        this.e = j3;
        this.d = i10;
        this.f18311c = z10;
    }

    public ze(MessagesStorage messagesStorage, boolean z10, int i10, long j3) {
        this.f18310b = messagesStorage;
        this.f18311c = z10;
        this.d = i10;
        this.e = j3;
    }
}
