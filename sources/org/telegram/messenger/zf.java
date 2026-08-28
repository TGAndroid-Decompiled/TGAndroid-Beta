package org.telegram.messenger;
public final class zf implements Runnable {
    public final int f22341a;
    public final MessagesStorage f22342b;
    public final long f22343c;
    public final boolean d;

    public zf(MessagesStorage messagesStorage, int i9, boolean z10, long j10) {
        this.f22341a = i9;
        this.f22342b = messagesStorage;
        this.f22343c = j10;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f22341a) {
            case 0:
                this.f22342b.lambda$setDialogUnread$248(this.f22343c, this.d);
                return;
            default:
                this.f22342b.lambda$setDialogViewThreadAsMessages$249(this.f22343c, this.d);
                return;
        }
    }
}
