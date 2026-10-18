package org.telegram.messenger;

import org.telegram.messenger.LanguageDetector;
public final class zk implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TranslateController f20272a;
    public final MessageObject f20273b;
    public final long f20274c;
    public final int d;

    public zk(TranslateController translateController, MessageObject messageObject, long j10, int i10) {
        this.f20272a = translateController;
        this.f20273b = messageObject;
        this.f20274c = j10;
        this.d = i10;
    }

    @Override
    public void run(Exception exc) {
        this.f20272a.lambda$checkLanguage$15(this.f20273b, this.f20274c, this.d, exc);
    }

    @Override
    public void run(String str) {
        long j10 = this.f20274c;
        int i10 = this.d;
        this.f20272a.lambda$checkLanguage$13(this.f20273b, j10, i10, str);
    }
}
