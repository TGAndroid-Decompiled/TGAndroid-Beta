package org.telegram.messenger;
public final class zk implements Runnable {
    public final int f18313a;
    public final TranslateController f18314b;
    public final String f18315c;
    public final MessageObject d;
    public final long e;
    public final int f18316f;

    public zk(TranslateController translateController, String str, MessageObject messageObject, long j3, int i10, int i11) {
        this.f18313a = i11;
        this.f18314b = translateController;
        this.f18315c = str;
        this.d = messageObject;
        this.e = j3;
        this.f18316f = i10;
    }

    @Override
    public final void run() {
        switch (this.f18313a) {
            case 0:
                long j3 = this.e;
                int i10 = this.f18316f;
                this.f18314b.lambda$checkLanguage$16(this.f18315c, this.d, j3, i10);
                return;
            default:
                long j10 = this.e;
                int i11 = this.f18316f;
                this.f18314b.lambda$checkLanguage$12(this.f18315c, this.d, j10, i11);
                return;
        }
    }
}
