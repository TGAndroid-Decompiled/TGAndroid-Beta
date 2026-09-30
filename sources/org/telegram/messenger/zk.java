package org.telegram.messenger;
public final class zk implements Runnable {
    public final int f18344a;
    public final TranslateController f18345b;
    public final String f18346c;
    public final MessageObject d;
    public final long e;
    public final int f18347f;

    public zk(TranslateController translateController, String str, MessageObject messageObject, long j3, int i10, int i11) {
        this.f18344a = i11;
        this.f18345b = translateController;
        this.f18346c = str;
        this.d = messageObject;
        this.e = j3;
        this.f18347f = i10;
    }

    @Override
    public final void run() {
        switch (this.f18344a) {
            case 0:
                long j3 = this.e;
                int i10 = this.f18347f;
                this.f18345b.lambda$checkLanguage$16(this.f18346c, this.d, j3, i10);
                return;
            default:
                long j10 = this.e;
                int i11 = this.f18347f;
                this.f18345b.lambda$checkLanguage$12(this.f18346c, this.d, j10, i11);
                return;
        }
    }
}
