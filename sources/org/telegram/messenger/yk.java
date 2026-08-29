package org.telegram.messenger;
public final class yk implements Runnable {
    public final int f22284a;
    public final TranslateController f22285b;
    public final String f22286c;
    public final MessageObject d;
    public final long f22287e;
    public final int f22288f;

    public yk(TranslateController translateController, String str, MessageObject messageObject, long j10, int i10, int i11) {
        this.f22284a = i11;
        this.f22285b = translateController;
        this.f22286c = str;
        this.d = messageObject;
        this.f22287e = j10;
        this.f22288f = i10;
    }

    @Override
    public final void run() {
        switch (this.f22284a) {
            case 0:
                long j10 = this.f22287e;
                int i10 = this.f22288f;
                this.f22285b.lambda$checkLanguage$16(this.f22286c, this.d, j10, i10);
                return;
            default:
                long j11 = this.f22287e;
                int i11 = this.f22288f;
                this.f22285b.lambda$checkLanguage$12(this.f22286c, this.d, j11, i11);
                return;
        }
    }
}
