package org.telegram.messenger;
public final class yk implements Runnable {
    public final int f22280a = 1;
    public final TranslateController f22281b;
    public final long f22282c;
    public final Object d;

    public yk(TranslateController translateController, long j10, String str) {
        this.f22281b = translateController;
        this.f22282c = j10;
        this.d = str;
    }

    @Override
    public final void run() {
        switch (this.f22280a) {
            case 0:
                long j10 = this.f22282c;
                this.f22281b.lambda$invalidateTranslation$9((MessageObject) this.d, j10);
                return;
            default:
                this.f22281b.lambda$setDialogTranslateTo$0(this.f22282c, (String) this.d);
                return;
        }
    }

    public yk(TranslateController translateController, MessageObject messageObject, long j10) {
        this.f22281b = translateController;
        this.d = messageObject;
        this.f22282c = j10;
    }
}
