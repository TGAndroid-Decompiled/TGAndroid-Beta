package org.telegram.messenger;
public final class zk implements Runnable {
    public final int f18327a;
    public final TranslateController f18328b;
    public final String f18329c;
    public final MessageObject d;
    public final long e;
    public final int f18330f;

    public zk(TranslateController translateController, String str, MessageObject messageObject, long j3, int i10, int i11) {
        this.f18327a = i11;
        this.f18328b = translateController;
        this.f18329c = str;
        this.d = messageObject;
        this.e = j3;
        this.f18330f = i10;
    }

    @Override
    public final void run() {
        switch (this.f18327a) {
            case 0:
                long j3 = this.e;
                int i10 = this.f18330f;
                this.f18328b.lambda$checkLanguage$16(this.f18329c, this.d, j3, i10);
                return;
            default:
                long j10 = this.e;
                int i11 = this.f18330f;
                this.f18328b.lambda$checkLanguage$12(this.f18329c, this.d, j10, i11);
                return;
        }
    }
}
