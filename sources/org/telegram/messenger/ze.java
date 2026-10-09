package org.telegram.messenger;
public final class ze implements Runnable {
    public final int f20003a = 2;
    public final MessagesStorage f20004b;
    public final boolean f20005c;
    public final int d;
    public final long f20006e;

    public ze(MessagesStorage messagesStorage, int i10, boolean z10, long j3) {
        this.f20004b = messagesStorage;
        this.d = i10;
        this.f20005c = z10;
        this.f20006e = j3;
    }

    @Override
    public final void run() {
        switch (this.f20003a) {
            case 0:
                this.f20004b.lambda$markMessagesAsDeleted$231(this.f20006e, this.d, this.f20005c);
                return;
            case 1:
                this.f20004b.lambda$removeFromDownloadQueue$182(this.f20005c, this.d, this.f20006e);
                return;
            default:
                this.f20004b.lambda$loadPendingTasks$31(this.d, this.f20005c, this.f20006e);
                return;
        }
    }

    public ze(MessagesStorage messagesStorage, long j3, int i10, boolean z10) {
        this.f20004b = messagesStorage;
        this.f20006e = j3;
        this.d = i10;
        this.f20005c = z10;
    }

    public ze(MessagesStorage messagesStorage, boolean z10, int i10, long j3) {
        this.f20004b = messagesStorage;
        this.f20005c = z10;
        this.d = i10;
        this.f20006e = j3;
    }
}
