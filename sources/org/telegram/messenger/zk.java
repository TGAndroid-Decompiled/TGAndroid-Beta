package org.telegram.messenger;
public final class zk implements Runnable {
    public final int f18329a;
    public final TranslateController f18330b;
    public final String f18331c;
    public final MessageObject d;
    public final long e;
    public final int f18332f;

    public zk(TranslateController translateController, String str, MessageObject messageObject, long j3, int i10, int i11) {
        this.f18329a = i11;
        this.f18330b = translateController;
        this.f18331c = str;
        this.d = messageObject;
        this.e = j3;
        this.f18332f = i10;
    }

    @Override
    public final void run() {
        switch (this.f18329a) {
            case 0:
                long j3 = this.e;
                int i10 = this.f18332f;
                this.f18330b.lambda$checkLanguage$16(this.f18331c, this.d, j3, i10);
                return;
            default:
                long j10 = this.e;
                int i11 = this.f18332f;
                this.f18330b.lambda$checkLanguage$12(this.f18331c, this.d, j10, i11);
                return;
        }
    }
}
