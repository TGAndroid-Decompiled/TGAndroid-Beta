package org.telegram.messenger;
public final class ze implements Runnable {
    public final int f20802a;
    public final MessagesStorage f20803b;
    public final long f20804c;
    public final long d;

    public ze(int i10, long j10, long j11, MessagesStorage messagesStorage) {
        this.f20802a = i10;
        this.f20803b = messagesStorage;
        this.f20804c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f20802a) {
            case 0:
                this.f20803b.lambda$clearUserPhoto$93(this.f20804c, this.d);
                return;
            case 1:
                this.f20803b.lambda$saveChatInviter$132(this.f20804c, this.d);
                return;
            case 2:
                this.f20803b.lambda$setDialogFlags$37(this.f20804c, this.d);
                return;
            case 3:
                this.f20803b.lambda$removeTopic$57(this.f20804c, this.d);
                return;
            default:
                this.f20803b.lambda$deleteUserChatHistory$87(this.f20804c, this.d);
                return;
        }
    }
}
