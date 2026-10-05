package org.telegram.messenger;
public final class zk implements Runnable {
    public final int f20038a;
    public final TranslateController f20039b;
    public final String f20040c;
    public final MessageObject d;
    public final long f20041e;
    public final int f20042f;

    public zk(TranslateController translateController, String str, MessageObject messageObject, long j3, int i10, int i11) {
        this.f20038a = i11;
        this.f20039b = translateController;
        this.f20040c = str;
        this.d = messageObject;
        this.f20041e = j3;
        this.f20042f = i10;
    }

    @Override
    public final void run() {
        switch (this.f20038a) {
            case 0:
                long j3 = this.f20041e;
                int i10 = this.f20042f;
                this.f20039b.lambda$checkLanguage$16(this.f20040c, this.d, j3, i10);
                return;
            default:
                long j10 = this.f20041e;
                int i11 = this.f20042f;
                this.f20039b.lambda$checkLanguage$12(this.f20040c, this.d, j10, i11);
                return;
        }
    }
}
