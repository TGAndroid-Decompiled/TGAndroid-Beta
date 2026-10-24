package org.telegram.messenger;
public final class zk implements Runnable {
    public final int f20336a;
    public final TranslateController f20337b;
    public final String f20338c;
    public final MessageObject d;
    public final long e;
    public final int f20339f;

    public zk(TranslateController translateController, String str, MessageObject messageObject, long j10, int i10, int i11) {
        this.f20336a = i11;
        this.f20337b = translateController;
        this.f20338c = str;
        this.d = messageObject;
        this.e = j10;
        this.f20339f = i10;
    }

    @Override
    public final void run() {
        switch (this.f20336a) {
            case 0:
                long j10 = this.e;
                int i10 = this.f20339f;
                this.f20337b.lambda$checkLanguage$16(this.f20338c, this.d, j10, i10);
                return;
            default:
                long j11 = this.e;
                int i11 = this.f20339f;
                this.f20337b.lambda$checkLanguage$12(this.f20338c, this.d, j11, i11);
                return;
        }
    }
}
