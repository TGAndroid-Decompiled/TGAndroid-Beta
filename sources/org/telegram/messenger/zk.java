package org.telegram.messenger;
public final class zk implements Runnable {
    public final int f20029a;
    public final TranslateController f20030b;
    public final String f20031c;
    public final MessageObject d;
    public final long f20032e;
    public final int f20033f;

    public zk(TranslateController translateController, String str, MessageObject messageObject, long j3, int i10, int i11) {
        this.f20029a = i11;
        this.f20030b = translateController;
        this.f20031c = str;
        this.d = messageObject;
        this.f20032e = j3;
        this.f20033f = i10;
    }

    @Override
    public final void run() {
        switch (this.f20029a) {
            case 0:
                long j3 = this.f20032e;
                int i10 = this.f20033f;
                this.f20030b.lambda$checkLanguage$16(this.f20031c, this.d, j3, i10);
                return;
            default:
                long j10 = this.f20032e;
                int i11 = this.f20033f;
                this.f20030b.lambda$checkLanguage$12(this.f20031c, this.d, j10, i11);
                return;
        }
    }
}
