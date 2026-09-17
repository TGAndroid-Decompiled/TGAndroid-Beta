package org.telegram.messenger;
public final class ze implements Runnable {
    public final int f19870a = 2;
    public final MessagesStorage f19871b;
    public final boolean f19872c;
    public final int d;
    public final long f19873e;

    public ze(MessagesStorage messagesStorage, int i10, boolean z10, long j3) {
        this.f19871b = messagesStorage;
        this.d = i10;
        this.f19872c = z10;
        this.f19873e = j3;
    }

    @Override
    public final void run() {
        switch (this.f19870a) {
            case 0:
                this.f19871b.lambda$markMessagesAsDeleted$231(this.f19873e, this.d, this.f19872c);
                return;
            case 1:
                this.f19871b.lambda$removeFromDownloadQueue$182(this.f19872c, this.d, this.f19873e);
                return;
            default:
                this.f19871b.lambda$loadPendingTasks$31(this.d, this.f19872c, this.f19873e);
                return;
        }
    }

    public ze(MessagesStorage messagesStorage, long j3, int i10, boolean z10) {
        this.f19871b = messagesStorage;
        this.f19873e = j3;
        this.d = i10;
        this.f19872c = z10;
    }

    public ze(MessagesStorage messagesStorage, boolean z10, int i10, long j3) {
        this.f19871b = messagesStorage;
        this.f19872c = z10;
        this.d = i10;
        this.f19873e = j3;
    }
}
