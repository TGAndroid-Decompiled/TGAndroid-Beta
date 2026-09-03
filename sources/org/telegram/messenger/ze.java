package org.telegram.messenger;
public final class ze implements Runnable {
    public final int f19119a;
    public final MessagesStorage f19120b;
    public final long f19121c;
    public final long d;

    public ze(int i10, long j10, long j11, MessagesStorage messagesStorage) {
        this.f19119a = i10;
        this.f19120b = messagesStorage;
        this.f19121c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f19119a) {
            case 0:
                this.f19120b.lambda$clearUserPhoto$93(this.f19121c, this.d);
                return;
            case 1:
                this.f19120b.lambda$saveChatInviter$132(this.f19121c, this.d);
                return;
            case 2:
                this.f19120b.lambda$setDialogFlags$37(this.f19121c, this.d);
                return;
            case 3:
                this.f19120b.lambda$removeTopic$57(this.f19121c, this.d);
                return;
            default:
                this.f19120b.lambda$deleteUserChatHistory$87(this.f19121c, this.d);
                return;
        }
    }
}
