package org.telegram.messenger;
public final class ze implements Runnable {
    public final int f20040a = 2;
    public final MessagesStorage f20041b;
    public final boolean f20042c;
    public final int d;
    public final long f20043e;

    public ze(MessagesStorage messagesStorage, int i10, boolean z10, long j3) {
        this.f20041b = messagesStorage;
        this.d = i10;
        this.f20042c = z10;
        this.f20043e = j3;
    }

    @Override
    public final void run() {
        switch (this.f20040a) {
            case 0:
                this.f20041b.lambda$markMessagesAsDeleted$231(this.f20043e, this.d, this.f20042c);
                return;
            case 1:
                this.f20041b.lambda$removeFromDownloadQueue$182(this.f20042c, this.d, this.f20043e);
                return;
            default:
                this.f20041b.lambda$loadPendingTasks$31(this.d, this.f20042c, this.f20043e);
                return;
        }
    }

    public ze(MessagesStorage messagesStorage, long j3, int i10, boolean z10) {
        this.f20041b = messagesStorage;
        this.f20043e = j3;
        this.d = i10;
        this.f20042c = z10;
    }

    public ze(MessagesStorage messagesStorage, boolean z10, int i10, long j3) {
        this.f20041b = messagesStorage;
        this.f20042c = z10;
        this.d = i10;
        this.f20043e = j3;
    }
}
