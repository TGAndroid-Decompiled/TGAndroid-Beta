package org.telegram.messenger;
public final class ze implements Runnable {
    public final int f19843a = 2;
    public final MessagesStorage f19844b;
    public final boolean f19845c;
    public final int d;
    public final long f19846e;

    public ze(MessagesStorage messagesStorage, int i10, boolean z10, long j3) {
        this.f19844b = messagesStorage;
        this.d = i10;
        this.f19845c = z10;
        this.f19846e = j3;
    }

    @Override
    public final void run() {
        switch (this.f19843a) {
            case 0:
                this.f19844b.lambda$markMessagesAsDeleted$231(this.f19846e, this.d, this.f19845c);
                return;
            case 1:
                this.f19844b.lambda$removeFromDownloadQueue$182(this.f19845c, this.d, this.f19846e);
                return;
            default:
                this.f19844b.lambda$loadPendingTasks$31(this.d, this.f19845c, this.f19846e);
                return;
        }
    }

    public ze(MessagesStorage messagesStorage, long j3, int i10, boolean z10) {
        this.f19844b = messagesStorage;
        this.f19846e = j3;
        this.d = i10;
        this.f19845c = z10;
    }

    public ze(MessagesStorage messagesStorage, boolean z10, int i10, long j3) {
        this.f19844b = messagesStorage;
        this.f19845c = z10;
        this.d = i10;
        this.f19846e = j3;
    }
}
