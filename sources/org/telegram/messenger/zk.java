package org.telegram.messenger;
public final class zk implements Runnable {
    public final int f18321a;
    public final TranslateController f18322b;
    public final String f18323c;
    public final MessageObject d;
    public final long e;
    public final int f18324f;

    public zk(TranslateController translateController, String str, MessageObject messageObject, long j3, int i10, int i11) {
        this.f18321a = i11;
        this.f18322b = translateController;
        this.f18323c = str;
        this.d = messageObject;
        this.e = j3;
        this.f18324f = i10;
    }

    @Override
    public final void run() {
        switch (this.f18321a) {
            case 0:
                long j3 = this.e;
                int i10 = this.f18324f;
                this.f18322b.lambda$checkLanguage$16(this.f18323c, this.d, j3, i10);
                return;
            default:
                long j10 = this.e;
                int i11 = this.f18324f;
                this.f18322b.lambda$checkLanguage$12(this.f18323c, this.d, j10, i11);
                return;
        }
    }
}
