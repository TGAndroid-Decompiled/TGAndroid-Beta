package org.telegram.messenger;
public final class ze implements Runnable {
    public final int f20006a = 2;
    public final MessagesStorage f20007b;
    public final boolean f20008c;
    public final int d;
    public final long f20009e;

    public ze(MessagesStorage messagesStorage, int i10, boolean z10, long j3) {
        this.f20007b = messagesStorage;
        this.d = i10;
        this.f20008c = z10;
        this.f20009e = j3;
    }

    @Override
    public final void run() {
        switch (this.f20006a) {
            case 0:
                this.f20007b.lambda$markMessagesAsDeleted$231(this.f20009e, this.d, this.f20008c);
                return;
            case 1:
                this.f20007b.lambda$removeFromDownloadQueue$182(this.f20008c, this.d, this.f20009e);
                return;
            default:
                this.f20007b.lambda$loadPendingTasks$31(this.d, this.f20008c, this.f20009e);
                return;
        }
    }

    public ze(MessagesStorage messagesStorage, long j3, int i10, boolean z10) {
        this.f20007b = messagesStorage;
        this.f20009e = j3;
        this.d = i10;
        this.f20008c = z10;
    }

    public ze(MessagesStorage messagesStorage, boolean z10, int i10, long j3) {
        this.f20007b = messagesStorage;
        this.f20008c = z10;
        this.d = i10;
        this.f20009e = j3;
    }
}
