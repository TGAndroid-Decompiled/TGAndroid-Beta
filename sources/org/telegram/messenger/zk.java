package org.telegram.messenger;
public final class zk implements Runnable {
    public final int f18075a;
    public final TranslateController f18076b;
    public final String f18077c;
    public final MessageObject d;
    public final long e;
    public final int f18078f;

    public zk(TranslateController translateController, String str, MessageObject messageObject, long j3, int i10, int i11) {
        this.f18075a = i11;
        this.f18076b = translateController;
        this.f18077c = str;
        this.d = messageObject;
        this.e = j3;
        this.f18078f = i10;
    }

    @Override
    public final void run() {
        switch (this.f18075a) {
            case 0:
                long j3 = this.e;
                int i10 = this.f18078f;
                this.f18076b.lambda$checkLanguage$16(this.f18077c, this.d, j3, i10);
                return;
            default:
                long j10 = this.e;
                int i11 = this.f18078f;
                this.f18076b.lambda$checkLanguage$12(this.f18077c, this.d, j10, i11);
                return;
        }
    }
}
