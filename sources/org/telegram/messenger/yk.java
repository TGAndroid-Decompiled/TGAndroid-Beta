package org.telegram.messenger;
public final class yk implements Runnable {
    public final int f20195a;
    public final TranslateController f20196b;
    public final String f20197c;
    public final MessageObject d;
    public final long e;
    public final int f20198f;

    public yk(TranslateController translateController, String str, MessageObject messageObject, long j10, int i10, int i11) {
        this.f20195a = i11;
        this.f20196b = translateController;
        this.f20197c = str;
        this.d = messageObject;
        this.e = j10;
        this.f20198f = i10;
    }

    @Override
    public final void run() {
        switch (this.f20195a) {
            case 0:
                long j10 = this.e;
                int i10 = this.f20198f;
                this.f20196b.lambda$checkLanguage$16(this.f20197c, this.d, j10, i10);
                return;
            default:
                long j11 = this.e;
                int i11 = this.f20198f;
                this.f20196b.lambda$checkLanguage$12(this.f20197c, this.d, j11, i11);
                return;
        }
    }
}
