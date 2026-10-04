package org.telegram.messenger;
public final class ze implements Runnable {
    public final int f20016a = 2;
    public final MessagesStorage f20017b;
    public final boolean f20018c;
    public final int d;
    public final long f20019e;

    public ze(MessagesStorage messagesStorage, int i10, boolean z10, long j3) {
        this.f20017b = messagesStorage;
        this.d = i10;
        this.f20018c = z10;
        this.f20019e = j3;
    }

    @Override
    public final void run() {
        switch (this.f20016a) {
            case 0:
                this.f20017b.lambda$markMessagesAsDeleted$231(this.f20019e, this.d, this.f20018c);
                return;
            case 1:
                this.f20017b.lambda$removeFromDownloadQueue$182(this.f20018c, this.d, this.f20019e);
                return;
            default:
                this.f20017b.lambda$loadPendingTasks$31(this.d, this.f20018c, this.f20019e);
                return;
        }
    }

    public ze(MessagesStorage messagesStorage, long j3, int i10, boolean z10) {
        this.f20017b = messagesStorage;
        this.f20019e = j3;
        this.d = i10;
        this.f20018c = z10;
    }

    public ze(MessagesStorage messagesStorage, boolean z10, int i10, long j3) {
        this.f20017b = messagesStorage;
        this.f20018c = z10;
        this.d = i10;
        this.f20019e = j3;
    }
}
