package org.telegram.messenger;
public final class ze implements Runnable {
    public final int f20004a = 2;
    public final MessagesStorage f20005b;
    public final boolean f20006c;
    public final int d;
    public final long f20007e;

    public ze(MessagesStorage messagesStorage, int i10, boolean z10, long j3) {
        this.f20005b = messagesStorage;
        this.d = i10;
        this.f20006c = z10;
        this.f20007e = j3;
    }

    @Override
    public final void run() {
        switch (this.f20004a) {
            case 0:
                this.f20005b.lambda$markMessagesAsDeleted$231(this.f20007e, this.d, this.f20006c);
                return;
            case 1:
                this.f20005b.lambda$removeFromDownloadQueue$182(this.f20006c, this.d, this.f20007e);
                return;
            default:
                this.f20005b.lambda$loadPendingTasks$31(this.d, this.f20006c, this.f20007e);
                return;
        }
    }

    public ze(MessagesStorage messagesStorage, long j3, int i10, boolean z10) {
        this.f20005b = messagesStorage;
        this.f20007e = j3;
        this.d = i10;
        this.f20006c = z10;
    }

    public ze(MessagesStorage messagesStorage, boolean z10, int i10, long j3) {
        this.f20005b = messagesStorage;
        this.f20006c = z10;
        this.d = i10;
        this.f20007e = j3;
    }
}
