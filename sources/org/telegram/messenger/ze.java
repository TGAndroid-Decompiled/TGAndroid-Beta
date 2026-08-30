package org.telegram.messenger;
public final class ze implements Runnable {
    public final int f19144a;
    public final MessagesStorage f19145b;
    public final long f19146c;
    public final long d;

    public ze(int i10, long j10, long j11, MessagesStorage messagesStorage) {
        this.f19144a = i10;
        this.f19145b = messagesStorage;
        this.f19146c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f19144a) {
            case 0:
                this.f19145b.lambda$clearUserPhoto$93(this.f19146c, this.d);
                return;
            case 1:
                this.f19145b.lambda$saveChatInviter$132(this.f19146c, this.d);
                return;
            case 2:
                this.f19145b.lambda$setDialogFlags$37(this.f19146c, this.d);
                return;
            case 3:
                this.f19145b.lambda$removeTopic$57(this.f19146c, this.d);
                return;
            default:
                this.f19145b.lambda$deleteUserChatHistory$87(this.f19146c, this.d);
                return;
        }
    }
}
