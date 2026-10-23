package org.telegram.messenger;
public final class yk implements Runnable {
    public final int f20264a;
    public final TranslateController f20265b;
    public final String f20266c;
    public final MessageObject d;
    public final long e;
    public final int f20267f;

    public yk(TranslateController translateController, String str, MessageObject messageObject, long j10, int i10, int i11) {
        this.f20264a = i11;
        this.f20265b = translateController;
        this.f20266c = str;
        this.d = messageObject;
        this.e = j10;
        this.f20267f = i10;
    }

    @Override
    public final void run() {
        switch (this.f20264a) {
            case 0:
                long j10 = this.e;
                int i10 = this.f20267f;
                this.f20265b.lambda$checkLanguage$16(this.f20266c, this.d, j10, i10);
                return;
            default:
                long j11 = this.e;
                int i11 = this.f20267f;
                this.f20265b.lambda$checkLanguage$12(this.f20266c, this.d, j11, i11);
                return;
        }
    }
}
