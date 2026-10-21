package org.telegram.messenger;
public final class yk implements Runnable {
    public final int f20189a;
    public final TranslateController f20190b;
    public final String f20191c;
    public final MessageObject d;
    public final long e;
    public final int f20192f;

    public yk(TranslateController translateController, String str, MessageObject messageObject, long j10, int i10, int i11) {
        this.f20189a = i11;
        this.f20190b = translateController;
        this.f20191c = str;
        this.d = messageObject;
        this.e = j10;
        this.f20192f = i10;
    }

    @Override
    public final void run() {
        switch (this.f20189a) {
            case 0:
                long j10 = this.e;
                int i10 = this.f20192f;
                this.f20190b.lambda$checkLanguage$16(this.f20191c, this.d, j10, i10);
                return;
            default:
                long j11 = this.e;
                int i11 = this.f20192f;
                this.f20190b.lambda$checkLanguage$12(this.f20191c, this.d, j11, i11);
                return;
        }
    }
}
