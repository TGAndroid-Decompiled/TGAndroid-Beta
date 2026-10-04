package org.telegram.messenger;
public final class zk implements Runnable {
    public final int f20028a;
    public final TranslateController f20029b;
    public final String f20030c;
    public final MessageObject d;
    public final long f20031e;
    public final int f20032f;

    public zk(TranslateController translateController, String str, MessageObject messageObject, long j3, int i10, int i11) {
        this.f20028a = i11;
        this.f20029b = translateController;
        this.f20030c = str;
        this.d = messageObject;
        this.f20031e = j3;
        this.f20032f = i10;
    }

    @Override
    public final void run() {
        switch (this.f20028a) {
            case 0:
                long j3 = this.f20031e;
                int i10 = this.f20032f;
                this.f20029b.lambda$checkLanguage$16(this.f20030c, this.d, j3, i10);
                return;
            default:
                long j10 = this.f20031e;
                int i11 = this.f20032f;
                this.f20029b.lambda$checkLanguage$12(this.f20030c, this.d, j10, i11);
                return;
        }
    }
}
