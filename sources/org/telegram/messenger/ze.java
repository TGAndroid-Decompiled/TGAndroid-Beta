package org.telegram.messenger;
public final class ze implements Runnable {
    public final int f20800a;
    public final MessagesStorage f20801b;
    public final long f20802c;
    public final long d;

    public ze(int i10, long j10, long j11, MessagesStorage messagesStorage) {
        this.f20800a = i10;
        this.f20801b = messagesStorage;
        this.f20802c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f20800a) {
            case 0:
                this.f20801b.lambda$clearUserPhoto$93(this.f20802c, this.d);
                return;
            case 1:
                this.f20801b.lambda$saveChatInviter$132(this.f20802c, this.d);
                return;
            case 2:
                this.f20801b.lambda$setDialogFlags$37(this.f20802c, this.d);
                return;
            case 3:
                this.f20801b.lambda$removeTopic$57(this.f20802c, this.d);
                return;
            default:
                this.f20801b.lambda$deleteUserChatHistory$87(this.f20802c, this.d);
                return;
        }
    }
}
