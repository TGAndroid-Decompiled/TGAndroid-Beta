package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
public final class zk implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f20266a;
    public final MessageObject f20267b;
    public final long f20268c;
    public final int d;

    public zk(TranslateController translateController, MessageObject messageObject, long j10, int i10) {
        this.f20266a = translateController;
        this.f20267b = messageObject;
        this.f20268c = j10;
        this.d = i10;
    }

    @Override
    public void run(Exception exc) {
        this.f20266a.lambda$checkLanguage$15(this.f20267b, this.f20268c, this.d, exc);
    }

    @Override
    public void run(String str) {
        long j10 = this.f20268c;
        int i10 = this.d;
        this.f20266a.lambda$checkLanguage$13(this.f20267b, j10, i10, str);
    }
}
