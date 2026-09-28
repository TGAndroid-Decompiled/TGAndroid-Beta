package org.telegram.ui;
public final class l80 implements Runnable {
    public final int f35239a;
    public final LanguageSelectActivity f35240b;

    public l80(LanguageSelectActivity languageSelectActivity, int i10) {
        this.f35239a = i10;
        this.f35240b = languageSelectActivity;
    }

    @Override
    public final void run() {
        switch (this.f35239a) {
            case 0:
                LanguageSelectActivity.Y(this.f35240b);
                return;
            case 1:
                LanguageSelectActivity.W(this.f35240b);
                return;
            default:
                this.f35240b.f31094a.l();
                return;
        }
    }
}
