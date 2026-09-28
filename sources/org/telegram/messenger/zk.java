package org.telegram.messenger;
public final class zk implements Runnable {
    public final int f18328a;
    public final TranslateController f18329b;
    public final String f18330c;
    public final MessageObject d;
    public final long e;
    public final int f18331f;

    public zk(TranslateController translateController, String str, MessageObject messageObject, long j3, int i10, int i11) {
        this.f18328a = i11;
        this.f18329b = translateController;
        this.f18330c = str;
        this.d = messageObject;
        this.e = j3;
        this.f18331f = i10;
    }

    @Override
    public final void run() {
        switch (this.f18328a) {
            case 0:
                long j3 = this.e;
                int i10 = this.f18331f;
                this.f18329b.lambda$checkLanguage$16(this.f18330c, this.d, j3, i10);
                return;
            default:
                long j10 = this.e;
                int i11 = this.f18331f;
                this.f18329b.lambda$checkLanguage$12(this.f18330c, this.d, j10, i11);
                return;
        }
    }
}
