package org.telegram.messenger;
public final class zk implements Runnable {
    public final int f20033a;
    public final TranslateController f20034b;
    public final String f20035c;
    public final MessageObject d;
    public final long f20036e;
    public final int f20037f;

    public zk(TranslateController translateController, String str, MessageObject messageObject, long j3, int i10, int i11) {
        this.f20033a = i11;
        this.f20034b = translateController;
        this.f20035c = str;
        this.d = messageObject;
        this.f20036e = j3;
        this.f20037f = i10;
    }

    @Override
    public final void run() {
        switch (this.f20033a) {
            case 0:
                long j3 = this.f20036e;
                int i10 = this.f20037f;
                this.f20034b.lambda$checkLanguage$16(this.f20035c, this.d, j3, i10);
                return;
            default:
                long j10 = this.f20036e;
                int i11 = this.f20037f;
                this.f20034b.lambda$checkLanguage$12(this.f20035c, this.d, j10, i11);
                return;
        }
    }
}
