package org.telegram.messenger;
public final class ze implements Runnable {
    public final int f18294a = 2;
    public final MessagesStorage f18295b;
    public final boolean f18296c;
    public final int d;
    public final long e;

    public ze(MessagesStorage messagesStorage, int i10, boolean z10, long j3) {
        this.f18295b = messagesStorage;
        this.d = i10;
        this.f18296c = z10;
        this.e = j3;
    }

    @Override
    public final void run() {
        switch (this.f18294a) {
            case 0:
                this.f18295b.lambda$markMessagesAsDeleted$231(this.e, this.d, this.f18296c);
                return;
            case 1:
                this.f18295b.lambda$removeFromDownloadQueue$182(this.f18296c, this.d, this.e);
                return;
            default:
                this.f18295b.lambda$loadPendingTasks$31(this.d, this.f18296c, this.e);
                return;
        }
    }

    public ze(MessagesStorage messagesStorage, long j3, int i10, boolean z10) {
        this.f18295b = messagesStorage;
        this.e = j3;
        this.d = i10;
        this.f18296c = z10;
    }

    public ze(MessagesStorage messagesStorage, boolean z10, int i10, long j3) {
        this.f18295b = messagesStorage;
        this.f18296c = z10;
        this.d = i10;
        this.e = j3;
    }
}
