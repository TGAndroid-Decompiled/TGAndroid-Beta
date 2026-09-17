package org.telegram.messenger;
public final class zk implements Runnable {
    public final int f19887a;
    public final TranslateController f19888b;
    public final String f19889c;
    public final MessageObject d;
    public final long f19890e;
    public final int f19891f;

    public zk(TranslateController translateController, String str, MessageObject messageObject, long j3, int i10, int i11) {
        this.f19887a = i11;
        this.f19888b = translateController;
        this.f19889c = str;
        this.d = messageObject;
        this.f19890e = j3;
        this.f19891f = i10;
    }

    @Override
    public final void run() {
        switch (this.f19887a) {
            case 0:
                long j3 = this.f19890e;
                int i10 = this.f19891f;
                this.f19888b.lambda$checkLanguage$16(this.f19889c, this.d, j3, i10);
                return;
            default:
                long j10 = this.f19890e;
                int i11 = this.f19891f;
                this.f19888b.lambda$checkLanguage$12(this.f19889c, this.d, j10, i11);
                return;
        }
    }
}
