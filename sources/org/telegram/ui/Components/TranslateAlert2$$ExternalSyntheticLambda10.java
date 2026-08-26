package org.telegram.ui.Components;

import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.Utilities;

public final class TranslateAlert2$$ExternalSyntheticLambda10 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final String f$0;
    public final String f$1;
    public final Utilities.Callback2 f$2;

    public TranslateAlert2$$ExternalSyntheticLambda10(String str, String str2, Utilities.Callback2 callback2) {
        this.f$0 = str;
        this.f$1 = str2;
        this.f$2 = callback2;
    }

    @Override
    public void run(Exception exc) {
        TranslateAlert2.alternativeTranslate(this.f$0, "en", this.f$1, this.f$2);
    }

    @Override
    public void run(String str) {
        TranslateAlert2.alternativeTranslate(this.f$0, str, this.f$1, this.f$2);
    }
}
