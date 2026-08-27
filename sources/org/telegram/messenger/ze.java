package org.telegram.messenger;

public final class ze implements Runnable {

    public final int f22345a = 2;

    public final MessagesStorage f22346b;

    public final boolean f22347c;
    public final int d;

    public final long f22348e;

    public ze(MessagesStorage messagesStorage, int i10, boolean z10, long j10) {
        this.f22346b = messagesStorage;
        this.d = i10;
        this.f22347c = z10;
        this.f22348e = j10;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.f22345a) {
            case 0:
                this.f22346b.lambda$markMessagesAsDeleted$231(this.f22348e, this.d, this.f22347c);
                break;
            case 1:
                this.f22346b.lambda$removeFromDownloadQueue$182(this.f22347c, this.d, this.f22348e);
                break;
            default:
                this.f22346b.lambda$loadPendingTasks$31(this.d, this.f22347c, this.f22348e);
                break;
        }
    }

    public ze(MessagesStorage messagesStorage, long j10, int i10, boolean z10) {
        this.f22346b = messagesStorage;
        this.f22348e = j10;
        this.d = i10;
        this.f22347c = z10;
    }

    public ze(MessagesStorage messagesStorage, boolean z10, int i10, long j10) {
        this.f22346b = messagesStorage;
        this.f22347c = z10;
        this.d = i10;
        this.f22348e = j10;
    }
}
