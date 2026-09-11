package org.telegram.messenger;
public final class zk implements Runnable {
    public final int f19860a;
    public final TranslateController f19861b;
    public final String f19862c;
    public final MessageObject d;
    public final long f19863e;
    public final int f19864f;

    public zk(TranslateController translateController, String str, MessageObject messageObject, long j3, int i10, int i11) {
        this.f19860a = i11;
        this.f19861b = translateController;
        this.f19862c = str;
        this.d = messageObject;
        this.f19863e = j3;
        this.f19864f = i10;
    }

    @Override
    public final void run() {
        switch (this.f19860a) {
            case 0:
                long j3 = this.f19863e;
                int i10 = this.f19864f;
                this.f19861b.lambda$checkLanguage$16(this.f19862c, this.d, j3, i10);
                return;
            default:
                long j10 = this.f19863e;
                int i11 = this.f19864f;
                this.f19861b.lambda$checkLanguage$12(this.f19862c, this.d, j10, i11);
                return;
        }
    }
}
