package org.telegram.ui.Cells;

import android.view.Menu;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LanguageDetector;

public final class TextSelectionHelper$4$$ExternalSyntheticLambda1 implements LanguageDetector.StringCallback, LanguageDetector.ExceptionCallback {
    public final TextSelectionHelper.AnonymousClass4 f$0;
    public final Menu f$1;

    public TextSelectionHelper$4$$ExternalSyntheticLambda1(TextSelectionHelper.AnonymousClass4 anonymousClass4, Menu menu) {
        this.f$0 = anonymousClass4;
        this.f$1 = menu;
    }

    @Override
    public void run(Exception exc) {
        TextSelectionHelper.AnonymousClass4 anonymousClass4 = this.f$0;
        anonymousClass4.getClass();
        FileLog.e("mlkit: failed to detect language in selection");
        FileLog.e(exc);
        anonymousClass4.translateFromLanguage = null;
        anonymousClass4.updateTranslateButton(this.f$1);
    }

    @Override
    public void run(String str) {
        TextSelectionHelper.AnonymousClass4 anonymousClass4 = this.f$0;
        anonymousClass4.translateFromLanguage = str;
        anonymousClass4.updateTranslateButton(this.f$1);
    }
}
