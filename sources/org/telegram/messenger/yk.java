package org.telegram.messenger;

public final class yk implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {

    public final TranslateController f22276a;

    public final MessageObject f22277b;

    public final long f22278c;
    public final int d;

    public yk(TranslateController translateController, MessageObject messageObject, long j10, int i10) {
        this.f22276a = translateController;
        this.f22277b = messageObject;
        this.f22278c = j10;
        this.d = i10;
    }

    @Override
    public void run(Exception exc) {
        this.f22276a.lambda$checkLanguage$15(this.f22277b, this.f22278c, this.d, exc);
    }

    @Override
    public void run(String str) {
        long j10 = this.f22278c;
        int i10 = this.d;
        this.f22276a.lambda$checkLanguage$13(this.f22277b, j10, i10, str);
    }
}
