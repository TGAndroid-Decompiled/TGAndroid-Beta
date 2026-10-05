package org.telegram.messenger;
public final class ze implements Runnable {
    public final int f20021a = 2;
    public final MessagesStorage f20022b;
    public final boolean f20023c;
    public final int d;
    public final long f20024e;

    public ze(MessagesStorage messagesStorage, int i10, boolean z10, long j3) {
        this.f20022b = messagesStorage;
        this.d = i10;
        this.f20023c = z10;
        this.f20024e = j3;
    }

    @Override
    public final void run() {
        switch (this.f20021a) {
            case 0:
                this.f20022b.lambda$markMessagesAsDeleted$231(this.f20024e, this.d, this.f20023c);
                return;
            case 1:
                this.f20022b.lambda$removeFromDownloadQueue$182(this.f20023c, this.d, this.f20024e);
                return;
            default:
                this.f20022b.lambda$loadPendingTasks$31(this.d, this.f20023c, this.f20024e);
                return;
        }
    }

    public ze(MessagesStorage messagesStorage, long j3, int i10, boolean z10) {
        this.f20022b = messagesStorage;
        this.f20024e = j3;
        this.d = i10;
        this.f20023c = z10;
    }

    public ze(MessagesStorage messagesStorage, boolean z10, int i10, long j3) {
        this.f20022b = messagesStorage;
        this.f20023c = z10;
        this.d = i10;
        this.f20024e = j3;
    }
}
