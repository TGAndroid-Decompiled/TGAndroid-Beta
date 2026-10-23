package org.telegram.messenger;
public final class zk implements Runnable {
    public final int f20272a;
    public final TranslateController f20273b;
    public final String f20274c;
    public final MessageObject d;
    public final long e;
    public final int f20275f;

    public zk(TranslateController translateController, String str, MessageObject messageObject, long j10, int i10, int i11) {
        this.f20272a = i11;
        this.f20273b = translateController;
        this.f20274c = str;
        this.d = messageObject;
        this.e = j10;
        this.f20275f = i10;
    }

    @Override
    public final void run() {
        switch (this.f20272a) {
            case 0:
                long j10 = this.e;
                int i10 = this.f20275f;
                this.f20273b.lambda$checkLanguage$16(this.f20274c, this.d, j10, i10);
                return;
            default:
                long j11 = this.e;
                int i11 = this.f20275f;
                this.f20273b.lambda$checkLanguage$12(this.f20274c, this.d, j11, i11);
                return;
        }
    }
}
