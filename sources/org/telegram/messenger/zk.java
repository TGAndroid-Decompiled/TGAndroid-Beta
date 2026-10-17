package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
public final class zk implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f20265a;
    public final MessageObject f20266b;
    public final long f20267c;
    public final int d;

    public zk(TranslateController translateController, MessageObject messageObject, long j10, int i10) {
        this.f20265a = translateController;
        this.f20266b = messageObject;
        this.f20267c = j10;
        this.d = i10;
    }

    @Override
    public void run(Exception exc) {
        this.f20265a.lambda$checkLanguage$15(this.f20266b, this.f20267c, this.d, exc);
    }

    @Override
    public void run(String str) {
        long j10 = this.f20267c;
        int i10 = this.d;
        this.f20265a.lambda$checkLanguage$13(this.f20266b, j10, i10, str);
    }
}
